// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceAccessWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceAccessWhiteListResponseBody</p>
 */
public class DescribeDBInstanceAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceAccessWhiteListResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceAccessWhiteListResponseBody create() {
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

        public DescribeDBInstanceAccessWhiteListResponseBody build() {
            return new DescribeDBInstanceAccessWhiteListResponseBody(this);
        } 

    } 

    public static class DBInstanceIPArray extends TeaModel {
        @NameInMap("DBInstanceIPArrayAttribute")
        private String DBInstanceIPArrayAttribute;

        @NameInMap("DBInstanceIPArrayName")
        private String DBInstanceIPArrayName;

        @NameInMap("SecurityIps")
        private String securityIps;

        private DBInstanceIPArray(Builder builder) {
            this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
            this.securityIps = builder.securityIps;
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
         * @return securityIps
         */
        public String getSecurityIps() {
            return this.securityIps;
        }

        public static final class Builder {
            private String DBInstanceIPArrayAttribute; 
            private String DBInstanceIPArrayName; 
            private String securityIps; 

            /**
             * DBInstanceIPArrayAttribute.
             */
            public Builder DBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
                this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
                return this;
            }

            /**
             * DBInstanceIPArrayName.
             */
            public Builder DBInstanceIPArrayName(String DBInstanceIPArrayName) {
                this.DBInstanceIPArrayName = DBInstanceIPArrayName;
                return this;
            }

            /**
             * SecurityIps.
             */
            public Builder securityIps(String securityIps) {
                this.securityIps = securityIps;
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
