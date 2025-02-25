// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Sample} extends {@link TeaModel}
 *
 * <p>Sample</p>
 */
public class Sample extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("SampleId")
    private String sampleId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private Sample(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.meta = builder.meta;
        this.sampleId = builder.sampleId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Sample create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return sampleId
     */
    public String getSampleId() {
        return this.sampleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private Meta meta; 
        private String sampleId; 
        private String status; 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * SampleId.
         */
        public Builder sampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Sample build() {
            return new Sample(this);
        } 

    } 

    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class FeatureConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemFeatures")
        private String itemFeatures;

        @com.aliyun.core.annotation.NameInMap("UserFeatures")
        private String userFeatures;

        private FeatureConfig(Builder builder) {
            this.itemFeatures = builder.itemFeatures;
            this.userFeatures = builder.userFeatures;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureConfig create() {
            return builder().build();
        }

        /**
         * @return itemFeatures
         */
        public String getItemFeatures() {
            return this.itemFeatures;
        }

        /**
         * @return userFeatures
         */
        public String getUserFeatures() {
            return this.userFeatures;
        }

        public static final class Builder {
            private String itemFeatures; 
            private String userFeatures; 

            /**
             * ItemFeatures.
             */
            public Builder itemFeatures(String itemFeatures) {
                this.itemFeatures = itemFeatures;
                return this;
            }

            /**
             * UserFeatures.
             */
            public Builder userFeatures(String userFeatures) {
                this.userFeatures = userFeatures;
                return this;
            }

            public FeatureConfig build() {
                return new FeatureConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class LabelLogic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BhvTimeWindow")
        private Long bhvTimeWindow;

        @com.aliyun.core.annotation.NameInMap("NegativeBhvTypes")
        private String negativeBhvTypes;

        @com.aliyun.core.annotation.NameInMap("PositiveBhvTypes")
        private String positiveBhvTypes;

        private LabelLogic(Builder builder) {
            this.bhvTimeWindow = builder.bhvTimeWindow;
            this.negativeBhvTypes = builder.negativeBhvTypes;
            this.positiveBhvTypes = builder.positiveBhvTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelLogic create() {
            return builder().build();
        }

        /**
         * @return bhvTimeWindow
         */
        public Long getBhvTimeWindow() {
            return this.bhvTimeWindow;
        }

        /**
         * @return negativeBhvTypes
         */
        public String getNegativeBhvTypes() {
            return this.negativeBhvTypes;
        }

        /**
         * @return positiveBhvTypes
         */
        public String getPositiveBhvTypes() {
            return this.positiveBhvTypes;
        }

        public static final class Builder {
            private Long bhvTimeWindow; 
            private String negativeBhvTypes; 
            private String positiveBhvTypes; 

            /**
             * BhvTimeWindow.
             */
            public Builder bhvTimeWindow(Long bhvTimeWindow) {
                this.bhvTimeWindow = bhvTimeWindow;
                return this;
            }

            /**
             * NegativeBhvTypes.
             */
            public Builder negativeBhvTypes(String negativeBhvTypes) {
                this.negativeBhvTypes = negativeBhvTypes;
                return this;
            }

            /**
             * PositiveBhvTypes.
             */
            public Builder positiveBhvTypes(String positiveBhvTypes) {
                this.positiveBhvTypes = positiveBhvTypes;
                return this;
            }

            public LabelLogic build() {
                return new LabelLogic(this);
            } 

        } 

    }
    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class WeightLogicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bhv")
        private String bhv;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private WeightLogicList(Builder builder) {
            this.bhv = builder.bhv;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeightLogicList create() {
            return builder().build();
        }

        /**
         * @return bhv
         */
        public String getBhv() {
            return this.bhv;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String bhv; 
            private String weight; 

            /**
             * Bhv.
             */
            public Builder bhv(String bhv) {
                this.bhv = bhv;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public WeightLogicList build() {
                return new WeightLogicList(this);
            } 

        } 

    }
    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BhvTableSourceIds")
        private java.util.List < String > bhvTableSourceIds;

        @com.aliyun.core.annotation.NameInMap("FeatureConfig")
        private FeatureConfig featureConfig;

        @com.aliyun.core.annotation.NameInMap("LabelLogic")
        private LabelLogic labelLogic;

        @com.aliyun.core.annotation.NameInMap("WeightLogicList")
        private java.util.List < WeightLogicList> weightLogicList;

        private Config(Builder builder) {
            this.bhvTableSourceIds = builder.bhvTableSourceIds;
            this.featureConfig = builder.featureConfig;
            this.labelLogic = builder.labelLogic;
            this.weightLogicList = builder.weightLogicList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return bhvTableSourceIds
         */
        public java.util.List < String > getBhvTableSourceIds() {
            return this.bhvTableSourceIds;
        }

        /**
         * @return featureConfig
         */
        public FeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        /**
         * @return labelLogic
         */
        public LabelLogic getLabelLogic() {
            return this.labelLogic;
        }

        /**
         * @return weightLogicList
         */
        public java.util.List < WeightLogicList> getWeightLogicList() {
            return this.weightLogicList;
        }

        public static final class Builder {
            private java.util.List < String > bhvTableSourceIds; 
            private FeatureConfig featureConfig; 
            private LabelLogic labelLogic; 
            private java.util.List < WeightLogicList> weightLogicList; 

            /**
             * BhvTableSourceIds.
             */
            public Builder bhvTableSourceIds(java.util.List < String > bhvTableSourceIds) {
                this.bhvTableSourceIds = bhvTableSourceIds;
                return this;
            }

            /**
             * FeatureConfig.
             */
            public Builder featureConfig(FeatureConfig featureConfig) {
                this.featureConfig = featureConfig;
                return this;
            }

            /**
             * LabelLogic.
             */
            public Builder labelLogic(LabelLogic labelLogic) {
                this.labelLogic = labelLogic;
                return this;
            }

            /**
             * WeightLogicList.
             */
            public Builder weightLogicList(java.util.List < WeightLogicList> weightLogicList) {
                this.weightLogicList = weightLogicList;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class ExtendParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LatestTaskStatus")
        private Long latestTaskStatus;

        @com.aliyun.core.annotation.NameInMap("SampleCount")
        private Long sampleCount;

        private ExtendParams(Builder builder) {
            this.latestTaskStatus = builder.latestTaskStatus;
            this.sampleCount = builder.sampleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendParams create() {
            return builder().build();
        }

        /**
         * @return latestTaskStatus
         */
        public Long getLatestTaskStatus() {
            return this.latestTaskStatus;
        }

        /**
         * @return sampleCount
         */
        public Long getSampleCount() {
            return this.sampleCount;
        }

        public static final class Builder {
            private Long latestTaskStatus; 
            private Long sampleCount; 

            /**
             * LatestTaskStatus.
             */
            public Builder latestTaskStatus(Long latestTaskStatus) {
                this.latestTaskStatus = latestTaskStatus;
                return this;
            }

            /**
             * SampleCount.
             */
            public Builder sampleCount(Long sampleCount) {
                this.sampleCount = sampleCount;
                return this;
            }

            public ExtendParams build() {
                return new ExtendParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link Sample} extends {@link TeaModel}
     *
     * <p>Sample</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpdate")
        private Boolean autoUpdate;

        @com.aliyun.core.annotation.NameInMap("AutoUpdateFrequency")
        private Long autoUpdateFrequency;

        @com.aliyun.core.annotation.NameInMap("ClonedId")
        private String clonedId;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("ExtendParams")
        private ExtendParams extendParams;

        @com.aliyun.core.annotation.NameInMap("MetaType")
        private String metaType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StoreConfig")
        private String storeConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Meta(Builder builder) {
            this.autoUpdate = builder.autoUpdate;
            this.autoUpdateFrequency = builder.autoUpdateFrequency;
            this.clonedId = builder.clonedId;
            this.config = builder.config;
            this.extendParams = builder.extendParams;
            this.metaType = builder.metaType;
            this.name = builder.name;
            this.storeConfig = builder.storeConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return autoUpdate
         */
        public Boolean getAutoUpdate() {
            return this.autoUpdate;
        }

        /**
         * @return autoUpdateFrequency
         */
        public Long getAutoUpdateFrequency() {
            return this.autoUpdateFrequency;
        }

        /**
         * @return clonedId
         */
        public String getClonedId() {
            return this.clonedId;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return extendParams
         */
        public ExtendParams getExtendParams() {
            return this.extendParams;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return storeConfig
         */
        public String getStoreConfig() {
            return this.storeConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoUpdate; 
            private Long autoUpdateFrequency; 
            private String clonedId; 
            private Config config; 
            private ExtendParams extendParams; 
            private String metaType; 
            private String name; 
            private String storeConfig; 
            private String type; 

            /**
             * AutoUpdate.
             */
            public Builder autoUpdate(Boolean autoUpdate) {
                this.autoUpdate = autoUpdate;
                return this;
            }

            /**
             * AutoUpdateFrequency.
             */
            public Builder autoUpdateFrequency(Long autoUpdateFrequency) {
                this.autoUpdateFrequency = autoUpdateFrequency;
                return this;
            }

            /**
             * ClonedId.
             */
            public Builder clonedId(String clonedId) {
                this.clonedId = clonedId;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * ExtendParams.
             */
            public Builder extendParams(ExtendParams extendParams) {
                this.extendParams = extendParams;
                return this;
            }

            /**
             * MetaType.
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StoreConfig.
             */
            public Builder storeConfig(String storeConfig) {
                this.storeConfig = storeConfig;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
