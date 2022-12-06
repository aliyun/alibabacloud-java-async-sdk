// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDirectionalAddressRequest} extends {@link RequestModel}
 *
 * <p>AddDirectionalAddressRequest</p>
 */
public class AddDirectionalAddressRequest extends Request {
    @Query
    @NameInMap("Address")
    @Validation(required = true)
    private String address;

    @Query
    @NameInMap("AddressType")
    @Validation(required = true)
    private String addressType;

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

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private AddDirectionalAddressRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.addressType = builder.addressType;
        this.groupId = builder.groupId;
        this.msgNotify = builder.msgNotify;
        this.serialNo = builder.serialNo;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDirectionalAddressRequest create() {
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
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
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

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<AddDirectionalAddressRequest, Builder> {
        private String address; 
        private String addressType; 
        private String groupId; 
        private Boolean msgNotify; 
        private String serialNo; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(AddDirectionalAddressRequest request) {
            super(request);
            this.address = request.address;
            this.addressType = request.addressType;
            this.groupId = request.groupId;
            this.msgNotify = request.msgNotify;
            this.serialNo = request.serialNo;
            this.source = request.source;
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
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
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

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public AddDirectionalAddressRequest build() {
            return new AddDirectionalAddressRequest(this);
        } 

    } 

}
