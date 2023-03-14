// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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

    public static class EipInfoList extends TeaModel {
        @NameInMap("Eip")
        private String eip;

        @NameInMap("Status")
        private String status;

        private EipInfoList(Builder builder) {
            this.eip = builder.eip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInfoList create() {
            return builder().build();
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eip; 
            private String status; 

            /**
             * Eip.
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EipInfoList build() {
                return new EipInfoList(this);
            } 

        } 

    }
    public static class InstanceDetails extends TeaModel {
        @NameInMap("EipInfoList")
        private java.util.List < EipInfoList> eipInfoList;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Line")
        private String line;

        private InstanceDetails(Builder builder) {
            this.eipInfoList = builder.eipInfoList;
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
         * @return eipInfoList
         */
        public java.util.List < EipInfoList> getEipInfoList() {
            return this.eipInfoList;
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
            private java.util.List < EipInfoList> eipInfoList; 
            private String instanceId; 
            private String line; 

            /**
             * EipInfoList.
             */
            public Builder eipInfoList(java.util.List < EipInfoList> eipInfoList) {
                this.eipInfoList = eipInfoList;
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
