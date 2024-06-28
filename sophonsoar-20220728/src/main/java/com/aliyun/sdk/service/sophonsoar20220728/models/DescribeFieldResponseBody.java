// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFieldResponseBody</p>
 */
public class DescribeFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFieldResponseBody(Builder builder) {
        this.fields = builder.fields;
        this.name = builder.name;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldResponseBody create() {
        return builder().build();
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fields; 
        private String name; 
        private String requestId; 

        /**
         * The configuration content.
         */
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        /**
         * The name of the global configuration.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFieldResponseBody build() {
            return new DescribeFieldResponseBody(this);
        } 

    } 

}
