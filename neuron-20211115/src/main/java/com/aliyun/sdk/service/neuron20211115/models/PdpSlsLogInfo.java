// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpSlsLogInfo} extends {@link TeaModel}
 *
 * <p>PdpSlsLogInfo</p>
 */
public class PdpSlsLogInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("slsUrl")
    private String slsUrl;

    private PdpSlsLogInfo(Builder builder) {
        this.slsUrl = builder.slsUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpSlsLogInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return slsUrl
     */
    public String getSlsUrl() {
        return this.slsUrl;
    }

    public static final class Builder {
        private String slsUrl; 

        private Builder() {
        } 

        private Builder(PdpSlsLogInfo model) {
            this.slsUrl = model.slsUrl;
        } 

        /**
         * slsUrl.
         */
        public Builder slsUrl(String slsUrl) {
            this.slsUrl = slsUrl;
            return this;
        }

        public PdpSlsLogInfo build() {
            return new PdpSlsLogInfo(this);
        } 

    } 

}
