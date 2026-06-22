// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link VideoReadSummaryOption} extends {@link TeaModel}
 *
 * <p>VideoReadSummaryOption</p>
 */
public class VideoReadSummaryOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Summarize")
    private Boolean summarize;

    private VideoReadSummaryOption(Builder builder) {
        this.summarize = builder.summarize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoReadSummaryOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return summarize
     */
    public Boolean getSummarize() {
        return this.summarize;
    }

    public static final class Builder {
        private Boolean summarize; 

        private Builder() {
        } 

        private Builder(VideoReadSummaryOption model) {
            this.summarize = model.summarize;
        } 

        /**
         * Summarize.
         */
        public Builder summarize(Boolean summarize) {
            this.summarize = summarize;
            return this;
        }

        public VideoReadSummaryOption build() {
            return new VideoReadSummaryOption(this);
        } 

    } 

}
