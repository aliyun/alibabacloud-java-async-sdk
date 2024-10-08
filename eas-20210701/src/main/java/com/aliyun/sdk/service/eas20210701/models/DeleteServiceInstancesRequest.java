// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteServiceInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceInstancesRequest</p>
 */
public class DeleteServiceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Container")
    private String container;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftRestart")
    private Boolean softRestart;

    private DeleteServiceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.container = builder.container;
        this.instanceList = builder.instanceList;
        this.softRestart = builder.softRestart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return container
     */
    public String getContainer() {
        return this.container;
    }

    /**
     * @return instanceList
     */
    public String getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return softRestart
     */
    public Boolean getSoftRestart() {
        return this.softRestart;
    }

    public static final class Builder extends Request.Builder<DeleteServiceInstancesRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String container; 
        private String instanceList; 
        private Boolean softRestart; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.container = request.container;
            this.instanceList = request.instanceList;
            this.softRestart = request.softRestart;
        } 

        /**
         * <p>The ID of the region where the service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="~~412109~~">ListServices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the container whose process needs to be restarted. This parameter takes effect only if the SoftRestart parameter is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>worker0</p>
         */
        public Builder container(String container) {
            this.putQueryParameter("Container", container);
            this.container = container;
            return this;
        }

        /**
         * <p>The instances that you want to restart. Separate multiple instance names with commas (,). For more information about how to query the instance name, see <a href="~~412108~~">ListServiceInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>foo-rdsbxxxx,foo-rdsaxxxx</p>
         */
        public Builder instanceList(String instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>Specifies whether to restart only the container process without recreating the instance. Default value: false. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder softRestart(Boolean softRestart) {
            this.putQueryParameter("SoftRestart", softRestart);
            this.softRestart = softRestart;
            return this;
        }

        @Override
        public DeleteServiceInstancesRequest build() {
            return new DeleteServiceInstancesRequest(this);
        } 

    } 

}
