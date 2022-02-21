// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFreeLockCorrectOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateFreeLockCorrectOrderRequest</p>
 */
public class CreateFreeLockCorrectOrderRequest extends Request {
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

    private CreateFreeLockCorrectOrderRequest(Builder builder) {
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

    public static CreateFreeLockCorrectOrderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateFreeLockCorrectOrderRequest, Builder> {
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private String regionId; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateFreeLockCorrectOrderRequest response) {
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
        public CreateFreeLockCorrectOrderRequest build() {
            return new CreateFreeLockCorrectOrderRequest(this);
        } 

    } 

    public static class DbItemList extends TeaModel {
        @NameInMap("DbId")
        @Validation(required = true)
        private Long dbId;

        @NameInMap("Logic")
        @Validation(required = true)
        private Boolean logic;

        private DbItemList(Builder builder) {
            this.dbId = builder.dbId;
            this.logic = builder.logic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbItemList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        public static final class Builder {
            private Long dbId; 
            private Boolean logic; 

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            public DbItemList build() {
                return new DbItemList(this);
            } 

        } 

    }
    public static class Param extends TeaModel {
        @NameInMap("AttachmentName")
        private String attachmentName;

        @NameInMap("Classify")
        private String classify;

        @NameInMap("DbItemList")
        @Validation(required = true)
        private java.util.List < DbItemList> dbItemList;

        @NameInMap("ExecSQL")
        @Validation(required = true)
        private String execSQL;

        @NameInMap("RollbackAttachmentName")
        private String rollbackAttachmentName;

        @NameInMap("RollbackSQL")
        private String rollbackSQL;

        @NameInMap("RollbackSqlType")
        private String rollbackSqlType;

        @NameInMap("SqlType")
        @Validation(required = true)
        private String sqlType;

        private Param(Builder builder) {
            this.attachmentName = builder.attachmentName;
            this.classify = builder.classify;
            this.dbItemList = builder.dbItemList;
            this.execSQL = builder.execSQL;
            this.rollbackAttachmentName = builder.rollbackAttachmentName;
            this.rollbackSQL = builder.rollbackSQL;
            this.rollbackSqlType = builder.rollbackSqlType;
            this.sqlType = builder.sqlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return dbItemList
         */
        public java.util.List < DbItemList> getDbItemList() {
            return this.dbItemList;
        }

        /**
         * @return execSQL
         */
        public String getExecSQL() {
            return this.execSQL;
        }

        /**
         * @return rollbackAttachmentName
         */
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        /**
         * @return rollbackSQL
         */
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        /**
         * @return rollbackSqlType
         */
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        public static final class Builder {
            private String attachmentName; 
            private String classify; 
            private java.util.List < DbItemList> dbItemList; 
            private String execSQL; 
            private String rollbackAttachmentName; 
            private String rollbackSQL; 
            private String rollbackSqlType; 
            private String sqlType; 

            /**
             * AttachmentName.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
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
             * DbItemList.
             */
            public Builder dbItemList(java.util.List < DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * ExecSQL.
             */
            public Builder execSQL(String execSQL) {
                this.execSQL = execSQL;
                return this;
            }

            /**
             * RollbackAttachmentName.
             */
            public Builder rollbackAttachmentName(String rollbackAttachmentName) {
                this.rollbackAttachmentName = rollbackAttachmentName;
                return this;
            }

            /**
             * RollbackSQL.
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * RollbackSqlType.
             */
            public Builder rollbackSqlType(String rollbackSqlType) {
                this.rollbackSqlType = rollbackSqlType;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
