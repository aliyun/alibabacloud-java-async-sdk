// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoginPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetLoginPreferenceRequest</p>
 */
public class SetLoginPreferenceRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("LoginNetworkMasks")
    private String loginNetworkMasks;

    private SetLoginPreferenceRequest(Builder builder) {
        super(builder);
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
        private String directoryId; 
        private String loginNetworkMasks; 

        private Builder() {
            super();
        } 

        private Builder(SetLoginPreferenceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.loginNetworkMasks = request.loginNetworkMasks;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist. Limits:
         * <p>
         * 
         * *   You can enter IP addresses or CIDR blocks. IPv4 addresses are supported.
         * *   You can enter up to 100 IP addresses or CIDR blocks. Separate multiple IP addresses or CIDR blocks with semicolons `(;)`.
         * *   If you do not specify this parameter, the original settings are retained.
         * *   If you set this parameter to a semicolon (`;`), the value of this parameter is cleared.
         * *   The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.
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
