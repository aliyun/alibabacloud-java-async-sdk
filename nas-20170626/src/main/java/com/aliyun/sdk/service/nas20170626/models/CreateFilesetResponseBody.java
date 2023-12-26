// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFilesetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFilesetResponseBody</p>
 */
public class CreateFilesetResponseBody extends TeaModel {
    @NameInMap("FsetId")
    private String fsetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFilesetResponseBody(Builder builder) {
        this.fsetId = builder.fsetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFilesetResponseBody create() {
        return builder().build();
    }

    /**
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fsetId; 
        private String requestId; 

        /**
         * The fileset ID.
         */
        public Builder fsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFilesetResponseBody build() {
            return new CreateFilesetResponseBody(this);
        } 

    } 

}
