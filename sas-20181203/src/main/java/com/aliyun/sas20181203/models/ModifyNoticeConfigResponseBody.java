// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyNoticeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyNoticeConfigResponseBody</p>
 */
public class ModifyNoticeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyNoticeConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNoticeConfigResponseBody create() {
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

        public ModifyNoticeConfigResponseBody build() {
            return new ModifyNoticeConfigResponseBody(this);
        } 

    } 

}
