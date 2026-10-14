// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ConfigWebCCRuleV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigWebCCRuleV2ResponseBody</p>
 */
public class ConfigWebCCRuleV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ConfigWebCCRuleV2ResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigWebCCRuleV2ResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(ConfigWebCCRuleV2ResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConfigWebCCRuleV2ResponseBody build() {
            return new ConfigWebCCRuleV2ResponseBody(this);
        } 

    } 

}
