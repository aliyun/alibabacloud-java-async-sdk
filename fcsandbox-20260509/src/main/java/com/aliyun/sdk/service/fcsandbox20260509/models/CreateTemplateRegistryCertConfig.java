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
 * {@link CreateTemplateRegistryCertConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateRegistryCertConfig</p>
 */
public class CreateTemplateRegistryCertConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("insecure")
    private Boolean insecure;

    private CreateTemplateRegistryCertConfig(Builder builder) {
        this.insecure = builder.insecure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRegistryCertConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insecure
     */
    public Boolean getInsecure() {
        return this.insecure;
    }

    public static final class Builder {
        private Boolean insecure; 

        private Builder() {
        } 

        private Builder(CreateTemplateRegistryCertConfig model) {
            this.insecure = model.insecure;
        } 

        /**
         * insecure.
         */
        public Builder insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        public CreateTemplateRegistryCertConfig build() {
            return new CreateTemplateRegistryCertConfig(this);
        } 

    } 

}
