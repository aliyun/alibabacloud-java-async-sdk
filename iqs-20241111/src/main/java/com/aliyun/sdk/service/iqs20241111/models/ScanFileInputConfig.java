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
 * {@link ScanFileInputConfig} extends {@link TeaModel}
 *
 * <p>ScanFileInputConfig</p>
 */
public class ScanFileInputConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoCrop")
    private String autoCrop;

    @com.aliyun.core.annotation.NameInMap("autoRotate")
    private String autoRotate;

    private ScanFileInputConfig(Builder builder) {
        this.autoCrop = builder.autoCrop;
        this.autoRotate = builder.autoRotate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileInputConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoCrop
     */
    public String getAutoCrop() {
        return this.autoCrop;
    }

    /**
     * @return autoRotate
     */
    public String getAutoRotate() {
        return this.autoRotate;
    }

    public static final class Builder {
        private String autoCrop; 
        private String autoRotate; 

        private Builder() {
        } 

        private Builder(ScanFileInputConfig model) {
            this.autoCrop = model.autoCrop;
            this.autoRotate = model.autoRotate;
        } 

        /**
         * autoCrop.
         */
        public Builder autoCrop(String autoCrop) {
            this.autoCrop = autoCrop;
            return this;
        }

        /**
         * autoRotate.
         */
        public Builder autoRotate(String autoRotate) {
            this.autoRotate = autoRotate;
            return this;
        }

        public ScanFileInputConfig build() {
            return new ScanFileInputConfig(this);
        } 

    } 

}
