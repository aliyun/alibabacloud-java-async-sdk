// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableResources")
    private AvailableResources availableResources;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.availableResources = builder.availableResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableResources
     */
    public AvailableResources getAvailableResources() {
        return this.availableResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AvailableResources availableResources; 
        private String requestId; 

        /**
         * The zones and the supported resources.
         */
        public Builder availableResources(AvailableResources availableResources) {
            this.availableResources = availableResources;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class SupportResource extends TeaModel {
        @NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @NameInMap("AddressType")
        private String addressType;

        private SupportResource(Builder builder) {
            this.addressIPVersion = builder.addressIPVersion;
            this.addressType = builder.addressType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return addressIPVersion
         */
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        public static final class Builder {
            private String addressIPVersion; 
            private String addressType; 

            /**
             * The type of the IP address.
             * <p>
             * 
             * Valid values: **ipv4 and ipv6**.
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * The network type.
             * <p>
             * 
             * Valid values: **vpc, classic-internet, and classic-intranet**.
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            public SupportResource build() {
                return new SupportResource(this);
            } 

        } 

    }
    public static class SupportResources extends TeaModel {
        @NameInMap("SupportResource")
        private java.util.List < SupportResource> supportResource;

        private SupportResources(Builder builder) {
            this.supportResource = builder.supportResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResources create() {
            return builder().build();
        }

        /**
         * @return supportResource
         */
        public java.util.List < SupportResource> getSupportResource() {
            return this.supportResource;
        }

        public static final class Builder {
            private java.util.List < SupportResource> supportResource; 

            /**
             * SupportResource.
             */
            public Builder supportResource(java.util.List < SupportResource> supportResource) {
                this.supportResource = supportResource;
                return this;
            }

            public SupportResources build() {
                return new SupportResources(this);
            } 

        } 

    }
    public static class AvailableResource extends TeaModel {
        @NameInMap("MasterZoneId")
        private String masterZoneId;

        @NameInMap("SlaveZoneId")
        private String slaveZoneId;

        @NameInMap("SupportResources")
        private SupportResources supportResources;

        private AvailableResource(Builder builder) {
            this.masterZoneId = builder.masterZoneId;
            this.slaveZoneId = builder.slaveZoneId;
            this.supportResources = builder.supportResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return masterZoneId
         */
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        /**
         * @return slaveZoneId
         */
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        /**
         * @return supportResources
         */
        public SupportResources getSupportResources() {
            return this.supportResources;
        }

        public static final class Builder {
            private String masterZoneId; 
            private String slaveZoneId; 
            private SupportResources supportResources; 

            /**
             * The primary zone.
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * The secondary zone.
             */
            public Builder slaveZoneId(String slaveZoneId) {
                this.slaveZoneId = slaveZoneId;
                return this;
            }

            /**
             * The supported resources.
             */
            public Builder supportResources(SupportResources supportResources) {
                this.supportResources = supportResources;
                return this;
            }

            public AvailableResource build() {
                return new AvailableResource(this);
            } 

        } 

    }
    public static class AvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        private java.util.List < AvailableResource> availableResource;

        private AvailableResources(Builder builder) {
            this.availableResource = builder.availableResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return availableResource
         */
        public java.util.List < AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

        public static final class Builder {
            private java.util.List < AvailableResource> availableResource; 

            /**
             * AvailableResource.
             */
            public Builder availableResource(java.util.List < AvailableResource> availableResource) {
                this.availableResource = availableResource;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
}
