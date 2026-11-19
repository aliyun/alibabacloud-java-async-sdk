// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link LimitRule} extends {@link TeaModel}
 *
 * <p>LimitRule</p>
 */
public class LimitRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("beginTime")
    private Long beginTime;

    @com.aliyun.core.annotation.NameInMap("condcase")
    private String condcase;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("limitNum")
    private Integer limitNum;

    @com.aliyun.core.annotation.NameInMap("ruleType")
    private String ruleType;

    private LimitRule(Builder builder) {
        this.beginTime = builder.beginTime;
        this.condcase = builder.condcase;
        this.endTime = builder.endTime;
        this.limitNum = builder.limitNum;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LimitRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return condcase
     */
    public String getCondcase() {
        return this.condcase;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limitNum
     */
    public Integer getLimitNum() {
        return this.limitNum;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder {
        private Long beginTime; 
        private String condcase; 
        private Long endTime; 
        private Integer limitNum; 
        private String ruleType; 

        private Builder() {
        } 

        private Builder(LimitRule model) {
            this.beginTime = model.beginTime;
            this.condcase = model.condcase;
            this.endTime = model.endTime;
            this.limitNum = model.limitNum;
            this.ruleType = model.ruleType;
        } 

        /**
         * <p>Start time of validity</p>
         * <blockquote>
         * <p>UNIX timestamp in milliseconds</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1724947200000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>Period condition</p>
         * <blockquote>
         * <p>This field applies only when ruleType is UpperNumberPerUserPeriod.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        public Builder condcase(String condcase) {
            this.condcase = condcase;
            return this;
        }

        /**
         * <p>End time of validity</p>
         * <blockquote>
         * <p>UNIX timestamp in milliseconds</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1724947200000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Purchase limit quantity</p>
         * <blockquote>
         * <p>If multiple purchase limit rules are active at the same time, the final limit is the minimum value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder limitNum(Integer limitNum) {
            this.limitNum = limitNum;
            return this;
        }

        /**
         * <p>Purchase limit type</p>
         * 
         * <strong>example:</strong>
         * <p>UpperNumberPerUser</p>
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public LimitRule build() {
            return new LimitRule(this);
        } 

    } 

}
