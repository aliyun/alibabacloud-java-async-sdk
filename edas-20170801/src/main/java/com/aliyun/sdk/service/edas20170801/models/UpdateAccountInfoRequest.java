// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccountInfoRequest</p>
 */
public class UpdateAccountInfoRequest extends Request {
    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Telephone")
    private String telephone;

    private UpdateAccountInfoRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.name = builder.name;
        this.telephone = builder.telephone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccountInfoRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    public static final class Builder extends Request.Builder<UpdateAccountInfoRequest, Builder> {
        private String email; 
        private String name; 
        private String telephone; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccountInfoRequest request) {
            super(request);
            this.email = request.email;
            this.name = request.name;
            this.telephone = request.telephone;
        } 

        /**
         * The email address of the account.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The name of the account.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The contact information of the account.
         */
        public Builder telephone(String telephone) {
            this.putQueryParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        @Override
        public UpdateAccountInfoRequest build() {
            return new UpdateAccountInfoRequest(this);
        } 

    } 

}
