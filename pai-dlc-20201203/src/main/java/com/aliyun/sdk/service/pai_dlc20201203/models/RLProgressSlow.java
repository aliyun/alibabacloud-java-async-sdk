// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLProgressSlow} extends {@link TeaModel}
 *
 * <p>RLProgressSlow</p>
 */
public class RLProgressSlow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.List<RLProgressSlowDetail> details;

    @com.aliyun.core.annotation.NameInMap("Elapsed")
    private Double elapsed;

    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    private RLProgressSlow(Builder builder) {
        this.details = builder.details;
        this.elapsed = builder.elapsed;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressSlow create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public java.util.List<RLProgressSlowDetail> getDetails() {
        return this.details;
    }

    /**
     * @return elapsed
     */
    public Double getElapsed() {
        return this.elapsed;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder {
        private java.util.List<RLProgressSlowDetail> details; 
        private Double elapsed; 
        private Long time; 

        private Builder() {
        } 

        private Builder(RLProgressSlow model) {
            this.details = model.details;
            this.elapsed = model.elapsed;
            this.time = model.time;
        } 

        /**
         * <p>慢推理明细，最多 20 条</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Elapsed&quot;:42.5,&quot;Time&quot;:1787474487,&quot;Message&quot;:&quot;rollout generation slow&quot;,&quot;Rank&quot;:0,&quot;Pod&quot;:&quot;dlc193cpaitk8eny-master-0&quot;,&quot;WorkerPid&quot;:12345,&quot;Ip&quot;:&quot;192.168.0.12&quot;,&quot;Rid&quot;:&quot;req-8f3a2c1d&quot;,&quot;TokenizerPid&quot;:&quot;12360&quot;,&quot;Ipc&quot;:&quot;ipc://worker-0&quot;,&quot;IsPause&quot;:&quot;false&quot;,&quot;StatePresent&quot;:&quot;true&quot;,&quot;OutQueue&quot;:&quot;3&quot;}]</p>
         */
        public Builder details(java.util.List<RLProgressSlowDetail> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>最慢一条的已耗时（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>42.5</p>
         */
        public Builder elapsed(Double elapsed) {
            this.elapsed = elapsed;
            return this;
        }

        /**
         * <p>最慢一条的日志时间（unix 秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        public RLProgressSlow build() {
            return new RLProgressSlow(this);
        } 

    } 

}
