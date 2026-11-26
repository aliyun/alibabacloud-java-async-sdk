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
 * {@link GetRLLogContextResponseBody} extends {@link TeaModel}
 *
 * <p>GetRLLogContextResponseBody</p>
 */
public class GetRLLogContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnchorIndex")
    private Integer anchorIndex;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Lines")
    private java.util.List<RLLogContextLine> lines;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Truncated")
    private Boolean truncated;

    private GetRLLogContextResponseBody(Builder builder) {
        this.anchorIndex = builder.anchorIndex;
        this.jobId = builder.jobId;
        this.lines = builder.lines;
        this.mode = builder.mode;
        this.requestId = builder.requestId;
        this.truncated = builder.truncated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLLogContextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorIndex
     */
    public Integer getAnchorIndex() {
        return this.anchorIndex;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return lines
     */
    public java.util.List<RLLogContextLine> getLines() {
        return this.lines;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return truncated
     */
    public Boolean getTruncated() {
        return this.truncated;
    }

    public static final class Builder {
        private Integer anchorIndex; 
        private String jobId; 
        private java.util.List<RLLogContextLine> lines; 
        private String mode; 
        private String requestId; 
        private Boolean truncated; 

        private Builder() {
        } 

        private Builder(GetRLLogContextResponseBody model) {
            this.anchorIndex = model.anchorIndex;
            this.jobId = model.jobId;
            this.lines = model.lines;
            this.mode = model.mode;
            this.requestId = model.requestId;
            this.truncated = model.truncated;
        } 

        /**
         * <p>Lines 数组中用于定位的参考行下标，从 0 开始；可能对应锚点或其邻近日志，不保证与原始锚点消息精确匹配。未提供时表示本次未返回可用的参考下标。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder anchorIndex(Integer anchorIndex) {
            this.anchorIndex = anchorIndex;
            return this;
        }

        /**
         * <p>作业 ID</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-xxxxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>按定位时间升序排列的上下文日志。采集时间定位最多返回 201 行；日志时间定位返回锚点前后 5 秒范围内的日志，并可能缩小返回范围。结果不保证包含原始锚点日志。</p>
         */
        public Builder lines(java.util.List<RLLogContextLine> lines) {
            this.lines = lines;
            return this;
        }

        /**
         * <p>日志定位方式。agent_collect_time 表示按采集时间定位，raw_time_cluster 表示按日志时间定位；定位方式本身不保证精确命中锚点。</p>
         * 
         * <strong>example:</strong>
         * <p>agent_collect_time</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>请求 ID</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>日志时间定位是否触及 5000 条的数量限制，为 true 时上下文可能不完整；采集时间定位时为 false，不能据此判断全部日志是否已完整返回。</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder truncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }

        public GetRLLogContextResponseBody build() {
            return new GetRLLogContextResponseBody(this);
        } 

    } 

}
