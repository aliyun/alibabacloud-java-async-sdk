// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DoInsightsActionRequest} extends {@link RequestModel}
 *
 * <p>DoInsightsActionRequest</p>
 */
public class DoInsightsActionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Module")
    @com.aliyun.core.annotation.Validation(required = true)
    private String module;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DoInsightsActionRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.module = builder.module;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoInsightsActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DoInsightsActionRequest, Builder> {
        private String data; 
        private String module; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DoInsightsActionRequest request) {
            super(request);
            this.data = request.data;
            this.module = request.module;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The query parameters. Different module types correspond to different query parameters.</p>
         * <ul>
         * <li>QueryTopo</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *     &quot;regionId&quot;: string,  # The region ID.
         *     &quot;startTime&quot;: string, # The beginning of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *     &quot;endTime&quot;: string, # The end of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *     &quot;edgeFilter&quot;: { # The edge filter condition.
         *         &quot;includeTypes&quot;: [EdgeType], # The edge types to be included.
         *         &quot;excludeTypes&quot;: [EdgeType], # The edge types to be excluded.
         *         &quot;fromNodeFilter&quot;: { # The source node filter condition.
         *             &quot;includeEntityTypes&quot;: [EntityType] # The entity types to be included.
         *             &quot;excludeEntityTypes&quot;: [EntityType] # The entity types to be excluded.
         *         },
         *         &quot;toNodeFilter&quot;: {  # The destination node filter condition.
         *             &quot;includeEntityTypes&quot;: [EntityType] # The entity types to be included.
         *             &quot;excludeEntityTypes&quot;: [EntityType] # The entity types to be excluded.
         *         }
         *     },
         *     &quot;includeIsolatedNodes&quot;: bool, # Specifies whether to include isolated nodes.
         *     &quot;isolatedNodeFilter&quot;: { # The isolated node filter condition.
         *         &quot;includeEntityTypes&quot;: [EntityType] # The entity types to be included.
         *         &quot;excludeEntityTypes&quot;: [EntityType] # The entity types to be excluded.
         *      },
         *     &quot;queryMetrics&quot;: boolean, # Specifies whether to query related red metrics during the metric query.
         *     &quot;timeoutSecs&quot;: int, # The timeout duration for querying metrics.
         *     &quot;redOption&quot;: { # A metric query option.
         *         &quot;skipRt&quot;: boolean,  # Specifies whether to skip querying the response time.
         *         &quot;skipCount&quot;: boolean, # Specifies whether to skip querying the number of requests.
         *         &quot;skipError&quot;: boolean # Specifies whether to skip querying the number of errors.
         *     }
         * }
         * </code></pre>
         * <ul>
         * <li>QueryTopoRed</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *     &quot;regionId&quot;: string,  # The region ID.
         *     &quot;startTime&quot;: string, # The beginning of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *     &quot;endTime&quot;: string,   # The end of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *     &quot;edgeIds&quot;: [string]  # The IDs of the edges to query.
         *     &quot;nodeIds&quot;: [string]  # The IDs of the nodes to query.
         *     &quot;redOption&quot;: { # A metric query option.
         *         &quot;skipRt&quot;: boolean,  # Specifies whether to skip querying the response time.
         *         &quot;skipCount&quot;: boolean, # Specifies whether to skip querying the number of requests.
         *         &quot;skipError&quot;: boolean # Specifies whether to skip querying the number of errors.
         *     }
         * }
         * </code></pre>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><p>QueryTopo</p>
         * <p>  {
         *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;startTime&quot;: &quot;2024-07-23 19:16:00&quot;,<br>  &quot;endTime&quot;: &quot;2024-07-23 20:16:00&quot;, # Limit the topology query range to 2024-07-23 19:16:00 to 2024-07-23 20:16:00
         *   &quot;edgeFilter&quot;: {
         *       &quot;includeTypes&quot;: [
         *           &quot;CALLS&quot; # The resulting topology only contains edges of call relationships.
         *       ],
         *       &quot;fromNodeFilter&quot;: {
         *           &quot;includeEntityTypes&quot;: [ # The source node type of the call edge must be application type
         *               &quot;APPLICATION&quot; 
         *           ]
         *       },
         *       &quot;toNodeFilter&quot;: {
         *           &quot;includeEntityTypes&quot;: [ # The target node of the call edge must be an application type or an external service type.
         *               &quot;APPLICATION&quot;,
         *               &quot;EXTERNAL_SERVICE&quot;
         *           ]
         *       }
         *   },
         *   &quot;includeIsolatedNodes&quot;: false, # The resulting topology does not contain isolated nodes
         *   &quot;queryMetrics&quot;: true, # Synchronously query the RED indicator
         *   &quot;timeoutSecs&quot;: 20, #It takes up to 20 seconds to query indicator data
         *   &quot;redOption&quot;: { # The query indicators include time consumption, request volume, and query skip errors.
         *       &quot;skipRt&quot;: false,
         *       &quot;skipCount&quot;: false,
         *       &quot;skipError&quot;: true
         *   }
         *   }</p>
         * </li>
         * <li><p>QueryTopoRed</p>
         * <p>  {
         *   &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;startTime&quot;: &quot;2024-07-23 10:00:00&quot;,
         *   &quot;endTime&quot;: &quot;2024-07-23 14:00:00&quot;,
         *   &quot;edgeIds&quot;: [
         *       &quot;097843bd50b06fbe2c6c1d8b761a7e8b&quot;
         *   ],
         *   &quot;nodeIds&quot;: [
         *       &quot;23d973261c6923da1b5b7a571ec1aa8b&quot;
         *   ],
         *   &quot;redOption&quot;: { # The query indicators include time consumption, request volume, and query skip errors.
         *       &quot;skipCount&quot;: false,
         *       &quot;skipError&quot;: true,
         *       &quot;skipRt&quot;: false
         *   }
         *   }</p>
         * </li>
         * </ul>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The module type. Valid values:</p>
         * <ul>
         * <li>QueryTopo: queries the topology.</li>
         * <li>QueryTopoRed: queries the red topology metrics, such as the number of requests, response time, and number of errors.</li>
         * </ul>
         * <p>Notice: The preceding features are still in canary release and are disabled by default. If you need to enable these features, submit a ticket in the Application Real-Time Monitoring Service (ARMS) console.</p>
         * <ul>
         * <li></li>
         * <li></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QueryTopo</p>
         */
        public Builder module(String module) {
            this.putBodyParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DoInsightsActionRequest build() {
            return new DoInsightsActionRequest(this);
        } 

    } 

}
