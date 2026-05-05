// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeDeductionStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeductionStatisticRequest</p>
 */
public class DescribeDeductionStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Periods")
    private java.util.List<Periods> periods;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List<String> resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeDeductionStatisticRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.periods = builder.periods;
        this.resourceTypes = builder.resourceTypes;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeductionStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return periods
     */
    public java.util.List<Periods> getPeriods() {
        return this.periods;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDeductionStatisticRequest, Builder> {
        private Long endTime; 
        private java.util.List<String> instanceIds; 
        private java.util.List<Periods> periods; 
        private java.util.List<String> resourceTypes; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeductionStatisticRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.periods = request.periods;
            this.resourceTypes = request.resourceTypes;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Periods.
         */
        public Builder periods(java.util.List<Periods> periods) {
            this.putQueryParameter("Periods", periods);
            this.periods = periods;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(java.util.List<String> resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDeductionStatisticRequest build() {
            return new DescribeDeductionStatisticRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeductionStatisticRequest} extends {@link TeaModel}
     *
     * <p>DescribeDeductionStatisticRequest</p>
     */
    public static class Periods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseTime")
        private String baseTime;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        private Periods(Builder builder) {
            this.baseTime = builder.baseTime;
            this.periodUnit = builder.periodUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Periods create() {
            return builder().build();
        }

        /**
         * @return baseTime
         */
        public String getBaseTime() {
            return this.baseTime;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public static final class Builder {
            private String baseTime; 
            private String periodUnit; 

            private Builder() {
            } 

            private Builder(Periods model) {
                this.baseTime = model.baseTime;
                this.periodUnit = model.periodUnit;
            } 

            /**
             * BaseTime.
             */
            public Builder baseTime(String baseTime) {
                this.baseTime = baseTime;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            public Periods build() {
                return new Periods(this);
            } 

        } 

    }
}
