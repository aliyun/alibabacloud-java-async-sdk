// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RemarkRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RemarkRequest</p>
 */
public class ConfigLayer4RemarkRequest extends Request {
    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ConfigLayer4RemarkRequest(Builder builder) {
        super(builder);
        this.listeners = builder.listeners;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RemarkRequest, Builder> {
        private String listeners; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RemarkRequest response) {
            super(response);
            this.listeners = response.listeners;
            this.regionId = response.regionId;
        } 

        /**
         * Listeners.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigLayer4RemarkRequest build() {
            return new ConfigLayer4RemarkRequest(this);
        } 

    } 

}
