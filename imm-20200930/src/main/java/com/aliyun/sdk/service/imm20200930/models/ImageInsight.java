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
 * {@link ImageInsight} extends {@link TeaModel}
 *
 * <p>ImageInsight</p>
 */
public class ImageInsight extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private String caption;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private ImageInsight(Builder builder) {
        this.caption = builder.caption;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageInsight create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String caption; 
        private String description; 

        private Builder() {
        } 

        private Builder(ImageInsight model) {
            this.caption = model.caption;
            this.description = model.description;
        } 

        /**
         * Caption.
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public ImageInsight build() {
            return new ImageInsight(this);
        } 

    } 

}
