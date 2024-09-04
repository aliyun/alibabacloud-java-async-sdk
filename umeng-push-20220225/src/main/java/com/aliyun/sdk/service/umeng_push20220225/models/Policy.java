// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Policy} extends {@link TeaModel}
 *
 * <p>Policy</p>
 */
public class Policy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expireTime")
    @com.aliyun.core.annotation.Validation(maxLength = 19, minLength = 19)
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("outerBizNo")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String outerBizNo;

    @com.aliyun.core.annotation.NameInMap("speed")
    private Integer speed;

    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(maxLength = 19, minLength = 19)
    private String startTime;

    private Policy(Builder builder) {
        this.expireTime = builder.expireTime;
        this.outerBizNo = builder.outerBizNo;
        this.speed = builder.speed;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Policy create() {
        return builder().build();
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return outerBizNo
     */
    public String getOuterBizNo() {
        return this.outerBizNo;
    }

    /**
     * @return speed
     */
    public Integer getSpeed() {
        return this.speed;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String expireTime; 
        private String outerBizNo; 
        private Integer speed; 
        private String startTime; 

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * outerBizNo.
         */
        public Builder outerBizNo(String outerBizNo) {
            this.outerBizNo = outerBizNo;
            return this;
        }

        /**
         * speed.
         */
        public Builder speed(Integer speed) {
            this.speed = speed;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Policy build() {
            return new Policy(this);
        } 

    } 

}
