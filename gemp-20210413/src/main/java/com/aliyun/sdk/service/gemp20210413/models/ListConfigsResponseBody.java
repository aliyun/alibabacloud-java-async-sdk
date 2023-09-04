// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigsResponseBody</p>
 */
public class ListConfigsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.Map < String, java.util.List<DataValue>> data;

    @NameInMap("requestId")
    private String requestId;

    private ListConfigsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map < String, java.util.List<DataValue>> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, java.util.List<DataValue>> data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(java.util.Map < String, java.util.List<DataValue>> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConfigsResponseBody build() {
            return new ListConfigsResponseBody(this);
        } 

    } 

}
