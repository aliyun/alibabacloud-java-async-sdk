// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCustomLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomLogConfigResponseBody</p>
 */
public class DescribeCustomLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sample")
    private String sample;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private DescribeCustomLogConfigResponseBody(Builder builder) {
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.sample = builder.sample;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sample
     */
    public String getSample() {
        return this.sample;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String remark; 
        private String requestId; 
        private String sample; 
        private String tag; 

        /**
         * <p>The format of the log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>$time_iso8601_$request_method_$</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>94E3559F-7B6A-4A5E-AFFD-44E2A208A249</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sample.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[9/Jun/2015:01:58:09 +0800] 188.165.15.75 - 1542 &quot;-&quot; &quot;GEThttp: //<a href="http://www.aliyun.com/index.html%5C">www.aliyun.com/index.html\</a>&quot; 200</p>
         */
        public Builder sample(String sample) {
            this.sample = sample;
            return this;
        }

        /**
         * <p>The tag information about the log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>img1</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public DescribeCustomLogConfigResponseBody build() {
            return new DescribeCustomLogConfigResponseBody(this);
        } 

    } 

}
