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
 * {@link ListSentinelBlockFallbackDefinitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSentinelBlockFallbackDefinitionsResponseBody</p>
 */
public class ListSentinelBlockFallbackDefinitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSentinelBlockFallbackDefinitionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSentinelBlockFallbackDefinitionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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

        public ListSentinelBlockFallbackDefinitionsResponseBody build() {
            return new ListSentinelBlockFallbackDefinitionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSentinelBlockFallbackDefinitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSentinelBlockFallbackDefinitionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("FallbackBehavior")
        private java.util.Map<String, ?> fallbackBehavior;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ResourceClassification")
        private String resourceClassification;

        @com.aliyun.core.annotation.NameInMap("TargetMap")
        private java.util.Map<String, ?> targetMap;

        private Data(Builder builder) {
            this.appName = builder.appName;
            this.fallbackBehavior = builder.fallbackBehavior;
            this.id = builder.id;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.resourceClassification = builder.resourceClassification;
            this.targetMap = builder.targetMap;
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
         * @return fallbackBehavior
         */
        public java.util.Map<String, ?> getFallbackBehavior() {
            return this.fallbackBehavior;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resourceClassification
         */
        public String getResourceClassification() {
            return this.resourceClassification;
        }

        /**
         * @return targetMap
         */
        public java.util.Map<String, ?> getTargetMap() {
            return this.targetMap;
        }

        public static final class Builder {
            private String appName; 
            private java.util.Map<String, ?> fallbackBehavior; 
            private String id; 
            private String name; 
            private String namespace; 
            private String resourceClassification; 
            private java.util.Map<String, ?> targetMap; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * FallbackBehavior.
             */
            public Builder fallbackBehavior(java.util.Map<String, ?> fallbackBehavior) {
                this.fallbackBehavior = fallbackBehavior;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * ResourceClassification.
             */
            public Builder resourceClassification(String resourceClassification) {
                this.resourceClassification = resourceClassification;
                return this;
            }

            /**
             * TargetMap.
             */
            public Builder targetMap(java.util.Map<String, ?> targetMap) {
                this.targetMap = targetMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
