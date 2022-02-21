// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShadowSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListShadowSchemasResponseBody</p>
 */
public class ListShadowSchemasResponseBody extends TeaModel {
    @NameInMap("PageList")
    private PageList pageList;

    @NameInMap("RequestId")
    private String requestId;

    private ListShadowSchemasResponseBody(Builder builder) {
        this.pageList = builder.pageList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShadowSchemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageList
     */
    public PageList getPageList() {
        return this.pageList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageList pageList; 
        private String requestId; 

        /**
         * PageList.
         */
        public Builder pageList(PageList pageList) {
            this.pageList = pageList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShadowSchemasResponseBody build() {
            return new ListShadowSchemasResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AuthType")
        private Integer authType;

        @NameInMap("AuthTypeDesc")
        private String authTypeDesc;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceModelId")
        private Long deviceModelId;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModuleSchema")
        private String moduleSchema;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ProjectId")
        private String projectId;

        private List(Builder builder) {
            this.authType = builder.authType;
            this.authTypeDesc = builder.authTypeDesc;
            this.deviceModel = builder.deviceModel;
            this.deviceModelId = builder.deviceModelId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.moduleSchema = builder.moduleSchema;
            this.namespace = builder.namespace;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public Integer getAuthType() {
            return this.authType;
        }

        /**
         * @return authTypeDesc
         */
        public String getAuthTypeDesc() {
            return this.authTypeDesc;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceModelId
         */
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return moduleSchema
         */
        public String getModuleSchema() {
            return this.moduleSchema;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Integer authType; 
            private String authTypeDesc; 
            private String deviceModel; 
            private Long deviceModelId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String moduleSchema; 
            private String namespace; 
            private String projectId; 

            /**
             * AuthType.
             */
            public Builder authType(Integer authType) {
                this.authType = authType;
                return this;
            }

            /**
             * AuthTypeDesc.
             */
            public Builder authTypeDesc(String authTypeDesc) {
                this.authTypeDesc = authTypeDesc;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * DeviceModelId.
             */
            public Builder deviceModelId(Long deviceModelId) {
                this.deviceModelId = deviceModelId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * ModuleSchema.
             */
            public Builder moduleSchema(String moduleSchema) {
                this.moduleSchema = moduleSchema;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("HasNextPage")
        private Boolean hasNextPage;

        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("SimpleSign")
        private Boolean simpleSign;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPageCount")
        private Integer totalPageCount;

        private Pagination(Builder builder) {
            this.hasNextPage = builder.hasNextPage;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.simpleSign = builder.simpleSign;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return hasNextPage
         */
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return simpleSign
         */
        public Boolean getSimpleSign() {
            return this.simpleSign;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Boolean hasNextPage; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private Boolean simpleSign; 
            private Integer totalCount; 
            private Integer totalPageCount; 

            /**
             * HasNextPage.
             */
            public Builder hasNextPage(Boolean hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * PageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
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
             * SimpleSign.
             */
            public Builder simpleSign(Boolean simpleSign) {
                this.simpleSign = simpleSign;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Integer totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class PageList extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private PageList(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageList create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public PageList build() {
                return new PageList(this);
            } 

        } 

    }
}
