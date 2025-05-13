// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetEntityStoreDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetEntityStoreDataResponseBody</p>
 */
public class GetEntityStoreDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.List<String>> data;

    @com.aliyun.core.annotation.NameInMap("header")
    private java.util.List<String> header;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEntityStoreDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.header = builder.header;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityStoreDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<java.util.List<String>> getData() {
        return this.data;
    }

    /**
     * @return header
     */
    public java.util.List<String> getHeader() {
        return this.header;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.List<String>> data; 
        private java.util.List<String> header; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEntityStoreDataResponseBody model) {
            this.data = model.data;
            this.header = model.header;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<java.util.List<String>> data) {
            this.data = data;
            return this;
        }

        /**
         * header.
         */
        public Builder header(java.util.List<String> header) {
            this.header = header;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEntityStoreDataResponseBody build() {
            return new GetEntityStoreDataResponseBody(this);
        } 

    } 

}
