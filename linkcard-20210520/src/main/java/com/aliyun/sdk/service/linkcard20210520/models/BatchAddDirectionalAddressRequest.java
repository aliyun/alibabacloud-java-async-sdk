// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDirectionalAddressRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDirectionalAddressRequest</p>
 */
public class BatchAddDirectionalAddressRequest extends Request {
    @Query
    @NameInMap("AddressType")
    @Validation(required = true)
    private String addressType;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("ListAddress")
    @Validation(required = true)
    private java.util.List < String > listAddress;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    private BatchAddDirectionalAddressRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.groupId = builder.groupId;
        this.listAddress = builder.listAddress;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDirectionalAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return listAddress
     */
    public java.util.List < String > getListAddress() {
        return this.listAddress;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<BatchAddDirectionalAddressRequest, Builder> {
        private String addressType; 
        private Long groupId; 
        private java.util.List < String > listAddress; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddDirectionalAddressRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.groupId = request.groupId;
            this.listAddress = request.listAddress;
            this.source = request.source;
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
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * ListAddress.
         */
        public Builder listAddress(java.util.List < String > listAddress) {
            this.putQueryParameter("ListAddress", listAddress);
            this.listAddress = listAddress;
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
        public BatchAddDirectionalAddressRequest build() {
            return new BatchAddDirectionalAddressRequest(this);
        } 

    } 

}
