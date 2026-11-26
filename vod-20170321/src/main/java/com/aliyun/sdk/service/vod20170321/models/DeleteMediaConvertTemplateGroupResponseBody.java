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
 * {@link DeleteMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMediaConvertTemplateGroupResponseBody</p>
 */
public class DeleteMediaConvertTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistTranscodeTemplateIds")
    private java.util.List<String> nonExistTranscodeTemplateIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteMediaConvertTemplateGroupResponseBody(Builder builder) {
        this.nonExistTranscodeTemplateIds = builder.nonExistTranscodeTemplateIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaConvertTemplateGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nonExistTranscodeTemplateIds
     */
    public java.util.List<String> getNonExistTranscodeTemplateIds() {
        return this.nonExistTranscodeTemplateIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> nonExistTranscodeTemplateIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteMediaConvertTemplateGroupResponseBody model) {
            this.nonExistTranscodeTemplateIds = model.nonExistTranscodeTemplateIds;
            this.requestId = model.requestId;
        } 

        /**
         * NonExistTranscodeTemplateIds.
         */
        public Builder nonExistTranscodeTemplateIds(java.util.List<String> nonExistTranscodeTemplateIds) {
            this.nonExistTranscodeTemplateIds = nonExistTranscodeTemplateIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteMediaConvertTemplateGroupResponseBody build() {
            return new DeleteMediaConvertTemplateGroupResponseBody(this);
        } 

    } 

}
