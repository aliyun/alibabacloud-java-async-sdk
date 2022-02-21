// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAccessWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAccessWhiteListResponseBody</p>
 */
public class DescribeDBClusterAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAccessWhiteListResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAccessWhiteListResponseBody create() {
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

        public DescribeDBClusterAccessWhiteListResponseBody build() {
            return new DescribeDBClusterAccessWhiteListResponseBody(this);
        } 

    } 

    public static class IPArray extends TeaModel {
        @NameInMap("DBClusterIPArrayAttribute")
        private String DBClusterIPArrayAttribute;

        @NameInMap("DBClusterIPArrayName")
        private String DBClusterIPArrayName;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        private IPArray(Builder builder) {
            this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
            this.securityIPList = builder.securityIPList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPArray create() {
            return builder().build();
        }

        /**
         * @return DBClusterIPArrayAttribute
         */
        public String getDBClusterIPArrayAttribute() {
            return this.DBClusterIPArrayAttribute;
        }

        /**
         * @return DBClusterIPArrayName
         */
        public String getDBClusterIPArrayName() {
            return this.DBClusterIPArrayName;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public static final class Builder {
            private String DBClusterIPArrayAttribute; 
            private String DBClusterIPArrayName; 
            private String securityIPList; 

            /**
             * DBClusterIPArrayAttribute.
             */
            public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
                this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
                return this;
            }

            /**
             * DBClusterIPArrayName.
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            public IPArray build() {
                return new IPArray(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("IPArray")
        private java.util.List < IPArray> IPArray;

        private Items(Builder builder) {
            this.IPArray = builder.IPArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return IPArray
         */
        public java.util.List < IPArray> getIPArray() {
            return this.IPArray;
        }

        public static final class Builder {
            private java.util.List < IPArray> IPArray; 

            /**
             * IPArray.
             */
            public Builder IPArray(java.util.List < IPArray> IPArray) {
                this.IPArray = IPArray;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
