// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link QueryMLServiceResultsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMLServiceResultsResponseBody</p>
 */
public class QueryMLServiceResultsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < java.util.Map<String, String>> data;

    @NameInMap("status")
    private java.util.Map < String, String > status;

    private QueryMLServiceResultsResponseBody(Builder builder) {
        this.data = builder.data;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMLServiceResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < java.util.Map<String, String>> getData() {
        return this.data;
    }

    /**
     * @return status
     */
    public java.util.Map < String, String > getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List < java.util.Map<String, String>> data; 
        private java.util.Map < String, String > status; 

        /**
         * data.
         */
        public Builder data(java.util.List < java.util.Map<String, String>> data) {
            this.data = data;
            return this;
        }

        /**
         * status.
         */
        public Builder status(java.util.Map < String, String > status) {
            this.status = status;
            return this;
        }

        public QueryMLServiceResultsResponseBody build() {
            return new QueryMLServiceResultsResponseBody(this);
        } 

    } 

}
