// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentAccuracyTestTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentAccuracyTestTasksResponseBody</p>
 */
public class ListDataAgentAccuracyTestTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListDataAgentAccuracyTestTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentAccuracyTestTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListDataAgentAccuracyTestTasksResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-xxx-FD8AD04A63B6</p>
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListDataAgentAccuracyTestTasksResponseBody build() {
            return new ListDataAgentAccuracyTestTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentAccuracyTestTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentAccuracyTestTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyTestInsId")
        private String accuracyTestInsId;

        @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
        private String accuracyTestTaskId;

        @com.aliyun.core.annotation.NameInMap("FinishedTaskNumber")
        private Integer finishedTaskNumber;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
        private Integer maxConcurrent;

        @com.aliyun.core.annotation.NameInMap("NeedDelete")
        private Boolean needDelete;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalTaskNumber")
        private Integer totalTaskNumber;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.accuracyTestInsId = builder.accuracyTestInsId;
            this.accuracyTestTaskId = builder.accuracyTestTaskId;
            this.finishedTaskNumber = builder.finishedTaskNumber;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.maxConcurrent = builder.maxConcurrent;
            this.needDelete = builder.needDelete;
            this.status = builder.status;
            this.totalTaskNumber = builder.totalTaskNumber;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accuracyTestInsId
         */
        public String getAccuracyTestInsId() {
            return this.accuracyTestInsId;
        }

        /**
         * @return accuracyTestTaskId
         */
        public String getAccuracyTestTaskId() {
            return this.accuracyTestTaskId;
        }

        /**
         * @return finishedTaskNumber
         */
        public Integer getFinishedTaskNumber() {
            return this.finishedTaskNumber;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return maxConcurrent
         */
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        /**
         * @return needDelete
         */
        public Boolean getNeedDelete() {
            return this.needDelete;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalTaskNumber
         */
        public Integer getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accuracyTestInsId; 
            private String accuracyTestTaskId; 
            private Integer finishedTaskNumber; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer maxConcurrent; 
            private Boolean needDelete; 
            private Integer status; 
            private Integer totalTaskNumber; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accuracyTestInsId = model.accuracyTestInsId;
                this.accuracyTestTaskId = model.accuracyTestTaskId;
                this.finishedTaskNumber = model.finishedTaskNumber;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.maxConcurrent = model.maxConcurrent;
                this.needDelete = model.needDelete;
                this.status = model.status;
                this.totalTaskNumber = model.totalTaskNumber;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * AccuracyTestInsId.
             */
            public Builder accuracyTestInsId(String accuracyTestInsId) {
                this.accuracyTestInsId = accuracyTestInsId;
                return this;
            }

            /**
             * AccuracyTestTaskId.
             */
            public Builder accuracyTestTaskId(String accuracyTestTaskId) {
                this.accuracyTestTaskId = accuracyTestTaskId;
                return this;
            }

            /**
             * FinishedTaskNumber.
             */
            public Builder finishedTaskNumber(Integer finishedTaskNumber) {
                this.finishedTaskNumber = finishedTaskNumber;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * MaxConcurrent.
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * NeedDelete.
             */
            public Builder needDelete(Boolean needDelete) {
                this.needDelete = needDelete;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalTaskNumber.
             */
            public Builder totalTaskNumber(Integer totalTaskNumber) {
                this.totalTaskNumber = totalTaskNumber;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
