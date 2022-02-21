// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTranscodeTemplateGroupResponseBody</p>
 */
public class DeleteTranscodeTemplateGroupResponseBody extends TeaModel {
    @NameInMap("NonExistTranscodeTemplateIds")
    private java.util.List < String > nonExistTranscodeTemplateIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteTranscodeTemplateGroupResponseBody(Builder builder) {
        this.nonExistTranscodeTemplateIds = builder.nonExistTranscodeTemplateIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTranscodeTemplateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistTranscodeTemplateIds
     */
    public java.util.List < String > getNonExistTranscodeTemplateIds() {
        return this.nonExistTranscodeTemplateIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > nonExistTranscodeTemplateIds; 
        private String requestId; 

        /**
         * NonExistTranscodeTemplateIds.
         */
        public Builder nonExistTranscodeTemplateIds(java.util.List < String > nonExistTranscodeTemplateIds) {
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

        public DeleteTranscodeTemplateGroupResponseBody build() {
            return new DeleteTranscodeTemplateGroupResponseBody(this);
        } 

    } 

}
