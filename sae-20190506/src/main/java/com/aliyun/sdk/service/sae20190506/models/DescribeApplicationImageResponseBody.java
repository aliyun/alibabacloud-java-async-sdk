// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationImageResponseBody</p>
 */
public class DescribeApplicationImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationImageResponseBody create() {
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the image of the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code. Valid values:
         * <p>
         * 
         * *   If the call is successful, the **ErrorCode** parameter is not returned.
         * *   If the call fails, the **ErrorCode** parameter is returned. For more information, see the **Error codes** section in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message. Valid values:
         * <p>
         * 
         * *   success: If the call is successful, **success** is returned.
         * *   An error code: If the call fails, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the information about the image was obtained. Valid values:
         * <p>
         * 
         * *   **true**: The information was obtained.
         * *   **false**: The information failed to be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationImageResponseBody build() {
            return new DescribeApplicationImageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrUrl")
        private String crUrl;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private String logo;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoOriginType")
        private String repoOriginType;

        @com.aliyun.core.annotation.NameInMap("RepoTag")
        private String repoTag;

        @com.aliyun.core.annotation.NameInMap("RepoType")
        private String repoType;

        private Data(Builder builder) {
            this.crUrl = builder.crUrl;
            this.logo = builder.logo;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoOriginType = builder.repoOriginType;
            this.repoTag = builder.repoTag;
            this.repoType = builder.repoType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return crUrl
         */
        public String getCrUrl() {
            return this.crUrl;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoOriginType
         */
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        /**
         * @return repoTag
         */
        public String getRepoTag() {
            return this.repoTag;
        }

        /**
         * @return repoType
         */
        public String getRepoType() {
            return this.repoType;
        }

        public static final class Builder {
            private String crUrl; 
            private String logo; 
            private String regionId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoOriginType; 
            private String repoTag; 
            private String repoType; 

            /**
             * This parameter is reserved.
             */
            public Builder crUrl(String crUrl) {
                this.crUrl = crUrl;
                return this;
            }

            /**
             * This parameter is reserved.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the repository.
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * The name of the namespace to which the image repository belongs.
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * The type of the repository. Only Container Registry is supported.
             */
            public Builder repoOriginType(String repoOriginType) {
                this.repoOriginType = repoOriginType;
                return this;
            }

            /**
             * The tag of the image.
             */
            public Builder repoTag(String repoTag) {
                this.repoTag = repoTag;
                return this;
            }

            /**
             * This parameter is reserved.
             */
            public Builder repoType(String repoType) {
                this.repoType = repoType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
