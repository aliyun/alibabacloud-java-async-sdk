// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
 *
 * <p>GetSavingPlanDeductableCommodityResponseBody</p>
 */
public class GetSavingPlanDeductableCommodityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSavingPlanDeductableCommodityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavingPlanDeductableCommodityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSavingPlanDeductableCommodityResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSavingPlanDeductableCommodityResponseBody build() {
            return new GetSavingPlanDeductableCommodityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class CycleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CycleList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(CycleList model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CycleList build() {
                return new CycleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class FilterModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private FilterModules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterModules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(FilterModules model) {
                this.moduleCode = model.moduleCode;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public FilterModules build() {
                return new FilterModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class ModuleMapListFilterModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private ModuleMapListFilterModules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleMapListFilterModules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(ModuleMapListFilterModules model) {
                this.moduleCode = model.moduleCode;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public ModuleMapListFilterModules build() {
                return new ModuleMapListFilterModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class ShowModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private ShowModules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShowModules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(ShowModules model) {
                this.moduleCode = model.moduleCode;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public ShowModules build() {
                return new ShowModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class SpnTypeNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SpnTypeNameList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpnTypeNameList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(SpnTypeNameList model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SpnTypeNameList build() {
                return new SpnTypeNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class ModuleMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterModules")
        private java.util.List<ModuleMapListFilterModules> filterModules;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ShowModules")
        private java.util.List<ShowModules> showModules;

        @com.aliyun.core.annotation.NameInMap("SpnTypeList")
        private java.util.List<String> spnTypeList;

        @com.aliyun.core.annotation.NameInMap("SpnTypeMapList")
        private java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> spnTypeMapList;

        @com.aliyun.core.annotation.NameInMap("SpnTypeNameList")
        private java.util.List<SpnTypeNameList> spnTypeNameList;

        private ModuleMapList(Builder builder) {
            this.filterModules = builder.filterModules;
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.showModules = builder.showModules;
            this.spnTypeList = builder.spnTypeList;
            this.spnTypeMapList = builder.spnTypeMapList;
            this.spnTypeNameList = builder.spnTypeNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleMapList create() {
            return builder().build();
        }

        /**
         * @return filterModules
         */
        public java.util.List<ModuleMapListFilterModules> getFilterModules() {
            return this.filterModules;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return showModules
         */
        public java.util.List<ShowModules> getShowModules() {
            return this.showModules;
        }

        /**
         * @return spnTypeList
         */
        public java.util.List<String> getSpnTypeList() {
            return this.spnTypeList;
        }

        /**
         * @return spnTypeMapList
         */
        public java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> getSpnTypeMapList() {
            return this.spnTypeMapList;
        }

        /**
         * @return spnTypeNameList
         */
        public java.util.List<SpnTypeNameList> getSpnTypeNameList() {
            return this.spnTypeNameList;
        }

        public static final class Builder {
            private java.util.List<ModuleMapListFilterModules> filterModules; 
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 
            private java.util.List<ShowModules> showModules; 
            private java.util.List<String> spnTypeList; 
            private java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> spnTypeMapList; 
            private java.util.List<SpnTypeNameList> spnTypeNameList; 

            private Builder() {
            } 

            private Builder(ModuleMapList model) {
                this.filterModules = model.filterModules;
                this.moduleCode = model.moduleCode;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
                this.showModules = model.showModules;
                this.spnTypeList = model.spnTypeList;
                this.spnTypeMapList = model.spnTypeMapList;
                this.spnTypeNameList = model.spnTypeNameList;
            } 

            /**
             * FilterModules.
             */
            public Builder filterModules(java.util.List<ModuleMapListFilterModules> filterModules) {
                this.filterModules = filterModules;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * ShowModules.
             */
            public Builder showModules(java.util.List<ShowModules> showModules) {
                this.showModules = showModules;
                return this;
            }

            /**
             * SpnTypeList.
             */
            public Builder spnTypeList(java.util.List<String> spnTypeList) {
                this.spnTypeList = spnTypeList;
                return this;
            }

            /**
             * SpnTypeMapList.
             */
            public Builder spnTypeMapList(java.util.List<java.util.Map<String, DataModuleMapListSpnTypeMapListValue>> spnTypeMapList) {
                this.spnTypeMapList = spnTypeMapList;
                return this;
            }

            /**
             * SpnTypeNameList.
             */
            public Builder spnTypeNameList(java.util.List<SpnTypeNameList> spnTypeNameList) {
                this.spnTypeNameList = spnTypeNameList;
                return this;
            }

            public ModuleMapList build() {
                return new ModuleMapList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class PayModeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PayModeList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayModeList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            private Builder() {
            } 

            private Builder(PayModeList model) {
                this.code = model.code;
                this.name = model.name;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PayModeList build() {
                return new PayModeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class PricingModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("ModuleId")
        private Long moduleId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private PricingModules(Builder builder) {
            this.moduleCode = builder.moduleCode;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PricingModules create() {
            return builder().build();
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleId
         */
        public Long getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String moduleCode; 
            private Long moduleId; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(PricingModules model) {
                this.moduleCode = model.moduleCode;
                this.moduleId = model.moduleId;
                this.moduleName = model.moduleName;
            } 

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(Long moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public PricingModules build() {
                return new PricingModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSavingPlanDeductableCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>GetSavingPlanDeductableCommodityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private Long activityId;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityId")
        private Long commodityId;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CycleList")
        private java.util.List<CycleList> cycleList;

        @com.aliyun.core.annotation.NameInMap("FilterModules")
        private java.util.List<FilterModules> filterModules;

        @com.aliyun.core.annotation.NameInMap("ItemCode")
        private String itemCode;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ModuleMapList")
        private java.util.List<ModuleMapList> moduleMapList;

        @com.aliyun.core.annotation.NameInMap("PayModeList")
        private java.util.List<PayModeList> payModeList;

        @com.aliyun.core.annotation.NameInMap("PricingModules")
        private java.util.List<PricingModules> pricingModules;

        @com.aliyun.core.annotation.NameInMap("SpnCommodityCode")
        private String spnCommodityCode;

        @com.aliyun.core.annotation.NameInMap("SpnCommodityName")
        private String spnCommodityName;

        @com.aliyun.core.annotation.NameInMap("SpnDiscountConfigType")
        private String spnDiscountConfigType;

        @com.aliyun.core.annotation.NameInMap("StepPriceMap")
        private java.util.Map<String, java.util.List<DataStepPriceMapValue>> stepPriceMap;

        private Data(Builder builder) {
            this.activityId = builder.activityId;
            this.commodityCode = builder.commodityCode;
            this.commodityId = builder.commodityId;
            this.commodityName = builder.commodityName;
            this.cycleList = builder.cycleList;
            this.filterModules = builder.filterModules;
            this.itemCode = builder.itemCode;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.moduleMapList = builder.moduleMapList;
            this.payModeList = builder.payModeList;
            this.pricingModules = builder.pricingModules;
            this.spnCommodityCode = builder.spnCommodityCode;
            this.spnCommodityName = builder.spnCommodityName;
            this.spnDiscountConfigType = builder.spnDiscountConfigType;
            this.stepPriceMap = builder.stepPriceMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public Long getActivityId() {
            return this.activityId;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityId
         */
        public Long getCommodityId() {
            return this.commodityId;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return cycleList
         */
        public java.util.List<CycleList> getCycleList() {
            return this.cycleList;
        }

        /**
         * @return filterModules
         */
        public java.util.List<FilterModules> getFilterModules() {
            return this.filterModules;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return moduleMapList
         */
        public java.util.List<ModuleMapList> getModuleMapList() {
            return this.moduleMapList;
        }

        /**
         * @return payModeList
         */
        public java.util.List<PayModeList> getPayModeList() {
            return this.payModeList;
        }

        /**
         * @return pricingModules
         */
        public java.util.List<PricingModules> getPricingModules() {
            return this.pricingModules;
        }

        /**
         * @return spnCommodityCode
         */
        public String getSpnCommodityCode() {
            return this.spnCommodityCode;
        }

        /**
         * @return spnCommodityName
         */
        public String getSpnCommodityName() {
            return this.spnCommodityName;
        }

        /**
         * @return spnDiscountConfigType
         */
        public String getSpnDiscountConfigType() {
            return this.spnDiscountConfigType;
        }

        /**
         * @return stepPriceMap
         */
        public java.util.Map<String, java.util.List<DataStepPriceMapValue>> getStepPriceMap() {
            return this.stepPriceMap;
        }

        public static final class Builder {
            private Long activityId; 
            private String commodityCode; 
            private Long commodityId; 
            private String commodityName; 
            private java.util.List<CycleList> cycleList; 
            private java.util.List<FilterModules> filterModules; 
            private String itemCode; 
            private Long itemId; 
            private String itemName; 
            private java.util.List<ModuleMapList> moduleMapList; 
            private java.util.List<PayModeList> payModeList; 
            private java.util.List<PricingModules> pricingModules; 
            private String spnCommodityCode; 
            private String spnCommodityName; 
            private String spnDiscountConfigType; 
            private java.util.Map<String, java.util.List<DataStepPriceMapValue>> stepPriceMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activityId = model.activityId;
                this.commodityCode = model.commodityCode;
                this.commodityId = model.commodityId;
                this.commodityName = model.commodityName;
                this.cycleList = model.cycleList;
                this.filterModules = model.filterModules;
                this.itemCode = model.itemCode;
                this.itemId = model.itemId;
                this.itemName = model.itemName;
                this.moduleMapList = model.moduleMapList;
                this.payModeList = model.payModeList;
                this.pricingModules = model.pricingModules;
                this.spnCommodityCode = model.spnCommodityCode;
                this.spnCommodityName = model.spnCommodityName;
                this.spnDiscountConfigType = model.spnDiscountConfigType;
                this.stepPriceMap = model.stepPriceMap;
            } 

            /**
             * ActivityId.
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityId.
             */
            public Builder commodityId(Long commodityId) {
                this.commodityId = commodityId;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * CycleList.
             */
            public Builder cycleList(java.util.List<CycleList> cycleList) {
                this.cycleList = cycleList;
                return this;
            }

            /**
             * FilterModules.
             */
            public Builder filterModules(java.util.List<FilterModules> filterModules) {
                this.filterModules = filterModules;
                return this;
            }

            /**
             * ItemCode.
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ModuleMapList.
             */
            public Builder moduleMapList(java.util.List<ModuleMapList> moduleMapList) {
                this.moduleMapList = moduleMapList;
                return this;
            }

            /**
             * PayModeList.
             */
            public Builder payModeList(java.util.List<PayModeList> payModeList) {
                this.payModeList = payModeList;
                return this;
            }

            /**
             * PricingModules.
             */
            public Builder pricingModules(java.util.List<PricingModules> pricingModules) {
                this.pricingModules = pricingModules;
                return this;
            }

            /**
             * SpnCommodityCode.
             */
            public Builder spnCommodityCode(String spnCommodityCode) {
                this.spnCommodityCode = spnCommodityCode;
                return this;
            }

            /**
             * SpnCommodityName.
             */
            public Builder spnCommodityName(String spnCommodityName) {
                this.spnCommodityName = spnCommodityName;
                return this;
            }

            /**
             * SpnDiscountConfigType.
             */
            public Builder spnDiscountConfigType(String spnDiscountConfigType) {
                this.spnDiscountConfigType = spnDiscountConfigType;
                return this;
            }

            /**
             * StepPriceMap.
             */
            public Builder stepPriceMap(java.util.Map<String, java.util.List<DataStepPriceMapValue>> stepPriceMap) {
                this.stepPriceMap = stepPriceMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
