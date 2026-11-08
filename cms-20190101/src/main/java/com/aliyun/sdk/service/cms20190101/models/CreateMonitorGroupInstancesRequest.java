// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link CreateMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupInstancesRequest</p>
 */
public class CreateMonitorGroupInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instances> instances;

    private CreateMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.groupId = builder.groupId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupInstancesRequest, Builder> {
        private String clientToken; 
        private String dryRun; 
        private String groupId; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.groupId = request.groupId;
            this.instances = request.instances;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to only perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. A check request is sent, and no security group is bound to the instance. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public CreateMonitorGroupInstancesRequest build() {
            return new CreateMonitorGroupInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMonitorGroupInstancesRequest} extends {@link TeaModel}
     *
     * <p>CreateMonitorGroupInstancesRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        private Instances(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.category = model.category;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
             * <p>For more information about how to obtain the abbreviation of the Alibaba Cloud service name, see the <code>metricCategory</code> field in the <code>Labels</code> response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze26xj5wwy12****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-instance-ecs</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region where the instance resides.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
