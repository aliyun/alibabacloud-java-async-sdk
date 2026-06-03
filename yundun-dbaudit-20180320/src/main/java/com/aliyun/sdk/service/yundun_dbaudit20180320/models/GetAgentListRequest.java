// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link GetAgentListRequest} extends {@link RequestModel}
 *
 * <p>GetAgentListRequest</p>
 */
public class GetAgentListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIp")
    private String agentIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentOs")
    private String agentOs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentStatus")
    private Integer agentStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetAgentListRequest(Builder builder) {
        super(builder);
        this.agentIp = builder.agentIp;
        this.agentOs = builder.agentOs;
        this.agentStatus = builder.agentStatus;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIp
     */
    public String getAgentIp() {
        return this.agentIp;
    }

    /**
     * @return agentOs
     */
    public String getAgentOs() {
        return this.agentOs;
    }

    /**
     * @return agentStatus
     */
    public Integer getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAgentListRequest, Builder> {
        private String agentIp; 
        private String agentOs; 
        private Integer agentStatus; 
        private String instanceId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentListRequest request) {
            super(request);
            this.agentIp = request.agentIp;
            this.agentOs = request.agentOs;
            this.agentStatus = request.agentStatus;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * AgentIp.
         */
        public Builder agentIp(String agentIp) {
            this.putQueryParameter("AgentIp", agentIp);
            this.agentIp = agentIp;
            return this;
        }

        /**
         * AgentOs.
         */
        public Builder agentOs(String agentOs) {
            this.putQueryParameter("AgentOs", agentOs);
            this.agentOs = agentOs;
            return this;
        }

        /**
         * AgentStatus.
         */
        public Builder agentStatus(Integer agentStatus) {
            this.putQueryParameter("AgentStatus", agentStatus);
            this.agentStatus = agentStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaudit-cn-78v1gc****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAgentListRequest build() {
            return new GetAgentListRequest(this);
        } 

    } 

}
