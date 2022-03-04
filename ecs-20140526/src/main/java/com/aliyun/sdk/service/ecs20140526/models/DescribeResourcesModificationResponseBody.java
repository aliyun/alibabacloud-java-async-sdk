// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcesModificationResponseBody</p>
 */
public class DescribeResourcesModificationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("AvailableZones")
    private AvailableZones availableZones;

    private DescribeResourcesModificationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.availableZones = builder.availableZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesModificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return availableZones
     */
    public AvailableZones getAvailableZones() {
        return this.availableZones;
    }

    public static final class Builder {
        private String requestId; 
        private AvailableZones availableZones; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A collection of data center information AvailableZone.
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        public DescribeResourcesModificationResponseBody build() {
            return new DescribeResourcesModificationResponseBody(this);
        } 

    } 

    public static class SupportedResource extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("Value")
        private String value;

        @NameInMap("Max")
        private Integer max;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("StatusCategory")
        private String statusCategory;

        @NameInMap("Min")
        private Integer min;

        private SupportedResource(Builder builder) {
            this.status = builder.status;
            this.value = builder.value;
            this.max = builder.max;
            this.unit = builder.unit;
            this.statusCategory = builder.statusCategory;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResource create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return statusCategory
         */
        public String getStatusCategory() {
            return this.statusCategory;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
        }

        public static final class Builder {
            private String status; 
            private String value; 
            private Integer max; 
            private String unit; 
            private String statusCategory; 
            private Integer min; 

            /**
             * The status of the resource. Possible values:
             * <p>
             * 
             * -Available: sufficient resources
             * -SoldOut: resources are sold out
             * 
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The value of the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The maximum value of the resource type. This parameter is not returned if it is null.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * The unit of the resource type. This parameter is not returned if it is null.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Resource categories are classified by inventory. Possible values:
             * <p>
             * 
             * -WithStock: sufficient inventory
             * -ClosedWithStock: the inventory is close to the low-level line.
             * -WithoutStock: the inventory is out of stock.
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * The minimum value of the resource type. This parameter is not returned if it is null.
             */
            public Builder min(Integer min) {
                this.min = min;
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
        @NameInMap("Type")
        private String type;

        @NameInMap("SupportedResources")
        private SupportedResources supportedResources;

        private AvailableResource(Builder builder) {
            this.type = builder.type;
            this.supportedResources = builder.supportedResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResource create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return supportedResources
         */
        public SupportedResources getSupportedResources() {
            return this.supportedResources;
        }

        public static final class Builder {
            private String type; 
            private SupportedResources supportedResources; 

            /**
             * The type of the resource. Possible values:
             * <p>
             * 
             * -Zone: Zone
             * -IoOptimized:I/O optimization
             * -InstanceType: instance type
             * -SystemDisk: system disk type
             * -DataDisk: data disk type
             * -Network: Network type
             * 
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * An array of specific resources that can be created.
             */
            public Builder supportedResources(SupportedResources supportedResources) {
                this.supportedResources = supportedResources;
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
        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusCategory")
        private String statusCategory;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("AvailableResources")
        private AvailableResources availableResources;

        private AvailableZone(Builder builder) {
            this.zoneId = builder.zoneId;
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
            this.regionId = builder.regionId;
            this.availableResources = builder.availableResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZone create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCategory
         */
        public String getStatusCategory() {
            return this.statusCategory;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return availableResources
         */
        public AvailableResources getAvailableResources() {
            return this.availableResources;
        }

        public static final class Builder {
            private String zoneId; 
            private String status; 
            private String statusCategory; 
            private String regionId; 
            private AvailableResources availableResources; 

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The status of the resource. Possible values:
             * <p>
             * 
             * -Available: sufficient resources
             * -SoldOut: resources are sold out
             * 
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Resource categories are classified by inventory. Possible values:
             * <p>
             * 
             * -WithStock: sufficient inventory
             * -ClosedWithStock: the inventory is close to the low-level line.
             * -WithoutStock: the inventory is out of stock.
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * An array of specific resources that can be created.
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
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
