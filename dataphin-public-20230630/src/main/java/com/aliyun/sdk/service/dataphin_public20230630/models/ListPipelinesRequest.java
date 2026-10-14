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
 * {@link ListPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelinesRequest</p>
 */
public class ListPipelinesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListCommand listCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.listCommand = builder.listCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return listCommand
     */
    public ListCommand getListCommand() {
        return this.listCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String regionId; 
        private Context context; 
        private ListCommand listCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.listCommand = request.listCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request context.</p>
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>The query parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listCommand(ListCommand listCommand) {
            String listCommandShrink = shrink(listCommand, "ListCommand", "json");
            this.putBodyParameter("ListCommand", listCommandShrink);
            this.listCommand = listCommand;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelinesRequest} extends {@link TeaModel}
     *
     * <p>ListPipelinesRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>The environment identifier. Valid values: DEV: development environment. PROD: production environment. Default value: PROD.</p>
             * 
             * <strong>example:</strong>
             * <p>PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7128268454335680</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPipelinesRequest} extends {@link TeaModel}
     *
     * <p>ListPipelinesRequest</p>
     */
    public static class ListCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorList")
        private java.util.List<String> creatorList;

        @com.aliyun.core.annotation.NameInMap("DevelopOwnerList")
        private java.util.List<String> developOwnerList;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private java.util.List<String> directories;

        @com.aliyun.core.annotation.NameInMap("ExactMatch")
        private Boolean exactMatch;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<String> keywords;

        @com.aliyun.core.annotation.NameInMap("NextCursor")
        private Long nextCursor;

        @com.aliyun.core.annotation.NameInMap("OpsOwnerList")
        private java.util.List<String> opsOwnerList;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PipelineTypeList")
        private java.util.List<Integer> pipelineTypeList;

        @com.aliyun.core.annotation.NameInMap("Recursive")
        private Boolean recursive;

        @com.aliyun.core.annotation.NameInMap("ScheduleTypeList")
        private java.util.List<Integer> scheduleTypeList;

        @com.aliyun.core.annotation.NameInMap("SubmitStatusList")
        private java.util.List<String> submitStatusList;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ListCommand(Builder builder) {
            this.creatorList = builder.creatorList;
            this.developOwnerList = builder.developOwnerList;
            this.directories = builder.directories;
            this.exactMatch = builder.exactMatch;
            this.keywords = builder.keywords;
            this.nextCursor = builder.nextCursor;
            this.opsOwnerList = builder.opsOwnerList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pipelineTypeList = builder.pipelineTypeList;
            this.recursive = builder.recursive;
            this.scheduleTypeList = builder.scheduleTypeList;
            this.submitStatusList = builder.submitStatusList;
            this.tagList = builder.tagList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListCommand create() {
            return builder().build();
        }

        /**
         * @return creatorList
         */
        public java.util.List<String> getCreatorList() {
            return this.creatorList;
        }

        /**
         * @return developOwnerList
         */
        public java.util.List<String> getDevelopOwnerList() {
            return this.developOwnerList;
        }

        /**
         * @return directories
         */
        public java.util.List<String> getDirectories() {
            return this.directories;
        }

        /**
         * @return exactMatch
         */
        public Boolean getExactMatch() {
            return this.exactMatch;
        }

        /**
         * @return keywords
         */
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        /**
         * @return nextCursor
         */
        public Long getNextCursor() {
            return this.nextCursor;
        }

        /**
         * @return opsOwnerList
         */
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pipelineTypeList
         */
        public java.util.List<Integer> getPipelineTypeList() {
            return this.pipelineTypeList;
        }

        /**
         * @return recursive
         */
        public Boolean getRecursive() {
            return this.recursive;
        }

        /**
         * @return scheduleTypeList
         */
        public java.util.List<Integer> getScheduleTypeList() {
            return this.scheduleTypeList;
        }

        /**
         * @return submitStatusList
         */
        public java.util.List<String> getSubmitStatusList() {
            return this.submitStatusList;
        }

        /**
         * @return tagList
         */
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<String> creatorList; 
            private java.util.List<String> developOwnerList; 
            private java.util.List<String> directories; 
            private Boolean exactMatch; 
            private java.util.List<String> keywords; 
            private Long nextCursor; 
            private java.util.List<String> opsOwnerList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private java.util.List<Integer> pipelineTypeList; 
            private Boolean recursive; 
            private java.util.List<Integer> scheduleTypeList; 
            private java.util.List<String> submitStatusList; 
            private java.util.List<String> tagList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ListCommand model) {
                this.creatorList = model.creatorList;
                this.developOwnerList = model.developOwnerList;
                this.directories = model.directories;
                this.exactMatch = model.exactMatch;
                this.keywords = model.keywords;
                this.nextCursor = model.nextCursor;
                this.opsOwnerList = model.opsOwnerList;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pipelineTypeList = model.pipelineTypeList;
                this.recursive = model.recursive;
                this.scheduleTypeList = model.scheduleTypeList;
                this.submitStatusList = model.submitStatusList;
                this.tagList = model.tagList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The user IDs of the creators used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
             */
            public Builder creatorList(java.util.List<String> creatorList) {
                this.creatorList = creatorList;
                return this;
            }

            /**
             * <p>The user IDs of the development owners used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
             */
            public Builder developOwnerList(java.util.List<String> developOwnerList) {
                this.developOwnerList = developOwnerList;
                return this;
            }

            /**
             * <p>The full paths of the directories to query. If this parameter is left empty, the root directory is queried.</p>
             */
            public Builder directories(java.util.List<String> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>Specifies whether an exact match is performed on the node name. Default value: false.</p>
             */
            public Builder exactMatch(Boolean exactMatch) {
                this.exactMatch = exactMatch;
                return this;
            }

            /**
             * <p>The keywords used to filter task names. This parameter is optional. If this parameter is left empty, tasks are not filtered by name. If exact match is enabled, this parameter specifies a list of full names. If fuzzy match is used, this parameter specifies a list of keywords. If multiple keywords are specified, they are evaluated by using the OR operator.</p>
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * <p>The cursor for the next page. Leave this parameter empty for the first page. For subsequent pages, pass the NextCursor value returned from the previous page.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder nextCursor(Long nextCursor) {
                this.nextCursor = nextCursor;
                return this;
            }

            /**
             * <p>The user IDs of the O&amp;M owners used for filtering. If this parameter is left empty, no filtering is performed. If multiple IDs are specified, they are evaluated by using the OR operator.</p>
             */
            public Builder opsOwnerList(java.util.List<String> opsOwnerList) {
                this.opsOwnerList = opsOwnerList;
                return this;
            }

            /**
             * <p>The page number. Default value: 1. The value starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The task types. Default value: [0]. Valid values: 0: offline integration. 1: real-time integration. 13: data ingestion. 14: offline unstructured workflow. 15: real-time unstructured workflow. 16: online unstructured workflow. If you pass null or an empty list, the default value [0] is used.</p>
             */
            public Builder pipelineTypeList(java.util.List<Integer> pipelineTypeList) {
                this.pipelineTypeList = pipelineTypeList;
                return this;
            }

            /**
             * <p>Specifies whether to recursively query subdirectories. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder recursive(Boolean recursive) {
                this.recursive = recursive;
                return this;
            }

            /**
             * <p>The schedule types used for filtering. If this parameter is left empty, no filtering is performed. Valid values: 1: periodic scheduling. 3: manual scheduling. 5: real-time scheduling. 7: online workflow.</p>
             */
            public Builder scheduleTypeList(java.util.List<Integer> scheduleTypeList) {
                this.scheduleTypeList = scheduleTypeList;
                return this;
            }

            /**
             * <p>The submit statuses used for filtering. If this parameter is left empty, no filtering is performed. Valid values: DRAFT: draft. SUBMITTING: submitting. SUBMITTED: submitted. PUBLISHED: published.</p>
             */
            public Builder submitStatusList(java.util.List<String> submitStatusList) {
                this.submitStatusList = submitStatusList;
                return this;
            }

            /**
             * <p>The tag names used for filtering. If this parameter is left empty, no filtering is performed. If multiple names are specified, they are evaluated by using the OR operator.</p>
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>1233</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListCommand build() {
                return new ListCommand(this);
            } 

        } 

    }
}
