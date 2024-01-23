// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceEndpointRequest</p>
 */
public class ListInstanceEndpointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("Summary")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the module that you want to access. Valid values:
         * <p>
         * 
         * *   `Registry`: the image repository.
         * *   `Chart`: a Helm chart.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * Summary.
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
