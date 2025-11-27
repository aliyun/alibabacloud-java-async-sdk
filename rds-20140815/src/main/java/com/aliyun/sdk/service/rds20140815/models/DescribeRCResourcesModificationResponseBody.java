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
 * {@link DescribeRCResourcesModificationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCResourcesModificationResponseBody</p>
 */
public class DescribeRCResourcesModificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCResourcesModificationResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCResourcesModificationResponseBody create() {
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

        private Builder(DescribeRCResourcesModificationResponseBody model) {
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

        public DescribeRCResourcesModificationResponseBody build() {
            return new DescribeRCResourcesModificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCResourcesModificationResponseBody</p>
     */
    public static class SupportedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCategory")
        private String statusCategory;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SupportedResources(Builder builder) {
            this.status = builder.status;
            this.statusCategory = builder.statusCategory;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResources create() {
            return builder().build();
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String status; 
            private String statusCategory; 
            private String value; 

            private Builder() {
            } 

            private Builder(SupportedResources model) {
                this.status = model.status;
                this.statusCategory = model.statusCategory;
                this.value = model.value;
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
     * {@link DescribeRCResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCResourcesModificationResponseBody</p>
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
     * {@link DescribeRCResourcesModificationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCResourcesModificationResponseBody</p>
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
