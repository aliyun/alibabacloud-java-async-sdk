// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagValuesResponseBody</p>
 */
public class ListTagValuesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Values")
    private Values values;

    private ListTagValuesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagValuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return values
     */
    public Values getValues() {
        return this.values;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageSize; 
        private String requestId; 
        private Values values; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(Values values) {
            this.values = values;
            return this;
        }

        public ListTagValuesResponseBody build() {
            return new ListTagValuesResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("Value")
        private java.util.List < String > value;

        private Values(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public java.util.List < String > getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List < String > value; 

            /**
             * Value.
             */
            public Builder value(java.util.List < String > value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
}
