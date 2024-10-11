// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExtraDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExtraDataSourcesResponseBody</p>
 */
public class ListExtraDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < ExtraDataSource > result;

    private ListExtraDataSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExtraDataSourcesResponseBody create() {
        return builder().build();
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
    public java.util.List < ExtraDataSource > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ExtraDataSource > result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < ExtraDataSource > result) {
            this.result = result;
            return this;
        }

        public ListExtraDataSourcesResponseBody build() {
            return new ListExtraDataSourcesResponseBody(this);
        } 

    } 

}
