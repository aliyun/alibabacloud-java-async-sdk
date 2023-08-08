// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterLogsResponse</p>
 */
public class DescribeClusterLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < DescribeClusterLogsResponseBody> body;

    private DescribeClusterLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterLogsResponse create() {
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
    public java.util.List < DescribeClusterLogsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(java.util.List < DescribeClusterLogsResponseBody> body);

        @Override
        DescribeClusterLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private java.util.List < DescribeClusterLogsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterLogsResponse response) {
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
        public Builder body(java.util.List < DescribeClusterLogsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterLogsResponse build() {
            return new DescribeClusterLogsResponse(this);
        } 

    } 

    public static class DescribeClusterLogsResponseBody extends TeaModel {
        @NameInMap("ID")
        private Long id;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("cluster_log")
        private String clusterLog;

        @NameInMap("created")
        private String created;

        @NameInMap("updated")
        private String updated;

        private DescribeClusterLogsResponseBody(Builder builder) {
            this.id = builder.id;
            this.clusterId = builder.clusterId;
            this.clusterLog = builder.clusterLog;
            this.created = builder.created;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeClusterLogsResponseBody create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterLog
         */
        public String getClusterLog() {
            return this.clusterLog;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Long id; 
            private String clusterId; 
            private String clusterLog; 
            private String created; 
            private String updated; 

            /**
             * ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * cluster_log.
             */
            public Builder clusterLog(String clusterLog) {
                this.clusterLog = clusterLog;
                return this;
            }

            /**
             * created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public DescribeClusterLogsResponseBody build() {
                return new DescribeClusterLogsResponseBody(this);
            } 

        } 

    }
}
