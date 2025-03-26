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
 * {@link GetErRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>GetErRouteEntryRequest</p>
 */
public class GetErRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErRouteEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erRouteEntryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetErRouteEntryRequest(Builder builder) {
        super(builder);
        this.erId = builder.erId;
        this.erRouteEntryId = builder.erRouteEntryId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return erRouteEntryId
     */
    public String getErRouteEntryId() {
        return this.erRouteEntryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetErRouteEntryRequest, Builder> {
        private String erId; 
        private String erRouteEntryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetErRouteEntryRequest request) {
            super(request);
            this.erId = request.erId;
            this.erRouteEntryId = request.erRouteEntryId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Lingjun HUB ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>The ID of the route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-rte-4q0jbylz</p>
         */
        public Builder erRouteEntryId(String erRouteEntryId) {
            this.putBodyParameter("ErRouteEntryId", erRouteEntryId);
            this.erRouteEntryId = erRouteEntryId;
            return this;
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

        @Override
        public GetErRouteEntryRequest build() {
            return new GetErRouteEntryRequest(this);
        } 

    } 

}
