// Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace applicationGateway.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class GatewayRoute
    {
        /// <summary>
        /// Initializes a new instance of the GatewayRoute class.
        /// </summary>
        public GatewayRoute()
        {
          CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GatewayRoute class.
        /// </summary>
        /// <param name="localAddress">The gateway's local address</param>
        /// <param name="networkProperty">The route's network prefix</param>
        /// <param name="nextHop">The route's next hop</param>
        /// <param name="sourcePeer">The peer this route was learned
        /// from</param>
        /// <param name="origin">The source this route was learned from</param>
        /// <param name="asPath">The route's AS path sequence</param>
        /// <param name="weight">The route's weight</param>
        public GatewayRoute(string localAddress = default(string), string networkProperty = default(string), string nextHop = default(string), string sourcePeer = default(string), string origin = default(string), string asPath = default(string), int? weight = default(int?))
        {
            LocalAddress = localAddress;
            NetworkProperty = networkProperty;
            NextHop = nextHop;
            SourcePeer = sourcePeer;
            Origin = origin;
            AsPath = asPath;
            Weight = weight;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets the gateway's local address
        /// </summary>
        [JsonProperty(PropertyName = "localAddress")]
        public string LocalAddress { get; private set; }

        /// <summary>
        /// Gets the route's network prefix
        /// </summary>
        [JsonProperty(PropertyName = "network")]
        public string NetworkProperty { get; private set; }

        /// <summary>
        /// Gets the route's next hop
        /// </summary>
        [JsonProperty(PropertyName = "nextHop")]
        public string NextHop { get; private set; }

        /// <summary>
        /// Gets the peer this route was learned from
        /// </summary>
        [JsonProperty(PropertyName = "sourcePeer")]
        public string SourcePeer { get; private set; }

        /// <summary>
        /// Gets the source this route was learned from
        /// </summary>
        [JsonProperty(PropertyName = "origin")]
        public string Origin { get; private set; }

        /// <summary>
        /// Gets the route's AS path sequence
        /// </summary>
        [JsonProperty(PropertyName = "asPath")]
        public string AsPath { get; private set; }

        /// <summary>
        /// Gets the route's weight
        /// </summary>
        [JsonProperty(PropertyName = "weight")]
        public int? Weight { get; private set; }

    }
}