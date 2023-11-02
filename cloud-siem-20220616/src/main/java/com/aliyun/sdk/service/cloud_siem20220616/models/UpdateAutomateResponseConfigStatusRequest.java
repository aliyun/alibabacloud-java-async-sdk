// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutomateResponseConfigStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutomateResponseConfigStatusRequest</p>
 */
public class UpdateAutomateResponseConfigStatusRequest extends Request {
    @Body
    @NameInMap("Ids")
    private String ids;

    @Body
    @NameInMap("InUse")
    private Boolean inUse;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAutomateResponseConfigStatusRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.inUse = builder.inUse;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutomateResponseConfigStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return inUse
     */
    public Boolean getInUse() {
        return this.inUse;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAutomateResponseConfigStatusRequest, Builder> {
        private String ids; 
        private Boolean inUse; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutomateResponseConfigStatusRequest request) {
            super(request);
            this.ids = request.ids;
            this.inUse = request.inUse;
            this.regionId = request.regionId;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putBodyParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * InUse.
         */
        public Builder inUse(Boolean inUse) {
            this.putBodyParameter("InUse", inUse);
            this.inUse = inUse;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAutomateResponseConfigStatusRequest build() {
            return new UpdateAutomateResponseConfigStatusRequest(this);
        } 

    } 

}
