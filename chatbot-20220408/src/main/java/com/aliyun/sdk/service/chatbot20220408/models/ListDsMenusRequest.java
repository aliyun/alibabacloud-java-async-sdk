// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDsMenusRequest} extends {@link RequestModel}
 *
 * <p>ListDsMenusRequest</p>
 */
public class ListDsMenusRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RobotEnv")
    private Integer robotEnv;

    @Query
    @NameInMap("Source")
    private Integer source;

    @Query
    @NameInMap("Tags")
    private String tags;

    private ListDsMenusRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.robotEnv = builder.robotEnv;
        this.source = builder.source;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDsMenusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return robotEnv
     */
    public Integer getRobotEnv() {
        return this.robotEnv;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListDsMenusRequest, Builder> {
        private String agentKey; 
        private String instanceId; 
        private String regionId; 
        private Integer robotEnv; 
        private Integer source; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListDsMenusRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.robotEnv = request.robotEnv;
            this.source = request.source;
            this.tags = request.tags;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 机器人ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * 1-正式环境，2-测试环境（默认）
         */
        public Builder robotEnv(Integer robotEnv) {
            this.putQueryParameter("RobotEnv", robotEnv);
            this.robotEnv = robotEnv;
            return this;
        }

        /**
         * 业务来源标识：
         * <p>
         * 1-集团内部aliyun域名；2-外部使用4service域名（默认）
         */
        public Builder source(Integer source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * 功能标识，为空表示所有；支持的tag有：Dialog / Intent / Entity / Var / TaskCenter；传入多个时通过英文逗号分隔
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListDsMenusRequest build() {
            return new ListDsMenusRequest(this);
        } 

    } 

}
