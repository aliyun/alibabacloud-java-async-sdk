// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetControlPolicyRequest</p>
 */
public class GetControlPolicyRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    private GetControlPolicyRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<GetControlPolicyRequest, Builder> {
        private String language; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(GetControlPolicyRequest response) {
            super(response);
            this.language = response.language;
            this.policyId = response.policyId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public GetControlPolicyRequest build() {
            return new GetControlPolicyRequest(this);
        } 

    } 

}
