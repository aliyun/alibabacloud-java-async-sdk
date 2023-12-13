// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
    @NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableZones
     */
    public AvailableZones getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AvailableZones availableZones; 
        private String requestId; 

        /**
         * The zones in which the specified resources are available.
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
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

    public static class SupportedResource extends TeaModel {
        @NameInMap("StatusCategory")
        private String statusCategory;

        @NameInMap("Value")
        private String value;

        private SupportedResource(Builder builder) {
            this.statusCategory = builder.statusCategory;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResource create() {
            return builder().build();
        }

        /**
         * @return statusCategory
         */
        public String getStatusCategory() {
            return this.statusCategory;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String statusCategory; 
            private String value; 

            /**
             * The category of resources based on stock status. Valid values:
             * <p>
             * 
             * *   WithStock: Resources are in sufficient stock.
             * *   ClosedWithStock: Resources are insufficient. We recommend that you use instance types that are in sufficient stock.
             * *   WithoutStock: Resources are sold out and will be replenished. We recommend that you use instance types that are in sufficient stock.
             * *   ClosedWithoutStock: Resources are sold out and will not be replenished. We recommend that you use instance types that are in sufficient stock.
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * The ECS instance types or instance families that are available in the zones.
             * <p>
             * 
             * *   If the return value of the Type parameter is InstanceTypeFamily, this parameter indicates instance families that are returned.
             * *   If the return value of the Type parameter is InstanceType, this parameter indicates instance types that are returned.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportedResource build() {
                return new SupportedResource(this);
            } 

        } 

    }
    public static class SupportedResources extends TeaModel {
        @NameInMap("SupportedResource")
        private java.util.List < SupportedResource> supportedResource;

        private SupportedResources(Builder builder) {
            this.supportedResource = builder.supportedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResources create() {
            return builder().build();
        }

        /**
         * @return supportedResource
         */
        public java.util.List < SupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

        public static final class Builder {
            private java.util.List < SupportedResource> supportedResource; 

            /**
             * SupportedResource.
             */
            public Builder supportedResource(java.util.List < SupportedResource> supportedResource) {
                this.supportedResource = supportedResource;
                return this;
            }

            public SupportedResources build() {
                return new SupportedResources(this);
            } 

        } 

    }
    public static class AvailableResource extends TeaModel {
        @NameInMap("SupportedResources")
        private SupportedResources supportedResources;

        @NameInMap("Type")
        private String type;

        private AvailableResource(Builder builder) {
            this.supportedResources = builder.supportedResources;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return supportedResources
         */
        public SupportedResources getSupportedResources() {
            return this.supportedResources;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private SupportedResources supportedResources; 
            private String type; 

            /**
             * The information about the resources that are available in the zones.
             */
            public Builder supportedResources(SupportedResources supportedResources) {
                this.supportedResources = supportedResources;
                return this;
            }

            /**
             * The type of the resource. Valid values:
             * <p>
             * 
             * *   InstanceTypeFamily: instance families.
             * *   InstanceType: instance types.
             */
            public Builder type(String type) {
                this.type = type;
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
    public static class AvailableZone extends TeaModel {
        @NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableZone(Builder builder) {
            this.availableResources = builder.availableResources;
            this.regionId = builder.regionId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private AvailableResources availableResources; 
            private String regionId; 
            private String zoneId; 

            /**
             * The resources that are available in the specified zone.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * The region ID of the resources.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The zone ID of the resources.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZone build() {
                return new AvailableZone(this);
            } 

        } 

    }
    public static class AvailableZones extends TeaModel {
        @NameInMap("AvailableZone")
        private java.util.List < AvailableZone> availableZone;

        private AvailableZones(Builder builder) {
            this.availableZone = builder.availableZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return availableZone
         */
        public java.util.List < AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List < AvailableZone> availableZone; 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List < AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
