// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDetailsResponseBody</p>
 */
public class DescribeInstanceDetailsResponseBody extends TeaModel {
    @NameInMap("InstanceDetails")
    private java.util.List < InstanceDetails> instanceDetails;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceDetailsResponseBody(Builder builder) {
        this.instanceDetails = builder.instanceDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceDetails
     */
    public java.util.List < InstanceDetails> getInstanceDetails() {
        return this.instanceDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceDetails> instanceDetails; 
        private String requestId; 

        /**
         * InstanceDetails.
         */
        public Builder instanceDetails(java.util.List < InstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceDetailsResponseBody build() {
            return new DescribeInstanceDetailsResponseBody(this);
        } 

    } 

    public static class EipInfos extends TeaModel {
        @NameInMap("Eip")
        private String eip;

        @NameInMap("IpMode")
        private String ipMode;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("Status")
        private String status;

        private EipInfos(Builder builder) {
            this.eip = builder.eip;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfos create() {
            return builder().build();
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eip; 
            private String ipMode; 
            private String ipVersion; 
            private String status; 

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EipInfos build() {
                return new EipInfos(this);
            } 

        } 

    }
    public static class InstanceDetails extends TeaModel {
        @NameInMap("EipInfos")
        private java.util.List < EipInfos> eipInfos;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Line")
        private String line;

        private InstanceDetails(Builder builder) {
            this.eipInfos = builder.eipInfos;
            this.instanceId = builder.instanceId;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetails create() {
            return builder().build();
        }

        /**
         * @return eipInfos
         */
        public java.util.List < EipInfos> getEipInfos() {
            return this.eipInfos;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        public static final class Builder {
            private java.util.List < EipInfos> eipInfos; 
            private String instanceId; 
            private String line; 

            /**
             * EipInfos.
             */
            public Builder eipInfos(java.util.List < EipInfos> eipInfos) {
                this.eipInfos = eipInfos;
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
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
}
