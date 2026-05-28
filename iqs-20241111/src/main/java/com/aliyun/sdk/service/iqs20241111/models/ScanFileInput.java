// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ScanFileInput} extends {@link TeaModel}
 *
 * <p>ScanFileInput</p>
 */
public class ScanFileInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("imageBase64")
    private String imageBase64;

    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("scanFileInputConfig")
    private ScanFileInputConfig scanFileInputConfig;

    private ScanFileInput(Builder builder) {
        this.imageBase64 = builder.imageBase64;
        this.imageUrl = builder.imageUrl;
        this.scanFileInputConfig = builder.scanFileInputConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageBase64
     */
    public String getImageBase64() {
        return this.imageBase64;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return scanFileInputConfig
     */
    public ScanFileInputConfig getScanFileInputConfig() {
        return this.scanFileInputConfig;
    }

    public static final class Builder {
        private String imageBase64; 
        private String imageUrl; 
        private ScanFileInputConfig scanFileInputConfig; 

        private Builder() {
        } 

        private Builder(ScanFileInput model) {
            this.imageBase64 = model.imageBase64;
            this.imageUrl = model.imageUrl;
            this.scanFileInputConfig = model.scanFileInputConfig;
        } 

        /**
         * imageBase64.
         */
        public Builder imageBase64(String imageBase64) {
            this.imageBase64 = imageBase64;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * scanFileInputConfig.
         */
        public Builder scanFileInputConfig(ScanFileInputConfig scanFileInputConfig) {
            this.scanFileInputConfig = scanFileInputConfig;
            return this;
        }

        public ScanFileInput build() {
            return new ScanFileInput(this);
        } 

    } 

}
