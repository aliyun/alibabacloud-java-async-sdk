// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link SplitShardRequest} extends {@link RequestModel}
 *
 * <p>SplitShardRequest</p>
 */
public class SplitShardRequest extends Request {
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

    @Query
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("shardCount")
    private Integer shardCount;

    private SplitShardRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.shardID = builder.shardID;
        this.action = builder.action;
        this.key = builder.key;
        this.project = builder.project;
        this.shardCount = builder.shardCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SplitShardRequest create() {
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

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
    }

    public static final class Builder extends Request.Builder<SplitShardRequest, Builder> {
        private String logstore; 
        private Integer shardID; 
        private String action; 
        private String key; 
        private String project; 
        private Integer shardCount; 

        private Builder() {
            super();
        } 

        private Builder(SplitShardRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.shardID = request.shardID;
            this.action = request.action;
            this.key = request.key;
            this.project = request.project;
            this.shardCount = request.shardCount;
        } 

        /**
         * Logstore ?????????
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * ??????????????? readwrite ????????? shard ??? id???
         */
        public Builder shardID(Integer shardID) {
            this.putPathParameter("shardID", shardID);
            this.shardID = shardID;
            return this;
        }

        /**
         * ??????????????? split???
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder key(String key) {
            this.putQueryParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * Project ?????????
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * ??????????????? shard ?????????????????? 2???
         */
        public Builder shardCount(Integer shardCount) {
            this.putQueryParameter("shardCount", shardCount);
            this.shardCount = shardCount;
            return this;
        }

        @Override
        public SplitShardRequest build() {
            return new SplitShardRequest(this);
        } 

    } 

}
