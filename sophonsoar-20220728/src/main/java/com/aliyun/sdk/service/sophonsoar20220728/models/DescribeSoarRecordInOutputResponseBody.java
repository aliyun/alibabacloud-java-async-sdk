// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordInOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarRecordInOutputResponseBody</p>
 */
public class DescribeSoarRecordInOutputResponseBody extends TeaModel {
    @NameInMap("InOutputInfo")
    private String inOutputInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSoarRecordInOutputResponseBody(Builder builder) {
        this.inOutputInfo = builder.inOutputInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordInOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return inOutputInfo
     */
    public String getInOutputInfo() {
        return this.inOutputInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String inOutputInfo; 
        private String requestId; 

        /**
         * The execution result of the component action.
         */
        public Builder inOutputInfo(String inOutputInfo) {
            this.inOutputInfo = inOutputInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSoarRecordInOutputResponseBody build() {
            return new DescribeSoarRecordInOutputResponseBody(this);
        } 

    } 

}
