// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageRegistryRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageRegistryRequest</p>
 */
public class ModifyImageRegistryRequest extends Request {
    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("Password")
    private String password;

    @Body
    @NameInMap("TransPerHour")
    private Integer transPerHour;

    @Body
    @NameInMap("UserName")
    private String userName;

    private ModifyImageRegistryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.password = builder.password;
        this.transPerHour = builder.transPerHour;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageRegistryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return transPerHour
     */
    public Integer getTransPerHour() {
        return this.transPerHour;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ModifyImageRegistryRequest, Builder> {
        private Long id; 
        private String password; 
        private Integer transPerHour; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageRegistryRequest request) {
            super(request);
            this.id = request.id;
            this.password = request.password;
            this.transPerHour = request.transPerHour;
            this.userName = request.userName;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * TransPerHour.
         */
        public Builder transPerHour(Integer transPerHour) {
            this.putBodyParameter("TransPerHour", transPerHour);
            this.transPerHour = transPerHour;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ModifyImageRegistryRequest build() {
            return new ModifyImageRegistryRequest(this);
        } 

    } 

}
