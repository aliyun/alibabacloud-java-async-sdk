// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateSessionRequest</p>
 */
public class CreateSessionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionType")
    private String sessionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateSessionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.sessionType = builder.sessionType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateSessionRequest, Builder> {
        private String regionId; 
        private String nodeId; 
        private String sessionType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSessionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.sessionType = request.sessionType;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-kvw44e6dn04</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Session type corresponding to the session package.</p>
         * 
         * <strong>example:</strong>
         * <p>N	两种：
         * Sol：基于串口[默认]
         * Assistant：基于云助手</p>
         */
        public Builder sessionType(String sessionType) {
            this.putBodyParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        /**
         * <p>Initiation time, 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1669340937156</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateSessionRequest build() {
            return new CreateSessionRequest(this);
        } 

    } 

}
