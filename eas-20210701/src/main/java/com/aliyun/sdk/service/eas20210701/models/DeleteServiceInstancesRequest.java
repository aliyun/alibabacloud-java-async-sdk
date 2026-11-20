// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
    private String instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReplica")
    private Boolean isReplica;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftRestart")
    private Boolean softRestart;

    private DeleteServiceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.container = builder.container;
        this.instanceList = builder.instanceList;
        this.isReplica = builder.isReplica;
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
     * @return isReplica
     */
    public Boolean getIsReplica() {
        return this.isReplica;
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
        private Boolean isReplica; 
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
            this.isReplica = request.isReplica;
            this.softRestart = request.softRestart;
        } 

        /**
         * <p>The region where the service is located.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the service. For more information, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the container in which to restart the process. This parameter is valid only when \<code>SoftRestart\\</code> is set to \<code>true\\</code>.</p>
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
         * <p>The instances to restart. Separate multiple instance names with a comma (,). For more information, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
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
         * <p>Specifies whether the instance is a replica.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isReplica(Boolean isReplica) {
            this.putQueryParameter("IsReplica", isReplica);
            this.isReplica = isReplica;
            return this;
        }

        /**
         * <p>Specifies whether to restart only the container process without rebuilding the instance. The default value is false.</p>
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
