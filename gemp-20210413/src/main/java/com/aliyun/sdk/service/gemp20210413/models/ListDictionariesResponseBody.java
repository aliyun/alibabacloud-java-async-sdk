// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDictionariesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDictionariesResponseBody</p>
 */
public class ListDictionariesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.Map < String, java.util.List<DataValue>> data;

    @NameInMap("requestId")
    private String requestId;

    private ListDictionariesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDictionariesResponseBody create() {
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
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDictionariesResponseBody build() {
            return new ListDictionariesResponseBody(this);
        } 

    } 

}
