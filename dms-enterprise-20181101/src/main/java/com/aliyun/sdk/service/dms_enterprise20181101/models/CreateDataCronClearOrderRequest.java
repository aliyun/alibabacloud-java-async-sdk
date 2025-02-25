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
 * {@link CreateDataCronClearOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataCronClearOrderRequest</p>
 */
public class CreateDataCronClearOrderRequest extends Request {
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

    private CreateDataCronClearOrderRequest(Builder builder) {
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

    public static CreateDataCronClearOrderRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDataCronClearOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private java.util.List<Long> relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataCronClearOrderRequest request) {
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
         * <p>order_attachement.txt</p>
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * <p>The purpose or objective of the data change. This reduces unnecessary communication.</p>
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
         * <p>The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
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
         * <p> The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the Manage DMS tenants topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123454324</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataCronClearOrderRequest build() {
            return new CreateDataCronClearOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataCronClearOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataCronClearOrderRequest</p>
     */
    public static class CronClearItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("FilterSQL")
        private String filterSQL;

        @com.aliyun.core.annotation.NameInMap("RemainDays")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long remainDays;

        @com.aliyun.core.annotation.NameInMap("TableName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        private CronClearItemList(Builder builder) {
            this.columnName = builder.columnName;
            this.filterSQL = builder.filterSQL;
            this.remainDays = builder.remainDays;
            this.tableName = builder.tableName;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CronClearItemList create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return filterSQL
         */
        public String getFilterSQL() {
            return this.filterSQL;
        }

        /**
         * @return remainDays
         */
        public Long getRemainDays() {
            return this.remainDays;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private String columnName; 
            private String filterSQL; 
            private Long remainDays; 
            private String tableName; 
            private String timeUnit; 

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>gmt_create</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>where 1 = 1</p>
             */
            public Builder filterSQL(String filterSQL) {
                this.filterSQL = filterSQL;
                return this;
            }

            /**
             * <p>The retention period of the historical data. Unit: days. For example, if you set the parameter to 7, DMS deletes the data that is retained for more than seven days.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder remainDays(Long remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the name of the table.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The type of time granularity. If the ColumnName parameter specifies a field of a time type, this parameter is required. Valid values:</p>
             * <ul>
             * <li><strong>MILLISECONDS</strong>: milliseconds</li>
             * <li><strong>SECONDS</strong>: seconds</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MILLISECONDS</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public CronClearItemList build() {
                return new CronClearItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDataCronClearOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataCronClearOrderRequest</p>
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

            /**
             * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabases</a> operation to query the ID of the database.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database.</li>
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
     * {@link CreateDataCronClearOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataCronClearOrderRequest</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("CronClearItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<CronClearItemList> cronClearItemList;

        @com.aliyun.core.annotation.NameInMap("CronFormat")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cronFormat;

        @com.aliyun.core.annotation.NameInMap("DbItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DbItemList> dbItemList;

        @com.aliyun.core.annotation.NameInMap("DurationHour")
        private Long durationHour;

        @com.aliyun.core.annotation.NameInMap("specifyDuration")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean specifyDuration;

        private Param(Builder builder) {
            this.classify = builder.classify;
            this.cronClearItemList = builder.cronClearItemList;
            this.cronFormat = builder.cronFormat;
            this.dbItemList = builder.dbItemList;
            this.durationHour = builder.durationHour;
            this.specifyDuration = builder.specifyDuration;
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
         * @return cronClearItemList
         */
        public java.util.List<CronClearItemList> getCronClearItemList() {
            return this.cronClearItemList;
        }

        /**
         * @return cronFormat
         */
        public String getCronFormat() {
            return this.cronFormat;
        }

        /**
         * @return dbItemList
         */
        public java.util.List<DbItemList> getDbItemList() {
            return this.dbItemList;
        }

        /**
         * @return durationHour
         */
        public Long getDurationHour() {
            return this.durationHour;
        }

        /**
         * @return specifyDuration
         */
        public Boolean getSpecifyDuration() {
            return this.specifyDuration;
        }

        public static final class Builder {
            private String classify; 
            private java.util.List<CronClearItemList> cronClearItemList; 
            private String cronFormat; 
            private java.util.List<DbItemList> dbItemList; 
            private Long durationHour; 
            private Boolean specifyDuration; 

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
             * <p>The tables for which you want to clear historical data.</p>
             * <p>This parameter is required.</p>
             */
            public Builder cronClearItemList(java.util.List<CronClearItemList> cronClearItemList) {
                this.cronClearItemList = cronClearItemList;
                return this;
            }

            /**
             * <p>The crontab expression that you can use to run the task at a specified time. For more information, see <a href="https://help.aliyun.com/document_detail/206581.html">Crontab expression</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 2 * * ?</p>
             */
            public Builder cronFormat(String cronFormat) {
                this.cronFormat = cronFormat;
                return this;
            }

            /**
             * <p>The databases for which you want to clear historical data.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dbItemList(java.util.List<DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * <p>The amount of time taken to run the task. Unit: hours.</p>
             * <blockquote>
             * <p> If the <strong>specifyDuration</strong> parameter is set to <strong>true</strong>, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder durationHour(Long durationHour) {
                this.durationHour = durationHour;
                return this;
            }

            /**
             * <p>Specifies whether to specify an end time for the task. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: specifies an end time for the task. The task is automatically suspended after this end time.</li>
             * <li><strong>false</strong>: does not specify an end time for the task. The task is stopped after the historical data is cleared.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder specifyDuration(Boolean specifyDuration) {
                this.specifyDuration = specifyDuration;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
