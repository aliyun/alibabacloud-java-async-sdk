// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link GetAllCustomTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllCustomTemplatesResponseBody</p>
 */
public class GetAllCustomTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomTemplates")
    private String customTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAllCustomTemplatesResponseBody(Builder builder) {
        this.customTemplates = builder.customTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllCustomTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTemplates
     */
    public String getCustomTemplates() {
        return this.customTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customTemplates; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAllCustomTemplatesResponseBody model) {
            this.customTemplates = model.customTemplates;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The template names and template configurations returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;templateConfig&quot;: &quot;{&quot;cdesc&quot;:&quot;H264&quot;,&quot;scale&quot;:&quot;[3:4]&quot;,&quot;gop&quot;:&quot;1&quot;,&quot;bframes&quot;:&quot;1&quot;,&quot;height&quot;:&quot;1080&quot;}&quot;,&quot;templateName&quot;: &quot;custom1&quot;},{&quot;templateConfig&quot;: &quot;{&quot;ar&quot;:&quot;44100&quot;,&quot;cdesc&quot;:&quot;H264&quot;,&quot;scale&quot;:&quot;[3:4]&quot;,&quot;gop&quot;:&quot;1&quot;,&quot;bframes&quot;:&quot;1&quot;,&quot;height&quot;:&quot;1080&quot;}&quot;,&quot;templateName&quot;: &quot;cus&quot;}]</p>
         */
        public Builder customTemplates(String customTemplates) {
            this.customTemplates = customTemplates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4791648Q-813C-6254-865C-0ED913661230</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAllCustomTemplatesResponseBody build() {
            return new GetAllCustomTemplatesResponseBody(this);
        } 

    } 

}
