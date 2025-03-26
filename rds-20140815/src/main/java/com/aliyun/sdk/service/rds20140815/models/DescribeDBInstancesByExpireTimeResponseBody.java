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
 * {@link DescribeDBInstancesByExpireTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesByExpireTimeResponseBody</p>
 */
public class DescribeDBInstancesByExpireTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstancesByExpireTimeResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesByExpireTimeResponseBody create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDBInstancesByExpireTimeResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details of the instances.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page. Valid values: any <strong>non-zero</strong> positive integer.</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instances returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesByExpireTimeResponseBody build() {
            return new DescribeDBInstancesByExpireTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesByExpireTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesByExpireTimeResponseBody</p>
     */
    public static class DBInstanceExpireTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        private DBInstanceExpireTime(Builder builder) {
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.expireTime = builder.expireTime;
            this.lockMode = builder.lockMode;
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceExpireTime create() {
            return builder().build();
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String expireTime; 
            private String lockMode; 
            private String payType; 

            private Builder() {
            } 

            private Builder(DBInstanceExpireTime model) {
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.expireTime = model.expireTime;
                this.lockMode = model.lockMode;
                this.payType = model.payType;
            } 

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test database</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The status of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26315.html">Instance state table</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p>: Pay-as-you-go instances never expire.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2019-03-27T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The lock mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unlock</strong>: The instance is not locked.</li>
             * <li><strong>ManualLock</strong>: The instance is manually locked.</li>
             * <li><strong>LockByExpiration</strong>: The instance is automatically locked after it expires.</li>
             * <li><strong>LockByRestoration</strong>: The instance is automatically locked before it is rolled back.</li>
             * <li><strong>LockByDiskQuota</strong>: The instance is automatically locked after its storage capacity is exhausted.</li>
             * <li><strong>LockReadInstanceByDiskQuota</strong>: The instance is a read-only instance and is automatically locked after its storage capacity is exhausted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public DBInstanceExpireTime build() {
                return new DBInstanceExpireTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesByExpireTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesByExpireTimeResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceExpireTime")
        private java.util.List<DBInstanceExpireTime> DBInstanceExpireTime;

        private Items(Builder builder) {
            this.DBInstanceExpireTime = builder.DBInstanceExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstanceExpireTime
         */
        public java.util.List<DBInstanceExpireTime> getDBInstanceExpireTime() {
            return this.DBInstanceExpireTime;
        }

        public static final class Builder {
            private java.util.List<DBInstanceExpireTime> DBInstanceExpireTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstanceExpireTime = model.DBInstanceExpireTime;
            } 

            /**
             * DBInstanceExpireTime.
             */
            public Builder DBInstanceExpireTime(java.util.List<DBInstanceExpireTime> DBInstanceExpireTime) {
                this.DBInstanceExpireTime = DBInstanceExpireTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
