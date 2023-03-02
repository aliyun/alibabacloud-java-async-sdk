// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessResponseBody} extends {@link TeaModel}
 *
 * <p>GetBusinessResponseBody</p>
 */
public class GetBusinessResponseBody extends TeaModel {
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

    private GetBusinessResponseBody(Builder builder) {
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

    public static GetBusinessResponseBody create() {
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
         * The details of the workflow.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBusinessResponseBody build() {
            return new GetBusinessResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BusinessId")
        private Long businessId;

        @NameInMap("BusinessName")
        private String businessName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("UseType")
        private String useType;

        private Data(Builder builder) {
            this.businessId = builder.businessId;
            this.businessName = builder.businessName;
            this.description = builder.description;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.useType = builder.useType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessId
         */
        public Long getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return useType
         */
        public String getUseType() {
            return this.useType;
        }

        public static final class Builder {
            private Long businessId; 
            private String businessName; 
            private String description; 
            private String owner; 
            private String projectId; 
            private String useType; 

            /**
             * The ID of the workflow.
             */
            public Builder businessId(Long businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * The name of the workflow.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * The description of the workflow.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the workflow owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the workspace to which the workflow belongs.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The module to which the workflow belongs. Valid values: NORMAL and MANUAL_BIZ.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
