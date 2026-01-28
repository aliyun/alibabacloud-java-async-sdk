// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20181015.models;

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
 * {@link ARMSQueryDataSetRequest} extends {@link RequestModel}
 *
 * <p>ARMSQueryDataSetRequest</p>
 */
public class ARMSQueryDataSetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateStr")
    private String dateStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HackerUserId")
    private String hackerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HungryMode")
    private Boolean hungryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalInSec")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer intervalInSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDrillDown")
    private Boolean isDrillDown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Measures")
    private java.util.List<String> measures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long minTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OptionalDims")
    private java.util.List<OptionalDims> optionalDims;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByKey")
    private String orderByKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReduceTail")
    private Boolean reduceTail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequiredDims")
    private java.util.List<RequiredDims> requiredDims;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ARMSQueryDataSetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetId = builder.datasetId;
        this.dateStr = builder.dateStr;
        this.dimensions = builder.dimensions;
        this.hackerUserId = builder.hackerUserId;
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
        this.securityToken = builder.securityToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public String getDateStr() {
        return this.dateStr;
    }

    /**
     * @return dimensions
     */
    public java.util.List<Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return hackerUserId
     */
    public String getHackerUserId() {
        return this.hackerUserId;
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
    public java.util.List<String> getMeasures() {
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
    public java.util.List<OptionalDims> getOptionalDims() {
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
    public java.util.List<RequiredDims> getRequiredDims() {
        return this.requiredDims;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ARMSQueryDataSetRequest, Builder> {
        private String regionId; 
        private Long datasetId; 
        private String dateStr; 
        private java.util.List<Dimensions> dimensions; 
        private String hackerUserId; 
        private Boolean hungryMode; 
        private Integer intervalInSec; 
        private Boolean isDrillDown; 
        private Integer limit; 
        private Long maxTime; 
        private java.util.List<String> measures; 
        private Long minTime; 
        private java.util.List<OptionalDims> optionalDims; 
        private String orderByKey; 
        private Boolean reduceTail; 
        private java.util.List<RequiredDims> requiredDims; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ARMSQueryDataSetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetId = request.datasetId;
            this.dateStr = request.dateStr;
            this.dimensions = request.dimensions;
            this.hackerUserId = request.hackerUserId;
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
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder datasetId(Long datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DateStr.
         */
        public Builder dateStr(String dateStr) {
            this.putQueryParameter("DateStr", dateStr);
            this.dateStr = dateStr;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * HackerUserId.
         */
        public Builder hackerUserId(String hackerUserId) {
            this.putQueryParameter("HackerUserId", hackerUserId);
            this.hackerUserId = hackerUserId;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder maxTime(Long maxTime) {
            this.putQueryParameter("MaxTime", maxTime);
            this.maxTime = maxTime;
            return this;
        }

        /**
         * Measures.
         */
        public Builder measures(java.util.List<String> measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder minTime(Long minTime) {
            this.putQueryParameter("MinTime", minTime);
            this.minTime = minTime;
            return this;
        }

        /**
         * OptionalDims.
         */
        public Builder optionalDims(java.util.List<OptionalDims> optionalDims) {
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
        public Builder requiredDims(java.util.List<RequiredDims> requiredDims) {
            this.putQueryParameter("RequiredDims", requiredDims);
            this.requiredDims = requiredDims;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ARMSQueryDataSetRequest build() {
            return new ARMSQueryDataSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link ARMSQueryDataSetRequest} extends {@link TeaModel}
     *
     * <p>ARMSQueryDataSetRequest</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link ARMSQueryDataSetRequest} extends {@link TeaModel}
     *
     * <p>ARMSQueryDataSetRequest</p>
     */
    public static class OptionalDims extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(OptionalDims model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link ARMSQueryDataSetRequest} extends {@link TeaModel}
     *
     * <p>ARMSQueryDataSetRequest</p>
     */
    public static class RequiredDims extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(RequiredDims model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

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
