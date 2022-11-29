// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTaskTemplateResponseBody</p>
 */
public class DeleteTaskTemplateResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private DeleteTaskTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTaskTemplateResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTaskTemplateResponseBody build() {
            return new DeleteTaskTemplateResponseBody(this);
        } 

    } 

}
