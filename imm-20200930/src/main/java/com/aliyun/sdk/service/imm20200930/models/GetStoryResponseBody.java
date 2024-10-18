// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetStoryResponseBody</p>
 */
public class GetStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Story")
    private Story story;

    private GetStoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.story = builder.story;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return story
     */
    public Story getStory() {
        return this.story;
    }

    public static final class Builder {
        private String requestId; 
        private Story story; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the story.</p>
         */
        public Builder story(Story story) {
            this.story = story;
            return this;
        }

        public GetStoryResponseBody build() {
            return new GetStoryResponseBody(this);
        } 

    } 

}
