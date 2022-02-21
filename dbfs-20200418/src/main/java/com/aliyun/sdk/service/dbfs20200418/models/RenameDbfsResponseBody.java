// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>RenameDbfsResponseBody</p>
 */
public class RenameDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RenameDbfsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameDbfsResponseBody create() {
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

        public RenameDbfsResponseBody build() {
            return new RenameDbfsResponseBody(this);
        } 

    } 

}
