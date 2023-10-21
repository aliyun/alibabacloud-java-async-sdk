// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIPArrayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIPArrayListResponseBody</p>
 */
public class DescribeDBInstanceIPArrayListResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceIPArrayListResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIPArrayListResponseBody create() {
        return builder().build();
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

        /**
         * An array that consists of the details about the IP address whitelists.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceIPArrayListResponseBody build() {
            return new DescribeDBInstanceIPArrayListResponseBody(this);
        } 

    } 

    public static class DBInstanceIPArray extends TeaModel {
        @NameInMap("DBInstanceIPArrayAttribute")
        private String DBInstanceIPArrayAttribute;

        @NameInMap("DBInstanceIPArrayName")
        private String DBInstanceIPArrayName;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("SecurityIPType")
        private String securityIPType;

        private DBInstanceIPArray(Builder builder) {
            this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
            this.securityIPList = builder.securityIPList;
            this.securityIPType = builder.securityIPType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIPArray create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIPArrayAttribute
         */
        public String getDBInstanceIPArrayAttribute() {
            return this.DBInstanceIPArrayAttribute;
        }

        /**
         * @return DBInstanceIPArrayName
         */
        public String getDBInstanceIPArrayName() {
            return this.DBInstanceIPArrayName;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return securityIPType
         */
        public String getSecurityIPType() {
            return this.securityIPType;
        }

        public static final class Builder {
            private String DBInstanceIPArrayAttribute; 
            private String DBInstanceIPArrayName; 
            private String securityIPList; 
            private String securityIPType; 

            /**
             * The attribute of the IP address whitelist. By default, this parameter is empty.
             * <p>
             * 
             * >  A whitelist with the hidden attribute does not appear in the console. Such IP address whitelists are used to access Alibaba Cloud services, such as Data Transmission Service (DTS).
             */
            public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
                this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
                return this;
            }

            /**
             * The name of the IP address whitelist.
             */
            public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
                this.DBInstanceIPArrayName = DBInstanceIPArrayName;
                return this;
            }

            /**
             * The IP addresses in the IP address whitelist.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * The type of the IP address.
             */
            public Builder securityIPType(String securityIPType) {
                this.securityIPType = securityIPType;
                return this;
            }

            public DBInstanceIPArray build() {
                return new DBInstanceIPArray(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("DBInstanceIPArray")
        private java.util.List < DBInstanceIPArray> DBInstanceIPArray;

        private Items(Builder builder) {
            this.DBInstanceIPArray = builder.DBInstanceIPArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIPArray
         */
        public java.util.List < DBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

        public static final class Builder {
            private java.util.List < DBInstanceIPArray> DBInstanceIPArray; 

            /**
             * DBInstanceIPArray.
             */
            public Builder DBInstanceIPArray(java.util.List < DBInstanceIPArray> DBInstanceIPArray) {
                this.DBInstanceIPArray = DBInstanceIPArray;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
