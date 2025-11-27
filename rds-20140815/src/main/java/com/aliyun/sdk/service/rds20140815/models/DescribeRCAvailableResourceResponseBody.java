// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCAvailableResourceResponseBody</p>
 */
public class DescribeRCAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCAvailableResourceResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCAvailableResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableZones
     */
    public java.util.List<AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableZones> availableZones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCAvailableResourceResponseBody model) {
            this.availableZones = model.availableZones;
            this.requestId = model.requestId;
        } 

        /**
         * AvailableZones.
         */
        public Builder availableZones(java.util.List<AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCAvailableResourceResponseBody build() {
            return new DescribeRCAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCAvailableResourceResponseBody</p>
     */
    public static class SupportedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Integer max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Integer min;

        @com.aliyun.core.annotation.NameInMap("QuotaStatus")
        private String quotaStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCategory")
        private String statusCategory;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SupportedResources(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.quotaStatus = builder.quotaStatus;
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResources create() {
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
         * @return quotaStatus
         */
        public String getQuotaStatus() {
            return this.quotaStatus;
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
            private String quotaStatus; 
            private String status; 
            private String statusCategory; 
            private String unit; 
            private String value; 

            private Builder() {
            } 

            private Builder(SupportedResources model) {
                this.max = model.max;
                this.min = model.min;
                this.quotaStatus = model.quotaStatus;
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * Max.
             */
            public Builder max(Integer max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Integer min) {
                this.min = min;
                return this;
            }

            /**
             * QuotaStatus.
             */
            public Builder quotaStatus(String quotaStatus) {
                this.quotaStatus = quotaStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusCategory.
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportedResources build() {
                return new SupportedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCAvailableResourceResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedResources")
        private java.util.List<SupportedResources> supportedResources;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AvailableResources(Builder builder) {
            this.supportedResources = builder.supportedResources;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return supportedResources
         */
        public java.util.List<SupportedResources> getSupportedResources() {
            return this.supportedResources;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<SupportedResources> supportedResources; 
            private String type; 

            private Builder() {
            } 

            private Builder(AvailableResources model) {
                this.supportedResources = model.supportedResources;
                this.type = model.type;
            } 

            /**
             * SupportedResources.
             */
            public Builder supportedResources(java.util.List<SupportedResources> supportedResources) {
                this.supportedResources = supportedResources;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCAvailableResourceResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableResources")
        private java.util.List<AvailableResources> availableResources;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCategory")
        private String statusCategory;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AvailableZones(Builder builder) {
            this.availableResources = builder.availableResources;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return availableResources
         */
        public java.util.List<AvailableResources> getAvailableResources() {
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
            private java.util.List<AvailableResources> availableResources; 
            private String regionId; 
            private String status; 
            private String statusCategory; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AvailableZones model) {
                this.availableResources = model.availableResources;
                this.regionId = model.regionId;
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.zoneId = model.zoneId;
            } 

            /**
             * AvailableResources.
             */
            public Builder availableResources(java.util.List<AvailableResources> availableResources) {
                this.availableResources = availableResources;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusCategory.
             */
            public Builder statusCategory(String statusCategory) {
                this.statusCategory = statusCategory;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
