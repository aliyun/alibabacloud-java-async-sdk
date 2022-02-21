// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAliyunAccountExistsRequest} extends {@link RequestModel}
 *
 * <p>CheckAliyunAccountExistsRequest</p>
 */
public class CheckAliyunAccountExistsRequest extends Request {
    @Body
    @NameInMap("UserPk")
    @Validation(required = true)
    private String userPk;

    private CheckAliyunAccountExistsRequest(Builder builder) {
        super(builder);
        this.userPk = builder.userPk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAliyunAccountExistsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPk
     */
    public String getUserPk() {
        return this.userPk;
    }

    public static final class Builder extends Request.Builder<CheckAliyunAccountExistsRequest, Builder> {
        private String userPk; 

        private Builder() {
            super();
        } 

        private Builder(CheckAliyunAccountExistsRequest response) {
            super(response);
            this.userPk = response.userPk;
        } 

        /**
         * UserPk.
         */
        public Builder userPk(String userPk) {
            this.putBodyParameter("UserPk", userPk);
            this.userPk = userPk;
            return this;
        }

        @Override
        public CheckAliyunAccountExistsRequest build() {
            return new CheckAliyunAccountExistsRequest(this);
        } 

    } 

}
