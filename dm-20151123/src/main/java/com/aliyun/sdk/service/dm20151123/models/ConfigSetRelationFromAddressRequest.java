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
 * {@link ConfigSetRelationFromAddressRequest} extends {@link RequestModel}
 *
 * <p>ConfigSetRelationFromAddressRequest</p>
 */
public class ConfigSetRelationFromAddressRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromAddress")
    private String fromAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private ConfigSetRelationFromAddressRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fromAddress = builder.fromAddress;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetRelationFromAddressRequest create() {
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
     * @return fromAddress
     */
    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<ConfigSetRelationFromAddressRequest, Builder> {
        private String regionId; 
        private String fromAddress; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(ConfigSetRelationFromAddressRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fromAddress = request.fromAddress;
            this.id = request.id;
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
         * FromAddress.
         */
        public Builder fromAddress(String fromAddress) {
            this.putQueryParameter("FromAddress", fromAddress);
            this.fromAddress = fromAddress;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public ConfigSetRelationFromAddressRequest build() {
            return new ConfigSetRelationFromAddressRequest(this);
        } 

    } 

}
