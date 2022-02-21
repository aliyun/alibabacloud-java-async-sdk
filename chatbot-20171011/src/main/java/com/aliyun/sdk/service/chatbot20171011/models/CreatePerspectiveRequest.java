// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePerspectiveRequest} extends {@link RequestModel}
 *
 * <p>CreatePerspectiveRequest</p>
 */
public class CreatePerspectiveRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreatePerspectiveRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePerspectiveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePerspectiveRequest, Builder> {
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePerspectiveRequest response) {
            super(response);
            this.name = response.name;
            this.regionId = response.regionId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreatePerspectiveRequest build() {
            return new CreatePerspectiveRequest(this);
        } 

    } 

}
