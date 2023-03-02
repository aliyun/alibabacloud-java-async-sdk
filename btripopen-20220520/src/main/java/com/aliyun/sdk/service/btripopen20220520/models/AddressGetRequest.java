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
    @NameInMap("sub_corp_id")
    private String subCorpId;

    @Query
    @NameInMap("type")
    private Integer type;

    @Query
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private AddressGetRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.itineraryId = builder.itineraryId;
        this.phone = builder.phone;
        this.subCorpId = builder.subCorpId;
        this.type = builder.type;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
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
     * @return subCorpId
     */
    public String getSubCorpId() {
        return this.subCorpId;
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

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<AddressGetRequest, Builder> {
        private Integer actionType; 
        private String itineraryId; 
        private String phone; 
        private String subCorpId; 
        private Integer type; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AddressGetRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.itineraryId = request.itineraryId;
            this.phone = request.phone;
            this.subCorpId = request.subCorpId;
            this.type = request.type;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
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
         * sub_corp_id.
         */
        public Builder subCorpId(String subCorpId) {
            this.putQueryParameter("sub_corp_id", subCorpId);
            this.subCorpId = subCorpId;
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

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public AddressGetRequest build() {
            return new AddressGetRequest(this);
        } 

    } 

}
