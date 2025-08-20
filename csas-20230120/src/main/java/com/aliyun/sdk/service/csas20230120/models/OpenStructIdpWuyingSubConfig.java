// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link OpenStructIdpWuyingSubConfig} extends {@link TeaModel}
 *
 * <p>OpenStructIdpWuyingSubConfig</p>
 */
public class OpenStructIdpWuyingSubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aliuids")
    private java.util.List<String> aliuids;

    private OpenStructIdpWuyingSubConfig(Builder builder) {
        this.aliuids = builder.aliuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructIdpWuyingSubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuids
     */
    public java.util.List<String> getAliuids() {
        return this.aliuids;
    }

    public static final class Builder {
        private java.util.List<String> aliuids; 

        private Builder() {
        } 

        private Builder(OpenStructIdpWuyingSubConfig model) {
            this.aliuids = model.aliuids;
        } 

        /**
         * Aliuids.
         */
        public Builder aliuids(java.util.List<String> aliuids) {
            this.aliuids = aliuids;
            return this;
        }

        public OpenStructIdpWuyingSubConfig build() {
            return new OpenStructIdpWuyingSubConfig(this);
        } 

    } 

}
