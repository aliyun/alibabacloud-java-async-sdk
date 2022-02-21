// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("CreateInstanceRequest")
    @Validation(required = true)
    private CreateInstanceRequestCreateInstanceRequest createInstanceRequest;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.createInstanceRequest = builder.createInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createInstanceRequest
     */
    public CreateInstanceRequestCreateInstanceRequest getCreateInstanceRequest() {
        return this.createInstanceRequest;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private CreateInstanceRequestCreateInstanceRequest createInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.createInstanceRequest = response.createInstanceRequest;
        } 

        /**
         * CreateInstanceRequest.
         */
        public Builder createInstanceRequest(CreateInstanceRequestCreateInstanceRequest createInstanceRequest) {
            this.putBodyParameter("CreateInstanceRequest", createInstanceRequest);
            this.createInstanceRequest = createInstanceRequest;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class Oss extends TeaModel {
        @NameInMap("Bucket")
        @Validation(required = true)
        private String bucket;

        private Oss(Builder builder) {
            this.bucket = builder.bucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Oss create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        public static final class Builder {
            private String bucket; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            public Oss build() {
                return new Oss(this);
            } 

        } 

    }
    public static class Storage extends TeaModel {
        @NameInMap("Oss")
        @Validation(required = true)
        private Oss oss;

        private Storage(Builder builder) {
            this.oss = builder.oss;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return oss
         */
        public Oss getOss() {
            return this.oss;
        }

        public static final class Builder {
            private Oss oss; 

            /**
             * Oss.
             */
            public Builder oss(Oss oss) {
                this.oss = oss;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    public static class CreateInstanceRequestCreateInstanceRequest extends TeaModel {
        @NameInMap("AutoRenew")
        private Boolean autoRenew;

        @NameInMap("ChargeType")
        @Validation(required = true)
        private String chargeType;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("InstanceName")
        @Validation(required = true)
        private String instanceName;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("PromotionCode")
        private String promotionCode;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @NameInMap("Storage")
        @Validation(required = true)
        private Storage storage;

        @NameInMap("UsePromotionCode")
        private Boolean usePromotionCode;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        @Validation(required = true)
        private String vpcId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        private String zoneId;

        private CreateInstanceRequestCreateInstanceRequest(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.duration = builder.duration;
            this.instanceName = builder.instanceName;
            this.pricingCycle = builder.pricingCycle;
            this.promotionCode = builder.promotionCode;
            this.region = builder.region;
            this.resourceSpec = builder.resourceSpec;
            this.storage = builder.storage;
            this.usePromotionCode = builder.usePromotionCode;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateInstanceRequestCreateInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return promotionCode
         */
        public String getPromotionCode() {
            return this.promotionCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return storage
         */
        public Storage getStorage() {
            return this.storage;
        }

        /**
         * @return usePromotionCode
         */
        public Boolean getUsePromotionCode() {
            return this.usePromotionCode;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String chargeType; 
            private Integer duration; 
            private String instanceName; 
            private String pricingCycle; 
            private String promotionCode; 
            private String region; 
            private ResourceSpec resourceSpec; 
            private Storage storage; 
            private Boolean usePromotionCode; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String zoneId; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * 优惠券code
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Storage storage) {
                this.storage = storage;
                return this;
            }

            /**
             * 是否使用优惠券
             */
            public Builder usePromotionCode(Boolean usePromotionCode) {
                this.usePromotionCode = usePromotionCode;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public CreateInstanceRequestCreateInstanceRequest build() {
                return new CreateInstanceRequestCreateInstanceRequest(this);
            } 

        } 

    }
}
