// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureRequest</p>
 */
public class CreateFeatureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateFeatureRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateFeatureRequest, Builder> {
        private String regionId; 
        private String name; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateFeatureRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateFeatureRequest build() {
            return new CreateFeatureRequest(this);
        } 

    } 

}
