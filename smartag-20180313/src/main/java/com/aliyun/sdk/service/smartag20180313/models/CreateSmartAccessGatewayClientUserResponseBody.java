// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateSmartAccessGatewayClientUserResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSmartAccessGatewayClientUserResponseBody</p>
 */
public class CreateSmartAccessGatewayClientUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserMail")
    private String userMail;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateSmartAccessGatewayClientUserResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.clientIp = builder.clientIp;
        this.requestId = builder.requestId;
        this.userMail = builder.userMail;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmartAccessGatewayClientUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userMail
     */
    public String getUserMail() {
        return this.userMail;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private Integer bandwidth; 
        private String clientIp; 
        private String requestId; 
        private String userMail; 
        private String userName; 

        private Builder() {
        } 

        private Builder(CreateSmartAccessGatewayClientUserResponseBody model) {
            this.bandwidth = model.bandwidth;
            this.clientIp = model.clientIp;
            this.requestId = model.requestId;
            this.userMail = model.userMail;
            this.userName = model.userName;
        } 

        /**
         * <p>The maximum bandwidth value. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The IP address of the client app.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72E82F5E-66E8-4C22-BF1F-5CEB7DC132E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The email address of the client account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder userMail(String userMail) {
            this.userMail = userMail;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public CreateSmartAccessGatewayClientUserResponseBody build() {
            return new CreateSmartAccessGatewayClientUserResponseBody(this);
        } 

    } 

}
