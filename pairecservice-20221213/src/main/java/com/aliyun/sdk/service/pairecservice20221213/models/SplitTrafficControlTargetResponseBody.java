// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link SplitTrafficControlTargetResponseBody} extends {@link TeaModel}
 *
 * <p>SplitTrafficControlTargetResponseBody</p>
 */
public class SplitTrafficControlTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SplitTrafficControlTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SplitTrafficControlTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(SplitTrafficControlTargetResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>Id of the request。</p>
         * 
         * <strong>example:</strong>
         * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SplitTrafficControlTargetResponseBody build() {
            return new SplitTrafficControlTargetResponseBody(this);
        } 

    } 

}
