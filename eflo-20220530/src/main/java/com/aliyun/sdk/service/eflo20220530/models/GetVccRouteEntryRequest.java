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
 * {@link GetVccRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>GetVccRouteEntryRequest</p>
 */
public class GetVccRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccRouteEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vccRouteEntryId;

    private GetVccRouteEntryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
        this.vccRouteEntryId = builder.vccRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVccRouteEntryRequest create() {
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

    /**
     * @return vccRouteEntryId
     */
    public String getVccRouteEntryId() {
        return this.vccRouteEntryId;
    }

    public static final class Builder extends Request.Builder<GetVccRouteEntryRequest, Builder> {
        private String regionId; 
        private String vccId; 
        private String vccRouteEntryId; 

        private Builder() {
            super();
        } 

        private Builder(GetVccRouteEntryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vccId = request.vccId;
            this.vccRouteEntryId = request.vccRouteEntryId;
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
         * <p>Lingjun Connection ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>The ID of the route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-rte-31ocvdhq</p>
         */
        public Builder vccRouteEntryId(String vccRouteEntryId) {
            this.putBodyParameter("VccRouteEntryId", vccRouteEntryId);
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }

        @Override
        public GetVccRouteEntryRequest build() {
            return new GetVccRouteEntryRequest(this);
        } 

    } 

}
