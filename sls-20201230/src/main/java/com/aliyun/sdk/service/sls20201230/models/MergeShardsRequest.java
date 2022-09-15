// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link MergeShardsRequest} extends {@link RequestModel}
 *
 * <p>MergeShardsRequest</p>
 */
public class MergeShardsRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shardID")
    @Validation(required = true)
    private Integer shardID;

    @Query
    @NameInMap("action")
    @Validation(required = true)
    private String action;

    private MergeShardsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shardID = builder.shardID;
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeShardsRequest create() {
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
     * @return shardID
     */
    public Integer getShardID() {
        return this.shardID;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder extends Request.Builder<MergeShardsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer shardID; 
        private String action; 

        private Builder() {
            super();
        } 

        private Builder(MergeShardsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shardID = request.shardID;
            this.action = request.action;
        } 

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * Logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 必须是readwrite状态的 shard，且其下一个相邻的 shard 也必须是 readwrite。
         */
        public Builder shardID(Integer shardID) {
            this.putPathParameter("shardID", shardID);
            this.shardID = shardID;
            return this;
        }

        /**
         * 固定为 merge。
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        @Override
        public MergeShardsRequest build() {
            return new MergeShardsRequest(this);
        } 

    } 

}
