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
 * {@link UpdateErRouteMapRequest} extends {@link RequestModel}
 *
 * <p>UpdateErRouteMapRequest</p>
 */
public class UpdateErRouteMapRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErRouteMapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erRouteMapId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateErRouteMapRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.erId = builder.erId;
        this.erRouteMapId = builder.erRouteMapId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateErRouteMapRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return erRouteMapId
     */
    public String getErRouteMapId() {
        return this.erRouteMapId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateErRouteMapRequest, Builder> {
        private String description; 
        private String erId; 
        private String erRouteMapId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateErRouteMapRequest request) {
            super(request);
            this.description = request.description;
            this.erId = request.erId;
            this.erRouteMapId = request.erRouteMapId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The description of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>test-example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
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
         * <p>routing policy ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-rmap-uwglhzom</p>
         */
        public Builder erRouteMapId(String erRouteMapId) {
            this.putBodyParameter("ErRouteMapId", erRouteMapId);
            this.erRouteMapId = erRouteMapId;
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
        public UpdateErRouteMapRequest build() {
            return new UpdateErRouteMapRequest(this);
        } 

    } 

}
