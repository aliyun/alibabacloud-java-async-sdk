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
 * {@link RLProgressFatal} extends {@link TeaModel}
 *
 * <p>RLProgressFatal</p>
 */
public class RLProgressFatal extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CollectNs")
    private String collectNs;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RawMessage")
    private String rawMessage;

    @com.aliyun.core.annotation.NameInMap("SubsecNs")
    private Long subsecNs;

    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    private RLProgressFatal(Builder builder) {
        this.collectNs = builder.collectNs;
        this.message = builder.message;
        this.rawMessage = builder.rawMessage;
        this.subsecNs = builder.subsecNs;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressFatal create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectNs
     */
    public String getCollectNs() {
        return this.collectNs;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return rawMessage
     */
    public String getRawMessage() {
        return this.rawMessage;
    }

    /**
     * @return subsecNs
     */
    public Long getSubsecNs() {
        return this.subsecNs;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder {
        private String collectNs; 
        private String message; 
        private String rawMessage; 
        private Long subsecNs; 
        private Long time; 

        private Builder() {
        } 

        private Builder(RLProgressFatal model) {
            this.collectNs = model.collectNs;
            this.message = model.message;
            this.rawMessage = model.rawMessage;
            this.subsecNs = model.subsecNs;
            this.time = model.time;
        } 

        /**
         * <p>锚点行 agent_collect_time（纳秒字符串，超 JS 安全整数）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487713456789</p>
         */
        public Builder collectNs(String collectNs) {
            this.collectNs = collectNs;
            return this;
        }

        /**
         * <p>错误文案（截断至 500 字符）</p>
         * 
         * <strong>example:</strong>
         * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>原始日志行（截断至 2000 字符）；调用 GetRLLogContext 时作为 AnchorMessage 传入</p>
         * 
         * <strong>example:</strong>
         * <p>[rank0]: torch.OutOfMemoryError: CUDA out of memory. Tried to allocate 2.00 GiB</p>
         */
        public Builder rawMessage(String rawMessage) {
            this.rawMessage = rawMessage;
            return this;
        }

        /**
         * <p>同秒内的纳秒偏移，用于同秒日志排序</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder subsecNs(Long subsecNs) {
            this.subsecNs = subsecNs;
            return this;
        }

        /**
         * <p>日志时间（unix 秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        public RLProgressFatal build() {
            return new RLProgressFatal(this);
        } 

    } 

}
