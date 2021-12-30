// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUserGroupResponseBody</p>
 */
public class ModifyUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserGroupResponseBody create() {
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

        public ModifyUserGroupResponseBody build() {
            return new ModifyUserGroupResponseBody(this);
        } 

    } 

}
