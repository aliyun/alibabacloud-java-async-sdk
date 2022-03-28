// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrAndSlsProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateSlrAndSlsProjectRequest</p>
 */
public class CreateSlrAndSlsProjectRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    private CreateSlrAndSlsProjectRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrAndSlsProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<CreateSlrAndSlsProjectRequest, Builder> {
        private Long ownerId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlrAndSlsProjectRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.region = request.region;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public CreateSlrAndSlsProjectRequest build() {
            return new CreateSlrAndSlsProjectRequest(this);
        } 

    } 

}
