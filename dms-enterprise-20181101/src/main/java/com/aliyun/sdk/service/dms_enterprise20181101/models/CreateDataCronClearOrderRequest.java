// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataCronClearOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataCronClearOrderRequest</p>
 */
public class CreateDataCronClearOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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
    public java.util.List < Long > getRelatedUserList() {
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
        private java.util.List < Long > relatedUserList; 
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
         * The ID of the ticket.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * Indicates whether the database is a logical database. Valid values:
         * <p>
         * 
         * *   **true**: The database is a logical database.
         * *   **false**: The database is not a logical database.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The databases for which you want to clear historical data.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the Manage DMS tenants topic.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The reason for the data change.
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

    public static class CronClearItemList extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        private String columnName;

        @NameInMap("FilterSQL")
        private String filterSQL;

        @NameInMap("RemainDays")
        @Validation(required = true)
        private Long remainDays;

        @NameInMap("TableName")
        @Validation(required = true)
        private String tableName;

        @NameInMap("TimeUnit")
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
             * The amount of time taken to run the task. Unit: hours.
             * <p>
             * 
             * >  If the **specifyDuration** parameter is set to **true**, this parameter is required.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The retention period of the historical data. Unit: days. For example, if you set the parameter to 7, DMS deletes the data that is retained for more than seven days.
             */
            public Builder filterSQL(String filterSQL) {
                this.filterSQL = filterSQL;
                return this;
            }

            /**
             * The crontab expression that you can use to run the task at a specified time. For more information, see [Crontab expression](~~206581~~).
             */
            public Builder remainDays(Long remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * The parameters of the ticket.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The error message.
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
             * The type of time granularity. If the ColumnName parameter specifies a field of a time type, this parameter is required. Valid values:
             * <p>
             * 
             * *   **MILLISECONDS**: milliseconds
             * *   **SECONDS**: seconds
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The tables for which you want to clear historical data.
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
        @NameInMap("Classify")
        private String classify;

        @NameInMap("CronClearItemList")
        @Validation(required = true)
        private java.util.List < CronClearItemList> cronClearItemList;

        @NameInMap("CronFormat")
        @Validation(required = true)
        private String cronFormat;

        @NameInMap("DbItemList")
        @Validation(required = true)
        private java.util.List < DbItemList> dbItemList;

        @NameInMap("DurationHour")
        private Long durationHour;

        @NameInMap("specifyDuration")
        @Validation(required = true)
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
        public java.util.List < CronClearItemList> getCronClearItemList() {
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
        public java.util.List < DbItemList> getDbItemList() {
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
            private java.util.List < CronClearItemList> cronClearItemList; 
            private String cronFormat; 
            private java.util.List < DbItemList> dbItemList; 
            private Long durationHour; 
            private Boolean specifyDuration; 

            /**
             * The purpose or objective of the data change. This reduces unnecessary communication.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.
             */
            public Builder cronClearItemList(java.util.List < CronClearItemList> cronClearItemList) {
                this.cronClearItemList = cronClearItemList;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder cronFormat(String cronFormat) {
                this.cronFormat = cronFormat;
                return this;
            }

            /**
             * The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.
             */
            public Builder dbItemList(java.util.List < DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * The key of the attachment for the ticket. The attachment provides more instructions for this operation.
             * <p>
             * 
             * You can call the [GetUserUploadFileJob](~~206069~~) operation to query the key of the attachment.
             */
            public Builder durationHour(Long durationHour) {
                this.durationHour = durationHour;
                return this;
            }

            /**
             * The name of the table. You can call the [ListTables](~~141878~~) operation to query the name of the table.
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
