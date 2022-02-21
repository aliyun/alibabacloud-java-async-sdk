// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProfileRequest} extends {@link RequestModel}
 *
 * <p>DeleteProfileRequest</p>
 */
public class DeleteProfileRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("ProfileId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long profileId;

    private DeleteProfileRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.profileId = builder.profileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProfileRequest create() {
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
     * @return profileId
     */
    public Long getProfileId() {
        return this.profileId;
    }

    public static final class Builder extends Request.Builder<DeleteProfileRequest, Builder> {
        private String corpId; 
        private String isvSubId; 
        private Long profileId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProfileRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
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
         * ProfileId.
         */
        public Builder profileId(Long profileId) {
            this.putBodyParameter("ProfileId", profileId);
            this.profileId = profileId;
            return this;
        }

        @Override
        public DeleteProfileRequest build() {
            return new DeleteProfileRequest(this);
        } 

    } 

}
