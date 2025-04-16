// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcesModificationResponseBody</p>
 */
public class DescribeResourcesModificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private AvailableZones availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeResourcesModificationResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesModificationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeResourcesModificationResponseBody model) {
            this.availableZones = model.availableZones;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the queried zones.</p>
         */
        public Builder availableZones(AvailableZones availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourcesModificationResponseBody build() {
            return new DescribeResourcesModificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Condition(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            private Builder() {
            } 

            private Builder(Condition model) {
                this.key = model.key;
            } 

            /**
             * <p>The condition name. Valid value:</p>
             * <p>DiskCategory, which indicates a disk category change.</p>
             * 
             * <strong>example:</strong>
             * <p>DiskCategory</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private java.util.List<Condition> condition;

        private Conditions(Builder builder) {
            this.condition = builder.condition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public java.util.List<Condition> getCondition() {
            return this.condition;
        }

        public static final class Builder {
            private java.util.List<Condition> condition; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.condition = model.condition;
            } 

            /**
             * Condition.
             */
            public Builder condition(java.util.List<Condition> condition) {
                this.condition = condition;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class ConditionSupportedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private Conditions conditions;

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

        private ConditionSupportedResource(Builder builder) {
            this.conditions = builder.conditions;
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

        public static ConditionSupportedResource create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public Conditions getConditions() {
            return this.conditions;
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
            private Conditions conditions; 
            private Integer max; 
            private Integer min; 
            private String status; 
            private String statusCategory; 
            private String unit; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConditionSupportedResource model) {
                this.conditions = model.conditions;
                this.max = model.max;
                this.min = model.min;
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The conditions.</p>
             */
            public Builder conditions(Conditions conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The maximum disk capacity.</p>
             * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
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
             * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The stock state of the resource. Valid values:</p>
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
             * <p>The category of the resource based on stock status. Valid values:</p>
             * <ul>
             * <li>WithStock: resources that are in sufficient stock</li>
             * <li>ClosedWithStock: resources that are in insufficient stock</li>
             * <li>WithoutStock: resources that are out of stock</li>
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
             * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConditionSupportedResource build() {
                return new ConditionSupportedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class ConditionSupportedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionSupportedResource")
        private java.util.List<ConditionSupportedResource> conditionSupportedResource;

        private ConditionSupportedResources(Builder builder) {
            this.conditionSupportedResource = builder.conditionSupportedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionSupportedResources create() {
            return builder().build();
        }

        /**
         * @return conditionSupportedResource
         */
        public java.util.List<ConditionSupportedResource> getConditionSupportedResource() {
            return this.conditionSupportedResource;
        }

        public static final class Builder {
            private java.util.List<ConditionSupportedResource> conditionSupportedResource; 

            private Builder() {
            } 

            private Builder(ConditionSupportedResources model) {
                this.conditionSupportedResource = model.conditionSupportedResource;
            } 

            /**
             * ConditionSupportedResource.
             */
            public Builder conditionSupportedResource(java.util.List<ConditionSupportedResource> conditionSupportedResource) {
                this.conditionSupportedResource = conditionSupportedResource;
                return this;
            }

            public ConditionSupportedResources build() {
                return new ConditionSupportedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SupportedResource model) {
                this.max = model.max;
                this.min = model.min;
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The maximum disk capacity.</p>
             * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
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
             * <p>This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * <p>The state of the resource. Valid values:</p>
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
             * <p>The category of the resource based on stock status. Valid values:</p>
             * <ul>
             * <li>WithStock: resources that are in sufficient stock</li>
             * <li>ClosedWithStock: resources that are in insufficient stock</li>
             * <li>WithoutStock: resources that are out of stock</li>
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
             * <p>The unit of the disk capacity. This parameter takes effect only when the DestinationResource request parameter is set to SystemDisk.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
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
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class SupportedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResource")
        private java.util.List<SupportedResource> supportedResource;

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
        public java.util.List<SupportedResource> getSupportedResource() {
            return this.supportedResource;
        }

        public static final class Builder {
            private java.util.List<SupportedResource> supportedResource; 

            private Builder() {
            } 

            private Builder(SupportedResources model) {
                this.supportedResource = model.supportedResource;
            } 

            /**
             * SupportedResource.
             */
            public Builder supportedResource(java.util.List<SupportedResource> supportedResource) {
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
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class AvailableResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionSupportedResources")
        private ConditionSupportedResources conditionSupportedResources;

        @com.aliyun.core.annotation.NameInMap("SupportedResources")
        private SupportedResources supportedResources;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AvailableResource(Builder builder) {
            this.conditionSupportedResources = builder.conditionSupportedResources;
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
         * @return conditionSupportedResources
         */
        public ConditionSupportedResources getConditionSupportedResources() {
            return this.conditionSupportedResources;
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
            private ConditionSupportedResources conditionSupportedResources; 
            private SupportedResources supportedResources; 
            private String type; 

            private Builder() {
            } 

            private Builder(AvailableResource model) {
                this.conditionSupportedResources = model.conditionSupportedResources;
                this.supportedResources = model.supportedResources;
                this.type = model.type;
            } 

            /**
             * <p>The resource types that resources can be changed to after the resources meet specified conditions. If the conditions are met, you can change the current resource to a resource in the list.</p>
             */
            public Builder conditionSupportedResources(ConditionSupportedResources conditionSupportedResources) {
                this.conditionSupportedResources = conditionSupportedResources;
                return this;
            }

            /**
             * <p>The information about the supported resources.</p>
             */
            public Builder supportedResources(SupportedResources supportedResources) {
                this.supportedResources = supportedResources;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li>InstanceType</li>
             * <li>SystemDisk</li>
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
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResource")
        private java.util.List<AvailableResource> availableResource;

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
        public java.util.List<AvailableResource> getAvailableResource() {
            return this.availableResource;
        }

        public static final class Builder {
            private java.util.List<AvailableResource> availableResource; 

            private Builder() {
            } 

            private Builder(AvailableResources model) {
                this.availableResource = model.availableResource;
            } 

            /**
             * AvailableResource.
             */
            public Builder availableResource(java.util.List<AvailableResource> availableResource) {
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
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AvailableZone model) {
                this.availableResources = model.availableResources;
                this.regionId = model.regionId;
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.zoneId = model.zoneId;
            } 

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
             * <p>The state of the resource. Valid values:</p>
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
             * <p>The category of the resource based on stock status. Valid values:</p>
             * <ul>
             * <li>WithStock: resources that are in sufficient stock</li>
             * <li>ClosedWithStock: resources that are in insufficient stock</li>
             * <li>WithoutStock: resources that are out of stock</li>
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
     * {@link DescribeResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcesModificationResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableZone")
        private java.util.List<AvailableZone> availableZone;

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
        public java.util.List<AvailableZone> getAvailableZone() {
            return this.availableZone;
        }

        public static final class Builder {
            private java.util.List<AvailableZone> availableZone; 

            private Builder() {
            } 

            private Builder(AvailableZones model) {
                this.availableZone = model.availableZone;
            } 

            /**
             * AvailableZone.
             */
            public Builder availableZone(java.util.List<AvailableZone> availableZone) {
                this.availableZone = availableZone;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
