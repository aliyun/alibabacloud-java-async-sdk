// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetLoginPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetLoginPreferenceRequest</p>
 */
public class SetLoginPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserToGetCredentials")
    private Boolean allowUserToGetCredentials;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    private SetLoginPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserToGetCredentials = builder.allowUserToGetCredentials;
        this.directoryId = builder.directoryId;
        this.loginNetworkMasks = builder.loginNetworkMasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoginPreferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUserToGetCredentials
     */
    public Boolean getAllowUserToGetCredentials() {
        return this.allowUserToGetCredentials;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return loginNetworkMasks
     */
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public static final class Builder extends Request.Builder<SetLoginPreferenceRequest, Builder> {
        private Boolean allowUserToGetCredentials; 
        private String directoryId; 
        private String loginNetworkMasks; 

        private Builder() {
            super();
        } 

        private Builder(SetLoginPreferenceRequest request) {
            super(request);
            this.allowUserToGetCredentials = request.allowUserToGetCredentials;
            this.directoryId = request.directoryId;
            this.loginNetworkMasks = request.loginNetworkMasks;
        } 

        /**
         * AllowUserToGetCredentials.
         */
        public Builder allowUserToGetCredentials(Boolean allowUserToGetCredentials) {
            this.putQueryParameter("AllowUserToGetCredentials", allowUserToGetCredentials);
            this.allowUserToGetCredentials = allowUserToGetCredentials;
            return this;
        }

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist. Limits:</p>
         * <ul>
         * <li>You can enter IP addresses or CIDR blocks. IPv4 addresses are supported.</li>
         * <li>You can enter up to 100 IP addresses or CIDR blocks. Separate multiple IP addresses or CIDR blocks with semicolons <code>(;)</code>.</li>
         * <li>If you do not specify this parameter, the original settings are retained.</li>
         * <li>If you set this parameter to a semicolon (<code>;</code>), the value of this parameter is cleared.</li>
         * <li>The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16;10.0.0.0/8</p>
         */
        public Builder loginNetworkMasks(String loginNetworkMasks) {
            this.putQueryParameter("LoginNetworkMasks", loginNetworkMasks);
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }

        @Override
        public SetLoginPreferenceRequest build() {
            return new SetLoginPreferenceRequest(this);
        } 

    } 

}
