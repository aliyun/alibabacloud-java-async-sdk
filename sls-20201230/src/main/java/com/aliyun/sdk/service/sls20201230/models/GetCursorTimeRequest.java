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
 * {@link GetCursorTimeRequest} extends {@link RequestModel}
 *
 * <p>GetCursorTimeRequest</p>
 */
public class GetCursorTimeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("cursor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cursor;

    private GetCursorTimeRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shardId = builder.shardId;
        this.cursor = builder.cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCursorTimeRequest create() {
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
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    public static final class Builder extends Request.Builder<GetCursorTimeRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer shardId; 
        private String cursor; 

        private Builder() {
            super();
        } 

        private Builder(GetCursorTimeRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shardId = request.shardId;
            this.cursor = request.cursor;
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
         * <p>test-logstore</p>
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
         * <p>0</p>
         */
        public Builder shardId(Integer shardId) {
            this.putPathParameter("shardId", shardId);
            this.shardId = shardId;
            return this;
        }

        /**
         * <p>The cursor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTU0NzQ3MDY4MjM3NjUxMzQ0Ng==</p>
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        @Override
        public GetCursorTimeRequest build() {
            return new GetCursorTimeRequest(this);
        } 

    } 

}
