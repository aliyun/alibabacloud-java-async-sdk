// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link OversoldUsageConfig} extends {@link TeaModel}
 *
 * <p>OversoldUsageConfig</p>
 */
public class OversoldUsageConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Disabled")
    private String disabled;

    @com.aliyun.core.annotation.NameInMap("DisabledBy")
    private String disabledBy;

    private OversoldUsageConfig(Builder builder) {
        this.disabled = builder.disabled;
        this.disabledBy = builder.disabledBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OversoldUsageConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disabled
     */
    public String getDisabled() {
        return this.disabled;
    }

    /**
     * @return disabledBy
     */
    public String getDisabledBy() {
        return this.disabledBy;
    }

    public static final class Builder {
        private String disabled; 
        private String disabledBy; 

        private Builder() {
        } 

        private Builder(OversoldUsageConfig model) {
            this.disabled = model.disabled;
            this.disabledBy = model.disabledBy;
        } 

        /**
         * Disabled.
         */
        public Builder disabled(String disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * DisabledBy.
         */
        public Builder disabledBy(String disabledBy) {
            this.disabledBy = disabledBy;
            return this;
        }

        public OversoldUsageConfig build() {
            return new OversoldUsageConfig(this);
        } 

    } 

}
