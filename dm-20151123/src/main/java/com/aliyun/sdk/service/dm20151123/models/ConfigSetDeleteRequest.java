// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ConfigSetDeleteRequest} extends {@link RequestModel}
 *
 * <p>ConfigSetDeleteRequest</p>
 */
public class ConfigSetDeleteRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsForce")
    private Boolean isForce;

    private ConfigSetDeleteRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ids = builder.ids;
        this.isForce = builder.isForce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetDeleteRequest create() {
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
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return isForce
     */
    public Boolean getIsForce() {
        return this.isForce;
    }

    public static final class Builder extends Request.Builder<ConfigSetDeleteRequest, Builder> {
        private String regionId; 
        private String ids; 
        private Boolean isForce; 

        private Builder() {
            super();
        } 

        private Builder(ConfigSetDeleteRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ids = request.ids;
            this.isForce = request.isForce;
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
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * IsForce.
         */
        public Builder isForce(Boolean isForce) {
            this.putQueryParameter("IsForce", isForce);
            this.isForce = isForce;
            return this;
        }

        @Override
        public ConfigSetDeleteRequest build() {
            return new ConfigSetDeleteRequest(this);
        } 

    } 

}
