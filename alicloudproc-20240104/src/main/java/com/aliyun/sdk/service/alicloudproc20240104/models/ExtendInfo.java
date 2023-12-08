// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtendInfo} extends {@link TeaModel}
 *
 * <p>ExtendInfo</p>
 */
public class ExtendInfo extends TeaModel {
    @NameInMap("depositAmount")
    private Double depositAmount;

    @NameInMap("desc")
    private String desc;

    private ExtendInfo(Builder builder) {
        this.depositAmount = builder.depositAmount;
        this.desc = builder.desc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendInfo create() {
        return builder().build();
    }

    /**
     * @return depositAmount
     */
    public Double getDepositAmount() {
        return this.depositAmount;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    public static final class Builder {
        private Double depositAmount; 
        private String desc; 

        /**
         * depositAmount.
         */
        public Builder depositAmount(Double depositAmount) {
            this.depositAmount = depositAmount;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public ExtendInfo build() {
            return new ExtendInfo(this);
        } 

    } 

}
