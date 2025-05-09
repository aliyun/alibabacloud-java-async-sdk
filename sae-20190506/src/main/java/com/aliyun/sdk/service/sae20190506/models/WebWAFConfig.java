// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebWAFConfig} extends {@link TeaModel}
 *
 * <p>WebWAFConfig</p>
 */
public class WebWAFConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableWAF")
    private Boolean enableWAF;

    private WebWAFConfig(Builder builder) {
        this.enableWAF = builder.enableWAF;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebWAFConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableWAF
     */
    public Boolean getEnableWAF() {
        return this.enableWAF;
    }

    public static final class Builder {
        private Boolean enableWAF; 

        private Builder() {
        } 

        private Builder(WebWAFConfig model) {
            this.enableWAF = model.enableWAF;
        } 

        /**
         * EnableWAF.
         */
        public Builder enableWAF(Boolean enableWAF) {
            this.enableWAF = enableWAF;
            return this;
        }

        public WebWAFConfig build() {
            return new WebWAFConfig(this);
        } 

    } 

}
