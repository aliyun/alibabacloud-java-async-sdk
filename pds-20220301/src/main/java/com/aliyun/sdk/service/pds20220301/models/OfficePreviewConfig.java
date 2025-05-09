// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link OfficePreviewConfig} extends {@link TeaModel}
 *
 * <p>OfficePreviewConfig</p>
 */
public class OfficePreviewConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    private OfficePreviewConfig(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfficePreviewConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Boolean enabled; 

        private Builder() {
        } 

        private Builder(OfficePreviewConfig model) {
            this.enabled = model.enabled;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public OfficePreviewConfig build() {
            return new OfficePreviewConfig(this);
        } 

    } 

}
