// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentDownloadUrlResponseBody</p>
 */
public class GetAgentDownloadUrlResponseBody extends TeaModel {
    @NameInMap("ArmsAgentDownloadUrl")
    private String armsAgentDownloadUrl;

    @NameInMap("RequestId")
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
         * The ID of the request.
         */
        public Builder armsAgentDownloadUrl(String armsAgentDownloadUrl) {
            this.armsAgentDownloadUrl = armsAgentDownloadUrl;
            return this;
        }

        /**
         * Obtains the download URL of the Application Real-Time Monitoring Service (ARMS) agent.
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
