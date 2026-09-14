// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDBInstanceIPArrayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIPArrayListResponseBody</p>
 */
public class DescribeDBInstanceIPArrayListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(DescribeDBInstanceIPArrayListResponseBody model) {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB7AA0BF-BE41-480E-A3DC-C97BF85A391B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceIPArrayListResponseBody build() {
            return new DescribeDBInstanceIPArrayListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceIPArrayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceIPArrayListResponseBody</p>
     */
    public static class DBInstanceIPArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIPArrayAttribute")
        private String DBInstanceIPArrayAttribute;

        @com.aliyun.core.annotation.NameInMap("DBInstanceIPArrayName")
        private String DBInstanceIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        private DBInstanceIPArray(Builder builder) {
            this.DBInstanceIPArrayAttribute = builder.DBInstanceIPArrayAttribute;
            this.DBInstanceIPArrayName = builder.DBInstanceIPArrayName;
            this.securityIPList = builder.securityIPList;
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

        public static final class Builder {
            private String DBInstanceIPArrayAttribute; 
            private String DBInstanceIPArrayName; 
            private String securityIPList; 

            private Builder() {
            } 

            private Builder(DBInstanceIPArray model) {
                this.DBInstanceIPArrayAttribute = model.DBInstanceIPArrayAttribute;
                this.DBInstanceIPArrayName = model.DBInstanceIPArrayName;
                this.securityIPList = model.securityIPList;
            } 

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
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            public DBInstanceIPArray build() {
                return new DBInstanceIPArray(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceIPArrayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceIPArrayListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIPArray")
        private java.util.List<DBInstanceIPArray> DBInstanceIPArray;

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
        public java.util.List<DBInstanceIPArray> getDBInstanceIPArray() {
            return this.DBInstanceIPArray;
        }

        public static final class Builder {
            private java.util.List<DBInstanceIPArray> DBInstanceIPArray; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstanceIPArray = model.DBInstanceIPArray;
            } 

            /**
             * DBInstanceIPArray.
             */
            public Builder DBInstanceIPArray(java.util.List<DBInstanceIPArray> DBInstanceIPArray) {
                this.DBInstanceIPArray = DBInstanceIPArray;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
