// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindUserRequest} extends {@link RequestModel}
 *
 * <p>BindUserRequest</p>
 */
public class BindUserRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("MatchingRate")
    @Validation(required = true)
    private String matchingRate;

    @Body
    @NameInMap("PersonId")
    @Validation(required = true)
    private String personId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long userId;

    private BindUserRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.matchingRate = builder.matchingRate;
        this.personId = builder.personId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return matchingRate
     */
    public String getMatchingRate() {
        return this.matchingRate;
    }

    /**
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<BindUserRequest, Builder> {
        private String corpId; 
        private String isvSubId; 
        private String matchingRate; 
        private String personId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(BindUserRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
            this.matchingRate = response.matchingRate;
            this.personId = response.personId;
            this.userId = response.userId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * MatchingRate.
         */
        public Builder matchingRate(String matchingRate) {
            this.putBodyParameter("MatchingRate", matchingRate);
            this.matchingRate = matchingRate;
            return this;
        }

        /**
         * PersonId.
         */
        public Builder personId(String personId) {
            this.putBodyParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public BindUserRequest build() {
            return new BindUserRequest(this);
        } 

    } 

}
