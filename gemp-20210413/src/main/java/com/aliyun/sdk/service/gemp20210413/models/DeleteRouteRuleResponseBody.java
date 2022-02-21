// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRouteRuleResponseBody</p>
 */
public class DeleteRouteRuleResponseBody extends TeaModel {
    @NameInMap("requestId")
    private Long requestId;

    private DeleteRouteRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public Long getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long requestId; 

        /**
         * 请求ID
         */
        public Builder requestId(Long requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteRouteRuleResponseBody build() {
            return new DeleteRouteRuleResponseBody(this);
        } 

    } 

}
