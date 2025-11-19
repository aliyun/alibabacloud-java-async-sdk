// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ViewPortConfiguration} extends {@link TeaModel}
 *
 * <p>ViewPortConfiguration</p>
 */
public class ViewPortConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("height")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float height;

    @com.aliyun.core.annotation.NameInMap("width")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float width;

    private ViewPortConfiguration(Builder builder) {
        this.height = builder.height;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewPortConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Float getHeight() {
        return this.height;
    }

    /**
     * @return width
     */
    public Float getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Float height; 
        private Float width; 

        private Builder() {
        } 

        private Builder(ViewPortConfiguration model) {
            this.height = model.height;
            this.width = model.width;
        } 

        /**
         * <p>视口高度（像素）</p>
         * <p>This parameter is required.</p>
         */
        public Builder height(Float height) {
            this.height = height;
            return this;
        }

        /**
         * <p>视口宽度（像素）</p>
         * <p>This parameter is required.</p>
         */
        public Builder width(Float width) {
            this.width = width;
            return this;
        }

        public ViewPortConfiguration build() {
            return new ViewPortConfiguration(this);
        } 

    } 

}
