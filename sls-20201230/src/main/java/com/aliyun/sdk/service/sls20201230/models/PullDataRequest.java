// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PullDataRequest} extends {@link RequestModel}
 *
 * <p>PullDataRequest</p>
 */
public class PullDataRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shard")
    @Validation(required = true)
    private String shard;

    @Query
    @NameInMap("count")
    @Validation(required = true)
    private String count;

    @Query
    @NameInMap("cursor")
    @Validation(required = true)
    private String cursor;

    @Query
    @NameInMap("endCursor")
    private String endCursor;

    private PullDataRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shard = builder.shard;
        this.count = builder.count;
        this.cursor = builder.cursor;
        this.endCursor = builder.endCursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullDataRequest create() {
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
     * @return shard
     */
    public String getShard() {
        return this.shard;
    }

    /**
     * @return count
     */
    public String getCount() {
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

    public static final class Builder extends Request.Builder<PullDataRequest, Builder> {
        private String project; 
        private String logstore; 
        private String shard; 
        private String count; 
        private String cursor; 
        private String endCursor; 

        private Builder() {
            super();
        } 

        private Builder(PullDataRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shard = request.shard;
            this.count = request.count;
            this.cursor = request.cursor;
            this.endCursor = request.endCursor;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * Shard ID。
         */
        public Builder shard(String shard) {
            this.putPathParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * count.
         */
        public Builder count(String count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * cursor.
         */
        public Builder cursor(String cursor) {
            this.putQueryParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * endCursor.
         */
        public Builder endCursor(String endCursor) {
            this.putQueryParameter("endCursor", endCursor);
            this.endCursor = endCursor;
            return this;
        }

        @Override
        public PullDataRequest build() {
            return new PullDataRequest(this);
        } 

    } 

}
