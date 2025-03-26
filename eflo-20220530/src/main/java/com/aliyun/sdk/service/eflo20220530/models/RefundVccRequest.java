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
 * {@link RefundVccRequest} extends {@link RequestModel}
 *
 * <p>RefundVccRequest</p>
 */
public class RefundVccRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    private RefundVccRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundVccRequest create() {
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
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    public static final class Builder extends Request.Builder<RefundVccRequest, Builder> {
        private String regionId; 
        private String vccId; 

        private Builder() {
            super();
        } 

        private Builder(RefundVccRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vccId = request.vccId;
        } 

        /**
         * <p>Region</p>
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
         * <p>Lingjun Connection ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        @Override
        public RefundVccRequest build() {
            return new RefundVccRequest(this);
        } 

    } 

}
