// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePerformanceViewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePerformanceViewAttributeResponseBody</p>
 */
public class DescribePerformanceViewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("CreateFromViewType")
    private String createFromViewType;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("FillOriginViewKeys")
    private Boolean fillOriginViewKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ViewDetail")
    private ViewDetail viewDetail;

    @com.aliyun.core.annotation.NameInMap("ViewName")
    private String viewName;

    private DescribePerformanceViewAttributeResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.createFromViewType = builder.createFromViewType;
        this.DBClusterId = builder.DBClusterId;
        this.fillOriginViewKeys = builder.fillOriginViewKeys;
        this.requestId = builder.requestId;
        this.viewDetail = builder.viewDetail;
        this.viewName = builder.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePerformanceViewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String createFromViewType; 
        private String DBClusterId; 
        private Boolean fillOriginViewKeys; 
        private String requestId; 
        private ViewDetail viewDetail; 
        private String viewName; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * CreateFromViewType.
         */
        public Builder createFromViewType(String createFromViewType) {
            this.createFromViewType = createFromViewType;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * FillOriginViewKeys.
         */
        public Builder fillOriginViewKeys(Boolean fillOriginViewKeys) {
            this.fillOriginViewKeys = fillOriginViewKeys;
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
         * ViewDetail.
         */
        public Builder viewDetail(ViewDetail viewDetail) {
            this.viewDetail = viewDetail;
            return this;
        }

        /**
         * ViewName.
         */
        public Builder viewName(String viewName) {
            this.viewName = viewName;
            return this;
        }

        public DescribePerformanceViewAttributeResponseBody build() {
            return new DescribePerformanceViewAttributeResponseBody(this);
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
