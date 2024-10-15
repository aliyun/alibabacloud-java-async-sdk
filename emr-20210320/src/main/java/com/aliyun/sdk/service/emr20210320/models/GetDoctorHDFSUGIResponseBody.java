// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHDFSUGIResponseBody</p>
 */
public class GetDoctorHDFSUGIResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHDFSUGIResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHDFSUGIResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The results of HDFS analysis.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHDFSUGIResponseBody build() {
            return new GetDoctorHDFSUGIResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHDFSUGIResponseBody</p>
     */
    public static class TotalDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSize create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total data size in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDataSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>40440503</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataSize build() {
                return new TotalDataSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHDFSUGIResponseBody</p>
     */
    public static class TotalDirCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDirCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDirCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of total dirs</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalDirCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>”“</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDirCount build() {
                return new TotalDirCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHDFSUGIResponseBody</p>
     */
    public static class TotalFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileCount create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Number of total files</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>totalFileCount</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>”“</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalFileCount build() {
                return new TotalFileCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHDFSUGIResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalDirCount")
        private TotalDirCount totalDirCount;

        @com.aliyun.core.annotation.NameInMap("TotalFileCount")
        private TotalFileCount totalFileCount;

        private Metrics(Builder builder) {
            this.totalDataSize = builder.totalDataSize;
            this.totalDirCount = builder.totalDirCount;
            this.totalFileCount = builder.totalFileCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return totalDataSize
         */
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return totalDirCount
         */
        public TotalDirCount getTotalDirCount() {
            return this.totalDirCount;
        }

        /**
         * @return totalFileCount
         */
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

        public static final class Builder {
            private TotalDataSize totalDataSize; 
            private TotalDirCount totalDirCount; 
            private TotalFileCount totalFileCount; 

            /**
             * <p>The total data size.</p>
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * <p>The total number of directories.</p>
             */
            public Builder totalDirCount(TotalDirCount totalDirCount) {
                this.totalDirCount = totalDirCount;
                return this;
            }

            /**
             * <p>The total number of files.</p>
             */
            public Builder totalFileCount(TotalFileCount totalFileCount) {
                this.totalFileCount = totalFileCount;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorHDFSUGIResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Metrics metrics; 

            /**
             * <p>The metric information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
