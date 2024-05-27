// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagValuesResponseBody</p>
 */
public class DescribeTagValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Map")
    private String map;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTagValuesResponseBody(Builder builder) {
        this.map = builder.map;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagValuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return map
     */
    public String getMap() {
        return this.map;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String map; 
        private String requestId; 

        /**
         * The mappings between tag groups and tags.
         */
        public Builder map(String map) {
            this.map = map;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTagValuesResponseBody build() {
            return new DescribeTagValuesResponseBody(this);
        } 

    } 

}
