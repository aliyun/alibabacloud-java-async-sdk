// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourcesResponse</p>
 */
public class DescribeClusterResourcesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribeClusterResourcesResponseBody> body;

    private DescribeClusterResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeClusterResourcesResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<DescribeClusterResourcesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterResourcesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribeClusterResourcesResponseBody> body);

        @Override
        DescribeClusterResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterResourcesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribeClusterResourcesResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterResourcesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<DescribeClusterResourcesResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterResourcesResponse build() {
            return new DescribeClusterResourcesResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourcesResponse</p>
     */
    public static class Dependencies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        private Dependencies(Builder builder) {
            this.clusterId = builder.clusterId;
            this.resourceType = builder.resourceType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dependencies create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String clusterId; 
            private String resourceType; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(Dependencies model) {
                this.clusterId = model.clusterId;
                this.resourceType = model.resourceType;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The ID of the cluster to which the dependent resource is related.</p>
             * 
             * <strong>example:</strong>
             * <p>cc5ee03f63e43425cb6f71f1a1756****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The dependent resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::VPC::NatGateway</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The dependent resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-wz9sphwk42sdtjixo****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Dependencies build() {
                return new Dependencies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourcesResponse</p>
     */
    public static class AssociatedObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private AssociatedObject(Builder builder) {
            this.kind = builder.kind;
            this.namespace = builder.namespace;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedObject create() {
            return builder().build();
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String kind; 
            private String namespace; 
            private String name; 

            private Builder() {
            } 

            private Builder(AssociatedObject model) {
                this.kind = model.kind;
                this.namespace = model.namespace;
                this.name = model.name;
            } 

            /**
             * <p>The Kubernetes object type.</p>
             * 
             * <strong>example:</strong>
             * <p>Service</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The namespace in which the Kubernetes object resides.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The Kubernetes object name.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx-ingress-lb</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AssociatedObject build() {
                return new AssociatedObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourcesResponse</p>
     */
    public static class DeleteBehavior extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delete_by_default")
        private Boolean deleteByDefault;

        @com.aliyun.core.annotation.NameInMap("changeable")
        private Boolean changeable;

        private DeleteBehavior(Builder builder) {
            this.deleteByDefault = builder.deleteByDefault;
            this.changeable = builder.changeable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteBehavior create() {
            return builder().build();
        }

        /**
         * @return deleteByDefault
         */
        public Boolean getDeleteByDefault() {
            return this.deleteByDefault;
        }

        /**
         * @return changeable
         */
        public Boolean getChangeable() {
            return this.changeable;
        }

        public static final class Builder {
            private Boolean deleteByDefault; 
            private Boolean changeable; 

            private Builder() {
            } 

            private Builder(DeleteBehavior model) {
                this.deleteByDefault = model.deleteByDefault;
                this.changeable = model.changeable;
            } 

            /**
             * <p>Specifies whether to delete the resource by default when the cluster is deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deleteByDefault(Boolean deleteByDefault) {
                this.deleteByDefault = deleteByDefault;
                return this;
            }

            /**
             * <p>Specifies whether the default behavior returned in delete_by_default can be changed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder changeable(Boolean changeable) {
                this.changeable = changeable;
                return this;
            }

            public DeleteBehavior build() {
                return new DeleteBehavior(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
     *
     * <p>DescribeClusterResourcesResponse</p>
     */
    public static class DescribeClusterResourcesResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("resource_info")
        private String resourceInfo;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("auto_create")
        private Long autoCreate;

        @com.aliyun.core.annotation.NameInMap("dependencies")
        private java.util.List<Dependencies> dependencies;

        @com.aliyun.core.annotation.NameInMap("associated_object")
        private AssociatedObject associatedObject;

        @com.aliyun.core.annotation.NameInMap("delete_behavior")
        private DeleteBehavior deleteBehavior;

        @com.aliyun.core.annotation.NameInMap("creator_type")
        private String creatorType;

        @com.aliyun.core.annotation.NameInMap("extra_info")
        private java.util.Map<String, ?> extraInfo;

        private DescribeClusterResourcesResponseBody(Builder builder) {
            this.clusterId = builder.clusterId;
            this.created = builder.created;
            this.instanceId = builder.instanceId;
            this.resourceInfo = builder.resourceInfo;
            this.resourceType = builder.resourceType;
            this.state = builder.state;
            this.autoCreate = builder.autoCreate;
            this.dependencies = builder.dependencies;
            this.associatedObject = builder.associatedObject;
            this.deleteBehavior = builder.deleteBehavior;
            this.creatorType = builder.creatorType;
            this.extraInfo = builder.extraInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeClusterResourcesResponseBody create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resourceInfo
         */
        public String getResourceInfo() {
            return this.resourceInfo;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return autoCreate
         */
        public Long getAutoCreate() {
            return this.autoCreate;
        }

        /**
         * @return dependencies
         */
        public java.util.List<Dependencies> getDependencies() {
            return this.dependencies;
        }

        /**
         * @return associatedObject
         */
        public AssociatedObject getAssociatedObject() {
            return this.associatedObject;
        }

        /**
         * @return deleteBehavior
         */
        public DeleteBehavior getDeleteBehavior() {
            return this.deleteBehavior;
        }

        /**
         * @return creatorType
         */
        public String getCreatorType() {
            return this.creatorType;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map<String, ?> getExtraInfo() {
            return this.extraInfo;
        }

        public static final class Builder {
            private String clusterId; 
            private String created; 
            private String instanceId; 
            private String resourceInfo; 
            private String resourceType; 
            private String state; 
            private Long autoCreate; 
            private java.util.List<Dependencies> dependencies; 
            private AssociatedObject associatedObject; 
            private DeleteBehavior deleteBehavior; 
            private String creatorType; 
            private java.util.Map<String, ?> extraInfo; 

            private Builder() {
            } 

            private Builder(DescribeClusterResourcesResponseBody model) {
                this.clusterId = model.clusterId;
                this.created = model.created;
                this.instanceId = model.instanceId;
                this.resourceInfo = model.resourceInfo;
                this.resourceType = model.resourceType;
                this.state = model.state;
                this.autoCreate = model.autoCreate;
                this.dependencies = model.dependencies;
                this.associatedObject = model.associatedObject;
                this.deleteBehavior = model.deleteBehavior;
                this.creatorType = model.creatorType;
                this.extraInfo = model.extraInfo;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb95aa626a47740afbf6aa099b65****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-11T10:11:54+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-wz9poz4r0ymh8u0uf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The resource information. For more information about how to query the source information about the resource, see <a href="https://help.aliyun.com/document_detail/133836.html">ListStackResources</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Id&quot;:&quot;k8s_master_slb&quot;,&quot;Name&quot;:&quot;k8s_master_slb&quot;,&quot;Type&quot;:&quot;ALIYUN::SLB::LoadBalancer&quot;,&quot;Status&quot;:&quot;CREATE_COMPLETE&quot;,&quot;StatusReason&quot;:&quot;state changed&quot;,&quot;Updated&quot;:&quot;2020-05-21T13:25:02&quot;,&quot;PhysicalId&quot;:&quot;lb-wz9poz4r0ymh8u0uf****&quot;}</p>
             */
            public Builder resourceInfo(String resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::SLB::LoadBalancer</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The resource status. Valid values:</p>
             * <ul>
             * <li><code>CREATE_COMPLETE</code>: the resource is created.</li>
             * <li><code>CREATE_FAILED</code>: the resource failed to be created.</li>
             * <li><code>CREATE_IN_PROGRESS</code>: the resource is being created.</li>
             * <li><code>DELETE_FAILED</code>: the resource failed to be deleted.</li>
             * <li><code>DELETE_IN_PROGRESS</code>: the resource is being deleted.</li>
             * <li><code>ROLLBACK_COMPLETE</code>: the resource is rolled back.</li>
             * <li><code>ROLLBACK_FAILED</code>: the resource failed to be rolled back.</li>
             * <li><code>ROLLBACK_IN_PROGRESS</code>: the resource is being rolled back.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE_COMPLETE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Specifies whether the resource is created by Container Service for Kubernetes (ACK). Valid values:</p>
             * <ul>
             * <li>1: the resource is created by ACK.</li>
             * <li>0: the resource is an existing resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoCreate(Long autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * <p>The dependent resources.</p>
             */
            public Builder dependencies(java.util.List<Dependencies> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * <p>The Kubernetes object with which the resource is associated.</p>
             */
            public Builder associatedObject(AssociatedObject associatedObject) {
                this.associatedObject = associatedObject;
                return this;
            }

            /**
             * <p>The deletion behavior of the resource when the cluster is deleted.</p>
             */
            public Builder deleteBehavior(DeleteBehavior deleteBehavior) {
                this.deleteBehavior = deleteBehavior;
                return this;
            }

            /**
             * <p>The type of the resource creator. Valid values:</p>
             * <ul>
             * <li>user: The resource is created by the user.</li>
             * <li>system: The resource is created by the ACK management system.</li>
             * <li>addon: The resource is created by a cluster component.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addon</p>
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * <p>The additional information about the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;IP&quot;: &quot;xx.xx.xx.xx&quot;}</p>
             */
            public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            public DescribeClusterResourcesResponseBody build() {
                return new DescribeClusterResourcesResponseBody(this);
            } 

        } 

    }
}
