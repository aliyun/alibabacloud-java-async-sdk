// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourcesResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterResourcesResponse</p>
 */
public class DescribeClusterResourcesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private java.util.List < DescribeClusterResourcesResponseBody> body;

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
    public java.util.Map < String, String > getHeaders() {
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
    public java.util.List < DescribeClusterResourcesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DescribeClusterResourcesResponseBody> body);

        @Override
        DescribeClusterResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DescribeClusterResourcesResponseBody> body; 

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
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(java.util.List < DescribeClusterResourcesResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterResourcesResponse build() {
            return new DescribeClusterResourcesResponse(this);
        } 

    } 

    public static class Dependencies extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("resource_type")
        private String resourceType;

        @NameInMap("instance_id")
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

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * resource_type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * instance_id.
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
    public static class AssociatedObject extends TeaModel {
        @NameInMap("kind")
        private String kind;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("name")
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

            /**
             * kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * name.
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
    public static class DeleteBehavior extends TeaModel {
        @NameInMap("delete_by_default")
        private Boolean deleteByDefault;

        @NameInMap("changeable")
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

            /**
             * delete_by_default.
             */
            public Builder deleteByDefault(Boolean deleteByDefault) {
                this.deleteByDefault = deleteByDefault;
                return this;
            }

            /**
             * changeable.
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
    public static class DescribeClusterResourcesResponseBody extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("created")
        private String created;

        @NameInMap("instance_id")
        private String instanceId;

        @NameInMap("resource_info")
        private String resourceInfo;

        @NameInMap("resource_type")
        private String resourceType;

        @NameInMap("state")
        private String state;

        @NameInMap("auto_create")
        private Long autoCreate;

        @NameInMap("dependencies")
        private java.util.List < Dependencies> dependencies;

        @NameInMap("associated_object")
        private AssociatedObject associatedObject;

        @NameInMap("delete_behavior")
        private DeleteBehavior deleteBehavior;

        @NameInMap("creator_type")
        private String creatorType;

        @NameInMap("extra_info")
        private java.util.Map < String, ? > extraInfo;

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
        public java.util.List < Dependencies> getDependencies() {
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
        public java.util.Map < String, ? > getExtraInfo() {
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
            private java.util.List < Dependencies> dependencies; 
            private AssociatedObject associatedObject; 
            private DeleteBehavior deleteBehavior; 
            private String creatorType; 
            private java.util.Map < String, ? > extraInfo; 

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The time when the resource was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The information about the resource. For more information about how to query the source information about a resource, see [ListStackResources](~~133836~~).
             */
            public Builder resourceInfo(String resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The resource status. Valid values:
             * <p>
             * 
             * *   `CREATE_COMPLETE`: The resource is created.
             * *   `CREATE_FAILED`: The resource failed to be created.
             * *   `CREATE_IN_PROGRESS`: The resource is being created.
             * *   `DELETE_FAILED`: The resource failed to be deleted.
             * *   `DELETE_IN_PROGRESS`: The resource is being deleted.
             * *   `ROLLBACK_COMPLETE`: The resource is rolled back.
             * *   `ROLLBACK_FAILED`: The resource failed to be rolled back.
             * *   `ROLLBACK_IN_PROGRESS`: The resource is being rolled back.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Indicates whether the resource is created by Container Service for Kubernetes (ACK). Valid values:
             * <p>
             * 
             * *   1: The resource is created by ACK.
             * *   0: The resource is an existing resource.
             */
            public Builder autoCreate(Long autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * dependencies.
             */
            public Builder dependencies(java.util.List < Dependencies> dependencies) {
                this.dependencies = dependencies;
                return this;
            }

            /**
             * associated_object.
             */
            public Builder associatedObject(AssociatedObject associatedObject) {
                this.associatedObject = associatedObject;
                return this;
            }

            /**
             * delete_behavior.
             */
            public Builder deleteBehavior(DeleteBehavior deleteBehavior) {
                this.deleteBehavior = deleteBehavior;
                return this;
            }

            /**
             * creator_type.
             */
            public Builder creatorType(String creatorType) {
                this.creatorType = creatorType;
                return this;
            }

            /**
             * extra_info.
             */
            public Builder extraInfo(java.util.Map < String, ? > extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            public DescribeClusterResourcesResponseBody build() {
                return new DescribeClusterResourcesResponseBody(this);
            } 

        } 

    }
}
