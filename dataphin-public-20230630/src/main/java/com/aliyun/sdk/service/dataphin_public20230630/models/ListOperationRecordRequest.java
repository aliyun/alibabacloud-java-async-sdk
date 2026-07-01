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
 * {@link ListOperationRecordRequest} extends {@link RequestModel}
 *
 * <p>ListOperationRecordRequest</p>
 */
public class ListOperationRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListCommand listCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListOperationRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listCommand = builder.listCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationRecordRequest create() {
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

    public static final class Builder extends Request.Builder<ListOperationRecordRequest, Builder> {
        private String regionId; 
        private ListCommand listCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public ListOperationRecordRequest build() {
            return new ListOperationRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationRecordRequest} extends {@link TeaModel}
     *
     * <p>ListOperationRecordRequest</p>
     */
    public static class ListCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTimeEnd")
        private String beginTimeEnd;

        @com.aliyun.core.annotation.NameInMap("BeginTimeStart")
        private String beginTimeStart;

        @com.aliyun.core.annotation.NameInMap("CodeContent")
        private String codeContent;

        @com.aliyun.core.annotation.NameInMap("CodeType")
        private java.util.List<Integer> codeType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private java.util.List<Integer> duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private java.util.List<String> objectType;

        @com.aliyun.core.annotation.NameInMap("Page")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SortType")
        private Integer sortType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private java.util.List<Integer> status;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private ListCommand(Builder builder) {
            this.beginTimeEnd = builder.beginTimeEnd;
            this.beginTimeStart = builder.beginTimeStart;
            this.codeContent = builder.codeContent;
            this.codeType = builder.codeType;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.objectType = builder.objectType;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectId = builder.projectId;
            this.sortType = builder.sortType;
            this.status = builder.status;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListCommand create() {
            return builder().build();
        }

        /**
         * @return beginTimeEnd
         */
        public String getBeginTimeEnd() {
            return this.beginTimeEnd;
        }

        /**
         * @return beginTimeStart
         */
        public String getBeginTimeStart() {
            return this.beginTimeStart;
        }

        /**
         * @return codeContent
         */
        public String getCodeContent() {
            return this.codeContent;
        }

        /**
         * @return codeType
         */
        public java.util.List<Integer> getCodeType() {
            return this.codeType;
        }

        /**
         * @return duration
         */
        public java.util.List<Integer> getDuration() {
            return this.duration;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return objectType
         */
        public java.util.List<String> getObjectType() {
            return this.objectType;
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sortType
         */
        public Integer getSortType() {
            return this.sortType;
        }

        /**
         * @return status
         */
        public java.util.List<Integer> getStatus() {
            return this.status;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private String beginTimeEnd; 
            private String beginTimeStart; 
            private String codeContent; 
            private java.util.List<Integer> codeType; 
            private java.util.List<Integer> duration; 
            private String fileName; 
            private java.util.List<String> objectType; 
            private Integer page; 
            private Integer pageSize; 
            private Long projectId; 
            private Integer sortType; 
            private java.util.List<Integer> status; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(ListCommand model) {
                this.beginTimeEnd = model.beginTimeEnd;
                this.beginTimeStart = model.beginTimeStart;
                this.codeContent = model.codeContent;
                this.codeType = model.codeType;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.objectType = model.objectType;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.projectId = model.projectId;
                this.sortType = model.sortType;
                this.status = model.status;
                this.userIds = model.userIds;
            } 

            /**
             * BeginTimeEnd.
             */
            public Builder beginTimeEnd(String beginTimeEnd) {
                this.beginTimeEnd = beginTimeEnd;
                return this;
            }

            /**
             * BeginTimeStart.
             */
            public Builder beginTimeStart(String beginTimeStart) {
                this.beginTimeStart = beginTimeStart;
                return this;
            }

            /**
             * CodeContent.
             */
            public Builder codeContent(String codeContent) {
                this.codeContent = codeContent;
                return this;
            }

            /**
             * CodeType.
             */
            public Builder codeType(java.util.List<Integer> codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(java.util.List<Integer> duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(java.util.List<String> objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SortType.
             */
            public Builder sortType(Integer sortType) {
                this.sortType = sortType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(java.util.List<Integer> status) {
                this.status = status;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public ListCommand build() {
                return new ListCommand(this);
            } 

        } 

    }
}
