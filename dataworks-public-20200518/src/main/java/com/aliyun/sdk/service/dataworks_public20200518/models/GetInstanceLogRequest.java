// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetInstanceLogRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceLogRequest</p>
 */
public class GetInstanceLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceHistoryId")
    private Long instanceHistoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    private GetInstanceLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceHistoryId = builder.instanceHistoryId;
        this.instanceId = builder.instanceId;
        this.projectEnv = builder.projectEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceLogRequest create() {
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
     * @return instanceHistoryId
     */
    public Long getInstanceHistoryId() {
        return this.instanceHistoryId;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public static final class Builder extends Request.Builder<GetInstanceLogRequest, Builder> {
        private String regionId; 
        private Long instanceHistoryId; 
        private Long instanceId; 
        private String projectEnv; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceHistoryId = request.instanceHistoryId;
            this.instanceId = request.instanceId;
            this.projectEnv = request.projectEnv;
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
         * <p>The historical record number of the instance. You can call the ListInstanceHistory operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceHistoryId(Long instanceHistoryId) {
            this.putBodyParameter("InstanceHistoryId", instanceHistoryId);
            this.instanceHistoryId = instanceHistoryId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        @Override
        public GetInstanceLogRequest build() {
            return new GetInstanceLogRequest(this);
        } 

    } 

}
