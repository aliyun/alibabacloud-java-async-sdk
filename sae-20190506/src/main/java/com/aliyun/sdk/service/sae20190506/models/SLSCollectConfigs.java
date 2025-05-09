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
 * {@link SLSCollectConfigs} extends {@link TeaModel}
 *
 * <p>SLSCollectConfigs</p>
 */
public class SLSCollectConfigs extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollectConfigs")
    private java.util.List<SLSCollectConfig> collectConfigs;

    private SLSCollectConfigs(Builder builder) {
        this.collectConfigs = builder.collectConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSCollectConfigs create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectConfigs
     */
    public java.util.List<SLSCollectConfig> getCollectConfigs() {
        return this.collectConfigs;
    }

    public static final class Builder {
        private java.util.List<SLSCollectConfig> collectConfigs; 

        private Builder() {
        } 

        private Builder(SLSCollectConfigs model) {
            this.collectConfigs = model.collectConfigs;
        } 

        /**
         * CollectConfigs.
         */
        public Builder collectConfigs(java.util.List<SLSCollectConfig> collectConfigs) {
            this.collectConfigs = collectConfigs;
            return this;
        }

        public SLSCollectConfigs build() {
            return new SLSCollectConfigs(this);
        } 

    } 

}
