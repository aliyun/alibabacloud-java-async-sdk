// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHDFSUGIResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHDFSUGIResponseBody</p>
 */
public class GetDoctorHDFSUGIResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHDFSUGIResponseBody build() {
            return new GetDoctorHDFSUGIResponseBody(this);
        } 

    } 

    public static class TotalDataSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalDirCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class TotalFileCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class Metrics extends TeaModel {
        @NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @NameInMap("TotalDirCount")
        private TotalDirCount totalDirCount;

        @NameInMap("TotalFileCount")
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
             * TotalDataSize.
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * TotalDirCount.
             */
            public Builder totalDirCount(TotalDirCount totalDirCount) {
                this.totalDirCount = totalDirCount;
                return this;
            }

            /**
             * TotalFileCount.
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
    public static class Data extends TeaModel {
        @NameInMap("Metrics")
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
             * Metrics.
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
