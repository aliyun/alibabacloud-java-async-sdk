// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Long > relatedUserList;

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
    public java.util.List < Long > getRelatedUserList() {
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
        private java.util.List < Long > relatedUserList; 
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
         * The key of an attachment that is returned after the attachment is uploaded. You can call the [GetUserUploadFileJob](~~206069~~) operation to query the key of the attachment.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * The remarks of the ticket.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The parameters of the ticket.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * The IDs of the stakeholders.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see [Manage DMS tenants](~~181330~~).
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

            /**
             * The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name that is used to search for the database. You can call the [SearchDatabases](~~141876~~) operation to query the name of the database.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * Specifies whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The version number of the schema. The default value is the latest schema version number. For more information, see [Manage schema versions](~~202275~~).
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

            /**
             * The name of the source table.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * The name of the destination table.
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

            /**
             * The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name that is used to search for the database. You can call the [SearchDatabases](~~141876~~) operation to query the name of the database.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
                return this;
            }

            /**
             * Specifies whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The version number. By default, this parameter is left empty.
             * <p>
             * 
             * >  If you specify the schema version number of the destination database, Data Management (DMS) only compares the schemas of the two databases.
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
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreError")
        private Boolean ignoreError;

        @com.aliyun.core.annotation.NameInMap("Source")
        @com.aliyun.core.annotation.Validation(required = true)
        private Source source;

        @com.aliyun.core.annotation.NameInMap("TableInfoList")
        private java.util.List < TableInfoList> tableInfoList;

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
        public java.util.List < TableInfoList> getTableInfoList() {
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
            private java.util.List < TableInfoList> tableInfoList; 
            private Target target; 

            /**
             * Specifies whether to skip an error that occurs in executing an SQL statement. Valid values:
             * <p>
             * 
             * *   **true**: continues to execute subsequent SQL statements if an error occurs in executing an SQL statement.
             * *   **false**: stops executing subsequent SQL statements if an error occurs in executing an SQL statement.
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * The information about the base database.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * The information about the table of which you want to synchronize the schema.
             */
            public Builder tableInfoList(java.util.List < TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * The information about the database to which you want to synchronize the schema of a table.
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
