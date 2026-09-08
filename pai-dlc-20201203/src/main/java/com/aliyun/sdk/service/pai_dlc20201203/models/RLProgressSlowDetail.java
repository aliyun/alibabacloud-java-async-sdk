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
 * {@link RLProgressSlowDetail} extends {@link TeaModel}
 *
 * <p>RLProgressSlowDetail</p>
 */
public class RLProgressSlowDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Elapsed")
    private Double elapsed;

    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.NameInMap("Ipc")
    private String ipc;

    @com.aliyun.core.annotation.NameInMap("IsPause")
    private String isPause;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OutQueue")
    private String outQueue;

    @com.aliyun.core.annotation.NameInMap("Pod")
    private String pod;

    @com.aliyun.core.annotation.NameInMap("Rank")
    private Integer rank;

    @com.aliyun.core.annotation.NameInMap("Rid")
    private String rid;

    @com.aliyun.core.annotation.NameInMap("StatePresent")
    private String statePresent;

    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("TokenizerPid")
    private String tokenizerPid;

    @com.aliyun.core.annotation.NameInMap("WorkerPid")
    private Integer workerPid;

    private RLProgressSlowDetail(Builder builder) {
        this.elapsed = builder.elapsed;
        this.ip = builder.ip;
        this.ipc = builder.ipc;
        this.isPause = builder.isPause;
        this.message = builder.message;
        this.outQueue = builder.outQueue;
        this.pod = builder.pod;
        this.rank = builder.rank;
        this.rid = builder.rid;
        this.statePresent = builder.statePresent;
        this.time = builder.time;
        this.tokenizerPid = builder.tokenizerPid;
        this.workerPid = builder.workerPid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressSlowDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elapsed
     */
    public Double getElapsed() {
        return this.elapsed;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipc
     */
    public String getIpc() {
        return this.ipc;
    }

    /**
     * @return isPause
     */
    public String getIsPause() {
        return this.isPause;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outQueue
     */
    public String getOutQueue() {
        return this.outQueue;
    }

    /**
     * @return pod
     */
    public String getPod() {
        return this.pod;
    }

    /**
     * @return rank
     */
    public Integer getRank() {
        return this.rank;
    }

    /**
     * @return rid
     */
    public String getRid() {
        return this.rid;
    }

    /**
     * @return statePresent
     */
    public String getStatePresent() {
        return this.statePresent;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return tokenizerPid
     */
    public String getTokenizerPid() {
        return this.tokenizerPid;
    }

    /**
     * @return workerPid
     */
    public Integer getWorkerPid() {
        return this.workerPid;
    }

    public static final class Builder {
        private Double elapsed; 
        private String ip; 
        private String ipc; 
        private String isPause; 
        private String message; 
        private String outQueue; 
        private String pod; 
        private Integer rank; 
        private String rid; 
        private String statePresent; 
        private Long time; 
        private String tokenizerPid; 
        private Integer workerPid; 

        private Builder() {
        } 

        private Builder(RLProgressSlowDetail model) {
            this.elapsed = model.elapsed;
            this.ip = model.ip;
            this.ipc = model.ipc;
            this.isPause = model.isPause;
            this.message = model.message;
            this.outQueue = model.outQueue;
            this.pod = model.pod;
            this.rank = model.rank;
            this.rid = model.rid;
            this.statePresent = model.statePresent;
            this.time = model.time;
            this.tokenizerPid = model.tokenizerPid;
            this.workerPid = model.workerPid;
        } 

        /**
         * <p>The elapsed time of the request, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>42.5</p>
         */
        public Builder elapsed(Double elapsed) {
            this.elapsed = elapsed;
            return this;
        }

        /**
         * <p>worker IP</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.12</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>The IPC channel identifier, which corresponds to the ipc field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>ipc://worker-0</p>
         */
        public Builder ipc(String ipc) {
            this.ipc = ipc;
            return this;
        }

        /**
         * <p>Indicates whether the request is paused. This is the raw value of the is_pause field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPause(String isPause) {
            this.isPause = isPause;
            return this;
        }

        /**
         * <p>The log message, truncated to 700 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The output queue length. This is the raw value of the out_queue field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder outQueue(String outQueue) {
            this.outQueue = outQueue;
            return this;
        }

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc193cpaitk8eny-master-0</p>
         */
        public Builder pod(String pod) {
            this.pod = pod;
            return this;
        }

        /**
         * <p>The training rank.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder rank(Integer rank) {
            this.rank = rank;
            return this;
        }

        /**
         * <p>The inference request ID, which corresponds to the rid field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>req-8f3a2c1d</p>
         */
        public Builder rid(String rid) {
            this.rid = rid;
            return this;
        }

        /**
         * <p>Indicates whether the state is present. This is the raw value of the state_present field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder statePresent(String statePresent) {
            this.statePresent = statePresent;
            return this;
        }

        /**
         * <p>The log time, in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>The tokenizer process ID, which corresponds to the pid field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>12360</p>
         */
        public Builder tokenizerPid(String tokenizerPid) {
            this.tokenizerPid = tokenizerPid;
            return this;
        }

        /**
         * <p>The worker process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workerPid(Integer workerPid) {
            this.workerPid = workerPid;
            return this;
        }

        public RLProgressSlowDetail build() {
            return new RLProgressSlowDetail(this);
        } 

    } 

}
