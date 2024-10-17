// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    @com.aliyun.core.annotation.NameInMap("registryConfig")
    private RegistryConfig registryConfig;

    private ImageConfig(Builder builder) {
        this.accelerationType = builder.accelerationType;
        this.image = builder.image;
        this.instanceID = builder.instanceID;
        this.registryConfig = builder.registryConfig;
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

    /**
     * @return registryConfig
     */
    public RegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public static final class Builder {
        private String accelerationType; 
        private String image; 
        private String instanceID; 
        private RegistryConfig registryConfig; 

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

        /**
         * registryConfig.
         */
        public Builder registryConfig(RegistryConfig registryConfig) {
            this.registryConfig = registryConfig;
            return this;
        }

        public ImageConfig build() {
            return new ImageConfig(this);
        } 

    } 

}
