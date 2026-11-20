// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAccessConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessConfigResponseBody</p>
 */
public class DescribeAccessConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccessConfigResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configValue; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAccessConfigResponseBody model) {
            this.configValue = model.configValue;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The value of the queried configuration item. For more information, see the <strong>ConfigValue</strong> parameter in <a href="~~ModifyAccessConfig~~">ModifyAccessConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:1,&quot;products&quot;:[&quot;alb&quot;]}</p>
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccessConfigResponseBody build() {
            return new DescribeAccessConfigResponseBody(this);
        } 

    } 

}
