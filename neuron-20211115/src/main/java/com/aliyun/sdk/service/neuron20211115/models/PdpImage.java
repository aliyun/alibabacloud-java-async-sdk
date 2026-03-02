// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpImage} extends {@link TeaModel}
 *
 * <p>PdpImage</p>
 */
public class PdpImage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("imageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("imageTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageTag;

    private PdpImage(Builder builder) {
        this.imageId = builder.imageId;
        this.imageTag = builder.imageTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpImage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    public static final class Builder {
        private String imageId; 
        private String imageTag; 

        private Builder() {
        } 

        private Builder(PdpImage model) {
            this.imageId = model.imageId;
            this.imageTag = model.imageTag;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-v12wpq</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20220421100717_prepub</p>
         */
        public Builder imageTag(String imageTag) {
            this.imageTag = imageTag;
            return this;
        }

        public PdpImage build() {
            return new PdpImage(this);
        } 

    } 

}
