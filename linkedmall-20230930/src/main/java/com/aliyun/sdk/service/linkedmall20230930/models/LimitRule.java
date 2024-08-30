// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * beginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * condcase.
         */
        public Builder condcase(String condcase) {
            this.condcase = condcase;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * limitNum.
         */
        public Builder limitNum(Integer limitNum) {
            this.limitNum = limitNum;
            return this;
        }

        /**
         * ruleType.
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
