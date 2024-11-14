// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportResponseBody</p>
 */
public class GetReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List < Datas> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetReportResponseBody(Builder builder) {
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return datas
     */
    public java.util.List < Datas> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Datas> datas; 
        private String requestId; 

        /**
         * <p>Data Details.</p>
         */
        public Builder datas(java.util.List < Datas> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetReportResponseBody build() {
            return new GetReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataPoints")
        private java.util.Map < String, ? > dataPoints;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map < String, ? > labels;

        private Data(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataPoints
         */
        public java.util.Map < String, ? > getDataPoints() {
            return this.dataPoints;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, ? > getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private java.util.Map < String, ? > dataPoints; 
            private java.util.Map < String, ? > labels; 

            /**
             * <p>Data Points.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;1726416000&quot;: 0.44,
             *   &quot;1726502400&quot;: 0.44,
             *   &quot;1726588800&quot;: 0.44,
             *   &quot;1726675200&quot;: 0.44,
             *   &quot;1726761600&quot;: 0.43,
             *   &quot;1726848000&quot;: 0.43,
             *   &quot;1726934400&quot;: 0.43,
             *   &quot;1727020800&quot;: 0.43
             * }</p>
             */
            public Builder dataPoints(java.util.Map < String, ? > dataPoints) {
                this.dataPoints = dataPoints;
                return this;
            }

            /**
             * <p>Data Labels.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;category&quot;: &quot;cloud&quot;
             * }</p>
             */
            public Builder labels(java.util.Map < String, ? > labels) {
                this.labels = labels;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportResponseBody</p>
     */
    public static class Datas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Datas(Builder builder) {
            this.data = builder.data;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datas create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String title; 

            /**
             * <p>Data.</p>
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Data Title.</p>
             * 
             * <strong>example:</strong>
             * <p>disk_count_percent_by_category</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Datas build() {
                return new Datas(this);
            } 

        } 

    }
}
