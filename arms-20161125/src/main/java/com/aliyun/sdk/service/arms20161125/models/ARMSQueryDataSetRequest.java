// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20161125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ARMSQueryDataSetRequest} extends {@link RequestModel}
 *
 * <p>ARMSQueryDataSetRequest</p>
 */
public class ARMSQueryDataSetRequest extends Request {
    @Query
    @NameInMap("DatasetId")
    @Validation(required = true)
    private Long datasetId;

    @Query
    @NameInMap("DateStr")
    private Long dateStr;

    @Query
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Query
    @NameInMap("HungryMode")
    private Boolean hungryMode;

    @Query
    @NameInMap("IntervalInSec")
    @Validation(required = true)
    private Integer intervalInSec;

    @Query
    @NameInMap("IsDrillDown")
    private Boolean isDrillDown;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("MaxTime")
    @Validation(required = true)
    private Long maxTime;

    @Query
    @NameInMap("Measures")
    private java.util.List < String > measures;

    @Query
    @NameInMap("MinTime")
    @Validation(required = true)
    private Long minTime;

    @Query
    @NameInMap("OptionalDims")
    private java.util.List < OptionalDims> optionalDims;

    @Query
    @NameInMap("OrderByKey")
    private String orderByKey;

    @Query
    @NameInMap("ReduceTail")
    private Boolean reduceTail;

    @Query
    @NameInMap("RequiredDims")
    private java.util.List < RequiredDims> requiredDims;

    private ARMSQueryDataSetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.dateStr = builder.dateStr;
        this.dimensions = builder.dimensions;
        this.hungryMode = builder.hungryMode;
        this.intervalInSec = builder.intervalInSec;
        this.isDrillDown = builder.isDrillDown;
        this.limit = builder.limit;
        this.maxTime = builder.maxTime;
        this.measures = builder.measures;
        this.minTime = builder.minTime;
        this.optionalDims = builder.optionalDims;
        this.orderByKey = builder.orderByKey;
        this.reduceTail = builder.reduceTail;
        this.requiredDims = builder.requiredDims;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ARMSQueryDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public Long getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return dateStr
     */
    public Long getDateStr() {
        return this.dateStr;
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return hungryMode
     */
    public Boolean getHungryMode() {
        return this.hungryMode;
    }

    /**
     * @return intervalInSec
     */
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    /**
     * @return isDrillDown
     */
    public Boolean getIsDrillDown() {
        return this.isDrillDown;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return maxTime
     */
    public Long getMaxTime() {
        return this.maxTime;
    }

    /**
     * @return measures
     */
    public java.util.List < String > getMeasures() {
        return this.measures;
    }

    /**
     * @return minTime
     */
    public Long getMinTime() {
        return this.minTime;
    }

    /**
     * @return optionalDims
     */
    public java.util.List < OptionalDims> getOptionalDims() {
        return this.optionalDims;
    }

    /**
     * @return orderByKey
     */
    public String getOrderByKey() {
        return this.orderByKey;
    }

    /**
     * @return reduceTail
     */
    public Boolean getReduceTail() {
        return this.reduceTail;
    }

    /**
     * @return requiredDims
     */
    public java.util.List < RequiredDims> getRequiredDims() {
        return this.requiredDims;
    }

    public static final class Builder extends Request.Builder<ARMSQueryDataSetRequest, Builder> {
        private Long datasetId; 
        private Long dateStr; 
        private java.util.List < Dimensions> dimensions; 
        private Boolean hungryMode; 
        private Integer intervalInSec; 
        private Boolean isDrillDown; 
        private Integer limit; 
        private Long maxTime; 
        private java.util.List < String > measures; 
        private Long minTime; 
        private java.util.List < OptionalDims> optionalDims; 
        private String orderByKey; 
        private Boolean reduceTail; 
        private java.util.List < RequiredDims> requiredDims; 

        private Builder() {
            super();
        } 

        private Builder(ARMSQueryDataSetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.dateStr = request.dateStr;
            this.dimensions = request.dimensions;
            this.hungryMode = request.hungryMode;
            this.intervalInSec = request.intervalInSec;
            this.isDrillDown = request.isDrillDown;
            this.limit = request.limit;
            this.maxTime = request.maxTime;
            this.measures = request.measures;
            this.minTime = request.minTime;
            this.optionalDims = request.optionalDims;
            this.orderByKey = request.orderByKey;
            this.reduceTail = request.reduceTail;
            this.requiredDims = request.requiredDims;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(Long datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DateStr.
         */
        public Builder dateStr(Long dateStr) {
            this.putQueryParameter("DateStr", dateStr);
            this.dateStr = dateStr;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * HungryMode.
         */
        public Builder hungryMode(Boolean hungryMode) {
            this.putQueryParameter("HungryMode", hungryMode);
            this.hungryMode = hungryMode;
            return this;
        }

        /**
         * IntervalInSec.
         */
        public Builder intervalInSec(Integer intervalInSec) {
            this.putQueryParameter("IntervalInSec", intervalInSec);
            this.intervalInSec = intervalInSec;
            return this;
        }

        /**
         * IsDrillDown.
         */
        public Builder isDrillDown(Boolean isDrillDown) {
            this.putQueryParameter("IsDrillDown", isDrillDown);
            this.isDrillDown = isDrillDown;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MaxTime.
         */
        public Builder maxTime(Long maxTime) {
            this.putQueryParameter("MaxTime", maxTime);
            this.maxTime = maxTime;
            return this;
        }

        /**
         * Measures.
         */
        public Builder measures(java.util.List < String > measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * MinTime.
         */
        public Builder minTime(Long minTime) {
            this.putQueryParameter("MinTime", minTime);
            this.minTime = minTime;
            return this;
        }

        /**
         * OptionalDims.
         */
        public Builder optionalDims(java.util.List < OptionalDims> optionalDims) {
            this.putQueryParameter("OptionalDims", optionalDims);
            this.optionalDims = optionalDims;
            return this;
        }

        /**
         * OrderByKey.
         */
        public Builder orderByKey(String orderByKey) {
            this.putQueryParameter("OrderByKey", orderByKey);
            this.orderByKey = orderByKey;
            return this;
        }

        /**
         * ReduceTail.
         */
        public Builder reduceTail(Boolean reduceTail) {
            this.putQueryParameter("ReduceTail", reduceTail);
            this.reduceTail = reduceTail;
            return this;
        }

        /**
         * RequiredDims.
         */
        public Builder requiredDims(java.util.List < RequiredDims> requiredDims) {
            this.putQueryParameter("RequiredDims", requiredDims);
            this.requiredDims = requiredDims;
            return this;
        }

        @Override
        public ARMSQueryDataSetRequest build() {
            return new ARMSQueryDataSetRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    public static class OptionalDims extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private OptionalDims(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionalDims create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OptionalDims build() {
                return new OptionalDims(this);
            } 

        } 

    }
    public static class RequiredDims extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private RequiredDims(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequiredDims create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequiredDims build() {
                return new RequiredDims(this);
            } 

        } 

    }
}
