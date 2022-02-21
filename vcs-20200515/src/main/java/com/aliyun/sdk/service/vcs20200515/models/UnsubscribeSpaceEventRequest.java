// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeSpaceEventRequest} extends {@link RequestModel}
 *
 * <p>UnsubscribeSpaceEventRequest</p>
 */
public class UnsubscribeSpaceEventRequest extends Request {
    @Query
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private UnsubscribeSpaceEventRequest(Builder builder) {
        super(builder);
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeSpaceEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<UnsubscribeSpaceEventRequest, Builder> {
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(UnsubscribeSpaceEventRequest response) {
            super(response);
            this.spaceId = response.spaceId;
        } 

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public UnsubscribeSpaceEventRequest build() {
            return new UnsubscribeSpaceEventRequest(this);
        } 

    } 

}
