// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListPbcInvokesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPbcInvokesResponseBody</p>
 */
public class ListPbcInvokesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private PbcListResult result;

    private ListPbcInvokesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPbcInvokesResponseBody create() {
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

    /**
     * @return result
     */
    public PbcListResult getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private PbcListResult result; 

        private Builder() {
        } 

        private Builder(ListPbcInvokesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>sdadawqewe</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(PbcListResult result) {
            this.result = result;
            return this;
        }

        public ListPbcInvokesResponseBody build() {
            return new ListPbcInvokesResponseBody(this);
        } 

    } 

}
