// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeConnectionCountRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConnectionCountRecordsResponseBody</p>
 */
public class DescribeConnectionCountRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessIpRecords")
    private java.util.List < AccessIpRecords> accessIpRecords;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserRecords")
    private java.util.List < UserRecords> userRecords;

    private DescribeConnectionCountRecordsResponseBody(Builder builder) {
        this.accessIpRecords = builder.accessIpRecords;
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.userRecords = builder.userRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionCountRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessIpRecords
     */
    public java.util.List < AccessIpRecords> getAccessIpRecords() {
        return this.accessIpRecords;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userRecords
     */
    public java.util.List < UserRecords> getUserRecords() {
        return this.userRecords;
    }

    public static final class Builder {
        private java.util.List < AccessIpRecords> accessIpRecords; 
        private String DBClusterId; 
        private String requestId; 
        private java.util.List < UserRecords> userRecords; 

        /**
         * <p>The queried client IP addresses.</p>
         */
        public Builder accessIpRecords(java.util.List < AccessIpRecords> accessIpRecords) {
            this.accessIpRecords = accessIpRecords;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1jj9xqft1po****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>562C7F89-FBE6-4A04-AAAA-7EBC25******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried database accounts.</p>
         */
        public Builder userRecords(java.util.List < UserRecords> userRecords) {
            this.userRecords = userRecords;
            return this;
        }

        public DescribeConnectionCountRecordsResponseBody build() {
            return new DescribeConnectionCountRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConnectionCountRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConnectionCountRecordsResponseBody</p>
     */
    public static class AccessIpRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessIp")
        private String accessIp;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private AccessIpRecords(Builder builder) {
            this.accessIp = builder.accessIp;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessIpRecords create() {
            return builder().build();
        }

        /**
         * @return accessIp
         */
        public String getAccessIp() {
            return this.accessIp;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String accessIp; 
            private Long count; 

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>42.120.XX.XX</p>
             */
            public Builder accessIp(String accessIp) {
                this.accessIp = accessIp;
                return this;
            }

            /**
             * <p>The number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public AccessIpRecords build() {
                return new AccessIpRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConnectionCountRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConnectionCountRecordsResponseBody</p>
     */
    public static class UserRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private UserRecords(Builder builder) {
            this.count = builder.count;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserRecords create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long count; 
            private String user; 

            /**
             * <p>The number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The username of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public UserRecords build() {
                return new UserRecords(this);
            } 

        } 

    }
}
