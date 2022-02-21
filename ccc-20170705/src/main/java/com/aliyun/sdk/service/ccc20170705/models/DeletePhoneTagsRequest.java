// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePhoneTagsRequest} extends {@link RequestModel}
 *
 * <p>DeletePhoneTagsRequest</p>
 */
public class DeletePhoneTagsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumberList")
    @Validation(required = true)
    private java.util.List < String > phoneNumberList;

    private DeletePhoneTagsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.phoneNumberList = builder.phoneNumberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePhoneTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumberList
     */
    public java.util.List < String > getPhoneNumberList() {
        return this.phoneNumberList;
    }

    public static final class Builder extends Request.Builder<DeletePhoneTagsRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > phoneNumberList; 

        private Builder() {
            super();
        } 

        private Builder(DeletePhoneTagsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.phoneNumberList = response.phoneNumberList;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PhoneNumberList.
         */
        public Builder phoneNumberList(java.util.List < String > phoneNumberList) {
            this.putQueryParameter("PhoneNumberList", phoneNumberList);
            this.phoneNumberList = phoneNumberList;
            return this;
        }

        @Override
        public DeletePhoneTagsRequest build() {
            return new DeletePhoneTagsRequest(this);
        } 

    } 

}
