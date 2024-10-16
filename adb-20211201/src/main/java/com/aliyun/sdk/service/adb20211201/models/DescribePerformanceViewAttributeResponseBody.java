// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the access denial.</p>
         * <blockquote>
         * <p> This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The type of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        public Builder createFromViewType(String createFromViewType) {
            this.createFromViewType = createFromViewType;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>amv-bp198m028ih55xxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
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
            this.fillOriginViewKeys = fillOriginViewKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E031AABF-BD56-5966-A063-4283EF18DB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the monitoring view.</p>
         */
        public Builder viewDetail(ViewDetail viewDetail) {
            this.viewDetail = viewDetail;
            return this;
        }

        /**
         * <p>The name of the view.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        public Builder viewName(String viewName) {
            this.viewName = viewName;
            return this;
        }

        public DescribePerformanceViewAttributeResponseBody build() {
            return new DescribePerformanceViewAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePerformanceViewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePerformanceViewAttributeResponseBody</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableAutoMc")
        private Boolean enableAutoMc;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private java.util.List < String > engine;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private java.util.List < String > groupType;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private Keys(Builder builder) {
            this.enableAutoMc = builder.enableAutoMc;
            this.engine = builder.engine;
            this.groupType = builder.groupType;
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
         * @return enableAutoMc
         */
        public Boolean getEnableAutoMc() {
            return this.enableAutoMc;
        }

        /**
         * @return engine
         */
        public java.util.List < String > getEngine() {
            return this.engine;
        }

        /**
         * @return groupType
         */
        public java.util.List < String > getGroupType() {
            return this.groupType;
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
            private Boolean enableAutoMc; 
            private java.util.List < String > engine; 
            private java.util.List < String > groupType; 
            private String keyName; 
            private Boolean selected; 

            /**
             * EnableAutoMc.
             */
            public Builder enableAutoMc(Boolean enableAutoMc) {
                this.enableAutoMc = enableAutoMc;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(java.util.List < String > engine) {
                this.engine = engine;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(java.util.List < String > groupType) {
                this.groupType = groupType;
                return this;
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
     * {@link DescribePerformanceViewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePerformanceViewAttributeResponseBody</p>
     */
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
            public Builder keys(java.util.List < Keys> keys) {
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
     * {@link DescribePerformanceViewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePerformanceViewAttributeResponseBody</p>
     */
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
             * <p>The metric category.</p>
             */
            public Builder categories(java.util.List < Categories> categories) {
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
