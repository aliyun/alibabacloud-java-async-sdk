// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link DeleteChatGroupParticipantsRequest} extends {@link RequestModel}
 *
 * <p>DeleteChatGroupParticipantsRequest</p>
 */
public class DeleteChatGroupParticipantsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteChatGroupParticipantsRequest(Builder builder) {
        super(builder);
        this.businessNumber = builder.businessNumber;
        this.channelType = builder.channelType;
        this.custSpaceId = builder.custSpaceId;
        this.groupId = builder.groupId;
        this.list = builder.list;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteChatGroupParticipantsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessNumber
     */
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteChatGroupParticipantsRequest, Builder> {
        private String businessNumber; 
        private String channelType; 
        private String custSpaceId; 
        private String groupId; 
        private java.util.List<List> list; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteChatGroupParticipantsRequest request) {
            super(request);
            this.businessNumber = request.businessNumber;
            this.channelType = request.channelType;
            this.custSpaceId = request.custSpaceId;
            this.groupId = request.groupId;
            this.list = request.list;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800**</p>
         */
        public Builder businessNumber(String businessNumber) {
            this.putQueryParameter("BusinessNumber", businessNumber);
            this.businessNumber = businessNumber;
            return this;
        }

        /**
         * ChannelType.
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-**</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EA93UU****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            String listShrink = shrink(list, "List", "json");
            this.putQueryParameter("List", listShrink);
            this.list = list;
            return this;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DeleteChatGroupParticipantsRequest build() {
            return new DeleteChatGroupParticipantsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteChatGroupParticipantsRequest} extends {@link TeaModel}
     *
     * <p>DeleteChatGroupParticipantsRequest</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParticipantNumber")
        private String participantNumber;

        private List(Builder builder) {
            this.participantNumber = builder.participantNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return participantNumber
         */
        public String getParticipantNumber() {
            return this.participantNumber;
        }

        public static final class Builder {
            private String participantNumber; 

            private Builder() {
            } 

            private Builder(List model) {
                this.participantNumber = model.participantNumber;
            } 

            /**
             * ParticipantNumber.
             */
            public Builder participantNumber(String participantNumber) {
                this.participantNumber = participantNumber;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
