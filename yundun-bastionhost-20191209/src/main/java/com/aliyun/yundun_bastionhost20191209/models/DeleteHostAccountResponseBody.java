// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteHostAccountResponseBody</p>
 */
public class DeleteHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteHostAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostAccountResponseBody create() {
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

        public DeleteHostAccountResponseBody build() {
            return new DeleteHostAccountResponseBody(this);
        } 

    } 

}
