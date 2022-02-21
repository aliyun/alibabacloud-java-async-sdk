// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginProfileRequest} extends {@link RequestModel}
 *
 * <p>GetLoginProfileRequest</p>
 */
public class GetLoginProfileRequest extends Request {
    @Query
    @NameInMap("UserName")
    private String userName;

    private GetLoginProfileRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GetLoginProfileRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginProfileRequest response) {
            super(response);
            this.userName = response.userName;
        } 

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GetLoginProfileRequest build() {
            return new GetLoginProfileRequest(this);
        } 

    } 

}
