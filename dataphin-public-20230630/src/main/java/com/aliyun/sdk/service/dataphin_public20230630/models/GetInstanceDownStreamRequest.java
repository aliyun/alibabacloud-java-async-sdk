// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetInstanceDownStreamRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceDownStreamRequest</p>
 */
public class GetInstanceDownStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownStreamDepth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer downStreamDepth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceGet")
    @com.aliyun.core.annotation.Validation(required = true)
    private InstanceGet instanceGet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunStatus")
    private String runStatus;

    private GetInstanceDownStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.downStreamDepth = builder.downStreamDepth;
        this.env = builder.env;
        this.instanceGet = builder.instanceGet;
        this.opTenantId = builder.opTenantId;
        this.runStatus = builder.runStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceDownStreamRequest create() {
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
     * @return downStreamDepth
     */
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return instanceGet
     */
    public InstanceGet getInstanceGet() {
        return this.instanceGet;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return runStatus
     */
    public String getRunStatus() {
        return this.runStatus;
    }

    public static final class Builder extends Request.Builder<GetInstanceDownStreamRequest, Builder> {
        private String regionId; 
        private Integer downStreamDepth; 
        private String env; 
        private InstanceGet instanceGet; 
        private Long opTenantId; 
        private String runStatus; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceDownStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.downStreamDepth = request.downStreamDepth;
            this.env = request.env;
            this.instanceGet = request.instanceGet;
            this.opTenantId = request.opTenantId;
            this.runStatus = request.runStatus;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder downStreamDepth(Integer downStreamDepth) {
            this.putQueryParameter("DownStreamDepth", downStreamDepth);
            this.downStreamDepth = downStreamDepth;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceGet(InstanceGet instanceGet) {
            String instanceGetShrink = shrink(instanceGet, "InstanceGet", "json");
            this.putBodyParameter("InstanceGet", instanceGetShrink);
            this.instanceGet = instanceGet;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * RunStatus.
         */
        public Builder runStatus(String runStatus) {
            this.putQueryParameter("RunStatus", runStatus);
            this.runStatus = runStatus;
            return this;
        }

        @Override
        public GetInstanceDownStreamRequest build() {
            return new GetInstanceDownStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceDownStreamRequest} extends {@link TeaModel}
     *
     * <p>GetInstanceDownStreamRequest</p>
     */
    public static class InstanceGet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeType;

        private InstanceGet(Builder builder) {
            this.instanceId = builder.instanceId;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceGet create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private String instanceId; 
            private String nodeType; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_5929472_20210411_9577721</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public InstanceGet build() {
                return new InstanceGet(this);
            } 

        } 

    }
}
