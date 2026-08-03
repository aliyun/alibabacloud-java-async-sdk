// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ConfigDataAgentMemoryRequest} extends {@link RequestModel}
 *
 * <p>ConfigDataAgentMemoryRequest</p>
 */
public class ConfigDataAgentMemoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallEnabled")
    private Boolean recallEnabled;

    private ConfigDataAgentMemoryRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.enabled = builder.enabled;
        this.recallEnabled = builder.recallEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigDataAgentMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return recallEnabled
     */
    public Boolean getRecallEnabled() {
        return this.recallEnabled;
    }

    public static final class Builder extends Request.Builder<ConfigDataAgentMemoryRequest, Builder> {
        private String DMSUnit; 
        private Boolean enabled; 
        private Boolean recallEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ConfigDataAgentMemoryRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.enabled = request.enabled;
            this.recallEnabled = request.recallEnabled;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * RecallEnabled.
         */
        public Builder recallEnabled(Boolean recallEnabled) {
            this.putQueryParameter("RecallEnabled", recallEnabled);
            this.recallEnabled = recallEnabled;
            return this;
        }

        @Override
        public ConfigDataAgentMemoryRequest build() {
            return new ConfigDataAgentMemoryRequest(this);
        } 

    } 

}
