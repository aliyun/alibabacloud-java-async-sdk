// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayErrorAccessLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayErrorAccessLogsResponseBody</p>
 */
public class ListGatewayErrorAccessLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<java.util.Map<String, String>> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGatewayErrorAccessLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayErrorAccessLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, String>> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayErrorAccessLogsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayErrorAccessLogsResponseBody build() {
            return new ListGatewayErrorAccessLogsResponseBody(this);
        } 

    } 

}
