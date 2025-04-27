// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionalInstanceConfigResponseBody</p>
 */
public class GetRegionalInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetRegionalInstanceConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionalInstanceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetRegionalInstanceConfigResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetRegionalInstanceConfigResponseBody build() {
            return new GetRegionalInstanceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class ClientNodeAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private ClientNodeAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            private Builder() {
            } 

            private Builder(ClientNodeAmountRange model) {
                this.maxAmount = model.maxAmount;
                this.minAmount = model.minAmount;
            } 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public ClientNodeAmountRange build() {
                return new ClientNodeAmountRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class ClientNodeDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        private ClientNodeDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 

            private Builder() {
            } 

            private Builder(ClientNodeDiskList model) {
                this.diskType = model.diskType;
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.scaleLimit = model.scaleLimit;
            } 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            public ClientNodeDiskList build() {
                return new ClientNodeDiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class DataNodeAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private DataNodeAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataNodeAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            private Builder() {
            } 

            private Builder(DataNodeAmountRange model) {
                this.maxAmount = model.maxAmount;
                this.minAmount = model.minAmount;
            } 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public DataNodeAmountRange build() {
                return new DataNodeAmountRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class SubClassificationConfines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        private SubClassificationConfines(Builder builder) {
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubClassificationConfines create() {
            return builder().build();
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private Integer maxSize; 
            private Integer minSize; 
            private String performanceLevel; 

            private Builder() {
            } 

            private Builder(SubClassificationConfines model) {
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * performanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public SubClassificationConfines build() {
                return new SubClassificationConfines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class DataNodeDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("subClassificationConfines")
        private java.util.List<SubClassificationConfines> subClassificationConfines;

        @com.aliyun.core.annotation.NameInMap("valueLimitSet")
        private java.util.List<Integer> valueLimitSet;

        private DataNodeDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.subClassificationConfines = builder.subClassificationConfines;
            this.valueLimitSet = builder.valueLimitSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataNodeDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return subClassificationConfines
         */
        public java.util.List<SubClassificationConfines> getSubClassificationConfines() {
            return this.subClassificationConfines;
        }

        /**
         * @return valueLimitSet
         */
        public java.util.List<Integer> getValueLimitSet() {
            return this.valueLimitSet;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List<SubClassificationConfines> subClassificationConfines; 
            private java.util.List<Integer> valueLimitSet; 

            private Builder() {
            } 

            private Builder(DataNodeDiskList model) {
                this.diskType = model.diskType;
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.scaleLimit = model.scaleLimit;
                this.subClassificationConfines = model.subClassificationConfines;
                this.valueLimitSet = model.valueLimitSet;
            } 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * subClassificationConfines.
             */
            public Builder subClassificationConfines(java.util.List<SubClassificationConfines> subClassificationConfines) {
                this.subClassificationConfines = subClassificationConfines;
                return this;
            }

            /**
             * valueLimitSet.
             */
            public Builder valueLimitSet(java.util.List<Integer> valueLimitSet) {
                this.valueLimitSet = valueLimitSet;
                return this;
            }

            public DataNodeDiskList build() {
                return new DataNodeDiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class MasterDiskListSubClassificationConfines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        private MasterDiskListSubClassificationConfines(Builder builder) {
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterDiskListSubClassificationConfines create() {
            return builder().build();
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private Integer maxSize; 
            private Integer minSize; 
            private String performanceLevel; 

            private Builder() {
            } 

            private Builder(MasterDiskListSubClassificationConfines model) {
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * performanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public MasterDiskListSubClassificationConfines build() {
                return new MasterDiskListSubClassificationConfines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class MasterDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("subClassificationConfines")
        private java.util.List<MasterDiskListSubClassificationConfines> subClassificationConfines;

        private MasterDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.subClassificationConfines = builder.subClassificationConfines;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return subClassificationConfines
         */
        public java.util.List<MasterDiskListSubClassificationConfines> getSubClassificationConfines() {
            return this.subClassificationConfines;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List<MasterDiskListSubClassificationConfines> subClassificationConfines; 

            private Builder() {
            } 

            private Builder(MasterDiskList model) {
                this.diskType = model.diskType;
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.scaleLimit = model.scaleLimit;
                this.subClassificationConfines = model.subClassificationConfines;
            } 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * subClassificationConfines.
             */
            public Builder subClassificationConfines(java.util.List<MasterDiskListSubClassificationConfines> subClassificationConfines) {
                this.subClassificationConfines = subClassificationConfines;
                return this;
            }

            public MasterDiskList build() {
                return new MasterDiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class WarmNodeAmountRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("minAmount")
        private Integer minAmount;

        private WarmNodeAmountRange(Builder builder) {
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodeAmountRange create() {
            return builder().build();
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        public static final class Builder {
            private Integer maxAmount; 
            private Integer minAmount; 

            private Builder() {
            } 

            private Builder(WarmNodeAmountRange model) {
                this.maxAmount = model.maxAmount;
                this.minAmount = model.minAmount;
            } 

            /**
             * maxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * minAmount.
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            public WarmNodeAmountRange build() {
                return new WarmNodeAmountRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class WarmNodeDiskListSubClassificationConfines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        private WarmNodeDiskListSubClassificationConfines(Builder builder) {
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodeDiskListSubClassificationConfines create() {
            return builder().build();
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private Integer maxSize; 
            private Integer minSize; 
            private String performanceLevel; 

            private Builder() {
            } 

            private Builder(WarmNodeDiskListSubClassificationConfines model) {
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * performanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public WarmNodeDiskListSubClassificationConfines build() {
                return new WarmNodeDiskListSubClassificationConfines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class WarmNodeDiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("minSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("scaleLimit")
        private Integer scaleLimit;

        @com.aliyun.core.annotation.NameInMap("subClassificationConfines")
        private java.util.List<WarmNodeDiskListSubClassificationConfines> subClassificationConfines;

        @com.aliyun.core.annotation.NameInMap("valueLimitSet")
        private java.util.List<Integer> valueLimitSet;

        private WarmNodeDiskList(Builder builder) {
            this.diskType = builder.diskType;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.scaleLimit = builder.scaleLimit;
            this.subClassificationConfines = builder.subClassificationConfines;
            this.valueLimitSet = builder.valueLimitSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodeDiskList create() {
            return builder().build();
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return scaleLimit
         */
        public Integer getScaleLimit() {
            return this.scaleLimit;
        }

        /**
         * @return subClassificationConfines
         */
        public java.util.List<WarmNodeDiskListSubClassificationConfines> getSubClassificationConfines() {
            return this.subClassificationConfines;
        }

        /**
         * @return valueLimitSet
         */
        public java.util.List<Integer> getValueLimitSet() {
            return this.valueLimitSet;
        }

        public static final class Builder {
            private String diskType; 
            private Integer maxSize; 
            private Integer minSize; 
            private Integer scaleLimit; 
            private java.util.List<WarmNodeDiskListSubClassificationConfines> subClassificationConfines; 
            private java.util.List<Integer> valueLimitSet; 

            private Builder() {
            } 

            private Builder(WarmNodeDiskList model) {
                this.diskType = model.diskType;
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.scaleLimit = model.scaleLimit;
                this.subClassificationConfines = model.subClassificationConfines;
                this.valueLimitSet = model.valueLimitSet;
            } 

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * minSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * scaleLimit.
             */
            public Builder scaleLimit(Integer scaleLimit) {
                this.scaleLimit = scaleLimit;
                return this;
            }

            /**
             * subClassificationConfines.
             */
            public Builder subClassificationConfines(java.util.List<WarmNodeDiskListSubClassificationConfines> subClassificationConfines) {
                this.subClassificationConfines = subClassificationConfines;
                return this;
            }

            /**
             * valueLimitSet.
             */
            public Builder valueLimitSet(java.util.List<Integer> valueLimitSet) {
                this.valueLimitSet = valueLimitSet;
                return this;
            }

            public WarmNodeDiskList build() {
                return new WarmNodeDiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionalInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionalInstanceConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientNodeAmountRange")
        private ClientNodeAmountRange clientNodeAmountRange;

        @com.aliyun.core.annotation.NameInMap("clientNodeDiskList")
        private java.util.List<ClientNodeDiskList> clientNodeDiskList;

        @com.aliyun.core.annotation.NameInMap("clientSpecs")
        private java.util.List<String> clientSpecs;

        @com.aliyun.core.annotation.NameInMap("dataNodeAmountRange")
        private DataNodeAmountRange dataNodeAmountRange;

        @com.aliyun.core.annotation.NameInMap("dataNodeDiskList")
        private java.util.List<DataNodeDiskList> dataNodeDiskList;

        @com.aliyun.core.annotation.NameInMap("dataNodeSpecs")
        private java.util.List<String> dataNodeSpecs;

        @com.aliyun.core.annotation.NameInMap("kibanaSpecs")
        private java.util.List<String> kibanaSpecs;

        @com.aliyun.core.annotation.NameInMap("masterAmountRange")
        private java.util.List<String> masterAmountRange;

        @com.aliyun.core.annotation.NameInMap("masterDiskList")
        private java.util.List<MasterDiskList> masterDiskList;

        @com.aliyun.core.annotation.NameInMap("masterSpecs")
        private java.util.List<String> masterSpecs;

        @com.aliyun.core.annotation.NameInMap("specInfoMap")
        private java.util.Map<String, ResultSpecInfoMapValue> specInfoMap;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List<String> versions;

        @com.aliyun.core.annotation.NameInMap("warmNodeAmountRange")
        private WarmNodeAmountRange warmNodeAmountRange;

        @com.aliyun.core.annotation.NameInMap("warmNodeDiskList")
        private java.util.List<WarmNodeDiskList> warmNodeDiskList;

        @com.aliyun.core.annotation.NameInMap("warmNodeSpecs")
        private java.util.List<String> warmNodeSpecs;

        private Result(Builder builder) {
            this.clientNodeAmountRange = builder.clientNodeAmountRange;
            this.clientNodeDiskList = builder.clientNodeDiskList;
            this.clientSpecs = builder.clientSpecs;
            this.dataNodeAmountRange = builder.dataNodeAmountRange;
            this.dataNodeDiskList = builder.dataNodeDiskList;
            this.dataNodeSpecs = builder.dataNodeSpecs;
            this.kibanaSpecs = builder.kibanaSpecs;
            this.masterAmountRange = builder.masterAmountRange;
            this.masterDiskList = builder.masterDiskList;
            this.masterSpecs = builder.masterSpecs;
            this.specInfoMap = builder.specInfoMap;
            this.versions = builder.versions;
            this.warmNodeAmountRange = builder.warmNodeAmountRange;
            this.warmNodeDiskList = builder.warmNodeDiskList;
            this.warmNodeSpecs = builder.warmNodeSpecs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return clientNodeAmountRange
         */
        public ClientNodeAmountRange getClientNodeAmountRange() {
            return this.clientNodeAmountRange;
        }

        /**
         * @return clientNodeDiskList
         */
        public java.util.List<ClientNodeDiskList> getClientNodeDiskList() {
            return this.clientNodeDiskList;
        }

        /**
         * @return clientSpecs
         */
        public java.util.List<String> getClientSpecs() {
            return this.clientSpecs;
        }

        /**
         * @return dataNodeAmountRange
         */
        public DataNodeAmountRange getDataNodeAmountRange() {
            return this.dataNodeAmountRange;
        }

        /**
         * @return dataNodeDiskList
         */
        public java.util.List<DataNodeDiskList> getDataNodeDiskList() {
            return this.dataNodeDiskList;
        }

        /**
         * @return dataNodeSpecs
         */
        public java.util.List<String> getDataNodeSpecs() {
            return this.dataNodeSpecs;
        }

        /**
         * @return kibanaSpecs
         */
        public java.util.List<String> getKibanaSpecs() {
            return this.kibanaSpecs;
        }

        /**
         * @return masterAmountRange
         */
        public java.util.List<String> getMasterAmountRange() {
            return this.masterAmountRange;
        }

        /**
         * @return masterDiskList
         */
        public java.util.List<MasterDiskList> getMasterDiskList() {
            return this.masterDiskList;
        }

        /**
         * @return masterSpecs
         */
        public java.util.List<String> getMasterSpecs() {
            return this.masterSpecs;
        }

        /**
         * @return specInfoMap
         */
        public java.util.Map<String, ResultSpecInfoMapValue> getSpecInfoMap() {
            return this.specInfoMap;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        /**
         * @return warmNodeAmountRange
         */
        public WarmNodeAmountRange getWarmNodeAmountRange() {
            return this.warmNodeAmountRange;
        }

        /**
         * @return warmNodeDiskList
         */
        public java.util.List<WarmNodeDiskList> getWarmNodeDiskList() {
            return this.warmNodeDiskList;
        }

        /**
         * @return warmNodeSpecs
         */
        public java.util.List<String> getWarmNodeSpecs() {
            return this.warmNodeSpecs;
        }

        public static final class Builder {
            private ClientNodeAmountRange clientNodeAmountRange; 
            private java.util.List<ClientNodeDiskList> clientNodeDiskList; 
            private java.util.List<String> clientSpecs; 
            private DataNodeAmountRange dataNodeAmountRange; 
            private java.util.List<DataNodeDiskList> dataNodeDiskList; 
            private java.util.List<String> dataNodeSpecs; 
            private java.util.List<String> kibanaSpecs; 
            private java.util.List<String> masterAmountRange; 
            private java.util.List<MasterDiskList> masterDiskList; 
            private java.util.List<String> masterSpecs; 
            private java.util.Map<String, ResultSpecInfoMapValue> specInfoMap; 
            private java.util.List<String> versions; 
            private WarmNodeAmountRange warmNodeAmountRange; 
            private java.util.List<WarmNodeDiskList> warmNodeDiskList; 
            private java.util.List<String> warmNodeSpecs; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.clientNodeAmountRange = model.clientNodeAmountRange;
                this.clientNodeDiskList = model.clientNodeDiskList;
                this.clientSpecs = model.clientSpecs;
                this.dataNodeAmountRange = model.dataNodeAmountRange;
                this.dataNodeDiskList = model.dataNodeDiskList;
                this.dataNodeSpecs = model.dataNodeSpecs;
                this.kibanaSpecs = model.kibanaSpecs;
                this.masterAmountRange = model.masterAmountRange;
                this.masterDiskList = model.masterDiskList;
                this.masterSpecs = model.masterSpecs;
                this.specInfoMap = model.specInfoMap;
                this.versions = model.versions;
                this.warmNodeAmountRange = model.warmNodeAmountRange;
                this.warmNodeDiskList = model.warmNodeDiskList;
                this.warmNodeSpecs = model.warmNodeSpecs;
            } 

            /**
             * clientNodeAmountRange.
             */
            public Builder clientNodeAmountRange(ClientNodeAmountRange clientNodeAmountRange) {
                this.clientNodeAmountRange = clientNodeAmountRange;
                return this;
            }

            /**
             * clientNodeDiskList.
             */
            public Builder clientNodeDiskList(java.util.List<ClientNodeDiskList> clientNodeDiskList) {
                this.clientNodeDiskList = clientNodeDiskList;
                return this;
            }

            /**
             * clientSpecs.
             */
            public Builder clientSpecs(java.util.List<String> clientSpecs) {
                this.clientSpecs = clientSpecs;
                return this;
            }

            /**
             * dataNodeAmountRange.
             */
            public Builder dataNodeAmountRange(DataNodeAmountRange dataNodeAmountRange) {
                this.dataNodeAmountRange = dataNodeAmountRange;
                return this;
            }

            /**
             * dataNodeDiskList.
             */
            public Builder dataNodeDiskList(java.util.List<DataNodeDiskList> dataNodeDiskList) {
                this.dataNodeDiskList = dataNodeDiskList;
                return this;
            }

            /**
             * dataNodeSpecs.
             */
            public Builder dataNodeSpecs(java.util.List<String> dataNodeSpecs) {
                this.dataNodeSpecs = dataNodeSpecs;
                return this;
            }

            /**
             * kibanaSpecs.
             */
            public Builder kibanaSpecs(java.util.List<String> kibanaSpecs) {
                this.kibanaSpecs = kibanaSpecs;
                return this;
            }

            /**
             * masterAmountRange.
             */
            public Builder masterAmountRange(java.util.List<String> masterAmountRange) {
                this.masterAmountRange = masterAmountRange;
                return this;
            }

            /**
             * masterDiskList.
             */
            public Builder masterDiskList(java.util.List<MasterDiskList> masterDiskList) {
                this.masterDiskList = masterDiskList;
                return this;
            }

            /**
             * masterSpecs.
             */
            public Builder masterSpecs(java.util.List<String> masterSpecs) {
                this.masterSpecs = masterSpecs;
                return this;
            }

            /**
             * specInfoMap.
             */
            public Builder specInfoMap(java.util.Map<String, ResultSpecInfoMapValue> specInfoMap) {
                this.specInfoMap = specInfoMap;
                return this;
            }

            /**
             * versions.
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            /**
             * warmNodeAmountRange.
             */
            public Builder warmNodeAmountRange(WarmNodeAmountRange warmNodeAmountRange) {
                this.warmNodeAmountRange = warmNodeAmountRange;
                return this;
            }

            /**
             * warmNodeDiskList.
             */
            public Builder warmNodeDiskList(java.util.List<WarmNodeDiskList> warmNodeDiskList) {
                this.warmNodeDiskList = warmNodeDiskList;
                return this;
            }

            /**
             * warmNodeSpecs.
             */
            public Builder warmNodeSpecs(java.util.List<String> warmNodeSpecs) {
                this.warmNodeSpecs = warmNodeSpecs;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
