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
 * {@link GetCursorRequest} extends {@link RequestModel}
 *
 * <p>GetCursorRequest</p>
 */
public class GetCursorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("shardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    private GetCursorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shardId = builder.shardId;
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCursorRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return shardId
     */
    public Integer getShardId() {
        return this.shardId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<GetCursorRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer shardId; 
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(GetCursorRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shardId = request.shardId;
            this.from = request.from;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The shard ID.</p>
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
         * <p>The point in time that you want to use to query a cursor. Set the value to a UNIX timestamp or a string such as <code>begin</code> and <code>end</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>begin</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        @Override
        public GetCursorRequest build() {
            return new GetCursorRequest(this);
        } 

    } 

}
