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
 * {@link DescribeClusterLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterLogsResponse</p>
 */
public class DescribeClusterLogsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribeClusterLogsResponseBody> body;

    private DescribeClusterLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
    public java.util.List<DescribeClusterLogsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterLogsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribeClusterLogsResponseBody> body);

        @Override
        DescribeClusterLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterLogsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribeClusterLogsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterLogsResponse response) {
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
        public Builder body(java.util.List<DescribeClusterLogsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterLogsResponse build() {
            return new DescribeClusterLogsResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterLogsResponse} extends {@link TeaModel}
     *
     * <p>DescribeClusterLogsResponse</p>
     */
    public static class DescribeClusterLogsResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ID")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cluster_log")
        private String clusterLog;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("updated")
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

            private Builder() {
            } 

            private Builder(DescribeClusterLogsResponseBody model) {
                this.id = model.id;
                this.clusterId = model.clusterId;
                this.clusterLog = model.clusterLog;
                this.created = model.created;
                this.updated = model.updated;
            } 

            /**
             * <p>The ID of the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>590749245</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c23421cfa74454bc8b37163fd19af***</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The log content.</p>
             * 
             * <strong>example:</strong>
             * <p>start to update cluster status to CREATE_COMPLETE</p>
             */
            public Builder clusterLog(String clusterLog) {
                this.clusterLog = clusterLog;
                return this;
            }

            /**
             * <p>The time when the log entry was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-11T10:11:51+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The time when the log entry was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-11T10:11:51+08:00</p>
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
