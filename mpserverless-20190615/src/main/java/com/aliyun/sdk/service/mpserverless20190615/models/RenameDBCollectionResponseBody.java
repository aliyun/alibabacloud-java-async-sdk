// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameDBCollectionResponseBody} extends {@link TeaModel}
 *
 * <p>RenameDBCollectionResponseBody</p>
 */
public class RenameDBCollectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RenameDBCollectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameDBCollectionResponseBody create() {
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

        public RenameDBCollectionResponseBody build() {
            return new RenameDBCollectionResponseBody(this);
        } 

    } 

}
