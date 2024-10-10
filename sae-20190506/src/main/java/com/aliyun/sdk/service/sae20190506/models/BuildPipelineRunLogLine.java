// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BuildPipelineRunLogLine} extends {@link TeaModel}
 *
 * <p>BuildPipelineRunLogLine</p>
 */
public class BuildPipelineRunLogLine extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    private BuildPipelineRunLogLine(Builder builder) {
        this.content = builder.content;
        this.offset = builder.offset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildPipelineRunLogLine create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    public static final class Builder {
        private String content; 
        private Long offset; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public BuildPipelineRunLogLine build() {
            return new BuildPipelineRunLogLine(this);
        } 

    } 

}
