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
 * {@link CreateProcCorrectOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateProcCorrectOrderRequest</p>
 */
public class CreateProcCorrectOrderRequest extends Request {
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

    private CreateProcCorrectOrderRequest(Builder builder) {
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

    public static CreateProcCorrectOrderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateProcCorrectOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private java.util.List<Long> relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateProcCorrectOrderRequest request) {
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
         * <p>The key of the attachment for the ticket. The attachment provides more instructions for this operation.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
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
         * <p>The operators that are related to the ticket.</p>
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
         * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateProcCorrectOrderRequest build() {
            return new CreateProcCorrectOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProcCorrectOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateProcCorrectOrderRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(DbItemList model) {
                this.dbId = model.dbId;
                this.logic = model.logic;
            } 

            /**
             * <p>The database ID. Databases are divided into physical databases and logical databases.</p>
             * <ul>
             * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>19721978</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * <p>This parameter is required.</p>
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
     * {@link CreateProcCorrectOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateProcCorrectOrderRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("DbItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DbItemList> dbItemList;

        @com.aliyun.core.annotation.NameInMap("ExecMode")
        private String execMode;

        @com.aliyun.core.annotation.NameInMap("ExecSQL")
        @com.aliyun.core.annotation.Validation(required = true)
        private String execSQL;

        @com.aliyun.core.annotation.NameInMap("RollbackAttachmentName")
        private String rollbackAttachmentName;

        @com.aliyun.core.annotation.NameInMap("RollbackSQL")
        private String rollbackSQL;

        @com.aliyun.core.annotation.NameInMap("RollbackSqlType")
        private String rollbackSqlType;

        private Param(Builder builder) {
            this.classify = builder.classify;
            this.dbItemList = builder.dbItemList;
            this.execMode = builder.execMode;
            this.execSQL = builder.execSQL;
            this.rollbackAttachmentName = builder.rollbackAttachmentName;
            this.rollbackSQL = builder.rollbackSQL;
            this.rollbackSqlType = builder.rollbackSqlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
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

        public static final class Builder {
            private String classify; 
            private java.util.List<DbItemList> dbItemList; 
            private String execMode; 
            private String execSQL; 
            private String rollbackAttachmentName; 
            private String rollbackSQL; 
            private String rollbackSqlType; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.classify = model.classify;
                this.dbItemList = model.dbItemList;
                this.execMode = model.execMode;
                this.execSQL = model.execSQL;
                this.rollbackAttachmentName = model.rollbackAttachmentName;
                this.rollbackSQL = model.rollbackSQL;
                this.rollbackSqlType = model.rollbackSqlType;
            } 

            /**
             * <p>The reason for the programmable object change.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The information about the database.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dbItemList(java.util.List<DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DELIMITER ///
             * CREATE PROCEDURE GetAllProducts()
             * BEGIN
             * SELECT *  FROM base_user;
             * END ///</p>
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
             * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>TEXT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
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

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
