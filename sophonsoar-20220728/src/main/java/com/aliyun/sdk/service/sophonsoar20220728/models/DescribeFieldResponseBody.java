// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ip&quot;,&quot;name&quot;,&quot;hostinfo&quot;,&quot;md5&quot;]</p>
         */
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>The name of the global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>soar_filed_tags</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCDE6498-83CC-50A1-8307-3D5A539C42F8</p>
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
