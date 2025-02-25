// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link PullLogsRequest} extends {@link RequestModel}
 *
 * <p>PullLogsRequest</p>
 */
public class PullLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("project")
    @com.aliyun.core.annotation.Validation(required = true)
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStore;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("shardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Accept-Encoding")
    private String acceptEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("count")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cursor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("end_cursor")
    private String endCursor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private PullLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logStore = builder.logStore;
        this.shardId = builder.shardId;
        this.acceptEncoding = builder.acceptEncoding;
        this.count = builder.count;
        this.cursor = builder.cursor;
        this.endCursor = builder.endCursor;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return shardId
     */
    public Integer getShardId() {
        return this.shardId;
    }

    /**
     * @return acceptEncoding
     */
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return endCursor
     */
    public String getEndCursor() {
        return this.endCursor;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<PullLogsRequest, Builder> {
        private String project; 
        private String logStore; 
        private Integer shardId; 
        private String acceptEncoding; 
        private Integer count; 
        private String cursor; 
        private String endCursor; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(PullLogsRequest request) {
            super(request);
            this.project = request.project;
            this.logStore = request.logStore;
            this.shardId = request.shardId;
            this.acceptEncoding = request.acceptEncoding;
            this.count = request.count;
            this.cursor = request.cursor;
            this.endCursor = request.endCursor;
            this.query = request.query;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putPathParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logStore(String logStore) {
            this.putPathParameter("logStore", logStore);
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder shardId(Integer shardId) {
            this.putPathParameter("shardId", shardId);
            this.shardId = shardId;
            return this;
        }

        /**
         * Accept-Encoding.
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder count(Integer count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTQ0NzMyOTQwMTEwMjEzMDkwNA</p>
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * end_cursor.
         */
        public Builder endCursor(String endCursor) {
            this.putQueryParameter("end_cursor", endCursor);
            this.endCursor = endCursor;
            return this;
        }

        /**
         * <p>The SPL statement that is used to filter data. For more information, see <a href="https://help.aliyun.com/document_detail/2536530.html">SPL instructions</a>.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| where userId=&quot;123&quot;</li>
         * </ul>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public PullLogsRequest build() {
            return new PullLogsRequest(this);
        } 

    } 

}
