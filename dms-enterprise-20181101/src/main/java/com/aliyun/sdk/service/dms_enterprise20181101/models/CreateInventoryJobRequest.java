// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateInventoryJobRequest} extends {@link RequestModel}
 *
 * <p>CreateInventoryJobRequest</p>
 */
public class CreateInventoryJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    private CreateInventoryJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.param = builder.param;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInventoryJobRequest create() {
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
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    public static final class Builder extends Request.Builder<CreateInventoryJobRequest, Builder> {
        private String regionId; 
        private String param; 

        private Builder() {
            super();
        } 

        private Builder(CreateInventoryJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.param = request.param;
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
         * Param.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        @Override
        public CreateInventoryJobRequest build() {
            return new CreateInventoryJobRequest(this);
        } 

    } 

}
