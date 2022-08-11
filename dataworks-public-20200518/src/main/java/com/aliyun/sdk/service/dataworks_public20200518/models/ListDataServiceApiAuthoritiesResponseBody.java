// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApiAuthoritiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiAuthoritiesResponseBody</p>
 */
public class ListDataServiceApiAuthoritiesResponseBody extends TeaModel {
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

    private ListDataServiceApiAuthoritiesResponseBody(Builder builder) {
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

    public static ListDataServiceApiAuthoritiesResponseBody create() {
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

        public ListDataServiceApiAuthoritiesResponseBody build() {
            return new ListDataServiceApiAuthoritiesResponseBody(this);
        } 

    } 

    public static class AuthorizationRecords extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ProjectId")
        private Long projectId;

        private AuthorizationRecords(Builder builder) {
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.endTime = builder.endTime;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRecords create() {
            return builder().build();
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String createdTime; 
            private String creatorId; 
            private String endTime; 
            private Long projectId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public AuthorizationRecords build() {
                return new AuthorizationRecords(this);
            } 

        } 

    }
    public static class ApiAuthorizationList extends TeaModel {
        @NameInMap("ApiId")
        private Long apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("ApiStatus")
        private Integer apiStatus;

        @NameInMap("AuthorizationRecords")
        private java.util.List < AuthorizationRecords> authorizationRecords;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("TenantId")
        private Long tenantId;

        private ApiAuthorizationList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.apiPath = builder.apiPath;
            this.apiStatus = builder.apiStatus;
            this.authorizationRecords = builder.authorizationRecords;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.groupId = builder.groupId;
            this.modifiedTime = builder.modifiedTime;
            this.projectId = builder.projectId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiAuthorizationList create() {
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
         * @return authorizationRecords
         */
        public java.util.List < AuthorizationRecords> getAuthorizationRecords() {
            return this.authorizationRecords;
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
            private java.util.List < AuthorizationRecords> authorizationRecords; 
            private String createdTime; 
            private String creatorId; 
            private String groupId; 
            private String modifiedTime; 
            private Long projectId; 
            private Long tenantId; 

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * ApiStatus.
             */
            public Builder apiStatus(Integer apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * AuthorizationRecords.
             */
            public Builder authorizationRecords(java.util.List < AuthorizationRecords> authorizationRecords) {
                this.authorizationRecords = authorizationRecords;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ApiAuthorizationList build() {
                return new ApiAuthorizationList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApiAuthorizationList")
        private java.util.List < ApiAuthorizationList> apiAuthorizationList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.apiAuthorizationList = builder.apiAuthorizationList;
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
         * @return apiAuthorizationList
         */
        public java.util.List < ApiAuthorizationList> getApiAuthorizationList() {
            return this.apiAuthorizationList;
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
            private java.util.List < ApiAuthorizationList> apiAuthorizationList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * ApiAuthorizationList.
             */
            public Builder apiAuthorizationList(java.util.List < ApiAuthorizationList> apiAuthorizationList) {
                this.apiAuthorizationList = apiAuthorizationList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
