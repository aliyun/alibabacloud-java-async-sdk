// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetContextLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetContextLogsResponseBody</p>
 */
public class GetContextLogsResponseBody extends TeaModel {
    @NameInMap("back_lines")
    private Long backLines;

    @NameInMap("forward_lines")
    private Long forwardLines;

    @NameInMap("logs")
    private java.util.List < java.util.Map<String, ?>> logs;

    @NameInMap("progress")
    private String progress;

    @NameInMap("total_lines")
    private Long totalLines;

    private GetContextLogsResponseBody(Builder builder) {
        this.backLines = builder.backLines;
        this.forwardLines = builder.forwardLines;
        this.logs = builder.logs;
        this.progress = builder.progress;
        this.totalLines = builder.totalLines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return backLines
     */
    public Long getBackLines() {
        return this.backLines;
    }

    /**
     * @return forwardLines
     */
    public Long getForwardLines() {
        return this.forwardLines;
    }

    /**
     * @return logs
     */
    public java.util.List < java.util.Map<String, ?>> getLogs() {
        return this.logs;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return this.progress;
    }

    /**
     * @return totalLines
     */
    public Long getTotalLines() {
        return this.totalLines;
    }

    public static final class Builder {
        private Long backLines; 
        private Long forwardLines; 
        private java.util.List < java.util.Map<String, ?>> logs; 
        private String progress; 
        private Long totalLines; 

        /**
         * 向前查询到的日志条数。
         */
        public Builder backLines(Long backLines) {
            this.backLines = backLines;
            return this;
        }

        /**
         * 向后查询到的日志条数。
         */
        public Builder forwardLines(Long forwardLines) {
            this.forwardLines = forwardLines;
            return this;
        }

        /**
         * 获取到的日志，按上下文顺序排列。当根据指定起始日志查询不到上下文日志时，此参数为空。
         */
        public Builder logs(java.util.List < java.util.Map<String, ?>> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * 查询的结果是否完整。
         * <p>
         * Complete：查询已经完成，返回结果为完整结果。
         * Incomplete：查询已经完成，返回结果为不完整结果，需要重复请求以获得完整结果。
         */
        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
         * 返回的总日志条数，包含请求参数中所指定的起始日志。
         */
        public Builder totalLines(Long totalLines) {
            this.totalLines = totalLines;
            return this;
        }

        public GetContextLogsResponseBody build() {
            return new GetContextLogsResponseBody(this);
        } 

    } 

}
