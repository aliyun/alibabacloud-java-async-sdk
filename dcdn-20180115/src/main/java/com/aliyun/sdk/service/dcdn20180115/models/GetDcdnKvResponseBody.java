// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDcdnKvResponseBody} extends {@link TeaModel}
 *
 * <p>GetDcdnKvResponseBody</p>
 */
public class GetDcdnKvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetDcdnKvResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String requestId; 
        private String value; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D61E4801-EAFF-4A63-AAE1-FBF6CE1CFD1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The value of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public GetDcdnKvResponseBody build() {
            return new GetDcdnKvResponseBody(this);
        } 

    } 

}
