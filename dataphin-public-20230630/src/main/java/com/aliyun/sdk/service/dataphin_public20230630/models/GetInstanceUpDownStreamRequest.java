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
 * {@link GetInstanceUpDownStreamRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceUpDownStreamRequest</p>
 */
public class GetInstanceUpDownStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownStreamDepth")
    private Integer downStreamDepth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private InstanceId instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpStreamDepth")
    private Integer upStreamDepth;

    private GetInstanceUpDownStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.downStreamDepth = builder.downStreamDepth;
        this.env = builder.env;
        this.instanceId = builder.instanceId;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
        this.upStreamDepth = builder.upStreamDepth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUpDownStreamRequest create() {
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
     * @return instanceId
     */
    public InstanceId getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return upStreamDepth
     */
    public Integer getUpStreamDepth() {
        return this.upStreamDepth;
    }

    public static final class Builder extends Request.Builder<GetInstanceUpDownStreamRequest, Builder> {
        private String regionId; 
        private Integer downStreamDepth; 
        private String env; 
        private InstanceId instanceId; 
        private Long opTenantId; 
        private Long projectId; 
        private Integer upStreamDepth; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceUpDownStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.downStreamDepth = request.downStreamDepth;
            this.env = request.env;
            this.instanceId = request.instanceId;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
            this.upStreamDepth = request.upStreamDepth;
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
         * DownStreamDepth.
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
        public Builder instanceId(InstanceId instanceId) {
            String instanceIdShrink = shrink(instanceId, "InstanceId", "json");
            this.putBodyParameter("InstanceId", instanceIdShrink);
            this.instanceId = instanceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1001121</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * UpStreamDepth.
         */
        public Builder upStreamDepth(Integer upStreamDepth) {
            this.putQueryParameter("UpStreamDepth", upStreamDepth);
            this.upStreamDepth = upStreamDepth;
            return this;
        }

        @Override
        public GetInstanceUpDownStreamRequest build() {
            return new GetInstanceUpDownStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceUpDownStreamRequest} extends {@link TeaModel}
     *
     * <p>GetInstanceUpDownStreamRequest</p>
     */
    public static class InstanceId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private InstanceId(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceId create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 

            private Builder() {
            } 

            private Builder(InstanceId model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
            } 

            /**
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_123456</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public InstanceId build() {
                return new InstanceId(this);
            } 

        } 

    }
}
