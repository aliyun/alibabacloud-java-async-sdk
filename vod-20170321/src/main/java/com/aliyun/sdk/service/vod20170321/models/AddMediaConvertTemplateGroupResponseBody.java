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
 * {@link AddMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddMediaConvertTemplateGroupResponseBody</p>
 */
public class AddMediaConvertTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    private String transcodeTemplateGroupId;

    private AddMediaConvertTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConvertTemplateGroupResponseBody create() {
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

        private Builder(AddMediaConvertTemplateGroupResponseBody model) {
            this.requestId = model.requestId;
            this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeTemplateGroupId.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        public AddMediaConvertTemplateGroupResponseBody build() {
            return new AddMediaConvertTemplateGroupResponseBody(this);
        } 

    } 

}
