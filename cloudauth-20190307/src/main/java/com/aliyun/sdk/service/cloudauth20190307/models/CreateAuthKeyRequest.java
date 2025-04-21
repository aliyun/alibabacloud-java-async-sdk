// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateAuthKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateAuthKeyRequest</p>
 */
public class CreateAuthKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthYears")
    private Integer authYears;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Test")
    private Boolean test;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDeviceId")
    private String userDeviceId;

    private CreateAuthKeyRequest(Builder builder) {
        super(builder);
        this.authYears = builder.authYears;
        this.bizType = builder.bizType;
        this.test = builder.test;
        this.userDeviceId = builder.userDeviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authYears
     */
    public Integer getAuthYears() {
        return this.authYears;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return test
     */
    public Boolean getTest() {
        return this.test;
    }

    /**
     * @return userDeviceId
     */
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public static final class Builder extends Request.Builder<CreateAuthKeyRequest, Builder> {
        private Integer authYears; 
        private String bizType; 
        private Boolean test; 
        private String userDeviceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAuthKeyRequest request) {
            super(request);
            this.authYears = request.authYears;
            this.bizType = request.bizType;
            this.test = request.test;
            this.userDeviceId = request.userDeviceId;
        } 

        /**
         * AuthYears.
         */
        public Builder authYears(Integer authYears) {
            this.putQueryParameter("AuthYears", authYears);
            this.authYears = authYears;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Test.
         */
        public Builder test(Boolean test) {
            this.putQueryParameter("Test", test);
            this.test = test;
            return this;
        }

        /**
         * UserDeviceId.
         */
        public Builder userDeviceId(String userDeviceId) {
            this.putQueryParameter("UserDeviceId", userDeviceId);
            this.userDeviceId = userDeviceId;
            return this;
        }

        @Override
        public CreateAuthKeyRequest build() {
            return new CreateAuthKeyRequest(this);
        } 

    } 

}
