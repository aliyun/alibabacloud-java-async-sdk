// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("Phone")
    private String phone;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
        private String email; 
        private String endUserId; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
            super(request);
            this.email = request.email;
            this.endUserId = request.endUserId;
            this.phone = request.phone;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}
