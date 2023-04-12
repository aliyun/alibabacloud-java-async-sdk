// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageContactResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMessageContactResponseBody</p>
 */
public class UpdateMessageContactResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateMessageContactResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageContactResponseBody create() {
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

        public UpdateMessageContactResponseBody build() {
            return new UpdateMessageContactResponseBody(this);
        } 

    } 

}
