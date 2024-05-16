// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessResponseBody</p>
 */
public class ListBusinessResponseBody extends TeaModel {
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

    private ListBusinessResponseBody(Builder builder) {
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

    public static ListBusinessResponseBody create() {
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
         * The information about the workflows returned.
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBusinessResponseBody build() {
            return new ListBusinessResponseBody(this);
        } 

    } 

    public static class Business extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private Long businessId;

        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("UseType")
        private String useType;

        private Business(Builder builder) {
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

        public static Business create() {
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
        public Long getProjectId() {
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
            private Long projectId; 
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
             * The owner of the workflow.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the workspace to which the workflow belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The module to which the workflow belongs. Valid values: NORMAL and MANUAL_BIZ. The value NORMAL indicates that the workflow belongs to auto triggered workflows. The value MANUAL_BIZ indicates that the workflow belongs to manually triggered workflows.
             */
            public Builder useType(String useType) {
                this.useType = useType;
                return this;
            }

            public Business build() {
                return new Business(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Business")
        private java.util.List < Business> business;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.business = builder.business;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public java.util.List < Business> getBusiness() {
            return this.business;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Business> business; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The details of the workflow.
             */
            public Builder business(java.util.List < Business> business) {
                this.business = business;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
