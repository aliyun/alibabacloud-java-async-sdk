// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String regionId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
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
         * <p>The description of the instance. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_for_test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
