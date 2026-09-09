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
 * {@link DescribeDefenseSceneConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseSceneConfigResponseBody</p>
 */
public class DescribeDefenseSceneConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefenseSceneConfigResponseBody(Builder builder) {
        this.configValue = builder.configValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseSceneConfigResponseBody create() {
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

        private Builder(DescribeDefenseSceneConfigResponseBody model) {
            this.configValue = model.configValue;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The value of the configuration item. For more information, see the <strong>ConfigValue</strong> parameter in <a href="https://help.aliyun.com/document_detail/2968435.html">ModifyDefenseSceneConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public DescribeDefenseSceneConfigResponseBody build() {
            return new DescribeDefenseSceneConfigResponseBody(this);
        } 

    } 

}
