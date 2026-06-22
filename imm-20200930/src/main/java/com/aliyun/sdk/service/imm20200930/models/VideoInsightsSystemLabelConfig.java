// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link VideoInsightsSystemLabelConfig} extends {@link TeaModel}
 *
 * <p>VideoInsightsSystemLabelConfig</p>
 */
public class VideoInsightsSystemLabelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    private VideoInsightsSystemLabelConfig(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoInsightsSystemLabelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder {
        private Boolean enable; 

        private Builder() {
        } 

        private Builder(VideoInsightsSystemLabelConfig model) {
            this.enable = model.enable;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public VideoInsightsSystemLabelConfig build() {
            return new VideoInsightsSystemLabelConfig(this);
        } 

    } 

}
