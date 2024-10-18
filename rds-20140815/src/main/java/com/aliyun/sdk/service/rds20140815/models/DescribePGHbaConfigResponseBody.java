// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePGHbaConfigResponseBody</p>
 */
public class DescribePGHbaConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DefaultHbaItems")
    private DefaultHbaItems defaultHbaItems;

    @com.aliyun.core.annotation.NameInMap("HbaModifyTime")
    private String hbaModifyTime;

    @com.aliyun.core.annotation.NameInMap("LastModifyStatus")
    private String lastModifyStatus;

    @com.aliyun.core.annotation.NameInMap("ModifyStatusReason")
    private String modifyStatusReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningHbaItems")
    private RunningHbaItems runningHbaItems;

    private DescribePGHbaConfigResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.defaultHbaItems = builder.defaultHbaItems;
        this.hbaModifyTime = builder.hbaModifyTime;
        this.lastModifyStatus = builder.lastModifyStatus;
        this.modifyStatusReason = builder.modifyStatusReason;
        this.requestId = builder.requestId;
        this.runningHbaItems = builder.runningHbaItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePGHbaConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return defaultHbaItems
     */
    public DefaultHbaItems getDefaultHbaItems() {
        return this.defaultHbaItems;
    }

    /**
     * @return hbaModifyTime
     */
    public String getHbaModifyTime() {
        return this.hbaModifyTime;
    }

    /**
     * @return lastModifyStatus
     */
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    /**
     * @return modifyStatusReason
     */
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningHbaItems
     */
    public RunningHbaItems getRunningHbaItems() {
        return this.runningHbaItems;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private DefaultHbaItems defaultHbaItems; 
        private String hbaModifyTime; 
        private String lastModifyStatus; 
        private String modifyStatusReason; 
        private String requestId; 
        private RunningHbaItems runningHbaItems; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The default configuration items of the pg_hba.conf file.</p>
         */
        public Builder defaultHbaItems(DefaultHbaItems defaultHbaItems) {
            this.defaultHbaItems = defaultHbaItems;
            return this;
        }

        /**
         * <p>The time when the previous modification was made to the pg_hba.conf file.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-25T06:00:40Z</p>
         */
        public Builder hbaModifyTime(String hbaModifyTime) {
            this.hbaModifyTime = hbaModifyTime;
            return this;
        }

        /**
         * <p>The status of the previous modification to the pg_hba.conf file. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>setting</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * <p>The reason why the previous modification was made to the pg_hba.conf file.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified users (testuser) is not exist.</p>
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A147A124-A147-5CCF-9609-B73C028848DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The current configuration items of the pg_hba.conf file.</p>
         */
        public Builder runningHbaItems(RunningHbaItems runningHbaItems) {
            this.runningHbaItems = runningHbaItems;
            return this;
        }

        public DescribePGHbaConfigResponseBody build() {
            return new DescribePGHbaConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePGHbaConfigResponseBody</p>
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

            /**
             * <p>The IP addresses from which the specified users can access the specified databases. The value is fixed as 0.0.0.0/0.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The names of the databases that the specified users are allowed to access. The value is fixed as all or replication.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The mask of the instance. The value is fixed as null.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The authentication method. The value is fixed as md5.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The value of this parameter is based on the value of the Method parameter. The value is fixed as null.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * <p>The priority of the configuration items in the pg_hba.conf file. This value is automatically generated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * <p>The type of connection to the instance. The value is fixed as host.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The user that is allowed to access the instance. The value is fixed as all.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
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
     * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePGHbaConfigResponseBody</p>
     */
    public static class DefaultHbaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaItem")
        private java.util.List < HbaItem> hbaItem;

        private DefaultHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List < HbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List < HbaItem> hbaItem; 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List < HbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public DefaultHbaItems build() {
                return new DefaultHbaItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePGHbaConfigResponseBody</p>
     */
    public static class RunningHbaItemsHbaItem extends TeaModel {
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

        private RunningHbaItemsHbaItem(Builder builder) {
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

        public static RunningHbaItemsHbaItem create() {
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

            /**
             * <p>The IP address of the client.</p>
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
             * <p>The value of this parameter varies based on the value of the Method parameter. The value is fixed as null.</p>
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
             * <p>3</p>
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * <p>The connection type. Valor:</p>
             * <ul>
             * <li><strong>host</strong>: The record matches TCP/IP connections, including SSL connections and non-SSL connections.</li>
             * <li><strong>hostssl</strong>: The record matches only TCP/IP connections that are established over SSL.</li>
             * <li><strong>hostnossl</strong>: The record matches only TCP/IP connections that are not established over SSL connections.</li>
             * </ul>
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

            public RunningHbaItemsHbaItem build() {
                return new RunningHbaItemsHbaItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePGHbaConfigResponseBody</p>
     */
    public static class RunningHbaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HbaItem")
        private java.util.List < RunningHbaItemsHbaItem> hbaItem;

        private RunningHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List < RunningHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List < RunningHbaItemsHbaItem> hbaItem; 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List < RunningHbaItemsHbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public RunningHbaItems build() {
                return new RunningHbaItems(this);
            } 

        } 

    }
}
