// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReRunTaskFlowInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReRunTaskFlowInstanceRequest</p>
 */
public class ReRunTaskFlowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagVersion")
    private String dagVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ReRunTaskFlowInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.dagInstanceId = builder.dagInstanceId;
        this.dagVersion = builder.dagVersion;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReRunTaskFlowInstanceRequest create() {
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
     * @return dagInstanceId
     */
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    /**
     * @return dagVersion
     */
    public String getDagVersion() {
        return this.dagVersion;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ReRunTaskFlowInstanceRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long dagInstanceId; 
        private String dagVersion; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ReRunTaskFlowInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.dagInstanceId = request.dagInstanceId;
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
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the execution record of the task flow. You can call the [ListTaskFlowInstance](~~424689~~) operation to query the execution record ID.
         */
        public Builder dagInstanceId(Long dagInstanceId) {
            this.putQueryParameter("DagInstanceId", dagInstanceId);
            this.dagInstanceId = dagInstanceId;
            return this;
        }

        /**
         * The version number of the task flow. You can call the ListTaskFlowVersions operation to query the version number of the task flow.
         */
        public Builder dagVersion(String dagVersion) {
            this.putQueryParameter("DagVersion", dagVersion);
            this.dagVersion = dagVersion;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ReRunTaskFlowInstanceRequest build() {
            return new ReRunTaskFlowInstanceRequest(this);
        } 

    } 

}
