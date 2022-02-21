// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStructSyncOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateStructSyncOrderRequest</p>
 */
public class CreateStructSyncOrderRequest extends Request {
    @Query
    @NameInMap("AttachmentKey")
    private String attachmentKey;

    @Query
    @NameInMap("Comment")
    @Validation(required = true)
    private String comment;

    @Query
    @NameInMap("Param")
    @Validation(required = true)
    private Param param;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateStructSyncOrderRequest(Builder builder) {
        super(builder);
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.param = builder.param;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private String regionId; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateStructSyncOrderRequest response) {
            super(response);
            this.attachmentKey = response.attachmentKey;
            this.comment = response.comment;
            this.param = response.param;
            this.regionId = response.regionId;
            this.relatedUserList = response.relatedUserList;
            this.tid = response.tid;
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
         * Param.
         */
        public Builder param(Param param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
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
         * RelatedUserList.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            this.putQueryParameter("RelatedUserList", relatedUserList);
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
        public CreateStructSyncOrderRequest build() {
            return new CreateStructSyncOrderRequest(this);
        } 

    } 

    public static class Source extends TeaModel {
        @NameInMap("DbId")
        @Validation(required = true)
        private Long dbId;

        @NameInMap("DbSearchName")
        @Validation(required = true)
        private String dbSearchName;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("VersionId")
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
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbSearchName.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
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
             * VersionId.
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
        @NameInMap("SourceTableName")
        private String sourceTableName;

        @NameInMap("TargetTableName")
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
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * TargetTableName.
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
        @NameInMap("DbId")
        @Validation(required = true)
        private Long dbId;

        @NameInMap("DbSearchName")
        @Validation(required = true)
        private String dbSearchName;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("VersionId")
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
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbSearchName.
             */
            public Builder dbSearchName(String dbSearchName) {
                this.dbSearchName = dbSearchName;
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
             * VersionId.
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
        @NameInMap("IgnoreError")
        private Boolean ignoreError;

        @NameInMap("Source")
        @Validation(required = true)
        private Source source;

        @NameInMap("TableInfoList")
        private java.util.List < TableInfoList> tableInfoList;

        @NameInMap("Target")
        @Validation(required = true)
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
             * IgnoreError.
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * TableInfoList.
             */
            public Builder tableInfoList(java.util.List < TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * Target.
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
