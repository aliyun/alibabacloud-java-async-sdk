// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultRegistrantProfileRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultRegistrantProfileRequest</p>
 */
public class SetDefaultRegistrantProfileRequest extends Request {
    @Query
    @NameInMap("RegistrantProfileId")
    @Validation(required = true)
    private Long registrantProfileId;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SetDefaultRegistrantProfileRequest(Builder builder) {
        super(builder);
        this.registrantProfileId = builder.registrantProfileId;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultRegistrantProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SetDefaultRegistrantProfileRequest, Builder> {
        private Long registrantProfileId; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultRegistrantProfileRequest request) {
            super(request);
            this.registrantProfileId = request.registrantProfileId;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SetDefaultRegistrantProfileRequest build() {
            return new SetDefaultRegistrantProfileRequest(this);
        } 

    } 

}
