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
 * {@link UpdateVpdRequest} extends {@link RequestModel}
 *
 * <p>UpdateVpdRequest</p>
 */
public class UpdateVpdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdName")
    private String vpdName;

    private UpdateVpdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vpdId = builder.vpdId;
        this.vpdName = builder.vpdName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpdRequest create() {
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

    /**
     * @return vpdName
     */
    public String getVpdName() {
        return this.vpdName;
    }

    public static final class Builder extends Request.Builder<UpdateVpdRequest, Builder> {
        private String regionId; 
        private String vpdId; 
        private String vpdName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVpdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vpdId = request.vpdId;
            this.vpdName = request.vpdName;
        } 

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the VPD instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-omqutbff</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The name of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lingjun</p>
         */
        public Builder vpdName(String vpdName) {
            this.putBodyParameter("VpdName", vpdName);
            this.vpdName = vpdName;
            return this;
        }

        @Override
        public UpdateVpdRequest build() {
            return new UpdateVpdRequest(this);
        } 

    } 

}
