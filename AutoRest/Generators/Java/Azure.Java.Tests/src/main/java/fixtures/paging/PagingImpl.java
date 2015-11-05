/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudError;
import com.microsoft.rest.serializer.AzureJacksonUtils;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.paging.models.PageImpl;
import fixtures.paging.models.Product;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class PagingImpl implements Paging {
    private PagingService service;
    AutoRestPagingTestService client;

    public PagingImpl(Retrofit retrofit, AutoRestPagingTestService client) {
        this.service = retrofit.create(PagingService.class);
        this.client = client;
    }

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePages() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getSinglePages(this.client.getAcceptLanguage());
            return getSinglePagesDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSinglePagesAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getSinglePages(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePages() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMultiplePages(this.client.getAcceptLanguage());
            return getMultiplePagesDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePages(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirst() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMultiplePagesRetryFirst(this.client.getAcceptLanguage());
            return getMultiplePagesRetryFirstDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesRetryFirstAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesRetryFirst(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetryFirstDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecond() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMultiplePagesRetrySecond(this.client.getAcceptLanguage());
            return getMultiplePagesRetrySecondDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesRetrySecondAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesRetrySecond(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetrySecondDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesFailure() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getSinglePagesFailure(this.client.getAcceptLanguage());
            return getSinglePagesFailureDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSinglePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getSinglePagesFailure(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesFailureDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesFailureDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailure() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMultiplePagesFailure(this.client.getAcceptLanguage());
            return getMultiplePagesFailureDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesFailureAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesFailure(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUri() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getMultiplePagesFailureUri(this.client.getAcceptLanguage());
            return getMultiplePagesFailureUriDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesFailureUriAsync(final ServiceCallback<PageImpl<Product>> serviceCallback) {
        Call<ResponseBody> call = service.getMultiplePagesFailureUri(this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureUriDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSinglePagesNext(nextPageLink, this.client.getAcceptLanguage());
            return getSinglePagesNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that finishes on the first call without a nextlink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSinglePagesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSinglePagesNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMultiplePagesNext(nextPageLink, this.client.getAcceptLanguage());
            return getMultiplePagesNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMultiplePagesNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMultiplePagesRetryFirstNext(nextPageLink, this.client.getAcceptLanguage());
            return getMultiplePagesRetryFirstNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that fails on the first call with 500 and then retries and then get a response including a nextLink that has 10 pages
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesRetryFirstNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMultiplePagesRetryFirstNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetryFirstNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetryFirstNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMultiplePagesRetrySecondNext(nextPageLink, this.client.getAcceptLanguage());
            return getMultiplePagesRetrySecondNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that includes a nextLink that has 10 pages, of which the 2nd call fails first with 500. The client should retry and finish all 10 pages eventually.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesRetrySecondNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMultiplePagesRetrySecondNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesRetrySecondNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesRetrySecondNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getSinglePagesFailureNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getSinglePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
            return getSinglePagesFailureNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives a 400 on the first call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getSinglePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getSinglePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSinglePagesFailureNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getSinglePagesFailureNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMultiplePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
            return getMultiplePagesFailureNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives a 400 on the second call
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesFailureNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PageImpl&lt;Product&gt; object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNext(String nextPageLink) throws ServiceException {
        if (nextPageLink == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.getMultiplePagesFailureUriNext(nextPageLink, this.client.getAcceptLanguage());
            return getMultiplePagesFailureUriNextDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * A paging operation that receives an invalid nextLink
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getMultiplePagesFailureUriNextAsync(String nextPageLink, final ServiceCallback<PageImpl<Product>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.getMultiplePagesFailureUriNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<Product>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMultiplePagesFailureUriNextDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Product>> getMultiplePagesFailureUriNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<PageImpl<Product>>(new AzureJacksonUtils())
                .register(200, new TypeToken<PageImpl<Product>>(){}.getType())
                .registerError(new TypeToken<CloudError>(){}.getType())
                .build(response, retrofit);
    }

}
