// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetAgentDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentDownloadUrlResponseBody</p>
 */
public class GetAgentDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArmsAgentDownloadUrl")
    private String armsAgentDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAgentDownloadUrlResponseBody(Builder builder) {
        this.armsAgentDownloadUrl = builder.armsAgentDownloadUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return armsAgentDownloadUrl
     */
    public String getArmsAgentDownloadUrl() {
        return this.armsAgentDownloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String armsAgentDownloadUrl; 
        private String requestId; 

        /**
         * <p>The download URL of the ARMS agent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://arms-apm-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/2.7.1.1/">http://arms-apm-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/2.7.1.1/</a></p>
         */
        public Builder armsAgentDownloadUrl(String armsAgentDownloadUrl) {
            this.armsAgentDownloadUrl = armsAgentDownloadUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14043452-D486-4EA1-80C9-BA73FB81****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAgentDownloadUrlResponseBody build() {
            return new GetAgentDownloadUrlResponseBody(this);
        } 

    } 

}
