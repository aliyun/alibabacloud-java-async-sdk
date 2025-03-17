// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateStructSyncOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateStructSyncOrderRequest</p>
 */
public class CreateStructSyncOrderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private Param param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List<Long> relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateStructSyncOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.param = builder.param;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStructSyncOrderRequest create() {
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
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateStructSyncOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private java.util.List<Long> relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateStructSyncOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachmentKey = request.attachmentKey;
            this.comment = request.comment;
            this.param = request.param;
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
         * <p>The key of an attachment that is returned after the attachment is uploaded. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>upload_3c7edea3-e4c3-4403-857d-737043036f69_test.sql</p>
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * <p>The remarks of the ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The parameters of the ticket.</p>
         * <p>This parameter is required.</p>
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * <p>The IDs of the stakeholders.</p>
         */
        public Builder relatedUserList(java.util.List<Long> relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateStructSyncOrderRequest build() {
            return new CreateStructSyncOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStructSyncOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateStructSyncOrderRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbSearchName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dbSearchName;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Source(Builder builder) {
            this.dbId = builder.dbId;
            this.dbSearchName = builder.dbSearchName;
            this.logic = builder.logic;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbSearchName
         */
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbSearchName; 
            private Boolean logic; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.dbId = model.dbId;
                this.dbSearchName = model.dbSearchName;
                this.logic = model.logic;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the ID of the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>4324532</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name that is used to search for the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the name of the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The version number of the schema. The default value is the latest schema version number. For more information, see <a href="https://help.aliyun.com/document_detail/202275.html">Manage schema versions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStructSyncOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateStructSyncOrderRequest</p>
     */
    public static class TableInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("TargetTableName")
        private String targetTableName;

        private TableInfoList(Builder builder) {
            this.sourceTableName = builder.sourceTableName;
            this.targetTableName = builder.targetTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfoList create() {
            return builder().build();
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public static final class Builder {
            private String sourceTableName; 
            private String targetTableName; 

            private Builder() {
            } 

            private Builder(TableInfoList model) {
                this.sourceTableName = model.sourceTableName;
                this.targetTableName = model.targetTableName;
            } 

            /**
             * <p>The name of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tbl</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * <p>The name of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tbl</p>
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            public TableInfoList build() {
                return new TableInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStructSyncOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateStructSyncOrderRequest</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbSearchName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dbSearchName;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Target(Builder builder) {
            this.dbId = builder.dbId;
            this.dbSearchName = builder.dbSearchName;
            this.logic = builder.logic;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbSearchName
         */
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbSearchName; 
            private Boolean logic; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.dbId = model.dbId;
                this.dbSearchName = model.dbSearchName;
                this.logic = model.logic;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the ID of the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>432432</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name that is used to search for the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the name of the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The version number. By default, this parameter is left empty.</p>
             * <blockquote>
             * <p> If you specify the schema version number of the destination database, Data Management (DMS) only compares the schemas of the two databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateStructSyncOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateStructSyncOrderRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreError")
        private Boolean ignoreError;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private Source source;

        @com.aliyun.core.annotation.NameInMap("TableInfoList")
        private java.util.List<TableInfoList> tableInfoList;

        @com.aliyun.core.annotation.NameInMap("Target")
        @com.aliyun.core.annotation.Validation(required = true)
        private Target target;

        private Param(Builder builder) {
            this.ignoreError = builder.ignoreError;
            this.source = builder.source;
            this.tableInfoList = builder.tableInfoList;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return ignoreError
         */
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return tableInfoList
         */
        public java.util.List<TableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private Boolean ignoreError; 
            private Source source; 
            private java.util.List<TableInfoList> tableInfoList; 
            private Target target; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.ignoreError = model.ignoreError;
                this.source = model.source;
                this.tableInfoList = model.tableInfoList;
                this.target = model.target;
            } 

            /**
             * <p>Specifies whether to skip an error that occurs in executing an SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: continues to execute subsequent SQL statements if an error occurs in executing an SQL statement.</li>
             * <li><strong>false</strong>: stops executing subsequent SQL statements if an error occurs in executing an SQL statement.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * <p>The information about the base database.</p>
             * <p>This parameter is required.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The information about the table of which you want to synchronize the schema.</p>
             */
            public Builder tableInfoList(java.util.List<TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * <p>The information about the database to which you want to synchronize the schema of a table.</p>
             * <p>This parameter is required.</p>
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
