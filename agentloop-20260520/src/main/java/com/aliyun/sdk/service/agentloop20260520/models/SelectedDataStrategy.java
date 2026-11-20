// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link SelectedDataStrategy} extends {@link TeaModel}
 *
 * <p>SelectedDataStrategy</p>
 */
public class SelectedDataStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("evalIds")
    private java.util.List<String> evalIds;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private SelectedDataStrategy(Builder builder) {
        this.endTime = builder.endTime;
        this.evalIds = builder.evalIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectedDataStrategy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return evalIds
     */
    public java.util.List<String> getEvalIds() {
        return this.evalIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private java.util.List<String> evalIds; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(SelectedDataStrategy model) {
            this.endTime = model.endTime;
            this.evalIds = model.evalIds;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The end time of the statistical window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of evaluation IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;2646a9380bba3c86371f55a0226322941794983634&quot;]</p>
         */
        public Builder evalIds(java.util.List<String> evalIds) {
            this.evalIds = evalIds;
            return this;
        }

        /**
         * <p>The estimated start time in milliseconds.</p>
         * <blockquote>
         * <p>You can modify this parameter only when the course is in the preview state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1735574400</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public SelectedDataStrategy build() {
            return new SelectedDataStrategy(this);
        } 

    } 

}
