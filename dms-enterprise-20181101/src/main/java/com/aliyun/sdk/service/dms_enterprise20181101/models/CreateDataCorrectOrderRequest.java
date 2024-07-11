// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCorrectOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataCorrectOrderRequest</p>
 */
public class CreateDataCorrectOrderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateDataCorrectOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.param = builder.param;
        this.realLoginUserUid = builder.realLoginUserUid;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataCorrectOrderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDataCorrectOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private String realLoginUserUid; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataCorrectOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachmentKey = request.attachmentKey;
            this.comment = request.comment;
            this.param = request.param;
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
         * The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * The purpose or objective of the data change. This parameter is used to help reduce unnecessary communication.
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
         * RealLoginUserUid.
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * The stakeholders of the data change. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataCorrectOrderRequest build() {
            return new CreateDataCorrectOrderRequest(this);
        } 

    } 

    public static class DbItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The ID of the database. The database can be a physical database or a logical database.
             * <p>
             * 
             * *   To obtain the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
             * *   To obtain the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * Specifies whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is a physical database.
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
        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("DbItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < DbItemList> dbItemList;

        @com.aliyun.core.annotation.NameInMap("EstimateAffectRows")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long estimateAffectRows;

        @com.aliyun.core.annotation.NameInMap("ExecMode")
        private String execMode;

        @com.aliyun.core.annotation.NameInMap("ExecSQL")
        private String execSQL;

        @com.aliyun.core.annotation.NameInMap("RollbackAttachmentName")
        private String rollbackAttachmentName;

        @com.aliyun.core.annotation.NameInMap("RollbackSQL")
        private String rollbackSQL;

        @com.aliyun.core.annotation.NameInMap("RollbackSqlType")
        private String rollbackSqlType;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sqlType;

        private Param(Builder builder) {
            this.attachmentName = builder.attachmentName;
            this.classify = builder.classify;
            this.dbItemList = builder.dbItemList;
            this.estimateAffectRows = builder.estimateAffectRows;
            this.execMode = builder.execMode;
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
         * @return estimateAffectRows
         */
        public Long getEstimateAffectRows() {
            return this.estimateAffectRows;
        }

        /**
         * @return execMode
         */
        public String getExecMode() {
            return this.execMode;
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
            private Long estimateAffectRows; 
            private String execMode; 
            private String execSQL; 
            private String rollbackAttachmentName; 
            private String rollbackSQL; 
            private String rollbackSqlType; 
            private String sqlType; 

            /**
             * The key of the attachment that contains the SQL statements used to change data. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
             * <p>
             * 
             * >  This parameter is required if you set the **SqlType** parameter to **ATTACHMENT**.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * The reason for the data change.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The databases in which you want to change data.
             */
            public Builder dbItemList(java.util.List < DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * The estimated number of data rows to be affected by the data change.
             */
            public Builder estimateAffectRows(Long estimateAffectRows) {
                this.estimateAffectRows = estimateAffectRows;
                return this;
            }

            /**
             * The execution mode of the ticket after the ticket is approved. Valid values:
             * <p>
             * 
             * *   **COMMITOR**: The data change is performed by the user who submits the ticket.
             * *   **AUTO**: The data change is automatically performed after the ticket is approved.
             * *   **LAST_AUDITOR**: The data change is performed by the last approver of the ticket.
             */
            public Builder execMode(String execMode) {
                this.execMode = execMode;
                return this;
            }

            /**
             * The SQL statements that you want to execute to change data.
             * <p>
             * 
             * >  This parameter is required if you set the **SqlType** parameter to **TEXT**.
             */
            public Builder execSQL(String execSQL) {
                this.execSQL = execSQL;
                return this;
            }

            /**
             * The key of the attachment that contains the SQL statements used to roll back the data change. You can call the [GetUserUploadFileJob](~~206069~~) operation to the attachment key from the value of the AttachmentKey parameter.
             * <p>
             * 
             * >  This parameter is required if you set the **RollbackSqlType** parameter to **ATTACHMENT**.
             */
            public Builder rollbackAttachmentName(String rollbackAttachmentName) {
                this.rollbackAttachmentName = rollbackAttachmentName;
                return this;
            }

            /**
             * The SQL statements used to roll back the data change.
             * <p>
             * 
             * > This parameter is required if you set the **RollbackSqlType** parameter to **TEXT**.
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * The format of the SQL statements used to roll back the data change. Valid values:
             * <p>
             * 
             * *   **TEXT**: text
             * *   **ATTACHMENT**: attachment
             */
            public Builder rollbackSqlType(String rollbackSqlType) {
                this.rollbackSqlType = rollbackSqlType;
                return this;
            }

            /**
             * The format of the SQL statements used to change data. Valid values:
             * <p>
             * 
             * *   **TEXT**: text
             * *   **ATTACHMENT**: attachment
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
