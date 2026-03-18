// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link QueryPriceV1Request} extends {@link RequestModel}
 *
 * <p>QueryPriceV1Request</p>
 */
public class QueryPriceV1Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentNodeGroup")
    private AgentNodeGroup agentNodeGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackendNodeGroups")
    private java.util.List<BackendNodeGroups> backendNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FrontendNodeGroups")
    private java.util.List<FrontendNodeGroups> frontendNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObserverNodeGroups")
    private java.util.List<ObserverNodeGroups> observerNodeGroups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PackageType")
    private String packageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunMode")
    private String runMode;

    private QueryPriceV1Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentNodeGroup = builder.agentNodeGroup;
        this.backendNodeGroups = builder.backendNodeGroups;
        this.duration = builder.duration;
        this.frontendNodeGroups = builder.frontendNodeGroups;
        this.observerNodeGroups = builder.observerNodeGroups;
        this.packageType = builder.packageType;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPriceV1Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentNodeGroup
     */
    public AgentNodeGroup getAgentNodeGroup() {
        return this.agentNodeGroup;
    }

    /**
     * @return backendNodeGroups
     */
    public java.util.List<BackendNodeGroups> getBackendNodeGroups() {
        return this.backendNodeGroups;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return frontendNodeGroups
     */
    public java.util.List<FrontendNodeGroups> getFrontendNodeGroups() {
        return this.frontendNodeGroups;
    }

    /**
     * @return observerNodeGroups
     */
    public java.util.List<ObserverNodeGroups> getObserverNodeGroups() {
        return this.observerNodeGroups;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    public static final class Builder extends Request.Builder<QueryPriceV1Request, Builder> {
        private String regionId; 
        private AgentNodeGroup agentNodeGroup; 
        private java.util.List<BackendNodeGroups> backendNodeGroups; 
        private Integer duration; 
        private java.util.List<FrontendNodeGroups> frontendNodeGroups; 
        private java.util.List<ObserverNodeGroups> observerNodeGroups; 
        private String packageType; 
        private String payType; 
        private String pricingCycle; 
        private String promotionOptionNo; 
        private String runMode; 

        private Builder() {
            super();
        } 

        private Builder(QueryPriceV1Request request) {
            super(request);
            this.regionId = request.regionId;
            this.agentNodeGroup = request.agentNodeGroup;
            this.backendNodeGroups = request.backendNodeGroups;
            this.duration = request.duration;
            this.frontendNodeGroups = request.frontendNodeGroups;
            this.observerNodeGroups = request.observerNodeGroups;
            this.packageType = request.packageType;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.promotionOptionNo = request.promotionOptionNo;
            this.runMode = request.runMode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentNodeGroup.
         */
        public Builder agentNodeGroup(AgentNodeGroup agentNodeGroup) {
            this.putBodyParameter("AgentNodeGroup", agentNodeGroup);
            this.agentNodeGroup = agentNodeGroup;
            return this;
        }

        /**
         * BackendNodeGroups.
         */
        public Builder backendNodeGroups(java.util.List<BackendNodeGroups> backendNodeGroups) {
            this.putBodyParameter("BackendNodeGroups", backendNodeGroups);
            this.backendNodeGroups = backendNodeGroups;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * FrontendNodeGroups.
         */
        public Builder frontendNodeGroups(java.util.List<FrontendNodeGroups> frontendNodeGroups) {
            this.putBodyParameter("FrontendNodeGroups", frontendNodeGroups);
            this.frontendNodeGroups = frontendNodeGroups;
            return this;
        }

        /**
         * ObserverNodeGroups.
         */
        public Builder observerNodeGroups(java.util.List<ObserverNodeGroups> observerNodeGroups) {
            this.putBodyParameter("ObserverNodeGroups", observerNodeGroups);
            this.observerNodeGroups = observerNodeGroups;
            return this;
        }

        /**
         * PackageType.
         */
        public Builder packageType(String packageType) {
            this.putBodyParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putBodyParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * PromotionOptionNo.
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putBodyParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.putBodyParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        @Override
        public QueryPriceV1Request build() {
            return new QueryPriceV1Request(this);
        } 

    } 

    /**
     * 
     * {@link QueryPriceV1Request} extends {@link TeaModel}
     *
     * <p>QueryPriceV1Request</p>
     */
    public static class AgentNodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        private AgentNodeGroup(Builder builder) {
            this.cu = builder.cu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentNodeGroup create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        public static final class Builder {
            private Integer cu; 

            private Builder() {
            } 

            private Builder(AgentNodeGroup model) {
                this.cu = model.cu;
            } 

            /**
             * cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            public AgentNodeGroup build() {
                return new AgentNodeGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPriceV1Request} extends {@link TeaModel}
     *
     * <p>QueryPriceV1Request</p>
     */
    public static class BackendNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        private BackendNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(BackendNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
            } 

            /**
             * cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * diskNumber.
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * localStorageInstanceType.
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * residentNodeNumber.
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * specType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * storagePerformanceLevel.
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * storageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public BackendNodeGroups build() {
                return new BackendNodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPriceV1Request} extends {@link TeaModel}
     *
     * <p>QueryPriceV1Request</p>
     */
    public static class FrontendNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        private FrontendNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrontendNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(FrontendNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
            } 

            /**
             * cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * diskNumber.
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * localStorageInstanceType.
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * residentNodeNumber.
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * specType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * storagePerformanceLevel.
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * storageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public FrontendNodeGroups build() {
                return new FrontendNodeGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPriceV1Request} extends {@link TeaModel}
     *
     * <p>QueryPriceV1Request</p>
     */
    public static class ObserverNodeGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("diskNumber")
        private Integer diskNumber;

        @com.aliyun.core.annotation.NameInMap("localStorageInstanceType")
        private String localStorageInstanceType;

        @com.aliyun.core.annotation.NameInMap("residentNodeNumber")
        private Integer residentNodeNumber;

        @com.aliyun.core.annotation.NameInMap("specType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("storagePerformanceLevel")
        private String storagePerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private Integer storageSize;

        private ObserverNodeGroups(Builder builder) {
            this.cu = builder.cu;
            this.diskNumber = builder.diskNumber;
            this.localStorageInstanceType = builder.localStorageInstanceType;
            this.residentNodeNumber = builder.residentNodeNumber;
            this.specType = builder.specType;
            this.storagePerformanceLevel = builder.storagePerformanceLevel;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObserverNodeGroups create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return diskNumber
         */
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        /**
         * @return localStorageInstanceType
         */
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        /**
         * @return residentNodeNumber
         */
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return storagePerformanceLevel
         */
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String cu; 
            private Integer diskNumber; 
            private String localStorageInstanceType; 
            private Integer residentNodeNumber; 
            private String specType; 
            private String storagePerformanceLevel; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(ObserverNodeGroups model) {
                this.cu = model.cu;
                this.diskNumber = model.diskNumber;
                this.localStorageInstanceType = model.localStorageInstanceType;
                this.residentNodeNumber = model.residentNodeNumber;
                this.specType = model.specType;
                this.storagePerformanceLevel = model.storagePerformanceLevel;
                this.storageSize = model.storageSize;
            } 

            /**
             * cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * diskNumber.
             */
            public Builder diskNumber(Integer diskNumber) {
                this.diskNumber = diskNumber;
                return this;
            }

            /**
             * localStorageInstanceType.
             */
            public Builder localStorageInstanceType(String localStorageInstanceType) {
                this.localStorageInstanceType = localStorageInstanceType;
                return this;
            }

            /**
             * residentNodeNumber.
             */
            public Builder residentNodeNumber(Integer residentNodeNumber) {
                this.residentNodeNumber = residentNodeNumber;
                return this;
            }

            /**
             * specType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * storagePerformanceLevel.
             */
            public Builder storagePerformanceLevel(String storagePerformanceLevel) {
                this.storagePerformanceLevel = storagePerformanceLevel;
                return this;
            }

            /**
             * storageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public ObserverNodeGroups build() {
                return new ObserverNodeGroups(this);
            } 

        } 

    }
}
