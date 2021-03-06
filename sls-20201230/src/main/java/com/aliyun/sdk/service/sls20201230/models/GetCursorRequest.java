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

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private GetCursorRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.shardId = builder.shardId;
        this.from = builder.from;
        this.project = builder.project;
        this.type = builder.type;
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetCursorRequest, Builder> {
        private String logstore; 
        private Integer shardId; 
        private String from; 
        private String project; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetCursorRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.shardId = request.shardId;
            this.from = request.from;
            this.project = request.project;
            this.type = request.type;
        } 

        /**
         * logstore ?????????
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * shard id???
         */
        public Builder shardId(Integer shardId) {
            this.putPathParameter("shardId", shardId);
            this.shardId = shardId;
            return this;
        }

        /**
         * ????????????Unix???????????????????????????begin???end???
         */
        public Builder from(String from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * project ?????????
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * ??????????????? cursor???
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetCursorRequest build() {
            return new GetCursorRequest(this);
        } 

    } 

}
