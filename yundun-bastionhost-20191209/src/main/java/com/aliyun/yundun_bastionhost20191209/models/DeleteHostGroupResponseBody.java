// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteHostGroupResponseBody</p>
 */
public class DeleteHostGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteHostGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostGroupResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteHostGroupResponseBody build() {
            return new DeleteHostGroupResponseBody(this);
        } 

    } 

}
