// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
 */
public class DescribeModifyPGHbaConfigLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("HbaLogItems")
    private HbaLogItems hbaLogItems;

    @com.aliyun.core.annotation.NameInMap("LogItemCount")
    private Integer logItemCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeModifyPGHbaConfigLogResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.hbaLogItems = builder.hbaLogItems;
        this.logItemCount = builder.logItemCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModifyPGHbaConfigLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return hbaLogItems
     */
    public HbaLogItems getHbaLogItems() {
        return this.hbaLogItems;
    }

    /**
     * @return logItemCount
     */
    public Integer getLogItemCount() {
        return this.logItemCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private HbaLogItems hbaLogItems; 
        private Integer logItemCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeModifyPGHbaConfigLogResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.hbaLogItems = model.hbaLogItems;
            this.logItemCount = model.logItemCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1lymyn1v3i****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>An array that consists of the modifications to the pg_hba.conf file.</p>
         */
        public Builder hbaLogItems(HbaLogItems hbaLogItems) {
            this.hbaLogItems = hbaLogItems;
            return this;
        }

        /**
         * <p>The number of modification records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logItemCount(Integer logItemCount) {
            this.logItemCount = logItemCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D797E6B-E157-510C-A27F-6F9E6DA40633</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModifyPGHbaConfigLogResponseBody build() {
            return new DescribeModifyPGHbaConfigLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class HbaItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("PriorityId")
        private Integer priorityId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private HbaItem(Builder builder) {
            this.address = builder.address;
            this.database = builder.database;
            this.mask = builder.mask;
            this.method = builder.method;
            this.option = builder.option;
            this.priorityId = builder.priorityId;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaItem create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private String database; 
            private String mask; 
            private String method; 
            private String option; 
            private Integer priorityId; 
            private String type; 
            private String user; 

            private Builder() {
            } 

            private Builder(HbaItem model) {
                this.address = model.address;
                this.database = model.database;
                this.mask = model.mask;
                this.method = model.method;
                this.option = model.option;
                this.priorityId = model.priorityId;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The mask of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The value of this parameter was set based on the value of the Method parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * <p>The connection type.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>ldapuser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public HbaItem build() {
                return new HbaItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class AfterHbaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaItem")
        private java.util.List<HbaItem> hbaItem;

        private AfterHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AfterHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List<HbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List<HbaItem> hbaItem; 

            private Builder() {
            } 

            private Builder(AfterHbaItems model) {
                this.hbaItem = model.hbaItem;
            } 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List<HbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public AfterHbaItems build() {
                return new AfterHbaItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class BeforeHbaItemsHbaItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("PriorityId")
        private Integer priorityId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private BeforeHbaItemsHbaItem(Builder builder) {
            this.address = builder.address;
            this.database = builder.database;
            this.mask = builder.mask;
            this.method = builder.method;
            this.option = builder.option;
            this.priorityId = builder.priorityId;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeforeHbaItemsHbaItem create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private String database; 
            private String mask; 
            private String method; 
            private String option; 
            private Integer priorityId; 
            private String type; 
            private String user; 

            private Builder() {
            } 

            private Builder(BeforeHbaItemsHbaItem model) {
                this.address = model.address;
                this.database = model.database;
                this.mask = model.mask;
                this.method = model.method;
                this.option = model.option;
                this.priorityId = model.priorityId;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The mask of the IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The authentication method.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The value of this parameter varies based on the value of the Method parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * <p>The connection type.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public BeforeHbaItemsHbaItem build() {
                return new BeforeHbaItemsHbaItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class BeforeHbaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaItem")
        private java.util.List<BeforeHbaItemsHbaItem> hbaItem;

        private BeforeHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeforeHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List<BeforeHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List<BeforeHbaItemsHbaItem> hbaItem; 

            private Builder() {
            } 

            private Builder(BeforeHbaItems model) {
                this.hbaItem = model.hbaItem;
            } 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List<BeforeHbaItemsHbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public BeforeHbaItems build() {
                return new BeforeHbaItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class HbaLogItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterHbaItems")
        private AfterHbaItems afterHbaItems;

        @com.aliyun.core.annotation.NameInMap("BeforeHbaItems")
        private BeforeHbaItems beforeHbaItems;

        @com.aliyun.core.annotation.NameInMap("ModifyStatus")
        private String modifyStatus;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private HbaLogItem(Builder builder) {
            this.afterHbaItems = builder.afterHbaItems;
            this.beforeHbaItems = builder.beforeHbaItems;
            this.modifyStatus = builder.modifyStatus;
            this.modifyTime = builder.modifyTime;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaLogItem create() {
            return builder().build();
        }

        /**
         * @return afterHbaItems
         */
        public AfterHbaItems getAfterHbaItems() {
            return this.afterHbaItems;
        }

        /**
         * @return beforeHbaItems
         */
        public BeforeHbaItems getBeforeHbaItems() {
            return this.beforeHbaItems;
        }

        /**
         * @return modifyStatus
         */
        public String getModifyStatus() {
            return this.modifyStatus;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private AfterHbaItems afterHbaItems; 
            private BeforeHbaItems beforeHbaItems; 
            private String modifyStatus; 
            private String modifyTime; 
            private String statusReason; 

            private Builder() {
            } 

            private Builder(HbaLogItem model) {
                this.afterHbaItems = model.afterHbaItems;
                this.beforeHbaItems = model.beforeHbaItems;
                this.modifyStatus = model.modifyStatus;
                this.modifyTime = model.modifyTime;
                this.statusReason = model.statusReason;
            } 

            /**
             * <p>The configurations of the pg_hba.conf file after modification.</p>
             */
            public Builder afterHbaItems(AfterHbaItems afterHbaItems) {
                this.afterHbaItems = afterHbaItems;
                return this;
            }

            /**
             * <p>The configurations of the pg_hba.conf file before modification.</p>
             */
            public Builder beforeHbaItems(BeforeHbaItems beforeHbaItems) {
                this.beforeHbaItems = beforeHbaItems;
                return this;
            }

            /**
             * <p>The status of the modification.</p>
             * <ul>
             * <li><strong>success</strong>: The modification is successful.</li>
             * <li><strong>failed</strong>: The modification failed.</li>
             * <li><strong>setting</strong>: The modification is being applied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder modifyStatus(String modifyStatus) {
                this.modifyStatus = modifyStatus;
                return this;
            }

            /**
             * <p>The time when the pg_hba.conf file was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-25T06:00:40Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The reason why the modification failed.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public HbaLogItem build() {
                return new HbaLogItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
     */
    public static class HbaLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaLogItem")
        private java.util.List<HbaLogItem> hbaLogItem;

        private HbaLogItems(Builder builder) {
            this.hbaLogItem = builder.hbaLogItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaLogItems create() {
            return builder().build();
        }

        /**
         * @return hbaLogItem
         */
        public java.util.List<HbaLogItem> getHbaLogItem() {
            return this.hbaLogItem;
        }

        public static final class Builder {
            private java.util.List<HbaLogItem> hbaLogItem; 

            private Builder() {
            } 

            private Builder(HbaLogItems model) {
                this.hbaLogItem = model.hbaLogItem;
            } 

            /**
             * HbaLogItem.
             */
            public Builder hbaLogItem(java.util.List<HbaLogItem> hbaLogItem) {
                this.hbaLogItem = hbaLogItem;
                return this;
            }

            public HbaLogItems build() {
                return new HbaLogItems(this);
            } 

        } 

    }
}
