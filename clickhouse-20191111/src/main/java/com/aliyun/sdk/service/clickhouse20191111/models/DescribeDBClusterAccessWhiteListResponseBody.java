// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
    @com.aliyun.core.annotation.NameInMap("DBClusterAccessWhiteList")
    private DBClusterAccessWhiteList DBClusterAccessWhiteList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterAccessWhiteListResponseBody(Builder builder) {
        this.DBClusterAccessWhiteList = builder.DBClusterAccessWhiteList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterAccessWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterAccessWhiteList
     */
    public DBClusterAccessWhiteList getDBClusterAccessWhiteList() {
        return this.DBClusterAccessWhiteList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBClusterAccessWhiteList DBClusterAccessWhiteList; 
        private String requestId; 

        /**
         * <p>The details about the IP address whitelist.</p>
         */
        public Builder DBClusterAccessWhiteList(DBClusterAccessWhiteList DBClusterAccessWhiteList) {
            this.DBClusterAccessWhiteList = DBClusterAccessWhiteList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>905F13A4-5097-4897-A84D-527EC75FFF4F</p>
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
             * <p>The attribute of the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
                this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
                return this;
            }

            /**
             * <p>The name of the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
                this.DBClusterIPArrayName = DBClusterIPArrayName;
                return this;
            }

            /**
             * <p>The IP addresses in the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.xx.xx,192.168.xx.xx</p>
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
    public static class DBClusterAccessWhiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPArray")
        private java.util.List < IPArray> IPArray;

        private DBClusterAccessWhiteList(Builder builder) {
            this.IPArray = builder.IPArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusterAccessWhiteList create() {
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

            public DBClusterAccessWhiteList build() {
                return new DBClusterAccessWhiteList(this);
            } 

        } 

    }
}
