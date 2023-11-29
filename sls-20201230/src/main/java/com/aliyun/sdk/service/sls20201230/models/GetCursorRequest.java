// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorRequest} extends {@link RequestModel}
 *
 * <p>GetCursorRequest</p>
 */
public class GetCursorRequest extends Request {
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
    @NameInMap("from")
    @Validation(required = true)
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
         * The point in time that you want to use to query a cursor. Set the value to a UNIX timestamp or a string such as `begin` and `end`.
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
