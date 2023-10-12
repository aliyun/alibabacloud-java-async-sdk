// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSetupProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSetupProjectResponseBody</p>
 */
public class DeleteSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSetupProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSetupProjectResponseBody create() {
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

        public DeleteSetupProjectResponseBody build() {
            return new DeleteSetupProjectResponseBody(this);
        } 

    } 

}
