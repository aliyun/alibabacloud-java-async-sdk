// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPerformanceViewRequest} extends {@link RequestModel}
 *
 * <p>ModifyPerformanceViewRequest</p>
 */
public class ModifyPerformanceViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private ViewDetail viewDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String viewName;

    private ModifyPerformanceViewRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.viewDetail = builder.viewDetail;
        this.viewName = builder.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPerformanceViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return viewDetail
     */
    public ViewDetail getViewDetail() {
        return this.viewDetail;
    }

    /**
     * @return viewName
     */
    public String getViewName() {
        return this.viewName;
    }

    public static final class Builder extends Request.Builder<ModifyPerformanceViewRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private ViewDetail viewDetail; 
        private String viewName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPerformanceViewRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.viewDetail = request.viewDetail;
            this.viewName = request.viewName;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ViewDetail.
         */
        public Builder viewDetail(ViewDetail viewDetail) {
            String viewDetailShrink = shrink(viewDetail, "ViewDetail", "json");
            this.putQueryParameter("ViewDetail", viewDetailShrink);
            this.viewDetail = viewDetail;
            return this;
        }

        /**
         * ViewName.
         */
        public Builder viewName(String viewName) {
            this.putQueryParameter("ViewName", viewName);
            this.viewName = viewName;
            return this;
        }

        @Override
        public ModifyPerformanceViewRequest build() {
            return new ModifyPerformanceViewRequest(this);
        } 

    } 

    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Keys(Builder builder) {
            this.keyName = builder.keyName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String keyName; 
            private Boolean selected; 

            /**
             * KeyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List < Keys> keys;

        private Categories(Builder builder) {
            this.category = builder.category;
            this.keys = builder.keys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return keys
         */
        public java.util.List < Keys> getKeys() {
            return this.keys;
        }

        public static final class Builder {
            private String category; 
            private java.util.List < Keys> keys; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Keys.
             */
            public Builder keys(java.util.List < Keys> keys) {
                this.keys = keys;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    public static class ViewDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < Categories> categories;

        @com.aliyun.core.annotation.NameInMap("ChartLinked")
        private Boolean chartLinked;

        @com.aliyun.core.annotation.NameInMap("ChartsPerLine")
        private Integer chartsPerLine;

        private ViewDetail(Builder builder) {
            this.categories = builder.categories;
            this.chartLinked = builder.chartLinked;
            this.chartsPerLine = builder.chartsPerLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewDetail create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < Categories> getCategories() {
            return this.categories;
        }

        /**
         * @return chartLinked
         */
        public Boolean getChartLinked() {
            return this.chartLinked;
        }

        /**
         * @return chartsPerLine
         */
        public Integer getChartsPerLine() {
            return this.chartsPerLine;
        }

        public static final class Builder {
            private java.util.List < Categories> categories; 
            private Boolean chartLinked; 
            private Integer chartsPerLine; 

            /**
             * Categories.
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * ChartLinked.
             */
            public Builder chartLinked(Boolean chartLinked) {
                this.chartLinked = chartLinked;
                return this;
            }

            /**
             * ChartsPerLine.
             */
            public Builder chartsPerLine(Integer chartsPerLine) {
                this.chartsPerLine = chartsPerLine;
                return this;
            }

            public ViewDetail build() {
                return new ViewDetail(this);
            } 

        } 

    }
}
