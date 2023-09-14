// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductQuotaDimensionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductQuotaDimensionsResponseBody</p>
 */
public class ListProductQuotaDimensionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("QuotaDimensions")
    private java.util.List < QuotaDimensions> quotaDimensions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < QuotaDimensions> getQuotaDimensions() {
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
        private java.util.List < QuotaDimensions> quotaDimensions; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The maximum number of records that are returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position at which the query ends. An empty value indicates that all data is returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about quota dimensions.
         */
        public Builder quotaDimensions(java.util.List < QuotaDimensions> quotaDimensions) {
            this.quotaDimensions = quotaDimensions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of records that are returned for the query.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProductQuotaDimensionsResponseBody build() {
            return new ListProductQuotaDimensionsResponseBody(this);
        } 

    } 

    public static class DimensionValueDetail extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DimensionValueDetail(Builder builder) {
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

            /**
             * The name of the quota dimension value.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The quota dimension value.
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
    public static class QuotaDimensions extends TeaModel {
        @NameInMap("DependentDimensions")
        private java.util.List < String > dependentDimensions;

        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValueDetail")
        private java.util.List < DimensionValueDetail> dimensionValueDetail;

        @NameInMap("DimensionValues")
        private java.util.List < String > dimensionValues;

        @NameInMap("Name")
        private String name;

        @NameInMap("Requisite")
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
        public java.util.List < String > getDependentDimensions() {
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
        public java.util.List < DimensionValueDetail> getDimensionValueDetail() {
            return this.dimensionValueDetail;
        }

        /**
         * @return dimensionValues
         */
        public java.util.List < String > getDimensionValues() {
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
            private java.util.List < String > dependentDimensions; 
            private String dimensionKey; 
            private java.util.List < DimensionValueDetail> dimensionValueDetail; 
            private java.util.List < String > dimensionValues; 
            private String name; 
            private Boolean requisite; 

            /**
             * DependentDimensions.
             */
            public Builder dependentDimensions(java.util.List < String > dependentDimensions) {
                this.dependentDimensions = dependentDimensions;
                return this;
            }

            /**
             * The key of the quota dimension. Valid values:
             * <p>
             * 
             * *   regionId: the region ID.
             * *   zoneId: the zone ID.
             * *   chargeType: the billing method.
             * *   networkType: the network type.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The details of the quota dimension value.
             */
            public Builder dimensionValueDetail(java.util.List < DimensionValueDetail> dimensionValueDetail) {
                this.dimensionValueDetail = dimensionValueDetail;
                return this;
            }

            /**
             * DimensionValues.
             */
            public Builder dimensionValues(java.util.List < String > dimensionValues) {
                this.dimensionValues = dimensionValues;
                return this;
            }

            /**
             * The name of the quota dimension.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the quota dimension is required when you query quota dimensions. Valid values:
             * <p>
             * 
             * *   true
             * *   false
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
