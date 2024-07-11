// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultimodeCmsUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultimodeCmsUrlResponseBody</p>
 */
public class GetMultimodeCmsUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("MultimodCmsUrl")
    private String multimodCmsUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMultimodeCmsUrlResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.multimodCmsUrl = builder.multimodCmsUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultimodeCmsUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return multimodCmsUrl
     */
    public String getMultimodCmsUrl() {
        return this.multimodCmsUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String multimodCmsUrl; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MultimodCmsUrl.
         */
        public Builder multimodCmsUrl(String multimodCmsUrl) {
            this.multimodCmsUrl = multimodCmsUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMultimodeCmsUrlResponseBody build() {
            return new GetMultimodeCmsUrlResponseBody(this);
        } 

    } 

}
