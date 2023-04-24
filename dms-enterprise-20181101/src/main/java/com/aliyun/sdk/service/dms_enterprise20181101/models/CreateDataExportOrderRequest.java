// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataExportOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataExportOrderRequest</p>
 */
public class CreateDataExportOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AttachmentKey")
    private String attachmentKey;

    @Query
    @NameInMap("Comment")
    @Validation(required = true)
    private String comment;

    @Query
    @NameInMap("ParentId")
    private Long parentId;

    @Query
    @NameInMap("PluginParam")
    @Validation(required = true)
    private PluginParam pluginParam;

    @Query
    @NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private CreateDataExportOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.parentId = builder.parentId;
        this.pluginParam = builder.pluginParam;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataExportOrderRequest create() {
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
     * @return attachmentKey
     */
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return pluginParam
     */
    public PluginParam getPluginParam() {
        return this.pluginParam;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List < Long > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateDataExportOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Long parentId; 
        private PluginParam pluginParam; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataExportOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachmentKey = request.attachmentKey;
            this.comment = request.comment;
            this.parentId = request.parentId;
            this.pluginParam = request.pluginParam;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
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
         * AttachmentKey.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * PluginParam.
         */
        public Builder pluginParam(PluginParam pluginParam) {
            String pluginParamShrink = shrink(pluginParam, "PluginParam", "json");
            this.putQueryParameter("PluginParam", pluginParamShrink);
            this.pluginParam = pluginParam;
            return this;
        }

        /**
         * RelatedUserList.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataExportOrderRequest build() {
            return new CreateDataExportOrderRequest(this);
        } 

    } 

    public static class Watermark extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DataWatermark")
        private String dataWatermark;

        @NameInMap("FileWatermark")
        private String fileWatermark;

        @NameInMap("Keys")
        private java.util.List < String > keys;

        @NameInMap("WatermarkTypes")
        private java.util.List < String > watermarkTypes;

        private Watermark(Builder builder) {
            this.columnName = builder.columnName;
            this.dataWatermark = builder.dataWatermark;
            this.fileWatermark = builder.fileWatermark;
            this.keys = builder.keys;
            this.watermarkTypes = builder.watermarkTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Watermark create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return dataWatermark
         */
        public String getDataWatermark() {
            return this.dataWatermark;
        }

        /**
         * @return fileWatermark
         */
        public String getFileWatermark() {
            return this.fileWatermark;
        }

        /**
         * @return keys
         */
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        /**
         * @return watermarkTypes
         */
        public java.util.List < String > getWatermarkTypes() {
            return this.watermarkTypes;
        }

        public static final class Builder {
            private String columnName; 
            private String dataWatermark; 
            private String fileWatermark; 
            private java.util.List < String > keys; 
            private java.util.List < String > watermarkTypes; 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * DataWatermark.
             */
            public Builder dataWatermark(String dataWatermark) {
                this.dataWatermark = dataWatermark;
                return this;
            }

            /**
             * FileWatermark.
             */
            public Builder fileWatermark(String fileWatermark) {
                this.fileWatermark = fileWatermark;
                return this;
            }

            /**
             * Keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * WatermarkTypes.
             */
            public Builder watermarkTypes(java.util.List < String > watermarkTypes) {
                this.watermarkTypes = watermarkTypes;
                return this;
            }

            public Watermark build() {
                return new Watermark(this);
            } 

        } 

    }
    public static class PluginParam extends TeaModel {
        @NameInMap("AffectRows")
        @Validation(required = true)
        private Long affectRows;

        @NameInMap("Classify")
        @Validation(required = true)
        private String classify;

        @NameInMap("DbId")
        @Validation(required = true)
        private Long dbId;

        @NameInMap("ExeSQL")
        @Validation(required = true)
        private String exeSQL;

        @NameInMap("IgnoreAffectRows")
        @Validation(required = true)
        private Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private Long instanceId;

        @NameInMap("Logic")
        @Validation(required = true)
        private Boolean logic;

        @NameInMap("Watermark")
        private Watermark watermark;

        private PluginParam(Builder builder) {
            this.affectRows = builder.affectRows;
            this.classify = builder.classify;
            this.dbId = builder.dbId;
            this.exeSQL = builder.exeSQL;
            this.ignoreAffectRows = builder.ignoreAffectRows;
            this.ignoreAffectRowsReason = builder.ignoreAffectRowsReason;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.watermark = builder.watermark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginParam create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return exeSQL
         */
        public String getExeSQL() {
            return this.exeSQL;
        }

        /**
         * @return ignoreAffectRows
         */
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        /**
         * @return ignoreAffectRowsReason
         */
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return watermark
         */
        public Watermark getWatermark() {
            return this.watermark;
        }

        public static final class Builder {
            private Long affectRows; 
            private String classify; 
            private Long dbId; 
            private String exeSQL; 
            private Boolean ignoreAffectRows; 
            private String ignoreAffectRowsReason; 
            private Long instanceId; 
            private Boolean logic; 
            private Watermark watermark; 

            /**
             * AffectRows.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * Classify.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * ExeSQL.
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * IgnoreAffectRows.
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * IgnoreAffectRowsReason.
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * Watermark.
             */
            public Builder watermark(Watermark watermark) {
                this.watermark = watermark;
                return this;
            }

            public PluginParam build() {
                return new PluginParam(this);
            } 

        } 

    }
}
