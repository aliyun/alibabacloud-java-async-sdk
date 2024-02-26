// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindUserDesktopRequest} extends {@link RequestModel}
 *
 * <p>UnbindUserDesktopRequest</p>
 */
public class UnbindUserDesktopRequest extends Request {
    @Query
    @NameInMap("DesktopAgentIds")
    private java.util.List < String > desktopAgentIds;

    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopIds")
    private java.util.List < String > desktopIds;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("UserDesktopIds")
    private java.util.List < String > userDesktopIds;

    private UnbindUserDesktopRequest(Builder builder) {
        super(builder);
        this.desktopAgentIds = builder.desktopAgentIds;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopIds = builder.desktopIds;
        this.force = builder.force;
        this.reason = builder.reason;
        this.userDesktopIds = builder.userDesktopIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindUserDesktopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopAgentIds
     */
    public java.util.List < String > getDesktopAgentIds() {
        return this.desktopAgentIds;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopIds
     */
    public java.util.List < String > getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return userDesktopIds
     */
    public java.util.List < String > getUserDesktopIds() {
        return this.userDesktopIds;
    }

    public static final class Builder extends Request.Builder<UnbindUserDesktopRequest, Builder> {
        private java.util.List < String > desktopAgentIds; 
        private String desktopGroupId; 
        private java.util.List < String > desktopIds; 
        private Boolean force; 
        private String reason; 
        private java.util.List < String > userDesktopIds; 

        private Builder() {
            super();
        } 

        private Builder(UnbindUserDesktopRequest request) {
            super(request);
            this.desktopAgentIds = request.desktopAgentIds;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopIds = request.desktopIds;
            this.force = request.force;
            this.reason = request.reason;
            this.userDesktopIds = request.userDesktopIds;
        } 

        /**
         * DesktopAgentIds.
         */
        public Builder desktopAgentIds(java.util.List < String > desktopAgentIds) {
            this.putQueryParameter("DesktopAgentIds", desktopAgentIds);
            this.desktopAgentIds = desktopAgentIds;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * DesktopIds.
         */
        public Builder desktopIds(java.util.List < String > desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * UserDesktopIds.
         */
        public Builder userDesktopIds(java.util.List < String > userDesktopIds) {
            this.putQueryParameter("UserDesktopIds", userDesktopIds);
            this.userDesktopIds = userDesktopIds;
            return this;
        }

        @Override
        public UnbindUserDesktopRequest build() {
            return new UnbindUserDesktopRequest(this);
        } 

    } 

}
