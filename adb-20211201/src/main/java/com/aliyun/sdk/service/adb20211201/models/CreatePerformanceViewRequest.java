// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CreatePerformanceViewRequest} extends {@link RequestModel}
 *
 * <p>CreatePerformanceViewRequest</p>
 */
public class CreatePerformanceViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateFromViewType")
    private String createFromViewType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FillOriginViewKeys")
    private Boolean fillOriginViewKeys;

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

    private CreatePerformanceViewRequest(Builder builder) {
        super(builder);
        this.createFromViewType = builder.createFromViewType;
        this.DBClusterId = builder.DBClusterId;
        this.fillOriginViewKeys = builder.fillOriginViewKeys;
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

    public static CreatePerformanceViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createFromViewType
     */
    public String getCreateFromViewType() {
        return this.createFromViewType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return fillOriginViewKeys
     */
    public Boolean getFillOriginViewKeys() {
        return this.fillOriginViewKeys;
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

    public static final class Builder extends Request.Builder<CreatePerformanceViewRequest, Builder> {
        private String createFromViewType; 
        private String DBClusterId; 
        private Boolean fillOriginViewKeys; 
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

        private Builder(CreatePerformanceViewRequest request) {
            super(request);
            this.createFromViewType = request.createFromViewType;
            this.DBClusterId = request.DBClusterId;
            this.fillOriginViewKeys = request.fillOriginViewKeys;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.viewDetail = request.viewDetail;
            this.viewName = request.viewName;
        } 

        /**
         * <p>The type of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        public Builder createFromViewType(String createFromViewType) {
            this.putQueryParameter("CreateFromViewType", createFromViewType);
            this.createFromViewType = createFromViewType;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to populate the names of the metrics in the original monitoring view when you view the monitoring view. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fillOriginViewKeys(Boolean fillOriginViewKeys) {
            this.putQueryParameter("FillOriginViewKeys", fillOriginViewKeys);
            this.fillOriginViewKeys = fillOriginViewKeys;
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
         * <p>The region ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
         * <p>The information about the monitoring view.</p>
         * <p>This parameter is required.</p>
         */
        public Builder viewDetail(ViewDetail viewDetail) {
            String viewDetailShrink = shrink(viewDetail, "ViewDetail", "json");
            this.putQueryParameter("ViewDetail", viewDetailShrink);
            this.viewDetail = viewDetail;
            return this;
        }

        /**
         * <p>The name of the view.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>viewname</p>
         */
        public Builder viewName(String viewName) {
            this.putQueryParameter("ViewName", viewName);
            this.viewName = viewName;
            return this;
        }

        @Override
        public CreatePerformanceViewRequest build() {
            return new CreatePerformanceViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePerformanceViewRequest} extends {@link TeaModel}
     *
     * <p>CreatePerformanceViewRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Keys model) {
                this.keyName = model.keyName;
                this.selected = model.selected;
            } 

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_CPU</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>Specifies whether to select the metric. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreatePerformanceViewRequest} extends {@link TeaModel}
     *
     * <p>CreatePerformanceViewRequest</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List<Keys> keys;

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
        public java.util.List<Keys> getKeys() {
            return this.keys;
        }

        public static final class Builder {
            private String category; 
            private java.util.List<Keys> keys; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.category = model.category;
                this.keys = model.keys;
            } 

            /**
             * <p>The name of the metric category. Valid values:</p>
             * <ul>
             * <li><strong>Node</strong></li>
             * <li><strong>DiskData</strong></li>
             * <li><strong>WorkLoad</strong></li>
             * <li><strong>ResourceGroup</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The metrics.</p>
             */
            public Builder keys(java.util.List<Keys> keys) {
                this.keys = keys;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePerformanceViewRequest} extends {@link TeaModel}
     *
     * <p>CreatePerformanceViewRequest</p>
     */
    public static class ViewDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<Categories> categories;

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
        public java.util.List<Categories> getCategories() {
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
            private java.util.List<Categories> categories; 
            private Boolean chartLinked; 
            private Integer chartsPerLine; 

            private Builder() {
            } 

            private Builder(ViewDetail model) {
                this.categories = model.categories;
                this.chartLinked = model.chartLinked;
                this.chartsPerLine = model.chartsPerLine;
            } 

            /**
             * <p>The metric categories.</p>
             */
            public Builder categories(java.util.List<Categories> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>Specifies whether to enable the filter interaction feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder chartLinked(Boolean chartLinked) {
                this.chartLinked = chartLinked;
                return this;
            }

            /**
             * <p>The number of charts to display in each row.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
