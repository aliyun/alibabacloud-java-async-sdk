// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTrafficMirrorFilterRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTrafficMirrorFilterRulesResponseBody</p>
 */
public class DeleteTrafficMirrorFilterRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteTrafficMirrorFilterRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrafficMirrorFilterRulesResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BD8A3F71-00C5-4655-8F55-11F3976C3274</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTrafficMirrorFilterRulesResponseBody build() {
            return new DeleteTrafficMirrorFilterRulesResponseBody(this);
        } 

    } 

}
