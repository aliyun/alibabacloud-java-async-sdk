// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRecordTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLiveRecordTemplateResponseBody</p>
 */
public class UpdateLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateLiveRecordTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRecordTemplateResponseBody create() {
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
         * 代表资源一级ID的资源属性字段
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLiveRecordTemplateResponseBody build() {
            return new UpdateLiveRecordTemplateResponseBody(this);
        } 

    } 

}
