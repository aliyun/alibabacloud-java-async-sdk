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
 * {@link ListDataAgentAccuracyTestInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAgentAccuracyTestInstancesResponseBody</p>
 */
public class ListDataAgentAccuracyTestInstancesResponseBody extends TeaModel {
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
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private ListDataAgentAccuracyTestInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timestamp = builder.timestamp;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentAccuracyTestInstancesResponseBody create() {
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
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String success; 
        private String timestamp; 
        private String total; 

        private Builder() {
        } 

        private Builder(ListDataAgentAccuracyTestInstancesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timestamp = model.timestamp;
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page. You can use this parameter together with NextToken to implement paging.</p>
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
         * <p>zCXS*****</p>
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
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The operation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1768270172</p>
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public ListDataAgentAccuracyTestInstancesResponseBody build() {
            return new ListDataAgentAccuracyTestInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAgentAccuracyTestInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAgentAccuracyTestInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccuracyTestInsId")
        private String accuracyTestInsId;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Datasource")
        private String datasource;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
        private String maxConcurrent;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedDelete")
        private String needDelete;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.accuracyTestInsId = builder.accuracyTestInsId;
            this.agentId = builder.agentId;
            this.creator = builder.creator;
            this.datasource = builder.datasource;
            this.fileId = builder.fileId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.language = builder.language;
            this.maxConcurrent = builder.maxConcurrent;
            this.mode = builder.mode;
            this.name = builder.name;
            this.needDelete = builder.needDelete;
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
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return datasource
         */
        public String getDatasource() {
            return this.datasource;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return maxConcurrent
         */
        public String getMaxConcurrent() {
            return this.maxConcurrent;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needDelete
         */
        public String getNeedDelete() {
            return this.needDelete;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accuracyTestInsId; 
            private String agentId; 
            private String creator; 
            private String datasource; 
            private String fileId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String language; 
            private String maxConcurrent; 
            private Integer mode; 
            private String name; 
            private String needDelete; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accuracyTestInsId = model.accuracyTestInsId;
                this.agentId = model.agentId;
                this.creator = model.creator;
                this.datasource = model.datasource;
                this.fileId = model.fileId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.language = model.language;
                this.maxConcurrent = model.maxConcurrent;
                this.mode = model.mode;
                this.name = model.name;
                this.needDelete = model.needDelete;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The accuracy test instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
             */
            public Builder accuracyTestInsId(String accuracyTestInsId) {
                this.accuracyTestInsId = accuracyTestInsId;
                return this;
            }

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-4x8uzp5wjqu4xxxxxxxxxx</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The UID of the workspace creator.</p>
             * 
             * <strong>example:</strong>
             * <p>20282*****7591</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Datasource.
             */
            public Builder datasource(String datasource) {
                this.datasource = datasource;
                return this;
            }

            /**
             * <p>The ID of the test set file.</p>
             * 
             * <strong>example:</strong>
             * <p>f-8*******01m</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-30T07:31:09.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-30T07:31:09.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The language used for the analysis task.</p>
             * 
             * <strong>example:</strong>
             * <p>CHINESE</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The maximum number of concurrent sessions during the test.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxConcurrent(String maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * <p>The analysis mode to be tested.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The custom agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent测试名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether sessions are displayed after analysis. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needDelete(String needDelete) {
                this.needDelete = needDelete;
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
