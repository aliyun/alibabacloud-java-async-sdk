// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ContainerConfiguration} extends {@link TeaModel}
 *
 * <p>ContainerConfiguration</p>
 */
public class ContainerConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    private ContainerConfiguration(Builder builder) {
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder {
        private String image; 

        private Builder() {
        } 

        private Builder(ContainerConfiguration model) {
            this.image = model.image;
        } 

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public ContainerConfiguration build() {
            return new ContainerConfiguration(this);
        } 

    } 

}
