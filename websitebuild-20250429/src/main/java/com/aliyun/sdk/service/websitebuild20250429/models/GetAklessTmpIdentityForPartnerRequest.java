// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAklessTmpIdentityForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetAklessTmpIdentityForPartnerRequest</p>
 */
public class GetAklessTmpIdentityForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleCode;

    private GetAklessTmpIdentityForPartnerRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.roleCode = builder.roleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAklessTmpIdentityForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return roleCode
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    public static final class Builder extends Request.Builder<GetAklessTmpIdentityForPartnerRequest, Builder> {
        private String appCode; 
        private String roleCode; 

        private Builder() {
            super();
        } 

        private Builder(GetAklessTmpIdentityForPartnerRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.roleCode = request.roleCode;
        } 

        /**
         * <p>The source system code for the call. This parameter is optional. This field is reserved for future extensions. Currently, the credential retrieval role is selected based on RoleCode.</p>
         * 
         * <strong>example:</strong>
         * <p>clouddream</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>The zero-trust role code, which is case-sensitive. The default code ai-website-clouddream-oem corresponds to the OEM role, and ai-website-clouddream-oem-provider corresponds to the OEM service provider role. Specify one code per request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-website-clouddream-oem</p>
         */
        public Builder roleCode(String roleCode) {
            this.putQueryParameter("RoleCode", roleCode);
            this.roleCode = roleCode;
            return this;
        }

        @Override
        public GetAklessTmpIdentityForPartnerRequest build() {
            return new GetAklessTmpIdentityForPartnerRequest(this);
        } 

    } 

}
