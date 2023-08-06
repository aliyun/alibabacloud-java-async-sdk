// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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

        private Builder(GetControlPolicyRequest request) {
            super(request);
            this.language = request.language;
            this.policyId = request.policyId;
        } 

        /**
         * The language in which you want to return the description of the access control policy. Valid values:
         * <p>
         * 
         * *   zh-CN (default value): Chinese
         * *   en: English
         * *   ja: Japanese
         * 
         * > This parameter is valid only for system access control policies.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The ID of the access control policy.
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
