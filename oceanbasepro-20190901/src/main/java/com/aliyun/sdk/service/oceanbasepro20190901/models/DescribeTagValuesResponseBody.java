// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTagValuesResponseBody model) {
            this.map = model.map;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The mappings between tag groups and tags.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;Tag group 2&quot;:[&quot;Tag 2-1&quot;,&quot;Tag 2-2&quot;],&quot;Tag group 1&quot;:[&quot;Tag 1-1&quot;]}&quot;</p>
         */
        public Builder map(String map) {
            this.map = map;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4C91F7BA-xxxx-xxxx-xxxx-846ECA1A9908</p>
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
