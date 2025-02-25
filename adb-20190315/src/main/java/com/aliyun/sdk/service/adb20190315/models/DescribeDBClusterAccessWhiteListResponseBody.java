// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterAccessWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAccessWhiteListResponseBody</p>
 */
public class DescribeDBClusterAccessWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterAccessWhiteListResponseBody build() {
            return new DescribeDBClusterAccessWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAccessWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhiteListResponseBody</p>
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
             * <p>The attribute of the IP address whitelist. By default, this parameter is empty.</p>
             * <blockquote>
             * <p> The IP address whitelists that have the <strong>hidden</strong> attribute are not displayed in the console. These IP address whitelists are used to access services such as Data Transmission Service (DTS) and PolarDB-X.</p>
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
             * <ul>
             * <li>The name of an IP address whitelist must be 2 to 32 characters in length. The name can contain lowercase letters, digits, and underscores (_). The name must start with a lowercase letter and end with a lowercase letter or digit.</li>
             * <li>Each cluster supports up to 50 IP address whitelists.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * <p>The IP addresses in the IP address whitelist. Up to 1,000 IP addresses can be returned. Multiple IP addresses are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
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
     * {@link DescribeDBClusterAccessWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAccessWhiteListResponseBody</p>
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
