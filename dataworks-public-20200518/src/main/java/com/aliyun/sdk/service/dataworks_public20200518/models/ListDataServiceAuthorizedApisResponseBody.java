// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceAuthorizedApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceAuthorizedApisResponseBody</p>
 */
public class ListDataServiceAuthorizedApisResponseBody extends TeaModel {
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

    private ListDataServiceAuthorizedApisResponseBody(Builder builder) {
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

    public static ListDataServiceAuthorizedApisResponseBody create() {
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
         * The information about the APIs that you are authorized to access.
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
         * The ID of the request.
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

        public ListDataServiceAuthorizedApisResponseBody build() {
            return new ListDataServiceAuthorizedApisResponseBody(this);
        } 

    } 

    public static class ApiAuthorizedList extends TeaModel {
        @NameInMap("ApiId")
        private Long apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("ApiStatus")
        private Integer apiStatus;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("GrantCreatedTime")
        private String grantCreatedTime;

        @NameInMap("GrantEndTime")
        private String grantEndTime;

        @NameInMap("GrantOperatorId")
        private String grantOperatorId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("TenantId")
        private Long tenantId;

        private ApiAuthorizedList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.apiStatus = builder.apiStatus;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.grantCreatedTime = builder.grantCreatedTime;
            this.grantEndTime = builder.grantEndTime;
            this.grantOperatorId = builder.grantOperatorId;
            this.groupId = builder.groupId;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiAuthorizedList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
        }

        /**
         * @return apiStatus
         */
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return grantCreatedTime
         */
        public String getGrantCreatedTime() {
            return this.grantCreatedTime;
        }

        /**
         * @return grantEndTime
         */
        public String getGrantEndTime() {
            return this.grantEndTime;
        }

        /**
         * @return grantOperatorId
         */
        public String getGrantOperatorId() {
            return this.grantOperatorId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private String apiPath; 
            private Integer apiStatus; 
            private String createdTime; 
            private String creatorId; 
            private String grantCreatedTime; 
            private String grantEndTime; 
            private String grantOperatorId; 
            private String groupId; 
            private String modifiedTime; 
            private Long projectId; 
            private Long tenantId; 

            /**
             * The ID of the API.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The name of the API.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The path of the API.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.
             */
            public Builder apiStatus(Integer apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * The time when the API was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the API owner.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The time when the access permissions of the API were granted.
             */
            public Builder grantCreatedTime(String grantCreatedTime) {
                this.grantCreatedTime = grantCreatedTime;
                return this;
            }

            /**
             * The expiration time for the granted access permissions of the API.
             */
            public Builder grantEndTime(String grantEndTime) {
                this.grantEndTime = grantEndTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who granted the access permissions of the API.
             */
            public Builder grantOperatorId(String grantOperatorId) {
                this.grantOperatorId = grantOperatorId;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The time when the API was last updated.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ApiAuthorizedList build() {
                return new ApiAuthorizedList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApiAuthorizedList")
        private java.util.List < ApiAuthorizedList> apiAuthorizedList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.apiAuthorizedList = builder.apiAuthorizedList;
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
         * @return apiAuthorizedList
         */
        public java.util.List < ApiAuthorizedList> getApiAuthorizedList() {
            return this.apiAuthorizedList;
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
            private java.util.List < ApiAuthorizedList> apiAuthorizedList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of APIs that you are authorized to access.
             */
            public Builder apiAuthorizedList(java.util.List < ApiAuthorizedList> apiAuthorizedList) {
                this.apiAuthorizedList = apiAuthorizedList;
                return this;
            }

            /**
             * The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
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
