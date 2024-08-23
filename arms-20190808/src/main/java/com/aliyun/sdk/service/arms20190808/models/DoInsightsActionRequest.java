// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private DoInsightsActionRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.module = builder.module;
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

    public static final class Builder extends Request.Builder<DoInsightsActionRequest, Builder> {
        private String data; 
        private String module; 

        private Builder() {
            super();
        } 

        private Builder(DoInsightsActionRequest request) {
            super(request);
            this.data = request.data;
            this.module = request.module;
        } 

        /**
         * The query parameters. Different module types correspond to different query parameters.
         * <p>
         * 
         * *   QueryTopo
         * 
         * <!---->
         * 
         *     {
         *         "regionId": string,  # The region ID.
         *         "startTime": string, # The beginning of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *         "endTime": string, # The end of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *         "edgeFilter": { # The edge filter condition.
         *             "includeTypes": [EdgeType], # The edge types to be included.
         *             "excludeTypes": [EdgeType], # The edge types to be excluded.
         *             "fromNodeFilter": { # The source node filter condition.
         *                 "includeEntityTypes": [EntityType] # The entity types to be included.
         *                 "excludeEntityTypes": [EntityType] # The entity types to be excluded.
         *             },
         *             "toNodeFilter": {  # The destination node filter condition.
         *                 "includeEntityTypes": [EntityType] # The entity types to be included.
         *                 "excludeEntityTypes": [EntityType] # The entity types to be excluded.
         *             }
         *         },
         *         "includeIsolatedNodes": bool, # Specifies whether to include isolated nodes.
         *         "isolatedNodeFilter": { # The isolated node filter condition.
         *             "includeEntityTypes": [EntityType] # The entity types to be included.
         *             "excludeEntityTypes": [EntityType] # The entity types to be excluded.
         *          },
         *         "queryMetrics": boolean, # Specifies whether to query related red metrics during the metric query.
         *         "timeoutSecs": int, # The timeout duration for querying metrics.
         *     	"redOption": { # A metric query option.
         *     		"skipRt": boolean,  # Specifies whether to skip querying the response time.
         *     		"skipCount": boolean, # Specifies whether to skip querying the number of requests.
         *     		"skipError": boolean # Specifies whether to skip querying the number of errors.
         *     	}
         *     }
         * 
         * *   QueryTopoRed
         * 
         * <!---->
         * 
         *     {
         *         "regionId": string,  # The region ID.
         *         "startTime": string, # The beginning of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *         "endTime": string,   # The end of the time range to query, in the yyyy-MM-dd HH:mm:ss format.
         *         "edgeIds": [string]  # The IDs of the edges to query.
         *         "nodeIds": [string]  # The IDs of the nodes to query.
         *         "redOption": { # A metric query option.
         *             "skipRt": boolean,  # Specifies whether to skip querying the response time.
         *             "skipCount": boolean, # Specifies whether to skip querying the number of requests.
         *             "skipError": boolean # Specifies whether to skip querying the number of errors.
         *         }
         *     }
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The module type. Valid values:
         * <p>
         * 
         * *   QueryTopo: queries the topology.
         * *   QueryTopoRed: queries the red topology metrics, such as the number of requests, response time, and number of errors.
         * 
         * Notice: The preceding features are still in canary release and are disabled by default. If you need to enable these features, submit a ticket in the Application Real-Time Monitoring Service (ARMS) console.
         * 
         * *
         * *
         */
        public Builder module(String module) {
            this.putBodyParameter("Module", module);
            this.module = module;
            return this;
        }

        @Override
        public DoInsightsActionRequest build() {
            return new DoInsightsActionRequest(this);
        } 

    } 

}
