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
 * {@link ModifySmartAccessGatewayClientUserResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySmartAccessGatewayClientUserResponseBody</p>
 */
public class ModifySmartAccessGatewayClientUserResponseBody extends TeaModel {
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

    private ModifySmartAccessGatewayClientUserResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.clientIp = builder.clientIp;
        this.requestId = builder.requestId;
        this.userMail = builder.userMail;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySmartAccessGatewayClientUserResponseBody create() {
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

        private Builder(ModifySmartAccessGatewayClientUserResponseBody model) {
            this.bandwidth = model.bandwidth;
            this.clientIp = model.clientIp;
            this.requestId = model.requestId;
            this.userMail = model.userMail;
            this.userName = model.userName;
        } 

        /**
         * <p>The maximum bandwidth allocated to the client account. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.1</p>
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5F0078B5-8AAD-4B53-8351-4C91B8EA528A</p>
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
         * <p>The username of the client account.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public ModifySmartAccessGatewayClientUserResponseBody build() {
            return new ModifySmartAccessGatewayClientUserResponseBody(this);
        } 

    } 

}
