// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EndAllCoordinationByOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>EndAllCoordinationByOwnerResponseBody</p>
 */
public class EndAllCoordinationByOwnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EndAllCoordinationByOwnerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndAllCoordinationByOwnerResponseBody create() {
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

        public EndAllCoordinationByOwnerResponseBody build() {
            return new EndAllCoordinationByOwnerResponseBody(this);
        } 

    } 

}
