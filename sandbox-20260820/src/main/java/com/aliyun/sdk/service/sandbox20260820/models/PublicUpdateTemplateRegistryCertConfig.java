// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicUpdateTemplateRegistryCertConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateRegistryCertConfig</p>
 */
public class PublicUpdateTemplateRegistryCertConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("insecure")
    private Boolean insecure;

    private PublicUpdateTemplateRegistryCertConfig(Builder builder) {
        this.insecure = builder.insecure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateRegistryCertConfig create() {
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

        private Builder(PublicUpdateTemplateRegistryCertConfig model) {
            this.insecure = model.insecure;
        } 

        /**
         * insecure.
         */
        public Builder insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        public PublicUpdateTemplateRegistryCertConfig build() {
            return new PublicUpdateTemplateRegistryCertConfig(this);
        } 

    } 

}
