// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReDeployLhDagVersionRequest} extends {@link RequestModel}
 *
 * <p>ReDeployLhDagVersionRequest</p>
 */
public class ReDeployLhDagVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagVersion")
    private Long dagVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ReDeployLhDagVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.dagVersion = builder.dagVersion;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReDeployLhDagVersionRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return dagVersion
     */
    public Long getDagVersion() {
        return this.dagVersion;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ReDeployLhDagVersionRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long dagVersion; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ReDeployLhDagVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.dagVersion = request.dagVersion;
            this.tid = request.tid;
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
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the ID of the task flow.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the task flow version. You can call the [ListDAGVersions](~~424682~~) operation to obtain the ID of the task flow version.
         */
        public Builder dagVersion(Long dagVersion) {
            this.putQueryParameter("DagVersion", dagVersion);
            this.dagVersion = dagVersion;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the ID of the tenant.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ReDeployLhDagVersionRequest build() {
            return new ReDeployLhDagVersionRequest(this);
        } 

    } 

}
