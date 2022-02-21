// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindPersonRequest} extends {@link RequestModel}
 *
 * <p>BindPersonRequest</p>
 */
public class BindPersonRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("PersonId")
    @Validation(required = true)
    private String personId;

    @Body
    @NameInMap("PersonMatchingRate")
    @Validation(required = true)
    private String personMatchingRate;

    @Body
    @NameInMap("ProfileId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long profileId;

    private BindPersonRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.personId = builder.personId;
        this.personMatchingRate = builder.personMatchingRate;
        this.profileId = builder.profileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindPersonRequest create() {
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
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * @return personMatchingRate
     */
    public String getPersonMatchingRate() {
        return this.personMatchingRate;
    }

    /**
     * @return profileId
     */
    public Long getProfileId() {
        return this.profileId;
    }

    public static final class Builder extends Request.Builder<BindPersonRequest, Builder> {
        private String corpId; 
        private String isvSubId; 
        private String personId; 
        private String personMatchingRate; 
        private Long profileId; 

        private Builder() {
            super();
        } 

        private Builder(BindPersonRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
            this.personId = response.personId;
            this.personMatchingRate = response.personMatchingRate;
            this.profileId = response.profileId;
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
         * PersonId.
         */
        public Builder personId(String personId) {
            this.putBodyParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * PersonMatchingRate.
         */
        public Builder personMatchingRate(String personMatchingRate) {
            this.putBodyParameter("PersonMatchingRate", personMatchingRate);
            this.personMatchingRate = personMatchingRate;
            return this;
        }

        /**
         * ProfileId.
         */
        public Builder profileId(Long profileId) {
            this.putBodyParameter("ProfileId", profileId);
            this.profileId = profileId;
            return this;
        }

        @Override
        public BindPersonRequest build() {
            return new BindPersonRequest(this);
        } 

    } 

}
