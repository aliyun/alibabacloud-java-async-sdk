// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDesktopsRequest} extends {@link RequestModel}
 *
 * <p>StopDesktopsRequest</p>
 */
public class StopDesktopsRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ClientOS")
    private String clientOS;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClientVersion")
    private String clientVersion;

    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private java.util.List < String > desktopId;

    @Query
    @NameInMap("LoginToken")
    private String loginToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    @Query
    @NameInMap("SessionToken")
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
    public java.util.List < String > getDesktopId() {
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
        private java.util.List < String > desktopId; 
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
         * The client ID. The system generates a unique ID for each client.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * The client OS.
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The client version.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
            return this;
        }

        /**
         * The cloud desktop IDs. You can specify 1 to 20 IDs.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The logon token.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The session ID.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * The logon token.
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
