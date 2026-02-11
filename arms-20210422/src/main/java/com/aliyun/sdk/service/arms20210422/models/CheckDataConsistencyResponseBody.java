// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link CheckDataConsistencyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDataConsistencyResponseBody</p>
 */
public class CheckDataConsistencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsDataConsistency")
    private Boolean isDataConsistency;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckDataConsistencyResponseBody model) {
            this.isDataConsistency = model.isDataConsistency;
            this.requestId = model.requestId;
        } 

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
