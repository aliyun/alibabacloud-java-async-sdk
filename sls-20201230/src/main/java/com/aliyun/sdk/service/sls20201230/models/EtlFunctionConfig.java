// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlFunctionConfig} extends {@link TeaModel}
 *
 * <p>EtlFunctionConfig</p>
 */
public class EtlFunctionConfig extends TeaModel {
    @NameInMap("functionProvider")
    @Validation(required = true)
    private String functionProvider;

    private EtlFunctionConfig(Builder builder) {
        this.functionProvider = builder.functionProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlFunctionConfig create() {
        return builder().build();
    }

    /**
     * @return functionProvider
     */
    public String getFunctionProvider() {
        return this.functionProvider;
    }

    public static final class Builder {
        private String functionProvider; 

        /**
         * functionProvider
         */
        public Builder functionProvider(String functionProvider) {
            this.functionProvider = functionProvider;
            return this;
        }

        public EtlFunctionConfig build() {
            return new EtlFunctionConfig(this);
        } 

    } 

}
