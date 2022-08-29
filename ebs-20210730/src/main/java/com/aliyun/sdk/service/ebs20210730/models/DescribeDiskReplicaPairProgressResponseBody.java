// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairProgressResponseBody</p>
 */
public class DescribeDiskReplicaPairProgressResponseBody extends TeaModel {
    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RecoverPoint")
    private Long recoverPoint;

    @NameInMap("RequestId")
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

        /**
         * 同步进度
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * 最近一次恢复点的时间戳。有条件返回，复制对start后，才会返回该字段。
         */
        public Builder recoverPoint(Long recoverPoint) {
            this.recoverPoint = recoverPoint;
            return this;
        }

        /**
         * RequestId.
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
