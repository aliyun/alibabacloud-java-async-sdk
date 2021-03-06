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
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeClusterResourcesResponseBody> body;

    private DescribeClusterResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public java.util.List < DescribeClusterResourcesResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeClusterResourcesResponseBody> body);

        @Override
        DescribeClusterResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeClusterResourcesResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterResourcesResponse response) {
            super(response);
            this.headers = response.headers;
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

        private DescribeClusterResourcesResponseBody(Builder builder) {
            this.clusterId = builder.clusterId;
            this.created = builder.created;
            this.instanceId = builder.instanceId;
            this.resourceInfo = builder.resourceInfo;
            this.resourceType = builder.resourceType;
            this.state = builder.state;
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

        public static final class Builder {
            private String clusterId; 
            private String created; 
            private String instanceId; 
            private String resourceInfo; 
            private String resourceType; 
            private String state; 

            /**
             * ??????ID???
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ?????????????????????
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * ??????ID???
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ???????????????????????????????????????????????????[ListStackResources](~~133836~~)???
             */
            public Builder resourceInfo(String resourceInfo) {
                this.resourceInfo = resourceInfo;
                return this;
            }

            /**
             * ???????????????
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ???????????????????????????
             * <p>
             * 
             * - `CREATE_COMPLETE`????????????????????????
             * - `CREATE_FAILED`????????????????????????
             * - `CREATE_IN_PROGRESS`?????????????????????
             * - `DELETE_FAILED`????????????????????????
             * - `DELETE_IN_PROGRESS`?????????????????????
             * - `ROLLBACK_COMPLETE`??????????????????
             * - `ROLLBACK_FAILED`??????????????????
             * - `ROLLBACK_IN_PROGRESS`???????????????
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public DescribeClusterResourcesResponseBody build() {
                return new DescribeClusterResourcesResponseBody(this);
            } 

        } 

    }
}
