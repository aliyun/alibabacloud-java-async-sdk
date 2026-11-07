// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayFlowRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGatewayFlowRuleResponseBody</p>
 */
public class UpdateGatewayFlowRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateGatewayFlowRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayFlowRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateGatewayFlowRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2B74E7F7-DF54-5AB1-B8F2-67391B83****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGatewayFlowRuleResponseBody build() {
            return new UpdateGatewayFlowRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayFlowRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateGatewayFlowRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BehaviorType")
        private Integer behaviorType;

        @com.aliyun.core.annotation.NameInMap("BodyEncoding")
        private Integer bodyEncoding;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdList")
        private java.util.List<Long> idList;

        @com.aliyun.core.annotation.NameInMap("LimitMode")
        private Integer limitMode;

        @com.aliyun.core.annotation.NameInMap("ResponseAdditionalHeaders")
        private String responseAdditionalHeaders;

        @com.aliyun.core.annotation.NameInMap("ResponseContentBody")
        private String responseContentBody;

        @com.aliyun.core.annotation.NameInMap("ResponseRedirectUrl")
        private String responseRedirectUrl;

        @com.aliyun.core.annotation.NameInMap("ResponseStatusCode")
        private Integer responseStatusCode;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("StatDurationMs")
        private Integer statDurationMs;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Integer threshold;

        private Data(Builder builder) {
            this.behaviorType = builder.behaviorType;
            this.bodyEncoding = builder.bodyEncoding;
            this.enable = builder.enable;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.id = builder.id;
            this.idList = builder.idList;
            this.limitMode = builder.limitMode;
            this.responseAdditionalHeaders = builder.responseAdditionalHeaders;
            this.responseContentBody = builder.responseContentBody;
            this.responseRedirectUrl = builder.responseRedirectUrl;
            this.responseStatusCode = builder.responseStatusCode;
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
            this.statDurationMs = builder.statDurationMs;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return behaviorType
         */
        public Integer getBehaviorType() {
            return this.behaviorType;
        }

        /**
         * @return bodyEncoding
         */
        public Integer getBodyEncoding() {
            return this.bodyEncoding;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idList
         */
        public java.util.List<Long> getIdList() {
            return this.idList;
        }

        /**
         * @return limitMode
         */
        public Integer getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return responseAdditionalHeaders
         */
        public String getResponseAdditionalHeaders() {
            return this.responseAdditionalHeaders;
        }

        /**
         * @return responseContentBody
         */
        public String getResponseContentBody() {
            return this.responseContentBody;
        }

        /**
         * @return responseRedirectUrl
         */
        public String getResponseRedirectUrl() {
            return this.responseRedirectUrl;
        }

        /**
         * @return responseStatusCode
         */
        public Integer getResponseStatusCode() {
            return this.responseStatusCode;
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return statDurationMs
         */
        public Integer getStatDurationMs() {
            return this.statDurationMs;
        }

        /**
         * @return threshold
         */
        public Integer getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private Integer behaviorType; 
            private Integer bodyEncoding; 
            private Integer enable; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Long id; 
            private java.util.List<Long> idList; 
            private Integer limitMode; 
            private String responseAdditionalHeaders; 
            private String responseContentBody; 
            private String responseRedirectUrl; 
            private Integer responseStatusCode; 
            private Long routeId; 
            private String routeName; 
            private Integer statDurationMs; 
            private Integer threshold; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.behaviorType = model.behaviorType;
                this.bodyEncoding = model.bodyEncoding;
                this.enable = model.enable;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.id = model.id;
                this.idList = model.idList;
                this.limitMode = model.limitMode;
                this.responseAdditionalHeaders = model.responseAdditionalHeaders;
                this.responseContentBody = model.responseContentBody;
                this.responseRedirectUrl = model.responseRedirectUrl;
                this.responseStatusCode = model.responseStatusCode;
                this.routeId = model.routeId;
                this.routeName = model.routeName;
                this.statDurationMs = model.statDurationMs;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The type of the web fallback behavior.</p>
             * <p>0: The specified content is returned.</p>
             * <p>1: The specified page is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder behaviorType(Integer behaviorType) {
                this.behaviorType = behaviorType;
                return this;
            }

            /**
             * <p>The encoding type.</p>
             * <p>0: plain text</p>
             * <p>1: JSON</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bodyEncoding(Integer bodyEncoding) {
                this.bodyEncoding = bodyEncoding;
                return this;
            }

            /**
             * <p>Specifies whether to enable the rule.</p>
             * <p>0: The rule is not enabled.</p>
             * <p>1: The rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>14407</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The ID of the throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>549</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IDs of the circuit breaking rules that are used to filter data.</p>
             */
            public Builder idList(java.util.List<Long> idList) {
                this.idList = idList;
                return this;
            }

            /**
             * <p>The threshold conversion mode.</p>
             * <p>0: standalone.</p>
             * <p>1: cluster.</p>
             * <p>2: cluster-to-standalone.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder limitMode(Integer limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * <p>The custom header. The input is a key-value pair.</p>
             * 
             * <strong>example:</strong>
             * <p>key=value</p>
             */
            public Builder responseAdditionalHeaders(String responseAdditionalHeaders) {
                this.responseAdditionalHeaders = responseAdditionalHeaders;
                return this;
            }

            /**
             * <p>The HTTP return text.</p>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder responseContentBody(String responseContentBody) {
                this.responseContentBody = responseContentBody;
                return this;
            }

            /**
             * <p>The redirection URL.</p>
             * 
             * <strong>example:</strong>
             * <p>www.******.com</p>
             */
            public Builder responseRedirectUrl(String responseRedirectUrl) {
                this.responseRedirectUrl = responseRedirectUrl;
                return this;
            }

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>429</p>
             */
            public Builder responseStatusCode(Integer responseStatusCode) {
                this.responseStatusCode = responseStatusCode;
                return this;
            }

            /**
             * <p>The route ID.</p>
             * 
             * <strong>example:</strong>
             * <p>48811</p>
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * <p>The route name.</p>
             * 
             * <strong>example:</strong>
             * <p>routeA</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The duration of the statistics.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder statDurationMs(Integer statDurationMs) {
                this.statDurationMs = statDurationMs;
                return this;
            }

            /**
             * <p>The overall queries per second (QPS) threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(Integer threshold) {
                this.threshold = threshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
