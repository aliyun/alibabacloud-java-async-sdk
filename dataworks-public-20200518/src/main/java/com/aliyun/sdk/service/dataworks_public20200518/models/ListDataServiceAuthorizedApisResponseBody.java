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
 * {@link ListDataServiceAuthorizedApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceAuthorizedApisResponseBody</p>
 */
public class ListDataServiceAuthorizedApisResponseBody extends TeaModel {
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

        private Builder(ListDataServiceAuthorizedApisResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The information about the APIs that you are authorized to access.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
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

        public ListDataServiceAuthorizedApisResponseBody build() {
            return new ListDataServiceAuthorizedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceAuthorizedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceAuthorizedApisResponseBody</p>
     */
    public static class ApiAuthorizedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiPath")
        private String apiPath;

        @com.aliyun.core.annotation.NameInMap("ApiStatus")
        private Integer apiStatus;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("GrantCreatedTime")
        private String grantCreatedTime;

        @com.aliyun.core.annotation.NameInMap("GrantEndTime")
        private String grantEndTime;

        @com.aliyun.core.annotation.NameInMap("GrantOperatorId")
        private String grantOperatorId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
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

            private Builder() {
            } 

            private Builder(ApiAuthorizedList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.apiPath = model.apiPath;
                this.apiStatus = model.apiStatus;
                this.createdTime = model.createdTime;
                this.creatorId = model.creatorId;
                this.grantCreatedTime = model.grantCreatedTime;
                this.grantEndTime = model.grantEndTime;
                this.grantOperatorId = model.grantOperatorId;
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
             * <p>My API Name</p>
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
             * <p>The time when the access permissions on the API were granted.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-23T00:21:01+0800</p>
             */
            public Builder grantCreatedTime(String grantCreatedTime) {
                this.grantCreatedTime = grantCreatedTime;
                return this;
            }

            /**
             * <p>The expiration time of the access permissions granted on the API.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-24T00:21:01+0800</p>
             */
            public Builder grantEndTime(String grantEndTime) {
                this.grantEndTime = grantEndTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the user who granted the access permissions on the API.</p>
             * 
             * <strong>example:</strong>
             * <p>23456</p>
             */
            public Builder grantOperatorId(String grantOperatorId) {
                this.grantOperatorId = grantOperatorId;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abcde123456789</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the API was last updated.</p>
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

            public ApiAuthorizedList build() {
                return new ApiAuthorizedList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceAuthorizedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceAuthorizedApisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiAuthorizedList")
        private java.util.List<ApiAuthorizedList> apiAuthorizedList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<ApiAuthorizedList> getApiAuthorizedList() {
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
            private java.util.List<ApiAuthorizedList> apiAuthorizedList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiAuthorizedList = model.apiAuthorizedList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The APIs that you are authorized to access.</p>
             */
            public Builder apiAuthorizedList(java.util.List<ApiAuthorizedList> apiAuthorizedList) {
                this.apiAuthorizedList = apiAuthorizedList;
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
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
