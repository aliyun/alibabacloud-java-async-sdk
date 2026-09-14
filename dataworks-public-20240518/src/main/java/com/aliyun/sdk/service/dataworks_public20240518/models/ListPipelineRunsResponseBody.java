// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRunsResponseBody</p>
 */
public class ListPipelineRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPipelineRunsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPipelineRunsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPipelineRunsResponseBody build() {
            return new ListPipelineRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunsResponseBody</p>
     */
    public static class Stages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.Map<String, ?> detail;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Stages(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.detail = builder.detail;
            this.message = builder.message;
            this.name = builder.name;
            this.status = builder.status;
            this.step = builder.step;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stages create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detail
         */
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private java.util.Map<String, ?> detail; 
            private String message; 
            private String name; 
            private String status; 
            private Integer step; 
            private String type; 

            private Builder() {
            } 

            private Builder(Stages model) {
                this.code = model.code;
                this.description = model.description;
                this.detail = model.detail;
                this.message = model.message;
                this.name = model.name;
                this.status = model.status;
                this.step = model.step;
                this.type = model.type;
            } 

            /**
             * <p>The code of the deployment stage.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV_CHECK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The stage description.</p>
             * 
             * <strong>example:</strong>
             * <p>Check before going online to development</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Additional information about the deployment stage.</p>
             */
            public Builder detail(java.util.Map<String, ?> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The error message returned if the deployment stage fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Error message</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The stage name.</p>
             * 
             * <strong>example:</strong>
             * <p>Check before going online to development</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the deployment stage.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><code>Init</code>: Initializing</p>
             * </li>
             * <li><p><code>Running</code>: Running</p>
             * </li>
             * <li><p><code>Success</code>: Succeeded</p>
             * </li>
             * <li><p><code>Fail</code>: Failed</p>
             * </li>
             * <li><p><code>Termination</code>: Terminated</p>
             * </li>
             * <li><p><code>Cancel</code>: Canceled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The step number of the deployment stage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * <p>The type of the deployment stage.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><code>Deploy</code>: A deploy operation</p>
             * </li>
             * <li><p><code>Check</code>: A check operation</p>
             * </li>
             * <li><p><code>Offline</code>: An offline operation</p>
             * </li>
             * <li><p><code>Build</code>: A build operation</p>
             * </li>
             * <li><p><code>Delete</code>: A delete operation</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Check</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Stages build() {
                return new Stages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunsResponseBody</p>
     */
    public static class PipelineRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private java.util.List<Stages> stages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PipelineRuns(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.id = builder.id;
            this.message = builder.message;
            this.modifyTime = builder.modifyTime;
            this.projectId = builder.projectId;
            this.stages = builder.stages;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRuns create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return stages
         */
        public java.util.List<Stages> getStages() {
            return this.stages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String description; 
            private String id; 
            private String message; 
            private Long modifyTime; 
            private Long projectId; 
            private java.util.List<Stages> stages; 
            private String status; 

            private Builder() {
            } 

            private Builder(PipelineRuns model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.id = model.id;
                this.message = model.message;
                this.modifyTime = model.modifyTime;
                this.projectId = model.projectId;
                this.stages = model.stages;
                this.status = model.status;
            } 

            /**
             * <p>The creation timestamp of the deployment pipeline run.</p>
             * 
             * <strong>example:</strong>
             * <p>1702736654000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the deployment pipeline run.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the deployment pipeline run.</p>
             * 
             * <strong>example:</strong>
             * <p>Release process description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the deployment pipeline run.</p>
             * 
             * <strong>example:</strong>
             * <p>097c73fe-ed6e-4fb1-b109-a5d59e46cd58</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The error message returned if the deployment pipeline run fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Error message</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The last modification timestamp of the deployment pipeline run.</p>
             * 
             * <strong>example:</strong>
             * <p>1702736654000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>70199</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>A list of deployment stages.</p>
             */
            public Builder stages(java.util.List<Stages> stages) {
                this.stages = stages;
                return this;
            }

            /**
             * <p>The status of the deployment pipeline run.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><code>Init</code>: Initializing</p>
             * </li>
             * <li><p><code>Running</code>: Running</p>
             * </li>
             * <li><p><code>Success</code>: Succeeded</p>
             * </li>
             * <li><p><code>Fail</code>: Failed</p>
             * </li>
             * <li><p><code>Termination</code>: Terminated</p>
             * </li>
             * <li><p><code>Cancel</code>: Canceled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PipelineRuns build() {
                return new PipelineRuns(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelineRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRunsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PipelineRuns")
        private java.util.List<PipelineRuns> pipelineRuns;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.pipelineRuns = builder.pipelineRuns;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
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
         * @return pipelineRuns
         */
        public java.util.List<PipelineRuns> getPipelineRuns() {
            return this.pipelineRuns;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<PipelineRuns> pipelineRuns; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.pipelineRuns = model.pipelineRuns;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The returned page number.</p>
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
             * <p>A list of deployment pipeline runs.</p>
             */
            public Builder pipelineRuns(java.util.List<PipelineRuns> pipelineRuns) {
                this.pipelineRuns = pipelineRuns;
                return this;
            }

            /**
             * <p>The total number of entries that meet the filter criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>2524</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
