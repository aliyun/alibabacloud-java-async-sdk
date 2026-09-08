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
         * <p>The response struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>NesLo****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
             * <p>The accuracy test instance ID to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
             */
            public Builder accuracyTestInsId(String accuracyTestInsId) {
                this.accuracyTestInsId = accuracyTestInsId;
                return this;
            }

            /**
             * <p>The accuracy test task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
             */
            public Builder accuracyTestTaskId(String accuracyTestTaskId) {
                this.accuracyTestTaskId = accuracyTestTaskId;
                return this;
            }

            /**
             * <p>The number of completed test subtasks.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder finishedTaskNumber(Integer finishedTaskNumber) {
                this.finishedTaskNumber = finishedTaskNumber;
                return this;
            }

            /**
             * <p>The time when the document was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-30T08:03:30.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the document was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-30T08:03:30.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions during the test.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * <p>Specifies whether sessions are displayed after analysis. This feature is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needDelete(Boolean needDelete) {
                this.needDelete = needDelete;
                return this;
            }

            /**
             * <p>The status of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>0 PENDING,1 RUNNING,2 COMPLETED,3 STOPPED,4 FAILED</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of subtasks in the accuracy test task.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalTaskNumber(Integer totalTaskNumber) {
                this.totalTaskNumber = totalTaskNumber;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8wfig6l33n4f4xxxxxxxxxx</p>
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
