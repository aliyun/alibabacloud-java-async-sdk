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
 * {@link ListPbcSubscribeResponseBody} extends {@link TeaModel}
 *
 * <p>ListPbcSubscribeResponseBody</p>
 */
public class ListPbcSubscribeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcListResult")
    private PbcListResult pbcListResult;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListPbcSubscribeResponseBody(Builder builder) {
        this.pbcListResult = builder.pbcListResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPbcSubscribeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcListResult
     */
    public PbcListResult getPbcListResult() {
        return this.pbcListResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PbcListResult pbcListResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPbcSubscribeResponseBody model) {
            this.pbcListResult = model.pbcListResult;
            this.requestId = model.requestId;
        } 

        /**
         * pbcListResult.
         */
        public Builder pbcListResult(PbcListResult pbcListResult) {
            this.pbcListResult = pbcListResult;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPbcSubscribeResponseBody build() {
            return new ListPbcSubscribeResponseBody(this);
        } 

    } 

}
