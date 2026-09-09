// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeComfyTaskWaitingQueueRequest} extends {@link RequestModel}
 *
 * <p>DescribeComfyTaskWaitingQueueRequest</p>
 */
public class DescribeComfyTaskWaitingQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiveId")
    private String hiveId;

    private DescribeComfyTaskWaitingQueueRequest(Builder builder) {
        super(builder);
        this.hiveId = builder.hiveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyTaskWaitingQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hiveId
     */
    public String getHiveId() {
        return this.hiveId;
    }

    public static final class Builder extends Request.Builder<DescribeComfyTaskWaitingQueueRequest, Builder> {
        private String hiveId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComfyTaskWaitingQueueRequest request) {
            super(request);
            this.hiveId = request.hiveId;
        } 

        /**
         * <p>The waiting queue information of a specified Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-26cd567b35c04a0a90f0xxxxx</p>
         */
        public Builder hiveId(String hiveId) {
            this.putQueryParameter("HiveId", hiveId);
            this.hiveId = hiveId;
            return this;
        }

        @Override
        public DescribeComfyTaskWaitingQueueRequest build() {
            return new DescribeComfyTaskWaitingQueueRequest(this);
        } 

    } 

}
