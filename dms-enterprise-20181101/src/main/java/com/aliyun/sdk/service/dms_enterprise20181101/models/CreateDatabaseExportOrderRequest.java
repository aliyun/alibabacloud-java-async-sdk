// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key.</p>
         * 
         * <strong>example:</strong>
         * <p>order_attachment.txt</p>
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>document_test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The ID of the parent ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>877****</p>
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The parameters of the ticket.</p>
         * <p>This parameter is required.</p>
         */
        public Builder pluginParam(PluginParam pluginParam) {
            String pluginParamShrink = shrink(pluginParam, "PluginParam", "json");
            this.putQueryParameter("PluginParam", pluginParamShrink);
            this.pluginParam = pluginParam;
            return this;
        }

        /**
         * <p>The stakeholders involved in this operation.</p>
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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

    /**
     * 
     * {@link CreateDatabaseExportOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDatabaseExportOrderRequest</p>
     */
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
             * <p>The export options for big data. The options are used to filter the big data to be exported. You can leave this parameter empty.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dataOption(java.util.List < String > dataOption) {
                this.dataOption = dataOption;
                return this;
            }

            /**
             * <p>The type of data that you want to export. Valid values:</p>
             * <ul>
             * <li><strong>DATA</strong>: The data of the database is exported.</li>
             * <li><strong>STRUCT</strong>: The schema of the database is exported.</li>
             * <li><strong>DATA_STRUCT</strong>: The data and schema of the database are exported.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA</p>
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * <p>The types of schemas that you want to export.</p>
             */
            public Builder exportTypes(java.util.List < String > exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            /**
             * <p>The extension options of the SQL script. You can leave this parameter empty.</p>
             * <p>This parameter is required.</p>
             */
            public Builder SQLExtOption(java.util.List < String > SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            /**
             * <p>The tables that you want to export.</p>
             */
            public Builder selectedTables(java.util.List < String > selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            /**
             * <p>The conditions used to filter the tables to be exported.</p>
             */
            public Builder tables(java.util.Map < String, String > tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The format in which the database is exported. Valid values:</p>
             * <ul>
             * <li><strong>SQL</strong></li>
             * <li><strong>CSV</strong></li>
             * <li><strong>XLSX</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
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
    /**
     * 
     * {@link CreateDatabaseExportOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDatabaseExportOrderRequest</p>
     */
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
             * <p>The reason for the database export.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>document_test</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The configurations for database export.</p>
             * <p>This parameter is required.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>17****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>137****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@xxx.xxx.xxx.xxx">test@xxx.xxx.xxx.xxx</a>:3306</p>
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
