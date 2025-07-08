// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateProductNewResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductNewResponseBody</p>
 */
public class CreateProductNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpenResult")
    private Boolean openResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProductNewResponseBody(Builder builder) {
        this.openResult = builder.openResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openResult
     */
    public Boolean getOpenResult() {
        return this.openResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean openResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProductNewResponseBody model) {
            this.openResult = model.openResult;
            this.requestId = model.requestId;
        } 

        /**
         * OpenResult.
         */
        public Builder openResult(Boolean openResult) {
            this.openResult = openResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProductNewResponseBody build() {
            return new CreateProductNewResponseBody(this);
        } 

    } 

}
