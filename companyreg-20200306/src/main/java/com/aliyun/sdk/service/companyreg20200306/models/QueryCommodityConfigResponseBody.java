// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommodityConfigResponseBody</p>
 */
public class QueryCommodityConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCommodityConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public QueryCommodityConfigResponseBody build() {
            return new QueryCommodityConfigResponseBody(this);
        } 

    } 

    public static class CommodityModules extends TeaModel {
        @NameInMap("LxModuleCode")
        private String lxModuleCode;

        @NameInMap("ModuleCode")
        private String moduleCode;

        @NameInMap("ModuleDescription")
        private String moduleDescription;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("ModuleTip")
        private String moduleTip;

        @NameInMap("ModuleType")
        private String moduleType;

        @NameInMap("ModuleUrl")
        private String moduleUrl;

        @NameInMap("ModuleValue")
        private String moduleValue;

        @NameInMap("SortNumber")
        private Integer sortNumber;

        private CommodityModules(Builder builder) {
            this.lxModuleCode = builder.lxModuleCode;
            this.moduleCode = builder.moduleCode;
            this.moduleDescription = builder.moduleDescription;
            this.moduleName = builder.moduleName;
            this.moduleTip = builder.moduleTip;
            this.moduleType = builder.moduleType;
            this.moduleUrl = builder.moduleUrl;
            this.moduleValue = builder.moduleValue;
            this.sortNumber = builder.sortNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityModules create() {
            return builder().build();
        }

        /**
         * @return lxModuleCode
         */
        public String getLxModuleCode() {
            return this.lxModuleCode;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return moduleDescription
         */
        public String getModuleDescription() {
            return this.moduleDescription;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleTip
         */
        public String getModuleTip() {
            return this.moduleTip;
        }

        /**
         * @return moduleType
         */
        public String getModuleType() {
            return this.moduleType;
        }

        /**
         * @return moduleUrl
         */
        public String getModuleUrl() {
            return this.moduleUrl;
        }

        /**
         * @return moduleValue
         */
        public String getModuleValue() {
            return this.moduleValue;
        }

        /**
         * @return sortNumber
         */
        public Integer getSortNumber() {
            return this.sortNumber;
        }

        public static final class Builder {
            private String lxModuleCode; 
            private String moduleCode; 
            private String moduleDescription; 
            private String moduleName; 
            private String moduleTip; 
            private String moduleType; 
            private String moduleUrl; 
            private String moduleValue; 
            private Integer sortNumber; 

            /**
             * LxModuleCode.
             */
            public Builder lxModuleCode(String lxModuleCode) {
                this.lxModuleCode = lxModuleCode;
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
             * ModuleDescription.
             */
            public Builder moduleDescription(String moduleDescription) {
                this.moduleDescription = moduleDescription;
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
             * ModuleTip.
             */
            public Builder moduleTip(String moduleTip) {
                this.moduleTip = moduleTip;
                return this;
            }

            /**
             * ModuleType.
             */
            public Builder moduleType(String moduleType) {
                this.moduleType = moduleType;
                return this;
            }

            /**
             * ModuleUrl.
             */
            public Builder moduleUrl(String moduleUrl) {
                this.moduleUrl = moduleUrl;
                return this;
            }

            /**
             * ModuleValue.
             */
            public Builder moduleValue(String moduleValue) {
                this.moduleValue = moduleValue;
                return this;
            }

            /**
             * SortNumber.
             */
            public Builder sortNumber(Integer sortNumber) {
                this.sortNumber = sortNumber;
                return this;
            }

            public CommodityModules build() {
                return new CommodityModules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityModules")
        private java.util.List < CommodityModules> commodityModules;

        @NameInMap("Description")
        private String description;

        @NameInMap("IconUrl")
        private String iconUrl;

        @NameInMap("ProductLine")
        private String productLine;

        @NameInMap("ProtocolUrl")
        private String protocolUrl;

        @NameInMap("StartingPrice")
        private String startingPrice;

        @NameInMap("Type")
        private Integer type;

        private Data(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityModules = builder.commodityModules;
            this.description = builder.description;
            this.iconUrl = builder.iconUrl;
            this.productLine = builder.productLine;
            this.protocolUrl = builder.protocolUrl;
            this.startingPrice = builder.startingPrice;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityModules
         */
        public java.util.List < CommodityModules> getCommodityModules() {
            return this.commodityModules;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return productLine
         */
        public String getProductLine() {
            return this.productLine;
        }

        /**
         * @return protocolUrl
         */
        public String getProtocolUrl() {
            return this.protocolUrl;
        }

        /**
         * @return startingPrice
         */
        public String getStartingPrice() {
            return this.startingPrice;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String commodityCode; 
            private java.util.List < CommodityModules> commodityModules; 
            private String description; 
            private String iconUrl; 
            private String productLine; 
            private String protocolUrl; 
            private String startingPrice; 
            private Integer type; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityModules.
             */
            public Builder commodityModules(java.util.List < CommodityModules> commodityModules) {
                this.commodityModules = commodityModules;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * ProductLine.
             */
            public Builder productLine(String productLine) {
                this.productLine = productLine;
                return this;
            }

            /**
             * ProtocolUrl.
             */
            public Builder protocolUrl(String protocolUrl) {
                this.protocolUrl = protocolUrl;
                return this;
            }

            /**
             * StartingPrice.
             */
            public Builder startingPrice(String startingPrice) {
                this.startingPrice = startingPrice;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
