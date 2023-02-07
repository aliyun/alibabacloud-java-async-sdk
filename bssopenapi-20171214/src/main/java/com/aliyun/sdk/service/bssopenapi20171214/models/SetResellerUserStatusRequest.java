// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResellerUserStatusRequest} extends {@link RequestModel}
 *
 * <p>SetResellerUserStatusRequest</p>
 */
public class SetResellerUserStatusRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("OwnerId")
    @Validation(required = true)
    private String ownerId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("StopMode")
    private String stopMode;

    private SetResellerUserStatusRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
        this.status = builder.status;
        this.stopMode = builder.stopMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetResellerUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stopMode
     */
    public String getStopMode() {
        return this.stopMode;
    }

    public static final class Builder extends Request.Builder<SetResellerUserStatusRequest, Builder> {
        private String businessType; 
        private String ownerId; 
        private String status; 
        private String stopMode; 

        private Builder() {
            super();
        } 

        private Builder(SetResellerUserStatusRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.ownerId = request.ownerId;
            this.status = request.status;
            this.stopMode = request.stopMode;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
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

        /**
         * StopMode.
         */
        public Builder stopMode(String stopMode) {
            this.putQueryParameter("StopMode", stopMode);
            this.stopMode = stopMode;
            return this;
        }

        @Override
        public SetResellerUserStatusRequest build() {
            return new SetResellerUserStatusRequest(this);
        } 

    } 

}
