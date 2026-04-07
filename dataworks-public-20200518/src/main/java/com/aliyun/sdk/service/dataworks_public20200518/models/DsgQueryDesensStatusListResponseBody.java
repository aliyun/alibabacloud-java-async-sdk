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
 * {@link DsgQueryDesensStatusListResponseBody} extends {@link TeaModel}
 *
 * <p>DsgQueryDesensStatusListResponseBody</p>
 */
public class DsgQueryDesensStatusListResponseBody extends TeaModel {
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

    private DsgQueryDesensStatusListResponseBody(Builder builder) {
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

    public static DsgQueryDesensStatusListResponseBody create() {
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

        private Builder(DsgQueryDesensStatusListResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public DsgQueryDesensStatusListResponseBody build() {
            return new DsgQueryDesensStatusListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DsgQueryDesensStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DsgQueryDesensStatusListResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesensStatus")
        private Integer desensStatus;

        @com.aliyun.core.annotation.NameInMap("HandleSpace")
        private String handleSpace;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("WorkspaceIdentifier")
        private String workspaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private PageData(Builder builder) {
            this.desensStatus = builder.desensStatus;
            this.handleSpace = builder.handleSpace;
            this.id = builder.id;
            this.workspaceIdentifier = builder.workspaceIdentifier;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return desensStatus
         */
        public Integer getDesensStatus() {
            return this.desensStatus;
        }

        /**
         * @return handleSpace
         */
        public String getHandleSpace() {
            return this.handleSpace;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return workspaceIdentifier
         */
        public String getWorkspaceIdentifier() {
            return this.workspaceIdentifier;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Integer desensStatus; 
            private String handleSpace; 
            private Long id; 
            private String workspaceIdentifier; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.desensStatus = model.desensStatus;
                this.handleSpace = model.handleSpace;
                this.id = model.id;
                this.workspaceIdentifier = model.workspaceIdentifier;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * DesensStatus.
             */
            public Builder desensStatus(Integer desensStatus) {
                this.desensStatus = desensStatus;
                return this;
            }

            /**
             * HandleSpace.
             */
            public Builder handleSpace(String handleSpace) {
                this.handleSpace = handleSpace;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * WorkspaceIdentifier.
             */
            public Builder workspaceIdentifier(String workspaceIdentifier) {
                this.workspaceIdentifier = workspaceIdentifier;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DsgQueryDesensStatusListResponseBody} extends {@link TeaModel}
     *
     * <p>DsgQueryDesensStatusListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageData = builder.pageData;
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
         * @return pageData
         */
        public java.util.List<PageData> getPageData() {
            return this.pageData;
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
            private java.util.List<PageData> pageData; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageData = model.pageData;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageData.
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
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
