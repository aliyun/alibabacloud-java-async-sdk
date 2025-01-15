// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetControlPolicyRequest</p>
 */
public class GetControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language in which you want to return the description of the access control policy. Valid values:</p>
         * <ul>
         * <li>zh-CN (default value): Chinese</li>
         * <li>en: English</li>
         * <li>ja: Japanese</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only for system access control policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-SImPt8GCEwiq****</p>
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
