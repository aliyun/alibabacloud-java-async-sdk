// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveEthereumInviteeRequest} extends {@link RequestModel}
 *
 * <p>ApproveEthereumInviteeRequest</p>
 */
public class ApproveEthereumInviteeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Invitee")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Invitee> invitee;

    private ApproveEthereumInviteeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.invitee = builder.invitee;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveEthereumInviteeRequest create() {
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

    /**
     * @return invitee
     */
    public java.util.List < Invitee> getInvitee() {
        return this.invitee;
    }

    public static final class Builder extends Request.Builder<ApproveEthereumInviteeRequest, Builder> {
        private String regionId; 
        private String id; 
        private java.util.List < Invitee> invitee; 

        private Builder() {
            super();
        } 

        private Builder(ApproveEthereumInviteeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.invitee = request.invitee;
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

        /**
         * Invitee.
         */
        public Builder invitee(java.util.List < Invitee> invitee) {
            this.putBodyParameter("Invitee", invitee);
            this.invitee = invitee;
            return this;
        }

        @Override
        public ApproveEthereumInviteeRequest build() {
            return new ApproveEthereumInviteeRequest(this);
        } 

    } 

    public static class Invitee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Invitee(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invitee create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Invitee build() {
                return new Invitee(this);
            } 

        } 

    }
}
