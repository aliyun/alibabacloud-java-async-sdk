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

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.listCommand = builder.listCommand;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String regionId; 
        private Context context; 
        private ListCommand listCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.listCommand = request.listCommand;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listCommand(ListCommand listCommand) {
            String listCommandShrink = shrink(listCommand, "ListCommand", "json");
            this.putBodyParameter("ListCommand", listCommandShrink);
            this.listCommand = listCommand;
            return this;
        }

        /**
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
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
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
             * CreatorList.
             */
            public Builder creatorList(java.util.List<String> creatorList) {
                this.creatorList = creatorList;
                return this;
            }

            /**
             * DevelopOwnerList.
             */
            public Builder developOwnerList(java.util.List<String> developOwnerList) {
                this.developOwnerList = developOwnerList;
                return this;
            }

            /**
             * Directories.
             */
            public Builder directories(java.util.List<String> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * ExactMatch.
             */
            public Builder exactMatch(Boolean exactMatch) {
                this.exactMatch = exactMatch;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List<String> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * NextCursor.
             */
            public Builder nextCursor(Long nextCursor) {
                this.nextCursor = nextCursor;
                return this;
            }

            /**
             * OpsOwnerList.
             */
            public Builder opsOwnerList(java.util.List<String> opsOwnerList) {
                this.opsOwnerList = opsOwnerList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * PipelineTypeList.
             */
            public Builder pipelineTypeList(java.util.List<Integer> pipelineTypeList) {
                this.pipelineTypeList = pipelineTypeList;
                return this;
            }

            /**
             * Recursive.
             */
            public Builder recursive(Boolean recursive) {
                this.recursive = recursive;
                return this;
            }

            /**
             * ScheduleTypeList.
             */
            public Builder scheduleTypeList(java.util.List<Integer> scheduleTypeList) {
                this.scheduleTypeList = scheduleTypeList;
                return this;
            }

            /**
             * SubmitStatusList.
             */
            public Builder submitStatusList(java.util.List<String> submitStatusList) {
                this.submitStatusList = submitStatusList;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * TotalCount.
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
