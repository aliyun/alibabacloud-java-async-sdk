// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnCcInfoRequest} extends {@link RequestModel}
 *
 * <p>SetScdnCcInfoRequest</p>
 */
public class SetScdnCcInfoRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetScdnCcInfoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScdnCcInfoRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetScdnCcInfoRequest, Builder> {
        private Long ownerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetScdnCcInfoRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.status = response.status;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetScdnCcInfoRequest build() {
            return new SetScdnCcInfoRequest(this);
        } 

    } 

}
