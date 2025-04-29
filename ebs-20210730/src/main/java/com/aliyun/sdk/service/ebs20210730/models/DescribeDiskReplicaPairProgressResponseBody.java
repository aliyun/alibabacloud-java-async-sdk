// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskReplicaPairProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairProgressResponseBody</p>
 */
public class DescribeDiskReplicaPairProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RecoverPoint")
    private Long recoverPoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskReplicaPairProgressResponseBody(Builder builder) {
        this.progress = builder.progress;
        this.recoverPoint = builder.recoverPoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairProgressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return recoverPoint
     */
    public Long getRecoverPoint() {
        return this.recoverPoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer progress; 
        private Long recoverPoint; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiskReplicaPairProgressResponseBody model) {
            this.progress = model.progress;
            this.recoverPoint = model.recoverPoint;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The replication progress of the replication pair.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The timestamp that indicates the last recovery point in time. The value is returned only after the replication pair works for replicating data.</p>
         * 
         * <strong>example:</strong>
         * <p>1661917424</p>
         */
        public Builder recoverPoint(Long recoverPoint) {
            this.recoverPoint = recoverPoint;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskReplicaPairProgressResponseBody build() {
            return new DescribeDiskReplicaPairProgressResponseBody(this);
        } 

    } 

}
