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
    private java.util.List<Long> relatedUserList;

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
    public java.util.List<Long> getRelatedUserList() {
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
        private java.util.List<Long> relatedUserList; 
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
         * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
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
         * <p>The purpose or objective of the data change. This parameter is used to help reduce unnecessary communication.</p>
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
         * <p>The ID of the Alibaba Cloud account that is used to call the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>21400447956867****</p>
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * <p>The stakeholders of the data change. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
         */
        public Builder relatedUserList(java.util.List<Long> relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
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
        public CreateDataCorrectOrderRequest build() {
            return new CreateDataCorrectOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataCorrectOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataCorrectOrderRequest</p>
     */
    public static class DbItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        private DbItemList(Builder builder) {
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
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

        public static final class Builder {
            private Long dbId; 
            private Long instanceId; 
            private Boolean logic; 

            private Builder() {
            } 

            private Builder(DbItemList model) {
                this.dbId = model.dbId;
                this.instanceId = model.instanceId;
                this.logic = model.logic;
            } 

            /**
             * <p>The database ID. The database can be a physical database or a logical database.</p>
             * <ul>
             * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The instance ID. You can call the ListInstances or GetInstance operation to query the instance ID.</p>
             * <blockquote>
             * <p>The instance change feature is supported only by ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and AnalyticDB for MySQL clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link CreateDataCorrectOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataCorrectOrderRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("DbItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DbItemList> dbItemList;

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
        public java.util.List<DbItemList> getDbItemList() {
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
            private java.util.List<DbItemList> dbItemList; 
            private Long estimateAffectRows; 
            private String execMode; 
            private String execSQL; 
            private String rollbackAttachmentName; 
            private String rollbackSQL; 
            private String rollbackSqlType; 
            private String sqlType; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.attachmentName = model.attachmentName;
                this.classify = model.classify;
                this.dbItemList = model.dbItemList;
                this.estimateAffectRows = model.estimateAffectRows;
                this.execMode = model.execMode;
                this.execSQL = model.execSQL;
                this.rollbackAttachmentName = model.rollbackAttachmentName;
                this.rollbackSQL = model.rollbackSQL;
                this.rollbackSqlType = model.rollbackSqlType;
                this.sqlType = model.sqlType;
            } 

            /**
             * <p>The key of the attachment that contains the SQL statements used to change data. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of AttachmentKey.</p>
             * <blockquote>
             * <p> This parameter is required if you set <strong>SqlType</strong> to <strong>ATTACHMENT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test.sql</p>
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * <p>The reason for the data change.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The databases whose data you want to change.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dbItemList(java.util.List<DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * <p>The estimated number of data rows that may be affected by the data change.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder estimateAffectRows(Long estimateAffectRows) {
                this.estimateAffectRows = estimateAffectRows;
                return this;
            }

            /**
             * <p>The mode in which the data change ticket is executed after the ticket is approved. Valid values:</p>
             * <ul>
             * <li><strong>COMMITOR</strong>: The ticket is executed by the user who submits the ticket.</li>
             * <li><strong>AUTO</strong>: The ticket is automatically executed after the ticket is approved.</li>
             * <li><strong>LAST_AUDITOR</strong>: The ticket is executed by the last approver of the ticket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMMITOR</p>
             */
            public Builder execMode(String execMode) {
                this.execMode = execMode;
                return this;
            }

            /**
             * <p>The SQL statements for data change.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is required if you set <strong>SqlType</strong> to <strong>TEXT</strong>.</p>
             * </li>
             * <li><p>The size of the SQL statement cannot exceed 15 MB.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>update base_user set id = 1 where id  = 1;</p>
             */
            public Builder execSQL(String execSQL) {
                this.execSQL = execSQL;
                return this;
            }

            /**
             * <p>The key of the attachment that contains the SQL statements used to roll back the data change. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of AttachmentKey.</p>
             * <blockquote>
             * <p> This parameter is required if you set <strong>RollbackSqlType</strong> to <strong>ATTACHMENT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_rollback.sql</p>
             */
            public Builder rollbackAttachmentName(String rollbackAttachmentName) {
                this.rollbackAttachmentName = rollbackAttachmentName;
                return this;
            }

            /**
             * <p>The SQL statements for rolling back the data change.</p>
             * <blockquote>
             * <p> This parameter is required if you set <strong>RollbackSqlType</strong> to <strong>TEXT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>update base_user set id = 1 where id  = 1;</p>
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * <p>The format of the SQL statements used to roll back the data change. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong></li>
             * <li><strong>ATTACHMENT</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder rollbackSqlType(String rollbackSqlType) {
                this.rollbackSqlType = rollbackSqlType;
                return this;
            }

            /**
             * <p>The format of the SQL statements used to change data. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong></li>
             * <li><strong>ATTACHMENT</strong></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
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
