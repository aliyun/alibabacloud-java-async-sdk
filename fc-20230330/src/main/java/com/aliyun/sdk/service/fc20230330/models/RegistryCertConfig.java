// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link RegistryCertConfig} extends {@link TeaModel}
 *
 * <p>RegistryCertConfig</p>
 */
public class RegistryCertConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("insecure")
    private Boolean insecure;

    @com.aliyun.core.annotation.NameInMap("rootCaCertBase64")
    private String rootCaCertBase64;

    private RegistryCertConfig(Builder builder) {
        this.insecure = builder.insecure;
        this.rootCaCertBase64 = builder.rootCaCertBase64;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegistryCertConfig create() {
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

    /**
     * @return rootCaCertBase64
     */
    public String getRootCaCertBase64() {
        return this.rootCaCertBase64;
    }

    public static final class Builder {
        private Boolean insecure; 
        private String rootCaCertBase64; 

        private Builder() {
        } 

        private Builder(RegistryCertConfig model) {
            this.insecure = model.insecure;
            this.rootCaCertBase64 = model.rootCaCertBase64;
        } 

        /**
         * insecure.
         */
        public Builder insecure(Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * rootCaCertBase64.
         */
        public Builder rootCaCertBase64(String rootCaCertBase64) {
            this.rootCaCertBase64 = rootCaCertBase64;
            return this;
        }

        public RegistryCertConfig build() {
            return new RegistryCertConfig(this);
        } 

    } 

}
