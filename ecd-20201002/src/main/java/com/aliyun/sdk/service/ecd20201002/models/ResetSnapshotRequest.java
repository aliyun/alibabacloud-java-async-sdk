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
 * {@link ResetSnapshotRequest} extends {@link RequestModel}
 *
 * <p>ResetSnapshotRequest</p>
 */
public class ResetSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDesktop")
    private Boolean stopDesktop;

    private ResetSnapshotRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.desktopId = builder.desktopId;
        this.loginToken = builder.loginToken;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.snapshotId = builder.snapshotId;
        this.stopDesktop = builder.stopDesktop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSnapshotRequest create() {
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
     * @return desktopId
     */
    public String getDesktopId() {
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return stopDesktop
     */
    public Boolean getStopDesktop() {
        return this.stopDesktop;
    }

    public static final class Builder extends Request.Builder<ResetSnapshotRequest, Builder> {
        private String clientId; 
        private String desktopId; 
        private String loginToken; 
        private String regionId; 
        private String sessionId; 
        private String snapshotId; 
        private Boolean stopDesktop; 

        private Builder() {
            super();
        } 

        private Builder(ResetSnapshotRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.desktopId = request.desktopId;
            this.loginToken = request.loginToken;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.snapshotId = request.snapshotId;
            this.stopDesktop = request.stopDesktop;
        } 

        /**
         * <p>The client ID. The system generates a unique ID for each client.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b9d8ddfd-65d4-4857-9e97-56477d1f****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-e964cr92klwqb****</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The logon token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1fdef51b727aa91d6c881658978508114d3f5680fa99a66b2a631d17d5bb4860cccf1173be24d77d5ef1423c83aea****</p>
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
         * <p>05182b8c-bb0d-49d3-963c-ee63a507****</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The snapshot ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zeipxmnhej803x7****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>Specifies whether to stop the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stopDesktop(Boolean stopDesktop) {
            this.putQueryParameter("StopDesktop", stopDesktop);
            this.stopDesktop = stopDesktop;
            return this;
        }

        @Override
        public ResetSnapshotRequest build() {
            return new ResetSnapshotRequest(this);
        } 

    } 

}
