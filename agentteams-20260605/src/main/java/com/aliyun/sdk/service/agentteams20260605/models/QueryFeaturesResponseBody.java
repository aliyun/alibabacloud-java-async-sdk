// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link QueryFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFeaturesResponseBody</p>
 */
public class QueryFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryFeaturesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFeaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryFeaturesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public QueryFeaturesResponseBody build() {
            return new QueryFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFeaturesResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FeatureCode")
        private String featureCode;

        @com.aliyun.core.annotation.NameInMap("Supported")
        private Boolean supported;

        @com.aliyun.core.annotation.NameInMap("UnsupportedReason")
        private String unsupportedReason;

        @com.aliyun.core.annotation.NameInMap("UnsupportedReasonCode")
        private String unsupportedReasonCode;

        private Features(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.featureCode = builder.featureCode;
            this.supported = builder.supported;
            this.unsupportedReason = builder.unsupportedReason;
            this.unsupportedReasonCode = builder.unsupportedReasonCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return featureCode
         */
        public String getFeatureCode() {
            return this.featureCode;
        }

        /**
         * @return supported
         */
        public Boolean getSupported() {
            return this.supported;
        }

        /**
         * @return unsupportedReason
         */
        public String getUnsupportedReason() {
            return this.unsupportedReason;
        }

        /**
         * @return unsupportedReasonCode
         */
        public String getUnsupportedReasonCode() {
            return this.unsupportedReasonCode;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String featureCode; 
            private Boolean supported; 
            private String unsupportedReason; 
            private String unsupportedReasonCode; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.featureCode = model.featureCode;
                this.supported = model.supported;
                this.unsupportedReason = model.unsupportedReason;
                this.unsupportedReasonCode = model.unsupportedReasonCode;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * FeatureCode.
             */
            public Builder featureCode(String featureCode) {
                this.featureCode = featureCode;
                return this;
            }

            /**
             * Supported.
             */
            public Builder supported(Boolean supported) {
                this.supported = supported;
                return this;
            }

            /**
             * UnsupportedReason.
             */
            public Builder unsupportedReason(String unsupportedReason) {
                this.unsupportedReason = unsupportedReason;
                return this;
            }

            /**
             * UnsupportedReasonCode.
             */
            public Builder unsupportedReasonCode(String unsupportedReasonCode) {
                this.unsupportedReasonCode = unsupportedReasonCode;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFeaturesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<Features> features;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("TargetScope")
        private String targetScope;

        private Data(Builder builder) {
            this.features = builder.features;
            this.instanceId = builder.instanceId;
            this.resourceName = builder.resourceName;
            this.targetScope = builder.targetScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.List<Features> getFeatures() {
            return this.features;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return targetScope
         */
        public String getTargetScope() {
            return this.targetScope;
        }

        public static final class Builder {
            private java.util.List<Features> features; 
            private String instanceId; 
            private String resourceName; 
            private String targetScope; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.features = model.features;
                this.instanceId = model.instanceId;
                this.resourceName = model.resourceName;
                this.targetScope = model.targetScope;
            } 

            /**
             * Features.
             */
            public Builder features(java.util.List<Features> features) {
                this.features = features;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * TargetScope.
             */
            public Builder targetScope(String targetScope) {
                this.targetScope = targetScope;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
