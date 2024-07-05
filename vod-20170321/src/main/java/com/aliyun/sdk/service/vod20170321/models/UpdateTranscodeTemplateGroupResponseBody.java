// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTranscodeTemplateGroupResponseBody</p>
 */
public class UpdateTranscodeTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    private String transcodeTemplateGroupId;

    private UpdateTranscodeTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTranscodeTemplateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String transcodeTemplateGroupId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the transcoding template group.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        public UpdateTranscodeTemplateGroupResponseBody build() {
            return new UpdateTranscodeTemplateGroupResponseBody(this);
        } 

    } 

}
