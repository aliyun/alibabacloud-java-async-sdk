// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link StopDesktopsRequest} extends {@link RequestModel}
 *
 * <p>StopDesktopsRequest</p>
 */
public class StopDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionToken")
    private String sessionToken;

    private StopDesktopsRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientOS = builder.clientOS;
        this.clientToken = builder.clientToken;
        this.clientVersion = builder.clientVersion;
        this.desktopId = builder.desktopId;
        this.loginToken = builder.loginToken;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.sessionToken = builder.sessionToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDesktopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionToken
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    public static final class Builder extends Request.Builder<StopDesktopsRequest, Builder> {
        private String clientId; 
        private String clientOS; 
        private String clientToken; 
        private String clientVersion; 
        private java.util.List<String> desktopId; 
        private String loginToken; 
        private String regionId; 
        private String sessionId; 
        private String sessionToken; 

        private Builder() {
            super();
        } 

        private Builder(StopDesktopsRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientOS = request.clientOS;
            this.clientToken = request.clientToken;
            this.clientVersion = request.clientVersion;
            this.desktopId = request.desktopId;
            this.loginToken = request.loginToken;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.sessionToken = request.sessionToken;
        } 

        /**
         * <p>The client ID. The system generates a unique ID for each client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The operating system (OS) of the device that runs the Alibaba Cloud Workspace client (hereinafter referred to as WUYING client).</p>
         * 
         * <strong>example:</strong>
         * <p>Windows_NT 10.0.18363 x64</p>
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence of a request?</a></p>
         * 
         * <strong>example:</strong>
         * <p>6ce412a8-399f-49f9-9518-66ee028a****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The client version. If you use a WUYING client, you can view the client version in the <strong>About</strong> dialog box on the client logon page.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.0-R-20210731.151756</p>
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers. You can specify the IDs of 1 to 20 cloud computers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * 
         * <strong>example:</strong>
         * <p>v18101ac6a9e69c66b04a163031680463660b4b216cd758f34b60b9ad6a7c7f7334b83dd8f75eef4209c68f9f1080b****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd45e873-650d-4d70-acb9-f996187a****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * 
         * <strong>example:</strong>
         * <p>04b7b80a0b020715c5c1b4175fc4771698****9e2a759557a4624665fd53ae40</p>
         */
        public Builder sessionToken(String sessionToken) {
            this.putQueryParameter("SessionToken", sessionToken);
            this.sessionToken = sessionToken;
            return this;
        }

        @Override
        public StopDesktopsRequest build() {
            return new StopDesktopsRequest(this);
        } 

    } 

}
