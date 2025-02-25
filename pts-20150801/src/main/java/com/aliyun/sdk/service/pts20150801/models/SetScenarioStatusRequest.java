// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScenarioStatusRequest} extends {@link RequestModel}
 *
 * <p>SetScenarioStatusRequest</p>
 */
public class SetScenarioStatusRequest extends Request {
    @Query
    @NameInMap("NodeIp")
    @Validation(required = true)
    private String nodeIp;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private Integer scenarioId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    @Query
    @NameInMap("Wskey")
    @Validation(required = true)
    private String wskey;

    private SetScenarioStatusRequest(Builder builder) {
        super(builder);
        this.nodeIp = builder.nodeIp;
        this.scenarioId = builder.scenarioId;
        this.status = builder.status;
        this.wskey = builder.wskey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScenarioStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeIp
     */
    public String getNodeIp() {
        return this.nodeIp;
    }

    /**
     * @return scenarioId
     */
    public Integer getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return wskey
     */
    public String getWskey() {
        return this.wskey;
    }

    public static final class Builder extends Request.Builder<SetScenarioStatusRequest, Builder> {
        private String nodeIp; 
        private Integer scenarioId; 
        private Integer status; 
        private String wskey; 

        private Builder() {
            super();
        } 

        private Builder(SetScenarioStatusRequest request) {
            super(request);
            this.nodeIp = request.nodeIp;
            this.scenarioId = request.scenarioId;
            this.status = request.status;
            this.wskey = request.wskey;
        } 

        /**
         * NodeIp.
         */
        public Builder nodeIp(String nodeIp) {
            this.putQueryParameter("NodeIp", nodeIp);
            this.nodeIp = nodeIp;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(Integer scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Wskey.
         */
        public Builder wskey(String wskey) {
            this.putQueryParameter("Wskey", wskey);
            this.wskey = wskey;
            return this;
        }

        @Override
        public SetScenarioStatusRequest build() {
            return new SetScenarioStatusRequest(this);
        } 

    } 

}
