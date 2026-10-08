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

        private Builder() {
        } 

        private Builder(DescribePGHbaConfigResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.defaultHbaItems = model.defaultHbaItems;
            this.hbaModifyTime = model.hbaModifyTime;
            this.lastModifyStatus = model.lastModifyStatus;
            this.modifyStatusReason = model.modifyStatusReason;
            this.requestId = model.requestId;
            this.runningHbaItems = model.runningHbaItems;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DefaultHbaItems.
         */
        public Builder defaultHbaItems(DefaultHbaItems defaultHbaItems) {
            this.defaultHbaItems = defaultHbaItems;
            return this;
        }

        /**
         * HbaModifyTime.
         */
        public Builder hbaModifyTime(String hbaModifyTime) {
            this.hbaModifyTime = hbaModifyTime;
            return this;
        }

        /**
         * LastModifyStatus.
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * ModifyStatusReason.
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RunningHbaItems.
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * PriorityId.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * User.
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
        private java.util.List<HbaItem> hbaItem;

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
        public java.util.List<HbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List<HbaItem> hbaItem; 

            private Builder() {
            } 

            private Builder(DefaultHbaItems model) {
                this.hbaItem = model.hbaItem;
            } 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List<HbaItem> hbaItem) {
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

            private Builder() {
            } 

            private Builder(RunningHbaItemsHbaItem model) {
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * Mask.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * PriorityId.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * User.
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
        private java.util.List<RunningHbaItemsHbaItem> hbaItem;

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
        public java.util.List<RunningHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List<RunningHbaItemsHbaItem> hbaItem; 

            private Builder() {
            } 

            private Builder(RunningHbaItems model) {
                this.hbaItem = model.hbaItem;
            } 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List<RunningHbaItemsHbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public RunningHbaItems build() {
                return new RunningHbaItems(this);
            } 

        } 

    }
}
