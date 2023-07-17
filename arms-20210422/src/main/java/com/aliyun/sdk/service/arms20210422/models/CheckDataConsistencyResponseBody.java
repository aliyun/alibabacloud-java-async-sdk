// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDataConsistencyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDataConsistencyResponseBody</p>
 */
public class CheckDataConsistencyResponseBody extends TeaModel {
    @NameInMap("IsDataConsistency")
    private Boolean isDataConsistency;

    @NameInMap("RequestId")
    private String requestId;

    private CheckDataConsistencyResponseBody(Builder builder) {
        this.isDataConsistency = builder.isDataConsistency;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDataConsistencyResponseBody create() {
        return builder().build();
    }

    /**
     * @return isDataConsistency
     */
    public Boolean getIsDataConsistency() {
        return this.isDataConsistency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isDataConsistency; 
        private String requestId; 

        /**
         * IsDataConsistency.
         */
        public Builder isDataConsistency(Boolean isDataConsistency) {
            this.isDataConsistency = isDataConsistency;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDataConsistencyResponseBody build() {
            return new CheckDataConsistencyResponseBody(this);
        } 

    } 

}
