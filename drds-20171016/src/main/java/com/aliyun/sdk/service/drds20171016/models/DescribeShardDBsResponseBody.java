// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardDBsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardDBsResponseBody</p>
 */
public class DescribeShardDBsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeShardDBsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardDBsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

        public DescribeShardDBsResponseBody build() {
            return new DescribeShardDBsResponseBody(this);
        } 

    } 

    public static class DbIntancePair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("SubDbName")
        private String subDbName;

        private DbIntancePair(Builder builder) {
            this.groupName = builder.groupName;
            this.instanceName = builder.instanceName;
            this.subDbName = builder.subDbName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbIntancePair create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return subDbName
         */
        public String getSubDbName() {
            return this.subDbName;
        }

        public static final class Builder {
            private String groupName; 
            private String instanceName; 
            private String subDbName; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * SubDbName.
             */
            public Builder subDbName(String subDbName) {
                this.subDbName = subDbName;
                return this;
            }

            public DbIntancePair build() {
                return new DbIntancePair(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbIntancePair")
        private java.util.List < DbIntancePair> dbIntancePair;

        private Data(Builder builder) {
            this.dbIntancePair = builder.dbIntancePair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbIntancePair
         */
        public java.util.List < DbIntancePair> getDbIntancePair() {
            return this.dbIntancePair;
        }

        public static final class Builder {
            private java.util.List < DbIntancePair> dbIntancePair; 

            /**
             * DbIntancePair.
             */
            public Builder dbIntancePair(java.util.List < DbIntancePair> dbIntancePair) {
                this.dbIntancePair = dbIntancePair;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
