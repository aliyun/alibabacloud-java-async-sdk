// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableSpecResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableSpecResponseBody</p>
 */
public class DescribeAvailableSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableSpecResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableSpecResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableSpecResponseBody build() {
            return new DescribeAvailableSpecResponseBody(this);
        } 

    } 

    public static class DiskSizeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Long max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Long min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Long step;

        private DiskSizeRange(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskSizeRange create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Long getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Long getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private Long max; 
            private Long min; 
            private Long step; 

            /**
             * Max.
             */
            public Builder max(Long max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Long min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public DiskSizeRange build() {
                return new DiskSizeRange(this);
            } 

        } 

    }
    public static class LogDiskSizeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Long max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Long min;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Long step;

        private LogDiskSizeRange(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogDiskSizeRange create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Long getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Long getMin() {
            return this.min;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private Long max; 
            private Long min; 
            private Long step; 

            /**
             * Max.
             */
            public Builder max(Long max) {
                this.max = max;
                return this;
            }

            /**
             * Min.
             */
            public Builder min(Long min) {
                this.min = min;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public LogDiskSizeRange build() {
                return new LogDiskSizeRange(this);
            } 

        } 

    }
    public static class AvailableSpecifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskSizeRange")
        private DiskSizeRange diskSizeRange;

        @com.aliyun.core.annotation.NameInMap("DiskTypes")
        private java.util.List < String > diskTypes;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("LogDiskSizeRange")
        private LogDiskSizeRange logDiskSizeRange;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private java.util.List < Integer > nodeNum;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private AvailableSpecifications(Builder builder) {
            this.diskSizeRange = builder.diskSizeRange;
            this.diskTypes = builder.diskTypes;
            this.instanceClass = builder.instanceClass;
            this.logDiskSizeRange = builder.logDiskSizeRange;
            this.nodeNum = builder.nodeNum;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpecifications create() {
            return builder().build();
        }

        /**
         * @return diskSizeRange
         */
        public DiskSizeRange getDiskSizeRange() {
            return this.diskSizeRange;
        }

        /**
         * @return diskTypes
         */
        public java.util.List < String > getDiskTypes() {
            return this.diskTypes;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return logDiskSizeRange
         */
        public LogDiskSizeRange getLogDiskSizeRange() {
            return this.logDiskSizeRange;
        }

        /**
         * @return nodeNum
         */
        public java.util.List < Integer > getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private DiskSizeRange diskSizeRange; 
            private java.util.List < String > diskTypes; 
            private String instanceClass; 
            private LogDiskSizeRange logDiskSizeRange; 
            private java.util.List < Integer > nodeNum; 
            private String spec; 

            /**
             * DiskSizeRange.
             */
            public Builder diskSizeRange(DiskSizeRange diskSizeRange) {
                this.diskSizeRange = diskSizeRange;
                return this;
            }

            /**
             * DiskTypes.
             */
            public Builder diskTypes(java.util.List < String > diskTypes) {
                this.diskTypes = diskTypes;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * LogDiskSizeRange.
             */
            public Builder logDiskSizeRange(LogDiskSizeRange logDiskSizeRange) {
                this.logDiskSizeRange = logDiskSizeRange;
                return this;
            }

            /**
             * NodeNum.
             */
            public Builder nodeNum(java.util.List < Integer > nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public AvailableSpecifications build() {
                return new AvailableSpecifications(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSpecifications")
        private java.util.List < AvailableSpecifications> availableSpecifications;

        private Data(Builder builder) {
            this.availableSpecifications = builder.availableSpecifications;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableSpecifications
         */
        public java.util.List < AvailableSpecifications> getAvailableSpecifications() {
            return this.availableSpecifications;
        }

        public static final class Builder {
            private java.util.List < AvailableSpecifications> availableSpecifications; 

            /**
             * AvailableSpecifications.
             */
            public Builder availableSpecifications(java.util.List < AvailableSpecifications> availableSpecifications) {
                this.availableSpecifications = availableSpecifications;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
