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
 * {@link DescribeDomainCustomLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCustomLogConfigResponseBody</p>
 */
public class DescribeDomainCustomLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sample")
    private String sample;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private DescribeDomainCustomLogConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.sample = builder.sample;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCustomLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
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
        private String configId; 
        private String remark; 
        private String requestId; 
        private String sample; 
        private String tag; 

        /**
         * <p>The ID of the log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

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
         * <p>The sample log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[9/Jun/2015:01:58:09+0800]188.165.15.75-1542&quot;-&quot;&quot;GET <a href="http://www.aliyun.com/index.html%5C">http://www.aliyun.com/index.html\</a></p>
         */
        public Builder sample(String sample) {
            this.sample = sample;
            return this;
        }

        /**
         * <p>The tag information about the log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>book</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public DescribeDomainCustomLogConfigResponseBody build() {
            return new DescribeDomainCustomLogConfigResponseBody(this);
        } 

    } 

}
