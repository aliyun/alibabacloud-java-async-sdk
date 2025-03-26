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
 * {@link DeleteErRouteMapRequest} extends {@link RequestModel}
 *
 * <p>DeleteErRouteMapRequest</p>
 */
public class DeleteErRouteMapRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErRouteMapIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> erRouteMapIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteErRouteMapRequest(Builder builder) {
        super(builder);
        this.erId = builder.erId;
        this.erRouteMapIds = builder.erRouteMapIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteErRouteMapRequest create() {
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
     * @return erRouteMapIds
     */
    public java.util.List<String> getErRouteMapIds() {
        return this.erRouteMapIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteErRouteMapRequest, Builder> {
        private String erId; 
        private java.util.List<String> erRouteMapIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteErRouteMapRequest request) {
            super(request);
            this.erId = request.erId;
            this.erRouteMapIds = request.erRouteMapIds;
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
         * <p>routing policy Instance ID List</p>
         * <p>This parameter is required.</p>
         */
        public Builder erRouteMapIds(java.util.List<String> erRouteMapIds) {
            this.putBodyParameter("ErRouteMapIds", erRouteMapIds);
            this.erRouteMapIds = erRouteMapIds;
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
        public DeleteErRouteMapRequest build() {
            return new DeleteErRouteMapRequest(this);
        } 

    } 

}
