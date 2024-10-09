// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about the zones in which resources are available.</p>
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0041D94C-FB92-4C49-B115-259DA1C*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCategory")
        private String statusCategory;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SupportedResource(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResource create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Integer getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Integer getMin() {
            return this.min;
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer max; 
            private Integer min; 
            private String status; 
            private String statusCategory; 
            private String unit; 
            private String value; 

            /**
             * <p>The maximum disk capacity.</p>
             * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum disk capacity.</p>
             * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The status of the resource. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>SoldOut</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The resource category based on the stock level. Valid values:</p>
             * <ul>
             * <li>WithStock: Resources are in sufficient stock.</li>
             * <li>ClosedWithStock: Resources are in insufficient stock. We recommend that you use other resources that are in sufficient stock.</li>
             * <li>WithoutStock: Resources are out of stock and will be replenished. We recommend that you use other resources that are in sufficient stock.</li>
             * <li>ClosedWithoutStock: Resources are out of stock and will not be replenished. We recommend that you use other resources that are in sufficient stock.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WithStock</p>
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * <p>The unit of the disk capacity.</p>
             * <p>This parameter takes effect only if DestinationResource is set to SystemDisk or DataDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.d1ne.xlarge</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResource")
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResources")
        private SupportedResources supportedResources;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The information about the resources.</p>
             */
            public Builder supportedResources(SupportedResources supportedResources) {
                this.supportedResources = supportedResources;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li>Zone: zone</li>
             * <li>IoOptimized: I/O optimized resource</li>
             * <li>InstanceType: instance type</li>
             * <li>SystemDisk: system disk</li>
             * <li>DataDisk: data disk</li>
             * <li>Network: network type</li>
             * <li>ddh: dedicated host</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InstanceType</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResource")
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private AvailableResources availableResources;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCategory")
        private String statusCategory;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AvailableZone(Builder builder) {
            this.availableResources = builder.availableResources;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private AvailableResources availableResources; 
            private String regionId; 
            private String status; 
            private String statusCategory; 
            private String zoneId; 

            /**
             * <p>The resources that are available in the zone.</p>
             */
            public Builder availableResources(AvailableResources availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of resources in the zone. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>SoldOut</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The resource category based on the stock level in the zone. Valid values:</p>
             * <ul>
             * <li>WithStock: Resources are in sufficient stock.</li>
             * <li>ClosedWithStock: Resources are in insufficient stock. We recommend that you use other resources that are in sufficient stock.</li>
             * <li>WithoutStock: Resources are out of stock and will be replenished. We recommend that you use other resources that are in sufficient stock.</li>
             * <li>ClosedWithoutStock: Resources are out of stock and will not be replenished. We recommend that you use other resources that are in sufficient stock.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WithStock</p>
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZone")
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
