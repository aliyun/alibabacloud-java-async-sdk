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
         * The number of logs that are generated before the generation time of the start log.
         */
        public Builder backLines(Long backLines) {
            this.backLines = backLines;
            return this;
        }

        /**
         * The number of logs that are generated after the generation time of the start log.
         */
        public Builder forwardLines(Long forwardLines) {
            this.forwardLines = forwardLines;
            return this;
        }

        /**
         * The logs that are returned.
         */
        public Builder logs(java.util.List < java.util.Map<String, ?>> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * Indicates whether the query and analysis results are complete. Valid values:
         * <p>
         * 
         * *   Complete: The query is successful, and the complete query and analysis results are returned.
         * *   Incomplete: The query is successful, but the query and analysis results are incomplete. To obtain the complete results, you must repeat the request.
         */
        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The total number of logs that are returned. The logs include the start log that is specified in the request.
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
