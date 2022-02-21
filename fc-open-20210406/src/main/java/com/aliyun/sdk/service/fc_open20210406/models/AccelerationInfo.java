// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccelerationInfo} extends {@link TeaModel}
 *
 * <p>AccelerationInfo</p>
 */
public class AccelerationInfo extends TeaModel {
    @NameInMap("status")
    private String status;

    private AccelerationInfo(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccelerationInfo create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        /**
         * 镜像加速状态，取值 Preparing 或 Ready
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AccelerationInfo build() {
            return new AccelerationInfo(this);
        } 

    } 

}
