// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupIdResponseBody</p>
 */
public class CreateGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateGroupIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupIdResponseBody create() {
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

        public CreateGroupIdResponseBody build() {
            return new CreateGroupIdResponseBody(this);
        } 

    } 

}
