// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateImageBaselineWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>OperateImageBaselineWhitelistResponseBody</p>
 */
public class OperateImageBaselineWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OperateImageBaselineWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateImageBaselineWhitelistResponseBody create() {
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

        public OperateImageBaselineWhitelistResponseBody build() {
            return new OperateImageBaselineWhitelistResponseBody(this);
        } 

    } 

}
