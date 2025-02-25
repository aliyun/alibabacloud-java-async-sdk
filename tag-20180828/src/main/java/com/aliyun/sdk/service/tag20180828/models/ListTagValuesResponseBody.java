// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagValuesResponseBody</p>
 */
public class ListTagValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Values")
    private Values values;

    private ListTagValuesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
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
        private String requestId; 
        private Values values; 

        /**
         * <p>Indicates whether the next query is required. The value of this parameter may be empty.</p>
         * <ul>
         * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8989CA7E-D2E0-4B6D-8282-311106E80150</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the tag values.</p>
         */
        public Builder values(Values values) {
            this.values = values;
            return this;
        }

        public ListTagValuesResponseBody build() {
            return new ListTagValuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagValuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagValuesResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

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
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<String> value; 

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
}
