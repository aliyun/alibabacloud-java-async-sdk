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
 * {@link ImageReverseImageConfig} extends {@link TeaModel}
 *
 * <p>ImageReverseImageConfig</p>
 */
public class ImageReverseImageConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    private ImageReverseImageConfig(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageReverseImageConfig create() {
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

        private Builder(ImageReverseImageConfig model) {
            this.enable = model.enable;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public ImageReverseImageConfig build() {
            return new ImageReverseImageConfig(this);
        } 

    } 

}
