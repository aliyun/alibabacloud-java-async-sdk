// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckCountStatisticResponseBody</p>
 */
public class GetCheckCountStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckCountStatisticDTO")
    private CheckCountStatisticDTO checkCountStatisticDTO;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCheckCountStatisticResponseBody(Builder builder) {
        this.checkCountStatisticDTO = builder.checkCountStatisticDTO;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckCountStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkCountStatisticDTO
     */
    public CheckCountStatisticDTO getCheckCountStatisticDTO() {
        return this.checkCountStatisticDTO;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckCountStatisticDTO checkCountStatisticDTO; 
        private String requestId; 

        /**
         * CheckCountStatisticDTO.
         */
        public Builder checkCountStatisticDTO(CheckCountStatisticDTO checkCountStatisticDTO) {
            this.checkCountStatisticDTO = checkCountStatisticDTO;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckCountStatisticResponseBody build() {
            return new GetCheckCountStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckCountStatisticResponseBody</p>
     */
    public static class CheckCountStatisticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private Integer instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceSubTypeName")
        private String instanceSubTypeName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private Integer instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeName")
        private String instanceTypeName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private CheckCountStatisticItems(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceSubType = builder.instanceSubType;
            this.instanceSubTypeName = builder.instanceSubTypeName;
            this.instanceType = builder.instanceType;
            this.instanceTypeName = builder.instanceTypeName;
            this.regionId = builder.regionId;
            this.riskCount = builder.riskCount;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCountStatisticItems create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceSubType
         */
        public Integer getInstanceSubType() {
            return this.instanceSubType;
        }

        /**
         * @return instanceSubTypeName
         */
        public String getInstanceSubTypeName() {
            return this.instanceSubTypeName;
        }

        /**
         * @return instanceType
         */
        public Integer getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeName
         */
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private Integer instanceSubType; 
            private String instanceSubTypeName; 
            private Integer instanceType; 
            private String instanceTypeName; 
            private String regionId; 
            private Integer riskCount; 
            private Integer vendor; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceSubType.
             */
            public Builder instanceSubType(Integer instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * InstanceSubTypeName.
             */
            public Builder instanceSubTypeName(String instanceSubTypeName) {
                this.instanceSubTypeName = instanceSubTypeName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeName.
             */
            public Builder instanceTypeName(String instanceTypeName) {
                this.instanceTypeName = instanceTypeName;
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
             * RiskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public CheckCountStatisticItems build() {
                return new CheckCountStatisticItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCheckCountStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckCountStatisticResponseBody</p>
     */
    public static class CheckCountStatisticDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckCountStatisticItems")
        private java.util.List<CheckCountStatisticItems> checkCountStatisticItems;

        @com.aliyun.core.annotation.NameInMap("StatisticType")
        private String statisticType;

        private CheckCountStatisticDTO(Builder builder) {
            this.checkCountStatisticItems = builder.checkCountStatisticItems;
            this.statisticType = builder.statisticType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckCountStatisticDTO create() {
            return builder().build();
        }

        /**
         * @return checkCountStatisticItems
         */
        public java.util.List<CheckCountStatisticItems> getCheckCountStatisticItems() {
            return this.checkCountStatisticItems;
        }

        /**
         * @return statisticType
         */
        public String getStatisticType() {
            return this.statisticType;
        }

        public static final class Builder {
            private java.util.List<CheckCountStatisticItems> checkCountStatisticItems; 
            private String statisticType; 

            /**
             * CheckCountStatisticItems.
             */
            public Builder checkCountStatisticItems(java.util.List<CheckCountStatisticItems> checkCountStatisticItems) {
                this.checkCountStatisticItems = checkCountStatisticItems;
                return this;
            }

            /**
             * StatisticType.
             */
            public Builder statisticType(String statisticType) {
                this.statisticType = statisticType;
                return this;
            }

            public CheckCountStatisticDTO build() {
                return new CheckCountStatisticDTO(this);
            } 

        } 

    }
}
