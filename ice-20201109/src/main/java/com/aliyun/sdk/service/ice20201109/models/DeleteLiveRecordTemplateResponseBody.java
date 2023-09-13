// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRecordTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveRecordTemplateResponseBody</p>
 */
public class DeleteLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLiveRecordTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRecordTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveRecordTemplateResponseBody build() {
            return new DeleteLiveRecordTemplateResponseBody(this);
        } 

    } 

}
