// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterPerformanceResponseBody</p>
 */
public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List<Performances> performances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBClusterPerformanceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.performances = builder.performances;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return performances
     */
    public java.util.List<Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String DBClusterId; 
        private String endTime; 
        private java.util.List<Performances> performances; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterPerformanceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.DBClusterId = model.DBClusterId;
            this.endTime = model.endTime;
            this.performances = model.performances;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The information about the request denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;AuthAction&quot;: &quot;xxx&quot;,
         *   &quot;AuthPrincipalDisplayName&quot;: &quot;sampleName&quot;,
         *   &quot;AuthPrincipalOwnerId&quot;: &quot;111111111111111111&quot;,
         *   &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *   &quot;AuthResource&quot;: &quot;xxx&quot;,
         *   &quot;NoPermissionType&quot;: &quot;xxx&quot;,
         *   &quot;PolicyType&quot;: &quot;xxx&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The queried performance metrics.</p>
         */
        public Builder performances(java.util.List<Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25B56BC7-4978-40B3-9E48-4B7067******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterPerformanceResponseBody build() {
            return new DescribeDBClusterPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPerformanceResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TranslateKey")
        private String translateKey;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Series(Builder builder) {
            this.name = builder.name;
            this.tags = builder.tags;
            this.translateKey = builder.translateKey;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return translateKey
         */
        public String getTranslateKey() {
            return this.translateKey;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String tags; 
            private String translateKey; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.name = model.name;
                this.tags = model.tags;
                this.translateKey = model.translateKey;
                this.values = model.values;
            } 

            /**
             * <p>The name of the performance metric value. For more information about the performance metrics, see <a href="https://help.aliyun.com/document_detail/2863211.html">Metric overview</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>worker_avg_cpu_used</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tags that are added to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_name: &quot;amv-8vbf80pjcz*****&quot;</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The key that is used to obtain the name of the performance metric value.</p>
             * 
             * <strong>example:</strong>
             * <p>elastic_executor_avg_cpu_use</p>
             */
            public Builder translateKey(String translateKey) {
                this.translateKey = translateKey;
                return this;
            }

            /**
             * <p>The values of the queried performance metric.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List<Series> series;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Performances(Builder builder) {
            this.key = builder.key;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return series
         */
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Series> series; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Performances model) {
                this.key = model.key;
                this.series = model.series;
                this.unit = model.unit;
            } 

            /**
             * <p>The name of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_CPU</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The queried performance metric data.</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
