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
 * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
 */
public class DescribeSQLServerUpgradeVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSQLServerUpgradeVersionsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLServerUpgradeVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSQLServerUpgradeVersionsResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLServerUpgradeVersionsResponseBody build() {
            return new DescribeSQLServerUpgradeVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class DBInstanceClassItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceClassType")
        private String DBInstanceClassType;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        private DBInstanceClassItem(Builder builder) {
            this.CPU = builder.CPU;
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceClassType = builder.DBInstanceClassType;
            this.group = builder.group;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceClassItem create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceClassType
         */
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private String CPU; 
            private String DBInstanceClass; 
            private String DBInstanceClassType; 
            private String group; 
            private String memory; 

            private Builder() {
            } 

            private Builder(DBInstanceClassItem model) {
                this.CPU = model.CPU;
                this.DBInstanceClass = model.DBInstanceClass;
                this.DBInstanceClassType = model.DBInstanceClassType;
                this.group = model.group;
                this.memory = model.memory;
            } 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceClassType.
             */
            public Builder DBInstanceClassType(String DBInstanceClassType) {
                this.DBInstanceClassType = DBInstanceClassType;
                return this;
            }

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            public DBInstanceClassItem build() {
                return new DBInstanceClassItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class DBInstanceClassItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceClassItem")
        private java.util.List<DBInstanceClassItem> DBInstanceClassItem;

        private DBInstanceClassItems(Builder builder) {
            this.DBInstanceClassItem = builder.DBInstanceClassItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceClassItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceClassItem
         */
        public java.util.List<DBInstanceClassItem> getDBInstanceClassItem() {
            return this.DBInstanceClassItem;
        }

        public static final class Builder {
            private java.util.List<DBInstanceClassItem> DBInstanceClassItem; 

            private Builder() {
            } 

            private Builder(DBInstanceClassItems model) {
                this.DBInstanceClassItem = model.DBInstanceClassItem;
            } 

            /**
             * DBInstanceClassItem.
             */
            public Builder DBInstanceClassItem(java.util.List<DBInstanceClassItem> DBInstanceClassItem) {
                this.DBInstanceClassItem = DBInstanceClassItem;
                return this;
            }

            public DBInstanceClassItems build() {
                return new DBInstanceClassItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class SQLServerUpgradeVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceClassItems")
        private DBInstanceClassItems DBInstanceClassItems;

        @com.aliyun.core.annotation.NameInMap("EnableUpgrade")
        private String enableUpgrade;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SQLServerUpgradeVersion(Builder builder) {
            this.DBInstanceClassItems = builder.DBInstanceClassItems;
            this.enableUpgrade = builder.enableUpgrade;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLServerUpgradeVersion create() {
            return builder().build();
        }

        /**
         * @return DBInstanceClassItems
         */
        public DBInstanceClassItems getDBInstanceClassItems() {
            return this.DBInstanceClassItems;
        }

        /**
         * @return enableUpgrade
         */
        public String getEnableUpgrade() {
            return this.enableUpgrade;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private DBInstanceClassItems DBInstanceClassItems; 
            private String enableUpgrade; 
            private String version; 

            private Builder() {
            } 

            private Builder(SQLServerUpgradeVersion model) {
                this.DBInstanceClassItems = model.DBInstanceClassItems;
                this.enableUpgrade = model.enableUpgrade;
                this.version = model.version;
            } 

            /**
             * DBInstanceClassItems.
             */
            public Builder DBInstanceClassItems(DBInstanceClassItems DBInstanceClassItems) {
                this.DBInstanceClassItems = DBInstanceClassItems;
                return this;
            }

            /**
             * EnableUpgrade.
             */
            public Builder enableUpgrade(String enableUpgrade) {
                this.enableUpgrade = enableUpgrade;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SQLServerUpgradeVersion build() {
                return new SQLServerUpgradeVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class SQLServerUpgradeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLServerUpgradeVersion")
        private java.util.List<SQLServerUpgradeVersion> SQLServerUpgradeVersion;

        private SQLServerUpgradeVersions(Builder builder) {
            this.SQLServerUpgradeVersion = builder.SQLServerUpgradeVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLServerUpgradeVersions create() {
            return builder().build();
        }

        /**
         * @return SQLServerUpgradeVersion
         */
        public java.util.List<SQLServerUpgradeVersion> getSQLServerUpgradeVersion() {
            return this.SQLServerUpgradeVersion;
        }

        public static final class Builder {
            private java.util.List<SQLServerUpgradeVersion> SQLServerUpgradeVersion; 

            private Builder() {
            } 

            private Builder(SQLServerUpgradeVersions model) {
                this.SQLServerUpgradeVersion = model.SQLServerUpgradeVersion;
            } 

            /**
             * SQLServerUpgradeVersion.
             */
            public Builder SQLServerUpgradeVersion(java.util.List<SQLServerUpgradeVersion> SQLServerUpgradeVersion) {
                this.SQLServerUpgradeVersion = SQLServerUpgradeVersion;
                return this;
            }

            public SQLServerUpgradeVersions build() {
                return new SQLServerUpgradeVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("SQLServerUpgradeVersions")
        private SQLServerUpgradeVersions SQLServerUpgradeVersions;

        private Item(Builder builder) {
            this.currentVersion = builder.currentVersion;
            this.SQLServerUpgradeVersions = builder.SQLServerUpgradeVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return SQLServerUpgradeVersions
         */
        public SQLServerUpgradeVersions getSQLServerUpgradeVersions() {
            return this.SQLServerUpgradeVersions;
        }

        public static final class Builder {
            private String currentVersion; 
            private SQLServerUpgradeVersions SQLServerUpgradeVersions; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.currentVersion = model.currentVersion;
                this.SQLServerUpgradeVersions = model.SQLServerUpgradeVersions;
            } 

            /**
             * CurrentVersion.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * SQLServerUpgradeVersions.
             */
            public Builder SQLServerUpgradeVersions(SQLServerUpgradeVersions SQLServerUpgradeVersions) {
                this.SQLServerUpgradeVersions = SQLServerUpgradeVersions;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLServerUpgradeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLServerUpgradeVersionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
            } 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
