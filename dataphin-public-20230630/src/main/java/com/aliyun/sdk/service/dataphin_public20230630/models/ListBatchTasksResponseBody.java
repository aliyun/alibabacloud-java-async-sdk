// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListBatchTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListBatchTasksResponseBody</p>
 */
public class ListBatchTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBatchTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBatchTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListBatchTasksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paginated result of the task query.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBatchTasksResponseBody build() {
            return new ListBatchTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListBatchTasksResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("LastSubmitStatus")
        private String lastSubmitStatus;

        @com.aliyun.core.annotation.NameInMap("LastVersion")
        private Integer lastVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeOutputNameList")
        private java.util.List<String> nodeOutputNameList;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private Integer nodeType;

        @com.aliyun.core.annotation.NameInMap("OperatorType")
        private Integer operatorType;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("Published")
        private Boolean published;

        @com.aliyun.core.annotation.NameInMap("Released")
        private Boolean released;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResultData(Builder builder) {
            this.description = builder.description;
            this.directory = builder.directory;
            this.fileId = builder.fileId;
            this.lastSubmitStatus = builder.lastSubmitStatus;
            this.lastVersion = builder.lastVersion;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutputNameList = builder.nodeOutputNameList;
            this.nodeType = builder.nodeType;
            this.operatorType = builder.operatorType;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.published = builder.published;
            this.released = builder.released;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return lastSubmitStatus
         */
        public String getLastSubmitStatus() {
            return this.lastSubmitStatus;
        }

        /**
         * @return lastVersion
         */
        public Integer getLastVersion() {
            return this.lastVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutputNameList
         */
        public java.util.List<String> getNodeOutputNameList() {
            return this.nodeOutputNameList;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return operatorType
         */
        public Integer getOperatorType() {
            return this.operatorType;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return published
         */
        public Boolean getPublished() {
            return this.published;
        }

        /**
         * @return released
         */
        public Boolean getReleased() {
            return this.released;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String directory; 
            private Long fileId; 
            private String lastSubmitStatus; 
            private Integer lastVersion; 
            private String name; 
            private String nodeId; 
            private String nodeName; 
            private java.util.List<String> nodeOutputNameList; 
            private Integer nodeType; 
            private Integer operatorType; 
            private String ownerName; 
            private String ownerUserId; 
            private Boolean published; 
            private Boolean released; 
            private String status; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.description = model.description;
                this.directory = model.directory;
                this.fileId = model.fileId;
                this.lastSubmitStatus = model.lastSubmitStatus;
                this.lastVersion = model.lastVersion;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeOutputNameList = model.nodeOutputNameList;
                this.nodeType = model.nodeType;
                this.operatorType = model.operatorType;
                this.ownerName = model.ownerName;
                this.ownerUserId = model.ownerUserId;
                this.published = model.published;
                this.released = model.released;
                this.status = model.status;
            } 

            /**
             * <p>The description of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Order detail processing task</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The folder where the task is located.</p>
             * 
             * <strong>example:</strong>
             * <p>/dwd</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The ID of the task file. You can use this ID as the input parameter for the GetBatchTaskInfo operation.</p>
             * 
             * <strong>example:</strong>
             * <p>7090125821589888</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The latest submit status. Valid values: SUBMITTING, SUCCESS, and FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastSubmitStatus(String lastSubmitStatus) {
                this.lastSubmitStatus = lastSubmitStatus;
                return this;
            }

            /**
             * <p>The latest submitted version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder lastVersion(Integer lastVersion) {
                this.lastVersion = lastVersion;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123456</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The list of output table names for the node.</p>
             */
            public Builder nodeOutputNameList(java.util.List<String> nodeOutputNameList) {
                this.nodeOutputNameList = nodeOutputNameList;
                return this;
            }

            /**
             * <p>The type of the node. Valid values: 1 (periodic task) and 3 (manual task).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The task type code.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder operatorType(Integer operatorType) {
                this.operatorType = operatorType;
                return this;
            }

            /**
             * <p>The name of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>Indicates whether the task has been published to the production environment.</p>
             */
            public Builder published(Boolean published) {
                this.published = published;
                return this;
            }

            /**
             * <p>Indicates whether the task has been submitted.</p>
             */
            public Builder released(Boolean released) {
                this.released = released;
                return this;
            }

            /**
             * <p>The status of the task. Valid values: DRAFT, DEVELOP, and SUBMITTED.</p>
             * 
             * <strong>example:</strong>
             * <p>SUBMITTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBatchTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListBatchTasksResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResultData")
        private java.util.List<ResultData> resultData;

        private PageResult(Builder builder) {
            this.count = builder.count;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.resultData = builder.resultData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resultData
         */
        public java.util.List<ResultData> getResultData() {
            return this.resultData;
        }

        public static final class Builder {
            private Integer count; 
            private Integer page; 
            private Integer pageSize; 
            private java.util.List<ResultData> resultData; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.count = model.count;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.resultData = model.resultData;
            } 

            /**
             * <p>The total number of tasks that meet the query conditions, regardless of pagination.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of tasks on the current page.</p>
             */
            public Builder resultData(java.util.List<ResultData> resultData) {
                this.resultData = resultData;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
