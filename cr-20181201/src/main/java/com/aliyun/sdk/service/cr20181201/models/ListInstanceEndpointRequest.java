// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceEndpointRequest</p>
 */
public class ListInstanceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summary")
    private Boolean summary;

    private ListInstanceEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.moduleName = builder.moduleName;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceEndpointRequest create() {
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
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return summary
     */
    public Boolean getSummary() {
        return this.summary;
    }

    public static final class Builder extends Request.Builder<ListInstanceEndpointRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String moduleName; 
        private Boolean summary; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.moduleName = request.moduleName;
            this.summary = request.summary;
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-kmsiwlxxdcva****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the module that you want to access. Valid values:</p>
         * <ul>
         * <li><code>Registry</code>: image repositories.</li>
         * <li><code>Chart</code>: Helm charts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Chart</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>Specify whether to return endpoints in simple mode. If yes, no access control information about the endpoint is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder summary(Boolean summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        @Override
        public ListInstanceEndpointRequest build() {
            return new ListInstanceEndpointRequest(this);
        } 

    } 

}
