// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInviteStatusRequest} extends {@link RequestModel}
 *
 * <p>GetInviteStatusRequest</p>
 */
public class GetInviteStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InviteStatusList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < InviteStatusList> inviteStatusList;

    private GetInviteStatusRequest(Builder builder) {
        super(builder);
        this.inviteStatusList = builder.inviteStatusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInviteStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inviteStatusList
     */
    public java.util.List < InviteStatusList> getInviteStatusList() {
        return this.inviteStatusList;
    }

    public static final class Builder extends Request.Builder<GetInviteStatusRequest, Builder> {
        private java.util.List < InviteStatusList> inviteStatusList; 

        private Builder() {
            super();
        } 

        private Builder(GetInviteStatusRequest request) {
            super(request);
            this.inviteStatusList = request.inviteStatusList;
        } 

        /**
         * <p>inviteId list</br>
         * <code>Sub-levels &lt;= 5</code></p>
         * <p>This parameter is required.</p>
         */
        public Builder inviteStatusList(java.util.List < InviteStatusList> inviteStatusList) {
            this.putQueryParameter("InviteStatusList", inviteStatusList);
            this.inviteStatusList = inviteStatusList;
            return this;
        }

        @Override
        public GetInviteStatusRequest build() {
            return new GetInviteStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetInviteStatusRequest} extends {@link TeaModel}
     *
     * <p>GetInviteStatusRequest</p>
     */
    public static class InviteStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InviteId")
        private Long inviteId;

        private InviteStatusList(Builder builder) {
            this.inviteId = builder.inviteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteStatusList create() {
            return builder().build();
        }

        /**
         * @return inviteId
         */
        public Long getInviteId() {
            return this.inviteId;
        }

        public static final class Builder {
            private Long inviteId; 

            /**
             * <p>Invitation ID, From interface InviteSubAccount</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inviteId(Long inviteId) {
                this.inviteId = inviteId;
                return this;
            }

            public InviteStatusList build() {
                return new InviteStatusList(this);
            } 

        } 

    }
}
