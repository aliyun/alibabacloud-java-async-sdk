// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseExportOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseExportOrderRequest</p>
 */
public class CreateDatabaseExportOrderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private CreateDatabaseExportOrderRequest(Builder builder) {
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

    public static CreateDatabaseExportOrderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDatabaseExportOrderRequest, Builder> {
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

        private Builder(CreateDatabaseExportOrderRequest request) {
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
        public CreateDatabaseExportOrderRequest build() {
            return new CreateDatabaseExportOrderRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataOption")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > dataOption;

        @com.aliyun.core.annotation.NameInMap("ExportContent")
        @com.aliyun.core.annotation.Validation(required = true)
        private String exportContent;

        @com.aliyun.core.annotation.NameInMap("ExportTypes")
        private java.util.List < String > exportTypes;

        @com.aliyun.core.annotation.NameInMap("SQLExtOption")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > SQLExtOption;

        @com.aliyun.core.annotation.NameInMap("SelectedTables")
        private java.util.List < String > selectedTables;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.Map < String, String > tables;

        @com.aliyun.core.annotation.NameInMap("TargetOption")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetOption;

        private Config(Builder builder) {
            this.dataOption = builder.dataOption;
            this.exportContent = builder.exportContent;
            this.exportTypes = builder.exportTypes;
            this.SQLExtOption = builder.SQLExtOption;
            this.selectedTables = builder.selectedTables;
            this.tables = builder.tables;
            this.targetOption = builder.targetOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return dataOption
         */
        public java.util.List < String > getDataOption() {
            return this.dataOption;
        }

        /**
         * @return exportContent
         */
        public String getExportContent() {
            return this.exportContent;
        }

        /**
         * @return exportTypes
         */
        public java.util.List < String > getExportTypes() {
            return this.exportTypes;
        }

        /**
         * @return SQLExtOption
         */
        public java.util.List < String > getSQLExtOption() {
            return this.SQLExtOption;
        }

        /**
         * @return selectedTables
         */
        public java.util.List < String > getSelectedTables() {
            return this.selectedTables;
        }

        /**
         * @return tables
         */
        public java.util.Map < String, String > getTables() {
            return this.tables;
        }

        /**
         * @return targetOption
         */
        public String getTargetOption() {
            return this.targetOption;
        }

        public static final class Builder {
            private java.util.List < String > dataOption; 
            private String exportContent; 
            private java.util.List < String > exportTypes; 
            private java.util.List < String > SQLExtOption; 
            private java.util.List < String > selectedTables; 
            private java.util.Map < String, String > tables; 
            private String targetOption; 

            /**
             * The export options for big data. The options are used to filter the big data to be exported. You can leave this parameter empty.
             */
            public Builder dataOption(java.util.List < String > dataOption) {
                this.dataOption = dataOption;
                return this;
            }

            /**
             * The type of data that you want to export. Valid values:
             * <p>
             * 
             * *   **DATA**: The data of the database is exported.
             * *   **STRUCT**: The schema of the database is exported.
             * *   **DATA_STRUCT**: The data and schema of the database are exported.
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * The types of schemas that you want to export.
             */
            public Builder exportTypes(java.util.List < String > exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            /**
             * The extension options of the SQL script. You can leave this parameter empty.
             */
            public Builder SQLExtOption(java.util.List < String > SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            /**
             * The tables that you want to export.
             */
            public Builder selectedTables(java.util.List < String > selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            /**
             * The conditions used to filter the tables to be exported.
             */
            public Builder tables(java.util.Map < String, String > tables) {
                this.tables = tables;
                return this;
            }

            /**
             * The format in which the database is exported. Valid values:
             * <p>
             * 
             * *   **SQL**
             * *   **CSV**
             * *   **XLSX**
             */
            public Builder targetOption(String targetOption) {
                this.targetOption = targetOption;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class PluginParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        @com.aliyun.core.annotation.Validation(required = true)
        private String classify;

        @com.aliyun.core.annotation.NameInMap("Config")
        @com.aliyun.core.annotation.Validation(required = true)
        private Config config;

        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String searchName;

        private PluginParam(Builder builder) {
            this.classify = builder.classify;
            this.config = builder.config;
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginParam create() {
            return builder().build();
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
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
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String classify; 
            private Config config; 
            private Long dbId; 
            private Long instanceId; 
            private Boolean logic; 
            private String searchName; 

            /**
             * The reason for the database export.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The configurations for database export.
             */
            public Builder config(Config config) {
                this.config = config;
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
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public PluginParam build() {
                return new PluginParam(this);
            } 

        } 

    }
}
