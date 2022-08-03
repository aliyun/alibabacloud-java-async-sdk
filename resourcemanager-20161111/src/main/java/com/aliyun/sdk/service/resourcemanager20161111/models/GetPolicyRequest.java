// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetPolicyRequest</p>
 */
public class GetPolicyRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    private String policyType;

    private GetPolicyRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyRequest create() {
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<GetPolicyRequest, Builder> {
        private String language; 
        private String policyName; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(GetPolicyRequest request) {
            super(request);
            this.language = request.language;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
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
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public GetPolicyRequest build() {
            return new GetPolicyRequest(this);
        } 

    } 

}
