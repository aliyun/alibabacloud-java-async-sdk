// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartProjectsByLabelRequest} extends {@link RequestModel}
 *
 * <p>StartProjectsByLabelRequest</p>
 */
public class StartProjectsByLabelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private StartProjectsByLabelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartProjectsByLabelRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<StartProjectsByLabelRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(StartProjectsByLabelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public StartProjectsByLabelRequest build() {
            return new StartProjectsByLabelRequest(this);
        } 

    } 

}
