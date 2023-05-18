// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleRequest} extends {@link RequestModel}
 *
 * <p>GetRoleRequest</p>
 */
public class GetRoleRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    private GetRoleRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleRequest create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<GetRoleRequest, Builder> {
        private String language; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(GetRoleRequest request) {
            super(request);
            this.language = request.language;
            this.roleName = request.roleName;
        } 

        /**
         * The language that is used to return the description of the RAM role. Valid values:
         * <p>
         * 
         * *   en: English
         * *   zh-CN: Chinese
         * *   ja: Japanese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The name of the RAM role.
         * <p>
         * 
         * The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public GetRoleRequest build() {
            return new GetRoleRequest(this);
        } 

    } 

}
