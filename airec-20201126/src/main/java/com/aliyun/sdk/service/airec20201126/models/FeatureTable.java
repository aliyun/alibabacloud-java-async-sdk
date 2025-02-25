// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FeatureTable} extends {@link TeaModel}
 *
 * <p>FeatureTable</p>
 */
public class FeatureTable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureTableId")
    private String featureTableId;

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

    private FeatureTable(Builder builder) {
        this.featureTableId = builder.featureTableId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.meta = builder.meta;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeatureTable create() {
        return builder().build();
    }

    /**
     * @return featureTableId
     */
    public String getFeatureTableId() {
        return this.featureTableId;
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
        private String featureTableId; 
        private String gmtCreate; 
        private String gmtModified; 
        private Meta meta; 
        private String status; 
        private String type; 

        /**
         * FeatureTableId.
         */
        public Builder featureTableId(String featureTableId) {
            this.featureTableId = featureTableId;
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

        public FeatureTable build() {
            return new FeatureTable(this);
        } 

    } 

    /**
     * 
     * {@link FeatureTable} extends {@link TeaModel}
     *
     * <p>FeatureTable</p>
     */
    public static class FeatureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FeatureList(Builder builder) {
            this.comment = builder.comment;
            this.featureName = builder.featureName;
            this.fieldName = builder.fieldName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String comment; 
            private String featureName; 
            private String fieldName; 
            private String status; 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FeatureList build() {
                return new FeatureList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FeatureTable} extends {@link TeaModel}
     *
     * <p>FeatureTable</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("FeatureList")
        private java.util.List < FeatureList> featureList;

        @com.aliyun.core.annotation.NameInMap("Internal")
        private Boolean internal;

        @com.aliyun.core.annotation.NameInMap("MetaType")
        private String metaType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("UpdateFrequency")
        private Long updateFrequency;

        private Meta(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.featureList = builder.featureList;
            this.internal = builder.internal;
            this.metaType = builder.metaType;
            this.source = builder.source;
            this.updateFrequency = builder.updateFrequency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return featureList
         */
        public java.util.List < FeatureList> getFeatureList() {
            return this.featureList;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return updateFrequency
         */
        public Long getUpdateFrequency() {
            return this.updateFrequency;
        }

        public static final class Builder {
            private String dataSourceId; 
            private java.util.List < FeatureList> featureList; 
            private Boolean internal; 
            private String metaType; 
            private String source; 
            private Long updateFrequency; 

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * FeatureList.
             */
            public Builder featureList(java.util.List < FeatureList> featureList) {
                this.featureList = featureList;
                return this;
            }

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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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
