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
         * <p>When the Test flag is false or empty, AuthYears is required, in years, with a range of [1,100]. A value of 100 indicates permanent authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authYears(Integer authYears) {
            this.putQueryParameter("AuthYears", authYears);
            this.authYears = authYears;
            return this;
        }

        /**
         * <p>Business type. No more than 64 characters. Can be used to note specific business, such as different face usage scenarios of the access party or the customer identifier to be delivered. It is recommended to pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>FACE_TEST</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>Test flag. If true, it indicates using test authorization with a default duration of 30 days; if false, the authorization duration will be based on AuthYears.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder test(Boolean test) {
            this.putQueryParameter("Test", test);
            this.test = test;
            return this;
        }

        /**
         * <p>User device ID. No more than 64 characters. Can be used to identify a specific device, and it is suggested to use the physical number of the device. It is recommended to pass this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>3iJ1AY$oHcu7mC69</p>
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
