// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link AddLiveAISubtitleResponseBody} extends {@link TeaModel}
 *
 * <p>AddLiveAISubtitleResponseBody</p>
 */
public class AddLiveAISubtitleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubtitleId")
    private String subtitleId;

    private AddLiveAISubtitleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.subtitleId = builder.subtitleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveAISubtitleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subtitleId
     */
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public static final class Builder {
        private String requestId; 
        private String subtitleId; 

        private Builder() {
        } 

        private Builder(AddLiveAISubtitleResponseBody model) {
            this.requestId = model.requestId;
            this.subtitleId = model.subtitleId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder subtitleId(String subtitleId) {
            this.subtitleId = subtitleId;
            return this;
        }

        public AddLiveAISubtitleResponseBody build() {
            return new AddLiveAISubtitleResponseBody(this);
        } 

    } 

}
