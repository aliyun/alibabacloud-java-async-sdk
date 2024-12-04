// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDIJobMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobMetricsResponseBody</p>
 */
public class ListDIJobMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIJobMetricsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>691CA452-D37A-4ED0-9441</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobMetricsResponseBody build() {
            return new ListDIJobMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIJobMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobMetricsResponseBody</p>
     */
    public static class SeriesList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private SeriesList(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesList create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long time; 
            private Double value; 

            /**
             * <p>The point in time at which data is sampled based on the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1716881141</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The sample value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public SeriesList build() {
                return new SeriesList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIJobMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobMetricsResponseBody</p>
     */
    public static class JobMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SeriesList")
        private java.util.List < SeriesList> seriesList;

        private JobMetrics(Builder builder) {
            this.name = builder.name;
            this.seriesList = builder.seriesList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobMetrics create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return seriesList
         */
        public java.util.List < SeriesList> getSeriesList() {
            return this.seriesList;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < SeriesList> seriesList; 

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>JobDelay</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The metric data.</p>
             */
            public Builder seriesList(java.util.List < SeriesList> seriesList) {
                this.seriesList = seriesList;
                return this;
            }

            public JobMetrics build() {
                return new JobMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIJobMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobMetricsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobMetrics")
        private java.util.List < JobMetrics> jobMetrics;

        private PagingInfo(Builder builder) {
            this.jobMetrics = builder.jobMetrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return jobMetrics
         */
        public java.util.List < JobMetrics> getJobMetrics() {
            return this.jobMetrics;
        }

        public static final class Builder {
            private java.util.List < JobMetrics> jobMetrics; 

            /**
             * <p>The metrics returned.</p>
             */
            public Builder jobMetrics(java.util.List < JobMetrics> jobMetrics) {
                this.jobMetrics = jobMetrics;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
