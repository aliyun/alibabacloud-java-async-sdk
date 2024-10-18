// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HeadPose} extends {@link TeaModel}
 *
 * <p>HeadPose</p>
 */
public class HeadPose extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pitch")
    private Float pitch;

    @com.aliyun.core.annotation.NameInMap("Roll")
    private Float roll;

    @com.aliyun.core.annotation.NameInMap("Yaw")
    private Float yaw;

    private HeadPose(Builder builder) {
        this.pitch = builder.pitch;
        this.roll = builder.roll;
        this.yaw = builder.yaw;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HeadPose create() {
        return builder().build();
    }

    /**
     * @return pitch
     */
    public Float getPitch() {
        return this.pitch;
    }

    /**
     * @return roll
     */
    public Float getRoll() {
        return this.roll;
    }

    /**
     * @return yaw
     */
    public Float getYaw() {
        return this.yaw;
    }

    public static final class Builder {
        private Float pitch; 
        private Float roll; 
        private Float yaw; 

        /**
         * Pitch.
         */
        public Builder pitch(Float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Roll.
         */
        public Builder roll(Float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Yaw.
         */
        public Builder yaw(Float yaw) {
            this.yaw = yaw;
            return this;
        }

        public HeadPose build() {
            return new HeadPose(this);
        } 

    } 

}
