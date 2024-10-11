// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterAccessWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAccessWhiteListResponseBody</p>
 */
public class DescribeClusterAccessWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterAccessWhiteListResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAccessWhiteListResponseBody create() {
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
         * <p>The queried IP address whitelists.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>370D09FD-442A-5225-AAD3-7362CAE39177</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterAccessWhiteListResponseBody build() {
            return new DescribeClusterAccessWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterAccessWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterAccessWhiteListResponseBody</p>
     */
    public static class IPArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayAttribute")
        private String DBClusterIPArrayAttribute;

        @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayName")
        private String DBClusterIPArrayName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
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
             * <p>The attribute of the whitelist.</p>
             * <blockquote>
             * <p>Whitelists with the <strong>hidden</strong> attribute are not displayed in the console. Those whitelists are used to access Data Transmission Service (DTS) and PolarDB.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hidden</p>
             */
            public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
                this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
                return this;
            }

            /**
             * <p>The name of the IP address whitelist.</p>
             * <p>Each cluster supports up to 50 IP address whitelists.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * <p>The IP addresses in the IP address whitelist. Up to 500 IP addresses can be returned. Multiple IP addresses are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.xx.xx</p>
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
    /**
     * 
     * {@link DescribeClusterAccessWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterAccessWhiteListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPArray")
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
