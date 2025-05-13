// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListApplicationsForSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForSwimmingLaneResponseBody</p>
 */
public class ListApplicationsForSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApplicationsForSwimmingLaneResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForSwimmingLaneResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListApplicationsForSwimmingLaneResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public ListApplicationsForSwimmingLaneResponseBody build() {
            return new ListApplicationsForSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsForSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForSwimmingLaneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BaseAppId")
        private String baseAppId;

        @com.aliyun.core.annotation.NameInMap("BaseAppName")
        private String baseAppName;

        @com.aliyun.core.annotation.NameInMap("MseAppId")
        private String mseAppId;

        @com.aliyun.core.annotation.NameInMap("MseAppName")
        private String mseAppName;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        @com.aliyun.core.annotation.NameInMap("ServiceTags")
        private java.util.Map<String, String> serviceTags;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.baseAppId = builder.baseAppId;
            this.baseAppName = builder.baseAppName;
            this.mseAppId = builder.mseAppId;
            this.mseAppName = builder.mseAppName;
            this.mseNamespaceId = builder.mseNamespaceId;
            this.serviceTags = builder.serviceTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return baseAppId
         */
        public String getBaseAppId() {
            return this.baseAppId;
        }

        /**
         * @return baseAppName
         */
        public String getBaseAppName() {
            return this.baseAppName;
        }

        /**
         * @return mseAppId
         */
        public String getMseAppId() {
            return this.mseAppId;
        }

        /**
         * @return mseAppName
         */
        public String getMseAppName() {
            return this.mseAppName;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        /**
         * @return serviceTags
         */
        public java.util.Map<String, String> getServiceTags() {
            return this.serviceTags;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String baseAppId; 
            private String baseAppName; 
            private String mseAppId; 
            private String mseAppName; 
            private String mseNamespaceId; 
            private java.util.Map<String, String> serviceTags; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.baseAppId = model.baseAppId;
                this.baseAppName = model.baseAppName;
                this.mseAppId = model.mseAppId;
                this.mseAppName = model.mseAppName;
                this.mseNamespaceId = model.mseNamespaceId;
                this.serviceTags = model.serviceTags;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BaseAppId.
             */
            public Builder baseAppId(String baseAppId) {
                this.baseAppId = baseAppId;
                return this;
            }

            /**
             * BaseAppName.
             */
            public Builder baseAppName(String baseAppName) {
                this.baseAppName = baseAppName;
                return this;
            }

            /**
             * MseAppId.
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * MseAppName.
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            /**
             * ServiceTags.
             */
            public Builder serviceTags(java.util.Map<String, String> serviceTags) {
                this.serviceTags = serviceTags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
