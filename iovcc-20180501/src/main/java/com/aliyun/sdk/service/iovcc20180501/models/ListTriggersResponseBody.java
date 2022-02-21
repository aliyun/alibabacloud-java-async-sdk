// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTriggersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTriggersResponseBody</p>
 */
public class ListTriggersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TriggerList")
    private TriggerList triggerList;

    private ListTriggersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.triggerList = builder.triggerList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTriggersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggerList
     */
    public TriggerList getTriggerList() {
        return this.triggerList;
    }

    public static final class Builder {
        private String requestId; 
        private TriggerList triggerList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TriggerList.
         */
        public Builder triggerList(TriggerList triggerList) {
            this.triggerList = triggerList;
            return this;
        }

        public ListTriggersResponseBody build() {
            return new ListTriggersResponseBody(this);
        } 

    } 

    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Integer pageIndex;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPageCount")
        private Integer totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
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
            private Integer pageIndex; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPageCount; 

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
    public static class Functions extends TeaModel {
        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        private Functions(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long fileId; 
            private String fileName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private String name; 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    public static class Triggers extends TeaModel {
        @NameInMap("ChainedFunctionIds")
        private String chainedFunctionIds;

        @NameInMap("Functions")
        private java.util.List < Functions> functions;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InvocationMode")
        private Integer invocationMode;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Production")
        private Integer production;

        @NameInMap("Sandbox")
        private Integer sandbox;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        private Triggers(Builder builder) {
            this.chainedFunctionIds = builder.chainedFunctionIds;
            this.functions = builder.functions;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invocationMode = builder.invocationMode;
            this.namespace = builder.namespace;
            this.production = builder.production;
            this.sandbox = builder.sandbox;
            this.source = builder.source;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return chainedFunctionIds
         */
        public String getChainedFunctionIds() {
            return this.chainedFunctionIds;
        }

        /**
         * @return functions
         */
        public java.util.List < Functions> getFunctions() {
            return this.functions;
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
         * @return invocationMode
         */
        public Integer getInvocationMode() {
            return this.invocationMode;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return production
         */
        public Integer getProduction() {
            return this.production;
        }

        /**
         * @return sandbox
         */
        public Integer getSandbox() {
            return this.sandbox;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String chainedFunctionIds; 
            private java.util.List < Functions> functions; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Integer invocationMode; 
            private String namespace; 
            private Integer production; 
            private Integer sandbox; 
            private String source; 
            private Integer status; 
            private Integer type; 

            /**
             * ChainedFunctionIds.
             */
            public Builder chainedFunctionIds(String chainedFunctionIds) {
                this.chainedFunctionIds = chainedFunctionIds;
                return this;
            }

            /**
             * Functions.
             */
            public Builder functions(java.util.List < Functions> functions) {
                this.functions = functions;
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
             * InvocationMode.
             */
            public Builder invocationMode(Integer invocationMode) {
                this.invocationMode = invocationMode;
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
             * Production.
             */
            public Builder production(Integer production) {
                this.production = production;
                return this;
            }

            /**
             * Sandbox.
             */
            public Builder sandbox(Integer sandbox) {
                this.sandbox = sandbox;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    public static class TriggerList extends TeaModel {
        @NameInMap("Pagination")
        private Pagination pagination;

        @NameInMap("Triggers")
        private java.util.List < Triggers> triggers;

        private TriggerList(Builder builder) {
            this.pagination = builder.pagination;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerList create() {
            return builder().build();
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        /**
         * @return triggers
         */
        public java.util.List < Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Pagination pagination; 
            private java.util.List < Triggers> triggers; 

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public TriggerList build() {
                return new TriggerList(this);
            } 

        } 

    }
}
