// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayIsolationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGatewayIsolationRuleResponseBody</p>
 */
public class UpdateGatewayIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateGatewayIsolationRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayIsolationRuleResponseBody create() {
        return builder().build();
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGatewayIsolationRuleResponseBody build() {
            return new UpdateGatewayIsolationRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BehaviorType")
        private Integer behaviorType;

        @NameInMap("BodyEncoding")
        private Integer bodyEncoding;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IdList")
        private java.util.List < Long > idList;

        @NameInMap("LimitMode")
        private Integer limitMode;

        @NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @NameInMap("ResponseAdditionalHeaders")
        private String responseAdditionalHeaders;

        @NameInMap("ResponseContentBody")
        private String responseContentBody;

        @NameInMap("ResponseRedirectUrl")
        private String responseRedirectUrl;

        @NameInMap("ResponseStatusCode")
        private Integer responseStatusCode;

        @NameInMap("RouteId")
        private Long routeId;

        @NameInMap("RouteName")
        private String routeName;

        private Data(Builder builder) {
            this.behaviorType = builder.behaviorType;
            this.bodyEncoding = builder.bodyEncoding;
            this.enable = builder.enable;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.id = builder.id;
            this.idList = builder.idList;
            this.limitMode = builder.limitMode;
            this.maxConcurrency = builder.maxConcurrency;
            this.responseAdditionalHeaders = builder.responseAdditionalHeaders;
            this.responseContentBody = builder.responseContentBody;
            this.responseRedirectUrl = builder.responseRedirectUrl;
            this.responseStatusCode = builder.responseStatusCode;
            this.routeId = builder.routeId;
            this.routeName = builder.routeName;
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
        public java.util.List < Long > getIdList() {
            return this.idList;
        }

        /**
         * @return limitMode
         */
        public Integer getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return maxConcurrency
         */
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
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

        public static final class Builder {
            private Integer behaviorType; 
            private Integer bodyEncoding; 
            private Integer enable; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Long id; 
            private java.util.List < Long > idList; 
            private Integer limitMode; 
            private Integer maxConcurrency; 
            private String responseAdditionalHeaders; 
            private String responseContentBody; 
            private String responseRedirectUrl; 
            private Integer responseStatusCode; 
            private Long routeId; 
            private String routeName; 

            /**
             * BehaviorType.
             */
            public Builder behaviorType(Integer behaviorType) {
                this.behaviorType = behaviorType;
                return this;
            }

            /**
             * BodyEncoding.
             */
            public Builder bodyEncoding(Integer bodyEncoding) {
                this.bodyEncoding = bodyEncoding;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdList.
             */
            public Builder idList(java.util.List < Long > idList) {
                this.idList = idList;
                return this;
            }

            /**
             * LimitMode.
             */
            public Builder limitMode(Integer limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * ResponseAdditionalHeaders.
             */
            public Builder responseAdditionalHeaders(String responseAdditionalHeaders) {
                this.responseAdditionalHeaders = responseAdditionalHeaders;
                return this;
            }

            /**
             * ResponseContentBody.
             */
            public Builder responseContentBody(String responseContentBody) {
                this.responseContentBody = responseContentBody;
                return this;
            }

            /**
             * ResponseRedirectUrl.
             */
            public Builder responseRedirectUrl(String responseRedirectUrl) {
                this.responseRedirectUrl = responseRedirectUrl;
                return this;
            }

            /**
             * ResponseStatusCode.
             */
            public Builder responseStatusCode(Integer responseStatusCode) {
                this.responseStatusCode = responseStatusCode;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            /**
             * RouteName.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
