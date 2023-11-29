// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorTimeRequest} extends {@link RequestModel}
 *
 * <p>GetCursorTimeRequest</p>
 */
public class GetCursorTimeRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shardId")
    @Validation(required = true)
    private Integer shardId;

    @Query
    @NameInMap("cursor")
    @Validation(required = true)
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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The shard ID.
         */
        public Builder shardId(Integer shardId) {
            this.putPathParameter("shardId", shardId);
            this.shardId = shardId;
            return this;
        }

        /**
         * The cursor.
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
