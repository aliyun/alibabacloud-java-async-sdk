// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link DeleteVpdRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpdRequest</p>
 */
public class DeleteVpdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    private DeleteVpdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpdRequest create() {
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
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<DeleteVpdRequest, Builder> {
        private String regionId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vpdId = request.vpdId;
        } 

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-zr0farea</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public DeleteVpdRequest build() {
            return new DeleteVpdRequest(this);
        } 

    } 

}
