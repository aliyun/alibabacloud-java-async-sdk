// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIdsResponseBody</p>
 */
public class DescribeInstanceIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < InstanceIds> instanceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceIdsResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public java.util.List < InstanceIds> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceIds> instanceIds; 
        private String requestId; 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < InstanceIds> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceIdsResponseBody build() {
            return new DescribeInstanceIdsResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edition")
        private Integer edition;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private InstanceIds(Builder builder) {
            this.edition = builder.edition;
            this.instanceId = builder.instanceId;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public Integer getEdition() {
            return this.edition;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer edition; 
            private String instanceId; 
            private String ipMode; 
            private String ipVersion; 
            private String remark; 

            /**
             * Edition.
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IpMode.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
