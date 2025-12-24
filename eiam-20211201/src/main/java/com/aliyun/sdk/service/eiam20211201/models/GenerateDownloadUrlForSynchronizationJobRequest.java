// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateDownloadUrlForSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>GenerateDownloadUrlForSynchronizationJobRequest</p>
 */
public class GenerateDownloadUrlForSynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String synchronizationJobId;

    private GenerateDownloadUrlForSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDownloadUrlForSynchronizationJobRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder extends Request.Builder<GenerateDownloadUrlForSynchronizationJobRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDownloadUrlForSynchronizationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.synchronizationJobId = request.synchronizationJobId;
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
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>同步任务ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_000036q9p3jd5s18boeo2dvmmanu2086vxxxx</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public GenerateDownloadUrlForSynchronizationJobRequest build() {
            return new GenerateDownloadUrlForSynchronizationJobRequest(this);
        } 

    } 

}
