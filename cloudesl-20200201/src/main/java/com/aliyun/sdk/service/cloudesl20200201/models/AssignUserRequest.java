// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignUserRequest} extends {@link RequestModel}
 *
 * <p>AssignUserRequest</p>
 */
public class AssignUserRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("Stores")
    private String stores;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("UserType")
    @Validation(required = true)
    private String userType;

    private AssignUserRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.stores = builder.stores;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return stores
     */
    public String getStores() {
        return this.stores;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<AssignUserRequest, Builder> {
        private String extraParams; 
        private String stores; 
        private String userId; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(AssignUserRequest response) {
            super(response);
            this.extraParams = response.extraParams;
            this.stores = response.stores;
            this.userId = response.userId;
            this.userType = response.userType;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * Stores.
         */
        public Builder stores(String stores) {
            this.putBodyParameter("Stores", stores);
            this.stores = stores;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public AssignUserRequest build() {
            return new AssignUserRequest(this);
        } 

    } 

}
