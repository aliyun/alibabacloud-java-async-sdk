// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateCheckPointRequest} extends {@link RequestModel}
 *
 * <p>UpdateCheckPointRequest</p>
 */
public class UpdateCheckPointRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("consumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @Body
    @NameInMap("checkpoint")
    @Validation(required = true)
    private String checkpoint;

    @Body
    @NameInMap("shard")
    @Validation(required = true)
    private Integer shard;

    @Query
    @NameInMap("consumer")
    private String consumer;

    @Query
    @NameInMap("forceSuccess")
    private Boolean forceSuccess;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private UpdateCheckPointRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.checkpoint = builder.checkpoint;
        this.shard = builder.shard;
        this.consumer = builder.consumer;
        this.forceSuccess = builder.forceSuccess;
        this.project = builder.project;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCheckPointRequest create() {
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
     * @return consumerGroup
     */
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    /**
     * @return consumer
     */
    public String getConsumer() {
        return this.consumer;
    }

    /**
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return this.forceSuccess;
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

    public static final class Builder extends Request.Builder<UpdateCheckPointRequest, Builder> {
        private String logstore; 
        private String consumerGroup; 
        private String checkpoint; 
        private Integer shard; 
        private String consumer; 
        private Boolean forceSuccess; 
        private String project; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCheckPointRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.checkpoint = request.checkpoint;
            this.shard = request.shard;
            this.consumer = request.consumer;
            this.forceSuccess = request.forceSuccess;
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
         * ??????????????????
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * checkpoint??????
         */
        public Builder checkpoint(String checkpoint) {
            this.putBodyParameter("checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * shard ??? id???
         */
        public Builder shard(Integer shard) {
            this.putBodyParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * ????????????
         */
        public Builder consumer(String consumer) {
            this.putQueryParameter("consumer", consumer);
            this.consumer = consumer;
            return this;
        }

        /**
         * ???????????????????????????????????????forceSuccess???true????????????checkpoint???
         */
        public Builder forceSuccess(Boolean forceSuccess) {
            this.putQueryParameter("forceSuccess", forceSuccess);
            this.forceSuccess = forceSuccess;
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
         * ????????? checkpoint???
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateCheckPointRequest build() {
            return new UpdateCheckPointRequest(this);
        } 

    } 

}
