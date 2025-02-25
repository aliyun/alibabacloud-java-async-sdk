// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassignUserRequest} extends {@link RequestModel}
 *
 * <p>UnassignUserRequest</p>
 */
public class UnassignUserRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private UnassignUserRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassignUserRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UnassignUserRequest, Builder> {
        private String extraParams; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UnassignUserRequest request) {
            super(request);
            this.extraParams = request.extraParams;
            this.userId = request.userId;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UnassignUserRequest build() {
            return new UnassignUserRequest(this);
        } 

    } 

}
