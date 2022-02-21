// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableIsolationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>EnableIsolationRuleResponseBody</p>
 */
public class EnableIsolationRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private EnableIsolationRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableIsolationRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnableIsolationRuleResponseBody build() {
            return new EnableIsolationRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("LimitOrigin")
        private String limitOrigin;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RefResource")
        private String refResource;

        @NameInMap("RelationStrategy")
        private Integer relationStrategy;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("Threshold")
        private Float threshold;

        private Data(Builder builder) {
            this.appName = builder.appName;
            this.enable = builder.enable;
            this.limitOrigin = builder.limitOrigin;
            this.namespace = builder.namespace;
            this.refResource = builder.refResource;
            this.relationStrategy = builder.relationStrategy;
            this.resource = builder.resource;
            this.ruleId = builder.ruleId;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return limitOrigin
         */
        public String getLimitOrigin() {
            return this.limitOrigin;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return refResource
         */
        public String getRefResource() {
            return this.refResource;
        }

        /**
         * @return relationStrategy
         */
        public Integer getRelationStrategy() {
            return this.relationStrategy;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appName; 
            private Boolean enable; 
            private String limitOrigin; 
            private String namespace; 
            private String refResource; 
            private Integer relationStrategy; 
            private String resource; 
            private Long ruleId; 
            private Float threshold; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * LimitOrigin.
             */
            public Builder limitOrigin(String limitOrigin) {
                this.limitOrigin = limitOrigin;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RefResource.
             */
            public Builder refResource(String refResource) {
                this.refResource = refResource;
                return this;
            }

            /**
             * RelationStrategy.
             */
            public Builder relationStrategy(Integer relationStrategy) {
                this.relationStrategy = relationStrategy;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
