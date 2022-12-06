// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectionalAddressRequest} extends {@link RequestModel}
 *
 * <p>DeleteDirectionalAddressRequest</p>
 */
public class DeleteDirectionalAddressRequest extends Request {
    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private String address;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("MsgNotify")
    private Boolean msgNotify;

    @Query
    @NameInMap("SerialNo")
    private String serialNo;

    private DeleteDirectionalAddressRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.groupId = builder.groupId;
        this.msgNotify = builder.msgNotify;
        this.serialNo = builder.serialNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDirectionalAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return msgNotify
     */
    public Boolean getMsgNotify() {
        return this.msgNotify;
    }

    /**
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    public static final class Builder extends Request.Builder<DeleteDirectionalAddressRequest, Builder> {
        private String address; 
        private String groupId; 
        private Boolean msgNotify; 
        private String serialNo; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDirectionalAddressRequest request) {
            super(request);
            this.address = request.address;
            this.groupId = request.groupId;
            this.msgNotify = request.msgNotify;
            this.serialNo = request.serialNo;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MsgNotify.
         */
        public Builder msgNotify(Boolean msgNotify) {
            this.putQueryParameter("MsgNotify", msgNotify);
            this.msgNotify = msgNotify;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putQueryParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        @Override
        public DeleteDirectionalAddressRequest build() {
            return new DeleteDirectionalAddressRequest(this);
        } 

    } 

}
