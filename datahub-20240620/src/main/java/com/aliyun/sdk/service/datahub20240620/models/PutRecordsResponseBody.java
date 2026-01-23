// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link PutRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>PutRecordsResponseBody</p>
 */
public class PutRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShardId")
    private String shardId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PutRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.shardId = builder.shardId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shardId
     */
    public String getShardId() {
        return this.shardId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String shardId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PutRecordsResponseBody model) {
            this.requestId = model.requestId;
            this.shardId = model.shardId;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShardId.
         */
        public Builder shardId(String shardId) {
            this.shardId = shardId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutRecordsResponseBody build() {
            return new PutRecordsResponseBody(this);
        } 

    } 

}
