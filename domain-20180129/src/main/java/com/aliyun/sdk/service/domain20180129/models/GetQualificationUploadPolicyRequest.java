// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualificationUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetQualificationUploadPolicyRequest</p>
 */
public class GetQualificationUploadPolicyRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private GetQualificationUploadPolicyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualificationUploadPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<GetQualificationUploadPolicyRequest, Builder> {
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(GetQualificationUploadPolicyRequest response) {
            super(response);
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
        public GetQualificationUploadPolicyRequest build() {
            return new GetQualificationUploadPolicyRequest(this);
        } 

    } 

}
