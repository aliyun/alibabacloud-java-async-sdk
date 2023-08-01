// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ExternalStore} extends {@link TeaModel}
 *
 * <p>ExternalStore</p>
 */
public class ExternalStore extends TeaModel {
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @NameInMap("parameter")
    @Validation(required = true)
    private java.util.Map < String, ? > parameter;

    @NameInMap("storeType")
    @Validation(required = true)
    private String storeType;

    private ExternalStore(Builder builder) {
        this.externalStoreName = builder.externalStoreName;
        this.parameter = builder.parameter;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExternalStore create() {
        return builder().build();
    }

    /**
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    /**
     * @return parameter
     */
    public java.util.Map < String, ? > getParameter() {
        return this.parameter;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder {
        private String externalStoreName; 
        private java.util.Map < String, ? > parameter; 
        private String storeType; 

        /**
         * externalStoreName.
         */
        public Builder externalStoreName(String externalStoreName) {
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * parameter.
         */
        public Builder parameter(java.util.Map < String, ? > parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * storeType.
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        public ExternalStore build() {
            return new ExternalStore(this);
        } 

    } 

}
