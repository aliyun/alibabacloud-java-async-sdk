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
 * {@link BrowserViewPort} extends {@link TeaModel}
 *
 * <p>BrowserViewPort</p>
 */
public class BrowserViewPort extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("height")
    private Double height;

    @com.aliyun.core.annotation.NameInMap("width")
    private Double width;

    private BrowserViewPort(Builder builder) {
        this.height = builder.height;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserViewPort create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return height
     */
    public Double getHeight() {
        return this.height;
    }

    /**
     * @return width
     */
    public Double getWidth() {
        return this.width;
    }

    public static final class Builder {
        private Double height; 
        private Double width; 

        private Builder() {
        } 

        private Builder(BrowserViewPort model) {
            this.height = model.height;
            this.width = model.width;
        } 

        /**
         * height.
         */
        public Builder height(Double height) {
            this.height = height;
            return this;
        }

        /**
         * width.
         */
        public Builder width(Double width) {
            this.width = width;
            return this;
        }

        public BrowserViewPort build() {
            return new BrowserViewPort(this);
        } 

    } 

}
