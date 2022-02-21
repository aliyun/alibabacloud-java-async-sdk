// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetControlRulesResponseBody</p>
 */
public class GetControlRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Pager")
    private Pager pager;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SettingList")
    private SettingList settingList;

    private GetControlRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.pager = builder.pager;
        this.requestId = builder.requestId;
        this.settingList = builder.settingList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return pager
     */
    public Pager getPager() {
        return this.pager;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return settingList
     */
    public SettingList getSettingList() {
        return this.settingList;
    }

    public static final class Builder {
        private Integer code; 
        private Pager pager; 
        private String requestId; 
        private SettingList settingList; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Pager.
         */
        public Builder pager(Pager pager) {
            this.pager = pager;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SettingList.
         */
        public Builder settingList(SettingList settingList) {
            this.settingList = settingList;
            return this;
        }

        public GetControlRulesResponseBody build() {
            return new GetControlRulesResponseBody(this);
        } 

    } 

    public static class Pager extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Pager(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pager create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Pager build() {
                return new Pager(this);
            } 

        } 

    }
    public static class Setting extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("IspName")
        private String ispName;

        @NameInMap("MarketType")
        private String marketType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Onoff")
        private Boolean onoff;

        @NameInMap("PlatformType")
        private String platformType;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("UpdatedAt")
        private String updatedAt;

        @NameInMap("Usable")
        private Boolean usable;

        private Setting(Builder builder) {
            this.appVersion = builder.appVersion;
            this.businessType = builder.businessType;
            this.clientId = builder.clientId;
            this.createdAt = builder.createdAt;
            this.ispName = builder.ispName;
            this.marketType = builder.marketType;
            this.name = builder.name;
            this.onoff = builder.onoff;
            this.platformType = builder.platformType;
            this.region = builder.region;
            this.resourceId = builder.resourceId;
            this.updatedAt = builder.updatedAt;
            this.usable = builder.usable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Setting create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return marketType
         */
        public String getMarketType() {
            return this.marketType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onoff
         */
        public Boolean getOnoff() {
            return this.onoff;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return usable
         */
        public Boolean getUsable() {
            return this.usable;
        }

        public static final class Builder {
            private String appVersion; 
            private String businessType; 
            private String clientId; 
            private String createdAt; 
            private String ispName; 
            private String marketType; 
            private String name; 
            private Boolean onoff; 
            private String platformType; 
            private String region; 
            private String resourceId; 
            private String updatedAt; 
            private Boolean usable; 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * MarketType.
             */
            public Builder marketType(String marketType) {
                this.marketType = marketType;
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
             * Onoff.
             */
            public Builder onoff(Boolean onoff) {
                this.onoff = onoff;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * Usable.
             */
            public Builder usable(Boolean usable) {
                this.usable = usable;
                return this;
            }

            public Setting build() {
                return new Setting(this);
            } 

        } 

    }
    public static class SettingList extends TeaModel {
        @NameInMap("Setting")
        private java.util.List < Setting> setting;

        private SettingList(Builder builder) {
            this.setting = builder.setting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SettingList create() {
            return builder().build();
        }

        /**
         * @return setting
         */
        public java.util.List < Setting> getSetting() {
            return this.setting;
        }

        public static final class Builder {
            private java.util.List < Setting> setting; 

            /**
             * Setting.
             */
            public Builder setting(java.util.List < Setting> setting) {
                this.setting = setting;
                return this;
            }

            public SettingList build() {
                return new SettingList(this);
            } 

        } 

    }
}
