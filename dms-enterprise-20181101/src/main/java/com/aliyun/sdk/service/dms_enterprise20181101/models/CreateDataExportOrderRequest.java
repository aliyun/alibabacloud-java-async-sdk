// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataExportOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataExportOrderRequest</p>
 */
public class CreateDataExportOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentKey")
    private String attachmentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private PluginParam pluginParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private CreateDataExportOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.parentId = builder.parentId;
        this.pluginParam = builder.pluginParam;
        this.realLoginUserUid = builder.realLoginUserUid;
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
     * @return realLoginUserUid
     */
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
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
        private String realLoginUserUid; 
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
            this.realLoginUserUid = request.realLoginUserUid;
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
         * The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The ID of the parent ticket.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The parameters of the ticket.
         */
        public Builder pluginParam(PluginParam pluginParam) {
            String pluginParamShrink = shrink(pluginParam, "PluginParam", "json");
            this.putQueryParameter("PluginParam", pluginParamShrink);
            this.pluginParam = pluginParam;
            return this;
        }

        /**
         * RealLoginUserUid.
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * The stakeholders involved in this operation.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The tenant ID.
         * <p>
         * 
         * > To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the "Manage DMS tenants" topic.
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
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DataWatermark")
        private String dataWatermark;

        @com.aliyun.core.annotation.NameInMap("FileWatermark")
        private String fileWatermark;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List < String > keys;

        @com.aliyun.core.annotation.NameInMap("WatermarkTypes")
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
             * The field into which the watermark is to be embedded.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The information to be embedded as a watermark into data.
             */
            public Builder dataWatermark(String dataWatermark) {
                this.dataWatermark = dataWatermark;
                return this;
            }

            /**
             * The information to be embedded as a watermark into files.
             */
            public Builder fileWatermark(String fileWatermark) {
                this.fileWatermark = fileWatermark;
                return this;
            }

            /**
             * One or more primary keys or unique keys.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            /**
             * The methods in which the watermark is embedded.
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
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("Classify")
        @com.aliyun.core.annotation.Validation(required = true)
        private String classify;

        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("ExeSQL")
        @com.aliyun.core.annotation.Validation(required = true)
        private String exeSQL;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRows")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean ignoreAffectRows;

        @com.aliyun.core.annotation.NameInMap("IgnoreAffectRowsReason")
        private String ignoreAffectRowsReason;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("Watermark")
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
             * The estimated number of data rows to be affected.
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * The reason for the export ticket.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The database ID.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The SQL statements that can be executed.
             */
            public Builder exeSQL(String exeSQL) {
                this.exeSQL = exeSQL;
                return this;
            }

            /**
             * Specifies whether to skip verification. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ignoreAffectRows(Boolean ignoreAffectRows) {
                this.ignoreAffectRows = ignoreAffectRows;
                return this;
            }

            /**
             * The reason for skipping verification. This parameter is required if you set IgnoreAffectRows to true.
             */
            public Builder ignoreAffectRowsReason(String ignoreAffectRowsReason) {
                this.ignoreAffectRowsReason = ignoreAffectRowsReason;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Specifies whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > If you set this parameter to **true**, the database that you specify must be a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The information about the watermarks.
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
