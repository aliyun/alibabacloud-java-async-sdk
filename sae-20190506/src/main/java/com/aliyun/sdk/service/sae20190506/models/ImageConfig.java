// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImageConfig} extends {@link TeaModel}
 *
 * <p>ImageConfig</p>
 */
public class ImageConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accelerationType")
    private String accelerationType;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("instanceID")
    private String instanceID;

    private ImageConfig(Builder builder) {
        this.accelerationType = builder.accelerationType;
        this.image = builder.image;
        this.instanceID = builder.instanceID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImageConfig create() {
        return builder().build();
    }

    /**
     * @return accelerationType
     */
    public String getAccelerationType() {
        return this.accelerationType;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    public static final class Builder {
        private String accelerationType; 
        private String image; 
        private String instanceID; 

        /**
         * accelerationType.
         */
        public Builder accelerationType(String accelerationType) {
            this.accelerationType = accelerationType;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * instanceID.
         */
        public Builder instanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }

        public ImageConfig build() {
            return new ImageConfig(this);
        } 

    } 

}
