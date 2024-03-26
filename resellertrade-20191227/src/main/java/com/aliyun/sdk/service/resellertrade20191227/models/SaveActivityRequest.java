// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveActivityRequest} extends {@link RequestModel}
 *
 * <p>SaveActivityRequest</p>
 */
public class SaveActivityRequest extends Request {
    @Body
    @NameInMap("ActivityName")
    @Validation(required = true)
    private String activityName;

    @Body
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("BlackUidList")
    private java.util.List < Long > blackUidList;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Body
    @NameInMap("ExtendMap")
    private java.util.Map < String, ? > extendMap;

    @Body
    @NameInMap("FusionPromotionParamList")
    @Validation(required = true)
    private java.util.List < FusionPromotionParamList> fusionPromotionParamList;

    @Body
    @NameInMap("PublishTag")
    @Validation(required = true)
    private String publishTag;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Body
    @NameInMap("TestAccountUidList")
    private java.util.List < Long > testAccountUidList;

    @Body
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Body
    @NameInMap("WhiteUidList")
    private java.util.List < Long > whiteUidList;

    private SaveActivityRequest(Builder builder) {
        super(builder);
        this.activityName = builder.activityName;
        this.bizId = builder.bizId;
        this.blackUidList = builder.blackUidList;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.extendMap = builder.extendMap;
        this.fusionPromotionParamList = builder.fusionPromotionParamList;
        this.publishTag = builder.publishTag;
        this.startTime = builder.startTime;
        this.testAccountUidList = builder.testAccountUidList;
        this.token = builder.token;
        this.whiteUidList = builder.whiteUidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveActivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityName
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return blackUidList
     */
    public java.util.List < Long > getBlackUidList() {
        return this.blackUidList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extendMap
     */
    public java.util.Map < String, ? > getExtendMap() {
        return this.extendMap;
    }

    /**
     * @return fusionPromotionParamList
     */
    public java.util.List < FusionPromotionParamList> getFusionPromotionParamList() {
        return this.fusionPromotionParamList;
    }

    /**
     * @return publishTag
     */
    public String getPublishTag() {
        return this.publishTag;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return testAccountUidList
     */
    public java.util.List < Long > getTestAccountUidList() {
        return this.testAccountUidList;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return whiteUidList
     */
    public java.util.List < Long > getWhiteUidList() {
        return this.whiteUidList;
    }

    public static final class Builder extends Request.Builder<SaveActivityRequest, Builder> {
        private String activityName; 
        private String bizId; 
        private java.util.List < Long > blackUidList; 
        private String description; 
        private String endTime; 
        private java.util.Map < String, ? > extendMap; 
        private java.util.List < FusionPromotionParamList> fusionPromotionParamList; 
        private String publishTag; 
        private String startTime; 
        private java.util.List < Long > testAccountUidList; 
        private String token; 
        private java.util.List < Long > whiteUidList; 

        private Builder() {
            super();
        } 

        private Builder(SaveActivityRequest request) {
            super(request);
            this.activityName = request.activityName;
            this.bizId = request.bizId;
            this.blackUidList = request.blackUidList;
            this.description = request.description;
            this.endTime = request.endTime;
            this.extendMap = request.extendMap;
            this.fusionPromotionParamList = request.fusionPromotionParamList;
            this.publishTag = request.publishTag;
            this.startTime = request.startTime;
            this.testAccountUidList = request.testAccountUidList;
            this.token = request.token;
            this.whiteUidList = request.whiteUidList;
        } 

        /**
         * ActivityName.
         */
        public Builder activityName(String activityName) {
            this.putBodyParameter("ActivityName", activityName);
            this.activityName = activityName;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BlackUidList.
         */
        public Builder blackUidList(java.util.List < Long > blackUidList) {
            this.putBodyParameter("BlackUidList", blackUidList);
            this.blackUidList = blackUidList;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExtendMap.
         */
        public Builder extendMap(java.util.Map < String, ? > extendMap) {
            String extendMapShrink = shrink(extendMap, "ExtendMap", "json");
            this.putBodyParameter("ExtendMap", extendMapShrink);
            this.extendMap = extendMap;
            return this;
        }

        /**
         * FusionPromotionParamList.
         */
        public Builder fusionPromotionParamList(java.util.List < FusionPromotionParamList> fusionPromotionParamList) {
            this.putBodyParameter("FusionPromotionParamList", fusionPromotionParamList);
            this.fusionPromotionParamList = fusionPromotionParamList;
            return this;
        }

        /**
         * PublishTag.
         */
        public Builder publishTag(String publishTag) {
            this.putBodyParameter("PublishTag", publishTag);
            this.publishTag = publishTag;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TestAccountUidList.
         */
        public Builder testAccountUidList(java.util.List < Long > testAccountUidList) {
            this.putBodyParameter("TestAccountUidList", testAccountUidList);
            this.testAccountUidList = testAccountUidList;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * WhiteUidList.
         */
        public Builder whiteUidList(java.util.List < Long > whiteUidList) {
            this.putBodyParameter("WhiteUidList", whiteUidList);
            this.whiteUidList = whiteUidList;
            return this;
        }

        @Override
        public SaveActivityRequest build() {
            return new SaveActivityRequest(this);
        } 

    } 

    public static class ModuleInfoParamList extends TeaModel {
        @NameInMap("componentCode")
        @Validation(required = true)
        private String componentCode;

        @NameInMap("itemCode")
        @Validation(required = true)
        private String itemCode;

        @NameInMap("moduleId")
        private Long moduleId;

        @NameInMap("moduleKey")
        @Validation(required = true)
        private String moduleKey;

        @NameInMap("moduleName")
        @Validation(required = true)
        private String moduleName;

        @NameInMap("moduleValueList")
        @Validation(required = true)
        private java.util.List < String > moduleValueList;

        @NameInMap("pricePlanId")
        private Long pricePlanId;

        private ModuleInfoParamList(Builder builder) {
            this.componentCode = builder.componentCode;
            this.itemCode = builder.itemCode;
            this.moduleId = builder.moduleId;
            this.moduleKey = builder.moduleKey;
            this.moduleName = builder.moduleName;
            this.moduleValueList = builder.moduleValueList;
            this.pricePlanId = builder.pricePlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleInfoParamList create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleKey
         */
        public String getModuleKey() {
            return this.moduleKey;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleValueList
         */
        public java.util.List < String > getModuleValueList() {
            return this.moduleValueList;
        }

        /**
         * @return pricePlanId
         */
        public Long getPricePlanId() {
            return this.pricePlanId;
        }

        public static final class Builder {
            private String componentCode; 
            private String itemCode; 
            private Long moduleId; 
            private String moduleKey; 
            private String moduleName; 
            private java.util.List < String > moduleValueList; 
            private Long pricePlanId; 

            /**
             * componentCode.
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * itemCode.
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleKey.
             */
            public Builder moduleKey(String moduleKey) {
                this.moduleKey = moduleKey;
                return this;
            }

            /**
             * moduleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * moduleValueList.
             */
            public Builder moduleValueList(java.util.List < String > moduleValueList) {
                this.moduleValueList = moduleValueList;
                return this;
            }

            /**
             * pricePlanId.
             */
            public Builder pricePlanId(Long pricePlanId) {
                this.pricePlanId = pricePlanId;
                return this;
            }

            public ModuleInfoParamList build() {
                return new ModuleInfoParamList(this);
            } 

        } 

    }
    public static class FusionPromotionParamList extends TeaModel {
        @NameInMap("CommodityCodeList")
        @Validation(required = true)
        private java.util.List < String > commodityCodeList;

        @NameInMap("PromotionValue")
        @Validation(required = true)
        private Double promotionValue;

        @NameInMap("RestrictedRegionList")
        @Validation(required = true)
        private java.util.List < String > restrictedRegionList;

        @NameInMap("moduleInfoParamList")
        private java.util.List < ModuleInfoParamList> moduleInfoParamList;

        private FusionPromotionParamList(Builder builder) {
            this.commodityCodeList = builder.commodityCodeList;
            this.promotionValue = builder.promotionValue;
            this.restrictedRegionList = builder.restrictedRegionList;
            this.moduleInfoParamList = builder.moduleInfoParamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FusionPromotionParamList create() {
            return builder().build();
        }

        /**
         * @return commodityCodeList
         */
        public java.util.List < String > getCommodityCodeList() {
            return this.commodityCodeList;
        }

        /**
         * @return promotionValue
         */
        public Double getPromotionValue() {
            return this.promotionValue;
        }

        /**
         * @return restrictedRegionList
         */
        public java.util.List < String > getRestrictedRegionList() {
            return this.restrictedRegionList;
        }

        /**
         * @return moduleInfoParamList
         */
        public java.util.List < ModuleInfoParamList> getModuleInfoParamList() {
            return this.moduleInfoParamList;
        }

        public static final class Builder {
            private java.util.List < String > commodityCodeList; 
            private Double promotionValue; 
            private java.util.List < String > restrictedRegionList; 
            private java.util.List < ModuleInfoParamList> moduleInfoParamList; 

            /**
             * CommodityCodeList.
             */
            public Builder commodityCodeList(java.util.List < String > commodityCodeList) {
                this.commodityCodeList = commodityCodeList;
                return this;
            }

            /**
             * PromotionValue.
             */
            public Builder promotionValue(Double promotionValue) {
                this.promotionValue = promotionValue;
                return this;
            }

            /**
             * RestrictedRegionList.
             */
            public Builder restrictedRegionList(java.util.List < String > restrictedRegionList) {
                this.restrictedRegionList = restrictedRegionList;
                return this;
            }

            /**
             * moduleInfoParamList.
             */
            public Builder moduleInfoParamList(java.util.List < ModuleInfoParamList> moduleInfoParamList) {
                this.moduleInfoParamList = moduleInfoParamList;
                return this;
            }

            public FusionPromotionParamList build() {
                return new FusionPromotionParamList(this);
            } 

        } 

    }
}
