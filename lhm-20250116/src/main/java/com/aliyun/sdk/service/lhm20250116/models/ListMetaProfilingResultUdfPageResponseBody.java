// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingResultUdfPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaProfilingResultUdfPageResponseBody</p>
 */
public class ListMetaProfilingResultUdfPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMetaProfilingResultUdfPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingResultUdfPageResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaProfilingResultUdfPageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaProfilingResultUdfPageResponseBody build() {
            return new ListMetaProfilingResultUdfPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaProfilingResultUdfPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaProfilingResultUdfPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("catalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("className")
        private String className;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("dsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("funcComment")
        private String funcComment;

        @com.aliyun.core.annotation.NameInMap("funcCrtTime")
        private String funcCrtTime;

        @com.aliyun.core.annotation.NameInMap("funcId")
        private String funcId;

        @com.aliyun.core.annotation.NameInMap("funcModTime")
        private String funcModTime;

        @com.aliyun.core.annotation.NameInMap("funcName")
        private String funcName;

        @com.aliyun.core.annotation.NameInMap("funcType")
        private String funcType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("migrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("resourceLocation")
        private String resourceLocation;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private Data(Builder builder) {
            this.catalogName = builder.catalogName;
            this.className = builder.className;
            this.dbName = builder.dbName;
            this.dsType = builder.dsType;
            this.funcComment = builder.funcComment;
            this.funcCrtTime = builder.funcCrtTime;
            this.funcId = builder.funcId;
            this.funcModTime = builder.funcModTime;
            this.funcName = builder.funcName;
            this.funcType = builder.funcType;
            this.id = builder.id;
            this.migrationStatus = builder.migrationStatus;
            this.owner = builder.owner;
            this.resourceLocation = builder.resourceLocation;
            this.resourceType = builder.resourceType;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return funcComment
         */
        public String getFuncComment() {
            return this.funcComment;
        }

        /**
         * @return funcCrtTime
         */
        public String getFuncCrtTime() {
            return this.funcCrtTime;
        }

        /**
         * @return funcId
         */
        public String getFuncId() {
            return this.funcId;
        }

        /**
         * @return funcModTime
         */
        public String getFuncModTime() {
            return this.funcModTime;
        }

        /**
         * @return funcName
         */
        public String getFuncName() {
            return this.funcName;
        }

        /**
         * @return funcType
         */
        public String getFuncType() {
            return this.funcType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return resourceLocation
         */
        public String getResourceLocation() {
            return this.resourceLocation;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String catalogName; 
            private String className; 
            private String dbName; 
            private String dsType; 
            private String funcComment; 
            private String funcCrtTime; 
            private String funcId; 
            private String funcModTime; 
            private String funcName; 
            private String funcType; 
            private Long id; 
            private String migrationStatus; 
            private String owner; 
            private String resourceLocation; 
            private String resourceType; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.catalogName = model.catalogName;
                this.className = model.className;
                this.dbName = model.dbName;
                this.dsType = model.dsType;
                this.funcComment = model.funcComment;
                this.funcCrtTime = model.funcCrtTime;
                this.funcId = model.funcId;
                this.funcModTime = model.funcModTime;
                this.funcName = model.funcName;
                this.funcType = model.funcType;
                this.id = model.id;
                this.migrationStatus = model.migrationStatus;
                this.owner = model.owner;
                this.resourceLocation = model.resourceLocation;
                this.resourceType = model.resourceType;
                this.tenantId = model.tenantId;
            } 

            /**
             * catalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * className.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * dbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * dsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * funcComment.
             */
            public Builder funcComment(String funcComment) {
                this.funcComment = funcComment;
                return this;
            }

            /**
             * funcCrtTime.
             */
            public Builder funcCrtTime(String funcCrtTime) {
                this.funcCrtTime = funcCrtTime;
                return this;
            }

            /**
             * funcId.
             */
            public Builder funcId(String funcId) {
                this.funcId = funcId;
                return this;
            }

            /**
             * funcModTime.
             */
            public Builder funcModTime(String funcModTime) {
                this.funcModTime = funcModTime;
                return this;
            }

            /**
             * funcName.
             */
            public Builder funcName(String funcName) {
                this.funcName = funcName;
                return this;
            }

            /**
             * funcType.
             */
            public Builder funcType(String funcType) {
                this.funcType = funcType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * migrationStatus.
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * resourceLocation.
             */
            public Builder resourceLocation(String resourceLocation) {
                this.resourceLocation = resourceLocation;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
