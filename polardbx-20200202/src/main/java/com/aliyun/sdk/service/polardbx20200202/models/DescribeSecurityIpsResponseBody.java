// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIpsResponseBody</p>
 */
public class DescribeSecurityIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSecurityIpsResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSecurityIpsResponseBody build() {
            return new DescribeSecurityIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIpsResponseBody</p>
     */
    public static class GroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        private GroupItems(Builder builder) {
            this.groupName = builder.groupName;
            this.securityIPList = builder.securityIPList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public static final class Builder {
            private String groupName; 
            private String securityIPList; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            public GroupItems build() {
                return new GroupItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityIpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIpsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("GroupItems")
        private java.util.List<GroupItems> groupItems;

        private Data(Builder builder) {
            this.DBInstanceName = builder.DBInstanceName;
            this.groupItems = builder.groupItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return groupItems
         */
        public java.util.List<GroupItems> getGroupItems() {
            return this.groupItems;
        }

        public static final class Builder {
            private String DBInstanceName; 
            private java.util.List<GroupItems> groupItems; 

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * GroupItems.
             */
            public Builder groupItems(java.util.List<GroupItems> groupItems) {
                this.groupItems = groupItems;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
