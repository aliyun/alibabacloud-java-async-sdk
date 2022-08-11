// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApplicationResponseBody</p>
 */
public class GetDataServiceApplicationResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetDataServiceApplicationResponseBody build() {
            return new GetDataServiceApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ApplicationCode")
        private String applicationCode;

        @NameInMap("ApplicationId")
        private Long applicationId;

        @NameInMap("ApplicationKey")
        private String applicationKey;

        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ApplicationSecret")
        private String applicationSecret;

        @NameInMap("ProjectId")
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
             * ApplicationCode.
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationKey.
             */
            public Builder applicationKey(String applicationKey) {
                this.applicationKey = applicationKey;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * ApplicationSecret.
             */
            public Builder applicationSecret(String applicationSecret) {
                this.applicationSecret = applicationSecret;
                return this;
            }

            /**
             * ProjectId.
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
