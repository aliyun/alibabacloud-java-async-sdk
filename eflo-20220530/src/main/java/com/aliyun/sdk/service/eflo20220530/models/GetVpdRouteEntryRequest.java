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
 * {@link GetVpdRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>GetVpdRouteEntryRequest</p>
 */
public class GetVpdRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdRouteEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdRouteEntryId;

    private GetVpdRouteEntryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vpdId = builder.vpdId;
        this.vpdRouteEntryId = builder.vpdRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdRouteEntryRequest create() {
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
     * @return vpdRouteEntryId
     */
    public String getVpdRouteEntryId() {
        return this.vpdRouteEntryId;
    }

    public static final class Builder extends Request.Builder<GetVpdRouteEntryRequest, Builder> {
        private String regionId; 
        private String vpdId; 
        private String vpdRouteEntryId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpdRouteEntryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vpdId = request.vpdId;
            this.vpdRouteEntryId = request.vpdRouteEntryId;
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
         * <p>Lingjun CIDR block instance ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-iv2zm1qf</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The ID of the route entry instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-rte-toekyqel</p>
         */
        public Builder vpdRouteEntryId(String vpdRouteEntryId) {
            this.putBodyParameter("VpdRouteEntryId", vpdRouteEntryId);
            this.vpdRouteEntryId = vpdRouteEntryId;
            return this;
        }

        @Override
        public GetVpdRouteEntryRequest build() {
            return new GetVpdRouteEntryRequest(this);
        } 

    } 

}
