// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DescribeMetricMetaListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricMetaListRequest</p>
 */
public class DescribeMetricMetaListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keywords")
    private String keywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metaFormat")
    private String metaFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("metricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private DescribeMetricMetaListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aliyunLang = builder.aliyunLang;
        this.category = builder.category;
        this.keywords = builder.keywords;
        this.labels = builder.labels;
        this.metaFormat = builder.metaFormat;
        this.metricName = builder.metricName;
        this.namespace = builder.namespace;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricMetaListRequest create() {
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
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return metaFormat
     */
    public String getMetaFormat() {
        return this.metaFormat;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMetricMetaListRequest, Builder> {
        private String regionId; 
        private String aliyunLang; 
        private String category; 
        private String keywords; 
        private java.util.List<Labels> labels; 
        private String metaFormat; 
        private String metricName; 
        private String namespace; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricMetaListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aliyunLang = request.aliyunLang;
            this.category = request.category;
            this.keywords = request.keywords;
            this.labels = request.labels;
            this.metaFormat = request.metaFormat;
            this.metricName = request.metricName;
            this.namespace = request.namespace;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("aliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance theory</p>
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>Filters resources by label. The following labels are available:</p>
         * <ul>
         * <li>metricCategory: the metric category description.</li>
         * <li>alertEnable: specifies whether alerting is required.</li>
         * <li>alertUnit: the recommended alert unit.</li>
         * <li>unitFactor: the unit conversion factor.</li>
         * <li>minAlertPeriod: the minimum alert period.</li>
         * <li>productCategory: the product type category.</li>
         * </ul>
         */
        public Builder labels(java.util.List<Labels> labels) {
            String labelsShrink = shrink(labels, "labels", "json");
            this.putQueryParameter("labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The metadata source. Valid values:</p>
         * <ul>
         * <li>CMS: CloudMonitor Basic monitoring metrics.</li>
         * <li>PROM_BASIC: Prometheus CloudMonitor Basic monitoring metrics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CMS</p>
         */
        public Builder metaFormat(String metaFormat) {
            this.putQueryParameter("metaFormat", metaFormat);
            this.metaFormat = metaFormat;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("metricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The namespace, which is used to distinguish between services.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 2000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMetricMetaListRequest build() {
            return new DescribeMetricMetaListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricMetaListRequest} extends {@link TeaModel}
     *
     * <p>DescribeMetricMetaListRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Labels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>productCategory</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
