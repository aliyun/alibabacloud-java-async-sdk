// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExtraDataSource} extends {@link TeaModel}
 *
 * <p>ExtraDataSource</p>
 */
public class ExtraDataSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ExtraDataSource(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.meta = builder.meta;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtraDataSource create() {
        return builder().build();
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String dataSourceId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Meta meta; 
        private String status; 
        private String type; 

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ExtraDataSource build() {
            return new ExtraDataSource(this);
        } 

    } 

    /**
     * 
     * {@link ExtraDataSource} extends {@link TeaModel}
     *
     * <p>ExtraDataSource</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Internal")
        private Boolean internal;

        @com.aliyun.core.annotation.NameInMap("MetaType")
        private String metaType;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateFrequency")
        private Long updateFrequency;

        private Meta(Builder builder) {
            this.internal = builder.internal;
            this.metaType = builder.metaType;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
            this.type = builder.type;
            this.updateFrequency = builder.updateFrequency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return internal
         */
        public Boolean getInternal() {
            return this.internal;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateFrequency
         */
        public Long getUpdateFrequency() {
            return this.updateFrequency;
        }

        public static final class Builder {
            private Boolean internal; 
            private String metaType; 
            private String projectName; 
            private String tableName; 
            private String type; 
            private Long updateFrequency; 

            /**
             * Internal.
             */
            public Builder internal(Boolean internal) {
                this.internal = internal;
                return this;
            }

            /**
             * MetaType.
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateFrequency.
             */
            public Builder updateFrequency(Long updateFrequency) {
                this.updateFrequency = updateFrequency;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
