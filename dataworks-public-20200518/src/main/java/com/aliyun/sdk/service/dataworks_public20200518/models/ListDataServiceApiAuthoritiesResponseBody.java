// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListDataServiceApiAuthoritiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiAuthoritiesResponseBody</p>
 */
public class ListDataServiceApiAuthoritiesResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDataServiceApiAuthoritiesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The APIs on which other users are granted the access permissions.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServiceApiAuthoritiesResponseBody build() {
            return new ListDataServiceApiAuthoritiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiAuthoritiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiAuthoritiesResponseBody</p>
     */
    public static class AuthorizationRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
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

            private Builder() {
            } 

            private Builder(AuthorizationRecords model) {
                this.createdTime = model.createdTime;
                this.creatorId = model.creatorId;
                this.endTime = model.endTime;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The time when the access permissions on the API were granted to other users.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the API owner.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The end time of the validity period of the authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-24T00:21:01+0800</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the access permissions on the API are granted.</p>
             * 
             * <strong>example:</strong>
             * <p>10004</p>
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
    /**
     * 
     * {@link ListDataServiceApiAuthoritiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiAuthoritiesResponseBody</p>
     */
    public static class ApiAuthorizationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiPath")
        private String apiPath;

        @com.aliyun.core.annotation.NameInMap("ApiStatus")
        private Integer apiStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizationRecords")
        private java.util.List<AuthorizationRecords> authorizationRecords;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
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
        public java.util.List<AuthorizationRecords> getAuthorizationRecords() {
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
            private java.util.List<AuthorizationRecords> authorizationRecords; 
            private String createdTime; 
            private String creatorId; 
            private String groupId; 
            private String modifiedTime; 
            private Long projectId; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(ApiAuthorizationList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.apiPath = model.apiPath;
                this.apiStatus = model.apiStatus;
                this.authorizationRecords = model.authorizationRecords;
                this.createdTime = model.createdTime;
                this.creatorId = model.creatorId;
                this.groupId = model.groupId;
                this.modifiedTime = model.modifiedTime;
                this.projectId = model.projectId;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10002</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>My API name</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/test/1</p>
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder apiStatus(Integer apiStatus) {
                this.apiStatus = apiStatus;
                return this;
            }

            /**
             * <p>The authorization records.</p>
             */
            public Builder authorizationRecords(java.util.List<AuthorizationRecords> authorizationRecords) {
                this.authorizationRecords = authorizationRecords;
                return this;
            }

            /**
             * <p>The time when the API was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the API owner.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ab123</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the API was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
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
    /**
     * 
     * {@link ListDataServiceApiAuthoritiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiAuthoritiesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiAuthorizationList")
        private java.util.List<ApiAuthorizationList> apiAuthorizationList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<ApiAuthorizationList> getApiAuthorizationList() {
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
            private java.util.List<ApiAuthorizationList> apiAuthorizationList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiAuthorizationList = model.apiAuthorizationList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The APIs on which other users are granted the access permissions.</p>
             */
            public Builder apiAuthorizationList(java.util.List<ApiAuthorizationList> apiAuthorizationList) {
                this.apiAuthorizationList = apiAuthorizationList;
                return this;
            }

            /**
             * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
