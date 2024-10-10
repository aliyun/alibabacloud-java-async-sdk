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
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
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
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SeriesList.
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
             * JobMetrics.
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
