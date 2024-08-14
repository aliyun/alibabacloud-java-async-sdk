// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApplicationResponseBody</p>
 */
public class GetDataServiceApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceApplicationResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApplicationResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the application.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataServiceApplicationResponseBody build() {
            return new GetDataServiceApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCode")
        private String applicationCode;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationKey")
        private String applicationKey;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationSecret")
        private String applicationSecret;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Data(Builder builder) {
            this.applicationCode = builder.applicationCode;
            this.applicationId = builder.applicationId;
            this.applicationKey = builder.applicationKey;
            this.applicationName = builder.applicationName;
            this.applicationSecret = builder.applicationSecret;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationCode
         */
        public String getApplicationCode() {
            return this.applicationCode;
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationKey
         */
        public String getApplicationKey() {
            return this.applicationKey;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationSecret
         */
        public String getApplicationSecret() {
            return this.applicationSecret;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String applicationCode; 
            private Long applicationId; 
            private String applicationKey; 
            private String applicationName; 
            private String applicationSecret; 
            private Long projectId; 

            /**
             * The AppCode for simple authentication. You can select simple authentication or signature authentication when you call an API operation.
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * The application ID.
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The AppKey for signature authentication. You can select simple authentication or signature authentication when you call an API operation.
             */
            public Builder applicationKey(String applicationKey) {
                this.applicationKey = applicationKey;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The AppSecret for signature authentication. You can select simple authentication or signature authentication when you call an API operation.
             */
            public Builder applicationSecret(String applicationSecret) {
                this.applicationSecret = applicationSecret;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
