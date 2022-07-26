// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddressGetRequest} extends {@link RequestModel}
 *
 * <p>AddressGetRequest</p>
 */
public class AddressGetRequest extends Request {
    @Query
    @NameInMap("action_type")
    @Validation(required = true)
    private Integer actionType;

    @Query
    @NameInMap("itinerary_id")
    private String itineraryId;

    @Query
    @NameInMap("phone")
    private String phone;

    @Query
    @NameInMap("type")
    private Integer type;

    @Query
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    private AddressGetRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.itineraryId = builder.itineraryId;
        this.phone = builder.phone;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressGetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public Integer getActionType() {
        return this.actionType;
    }

    /**
     * @return itineraryId
     */
    public String getItineraryId() {
        return this.itineraryId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddressGetRequest, Builder> {
        private Integer actionType; 
        private String itineraryId; 
        private String phone; 
        private Integer type; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddressGetRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.itineraryId = request.itineraryId;
            this.phone = request.phone;
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * action_type.
         */
        public Builder actionType(Integer actionType) {
            this.putQueryParameter("action_type", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * itinerary_id.
         */
        public Builder itineraryId(String itineraryId) {
            this.putQueryParameter("itinerary_id", itineraryId);
            this.itineraryId = itineraryId;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddressGetRequest build() {
            return new AddressGetRequest(this);
        } 

    } 

}
