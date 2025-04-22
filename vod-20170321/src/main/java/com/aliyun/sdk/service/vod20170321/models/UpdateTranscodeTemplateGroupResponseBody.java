// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String transcodeTemplateGroupId; 

        private Builder() {
        } 

        private Builder(UpdateTranscodeTemplateGroupResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group.</p>
         * 
         * <strong>example:</strong>
         * <p>34e908aa4024a*****f7821c31f93a2a</p>
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
