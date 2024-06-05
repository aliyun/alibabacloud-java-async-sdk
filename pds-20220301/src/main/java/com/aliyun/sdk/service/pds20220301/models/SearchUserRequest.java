// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchUserRequest} extends {@link RequestModel}
 *
 * <p>SearchUserRequest</p>
 */
public class SearchUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marker")
    private String marker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nick_name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nickName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nick_name_for_fuzzy")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nickNameForFuzzy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role")
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_name")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String userName;

    private SearchUserRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.email = builder.email;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.nickName = builder.nickName;
        this.nickNameForFuzzy = builder.nickNameForFuzzy;
        this.phone = builder.phone;
        this.role = builder.role;
        this.status = builder.status;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return nickNameForFuzzy
     */
    public String getNickNameForFuzzy() {
        return this.nickNameForFuzzy;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<SearchUserRequest, Builder> {
        private String domainId; 
        private String email; 
        private Integer limit; 
        private String marker; 
        private String nickName; 
        private String nickNameForFuzzy; 
        private String phone; 
        private String role; 
        private String status; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(SearchUserRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.email = request.email;
            this.limit = request.limit;
            this.marker = request.marker;
            this.nickName = request.nickName;
            this.nickNameForFuzzy = request.nickNameForFuzzy;
            this.phone = request.phone;
            this.role = request.role;
            this.status = request.status;
            this.userName = request.userName;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The email address of the user.
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 1 to 100. Default value: 100.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
         * <p>
         * By default, this parameter is left empty.
         */
        public Builder marker(String marker) {
            this.putBodyParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The nickname of the user. The nickname can be up to 128 characters in length.
         */
        public Builder nickName(String nickName) {
            this.putBodyParameter("nick_name", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * The nickname used for fuzzy searches. The nickname can be up to 128 characters in length.
         */
        public Builder nickNameForFuzzy(String nickNameForFuzzy) {
            this.putBodyParameter("nick_name_for_fuzzy", nickNameForFuzzy);
            this.nickNameForFuzzy = nickNameForFuzzy;
            return this;
        }

        /**
         * The mobile number of the user.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * The role of the user. Valid values:
         * <p>
         * 
         * *   superadmin
         * *   admin
         * *   user
         */
        public Builder role(String role) {
            this.putBodyParameter("role", role);
            this.role = role;
            return this;
        }

        /**
         * The state of the user. Valid values:
         * <p>
         * 
         * *   disabled: The user is prohibited from logon.
         * *   enabled: The user is in a normal state.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * The name of the user. The name can be up to 128 characters in length.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public SearchUserRequest build() {
            return new SearchUserRequest(this);
        } 

    } 

}
