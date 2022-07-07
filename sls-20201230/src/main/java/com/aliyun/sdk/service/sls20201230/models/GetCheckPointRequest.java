// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCheckPointRequest} extends {@link RequestModel}
 *
 * <p>GetCheckPointRequest</p>
 */
public class GetCheckPointRequest extends Request {
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("consumerGroup")
    @Validation(required = true)
    private String consumerGroup;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("shard")
    private Integer shard;

    private GetCheckPointRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.consumerGroup = builder.consumerGroup;
        this.project = builder.project;
        this.shard = builder.shard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckPointRequest create() {
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
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    public static final class Builder extends Request.Builder<GetCheckPointRequest, Builder> {
        private String logstore; 
        private String consumerGroup; 
        private String project; 
        private Integer shard; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckPointRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.consumerGroup = request.consumerGroup;
            this.project = request.project;
            this.shard = request.shard;
        } 

        /**
         * logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 消费组名称。
         */
        public Builder consumerGroup(String consumerGroup) {
            this.putPathParameter("consumerGroup", consumerGroup);
            this.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * Shard ID。
         * <p>
         * 如果指定的Shard不存在，则返回空列表。
         * 如果不指定Shard，则返回所有Shard的checkpoint。
         */
        public Builder shard(Integer shard) {
            this.putQueryParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        @Override
        public GetCheckPointRequest build() {
            return new GetCheckPointRequest(this);
        } 

    } 

}
