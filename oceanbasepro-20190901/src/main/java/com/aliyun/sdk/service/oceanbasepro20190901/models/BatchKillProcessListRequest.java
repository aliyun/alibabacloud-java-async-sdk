// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link BatchKillProcessListRequest} extends {@link RequestModel}
 *
 * <p>BatchKillProcessListRequest</p>
 */
public class BatchKillProcessListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ByObSessionId")
    private Boolean byObSessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private BatchKillProcessListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.byObSessionId = builder.byObSessionId;
        this.instanceId = builder.instanceId;
        this.sessionList = builder.sessionList;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchKillProcessListRequest create() {
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
     * @return byObSessionId
     */
    public Boolean getByObSessionId() {
        return this.byObSessionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sessionList
     */
    public String getSessionList() {
        return this.sessionList;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<BatchKillProcessListRequest, Builder> {
        private String regionId; 
        private Boolean byObSessionId; 
        private String instanceId; 
        private String sessionList; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(BatchKillProcessListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.byObSessionId = request.byObSessionId;
            this.instanceId = request.instanceId;
            this.sessionList = request.sessionList;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ByObSessionId.
         */
        public Builder byObSessionId(Boolean byObSessionId) {
            this.putBodyParameter("ByObSessionId", byObSessionId);
            this.byObSessionId = byObSessionId;
            return this;
        }

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of sessions to close.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProxySessId&quot;:&quot;752113700739156671&quot;,&quot;SessionId&quot;:3221555062,&quot;ServerIp&quot;:&quot;10.<em><strong>.</strong>.</em>**&quot;}]</p>
         */
        public Builder sessionList(String sessionList) {
            this.putBodyParameter("SessionList", sessionList);
            this.sessionList = sessionList;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t33h8y08k****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public BatchKillProcessListRequest build() {
            return new BatchKillProcessListRequest(this);
        } 

    } 

}
