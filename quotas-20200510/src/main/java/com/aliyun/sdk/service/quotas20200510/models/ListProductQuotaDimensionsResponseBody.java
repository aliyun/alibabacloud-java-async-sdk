// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListProductQuotaDimensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductQuotaDimensionsResponseBody</p>
 */
public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaDimensions")
    private java.util.List<QuotaDimensions> quotaDimensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProductQuotaDimensionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaDimensions = builder.quotaDimensions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductQuotaDimensionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotaDimensions
     */
    public java.util.List<QuotaDimensions> getQuotaDimensions() {
        return this.quotaDimensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QuotaDimensions> quotaDimensions; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProductQuotaDimensionsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaDimensions = model.quotaDimensions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that indicates the position of the returned data. If this parameter is not returned, it indicates that all data has been queried.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The quota dimensions.</p>
         */
        public Builder quotaDimensions(java.util.List<QuotaDimensions> quotaDimensions) {
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductQuotaDimensionsResponseBody build() {
            return new ListProductQuotaDimensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductQuotaDimensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductQuotaDimensionsResponseBody</p>
     */
    public static class DependentDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DependentDimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependentDimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(DependentDimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension on which the target quota dimension depends.</p>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the quota dimension on which the target quota dimension depends.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DependentDimensions build() {
                return new DependentDimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductQuotaDimensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductQuotaDimensionsResponseBody</p>
     */
    public static class DimensionValueDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependentDimensions")
        private java.util.List<DependentDimensions> dependentDimensions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DimensionValueDetail(Builder builder) {
            this.dependentDimensions = builder.dependentDimensions;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionValueDetail create() {
            return builder().build();
        }

        /**
         * @return dependentDimensions
         */
        public java.util.List<DependentDimensions> getDependentDimensions() {
            return this.dependentDimensions;
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
            private java.util.List<DependentDimensions> dependentDimensions; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(DimensionValueDetail model) {
                this.dependentDimensions = model.dependentDimensions;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The quota dimensions on which the target quota dimension depends.</p>
             */
            public Builder dependentDimensions(java.util.List<DependentDimensions> dependentDimensions) {
                this.dependentDimensions = dependentDimensions;
                return this;
            }

            /**
             * <p>The name of the quota dimension value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DimensionValueDetail build() {
                return new DimensionValueDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductQuotaDimensionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductQuotaDimensionsResponseBody</p>
     */
    public static class QuotaDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependentDimensions")
        private java.util.List<String> dependentDimensions;

        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValueDetail")
        private java.util.List<DimensionValueDetail> dimensionValueDetail;

        @com.aliyun.core.annotation.NameInMap("DimensionValues")
        private java.util.List<String> dimensionValues;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Requisite")
        private Boolean requisite;

        private QuotaDimensions(Builder builder) {
            this.dependentDimensions = builder.dependentDimensions;
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValueDetail = builder.dimensionValueDetail;
            this.dimensionValues = builder.dimensionValues;
            this.name = builder.name;
            this.requisite = builder.requisite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaDimensions create() {
            return builder().build();
        }

        /**
         * @return dependentDimensions
         */
        public java.util.List<String> getDependentDimensions() {
            return this.dependentDimensions;
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValueDetail
         */
        public java.util.List<DimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
        }

        /**
         * @return dimensionValues
         */
        public java.util.List<String> getDimensionValues() {
            return this.dimensionValues;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requisite
         */
        public Boolean getRequisite() {
            return this.requisite;
        }

        public static final class Builder {
            private java.util.List<String> dependentDimensions; 
            private String dimensionKey; 
            private java.util.List<DimensionValueDetail> dimensionValueDetail; 
            private java.util.List<String> dimensionValues; 
            private String name; 
            private Boolean requisite; 

            private Builder() {
            } 

            private Builder(QuotaDimensions model) {
                this.dependentDimensions = model.dependentDimensions;
                this.dimensionKey = model.dimensionKey;
                this.dimensionValueDetail = model.dimensionValueDetail;
                this.dimensionValues = model.dimensionValues;
                this.name = model.name;
                this.requisite = model.requisite;
            } 

            /**
             * <p>The quota dimensions on which the target quota dimension depends.</p>
             */
            public Builder dependentDimensions(java.util.List<String> dependentDimensions) {
                this.dependentDimensions = dependentDimensions;
                return this;
            }

            /**
             * <p>The key of the quota dimension. Valid values:</p>
             * <ul>
             * <li><p>regionId: the region ID.</p>
             * </li>
             * <li><p>zoneId: the zone ID.</p>
             * </li>
             * <li><p>chargeType: the billing method.</p>
             * </li>
             * <li><p>networkType: the network type.</p>
             * </li>
             * <li><p>resourceType: the resource type.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zoneId</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The details of the quota dimension value.</p>
             */
            public Builder dimensionValueDetail(java.util.List<DimensionValueDetail> dimensionValueDetail) {
                this.dimensionValueDetail = dimensionValueDetail;
                return this;
            }

            /**
             * <p>The list of quota dimension values.</p>
             */
            public Builder dimensionValues(java.util.List<String> dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            /**
             * <p>The name of the quota dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>Zone</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the quota dimension is required when you query quota dimensions. Valid values:</p>
             * <ul>
             * <li><p>true: The quota dimension is required.</p>
             * </li>
             * <li><p>false: The quota dimension is optional.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder requisite(Boolean requisite) {
                this.requisite = requisite;
                return this;
            }

            public QuotaDimensions build() {
                return new QuotaDimensions(this);
            } 

        } 

    }
}
