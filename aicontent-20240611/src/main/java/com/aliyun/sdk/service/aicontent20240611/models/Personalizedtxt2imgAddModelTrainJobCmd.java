// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link Personalizedtxt2imgAddModelTrainJobCmd} extends {@link TeaModel}
 *
 * <p>Personalizedtxt2imgAddModelTrainJobCmd</p>
 */
public class Personalizedtxt2imgAddModelTrainJobCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> imageUrl;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("objectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    private Personalizedtxt2imgAddModelTrainJobCmd(Builder builder) {
        this.imageUrl = builder.imageUrl;
        this.name = builder.name;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Personalizedtxt2imgAddModelTrainJobCmd create() {
        return builder().build();
    }

    /**
     * @return imageUrl
     */
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder {
        private java.util.List<String> imageUrl; 
        private String name; 
        private String objectType; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageUrl(java.util.List<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>熊猫图片生成</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dog</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        public Personalizedtxt2imgAddModelTrainJobCmd build() {
            return new Personalizedtxt2imgAddModelTrainJobCmd(this);
        } 

    } 

}
