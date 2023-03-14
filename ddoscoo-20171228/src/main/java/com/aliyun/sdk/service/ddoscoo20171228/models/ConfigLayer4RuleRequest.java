// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RuleRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleRequest</p>
 */
public class ConfigLayer4RuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    private ConfigLayer4RuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RuleRequest, Builder> {
        private String regionId; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Listeners.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public ConfigLayer4RuleRequest build() {
            return new ConfigLayer4RuleRequest(this);
        } 

    } 

}
