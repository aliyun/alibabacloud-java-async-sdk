// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetTensorboardSharedUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetTensorboardSharedUrlResponseBody</p>
 */
public class GetTensorboardSharedUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TensorboardSharedUrl")
    private String tensorboardSharedUrl;

    private GetTensorboardSharedUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tensorboardSharedUrl = builder.tensorboardSharedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTensorboardSharedUrlResponseBody create() {
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

    /**
     * @return tensorboardSharedUrl
     */
    public String getTensorboardSharedUrl() {
        return this.tensorboardSharedUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String tensorboardSharedUrl; 

        private Builder() {
        } 

        private Builder(GetTensorboardSharedUrlResponseBody model) {
            this.requestId = model.requestId;
            this.tensorboardSharedUrl = model.tensorboardSharedUrl;
        } 

        /**
         * <p>The request ID which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The shareable link of the TensorBoard task.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pai-dlc-proxy-xxx.alicyuncs.com/xxx/xxx/token/">http://pai-dlc-proxy-xxx.alicyuncs.com/xxx/xxx/token/</a></p>
         */
        public Builder tensorboardSharedUrl(String tensorboardSharedUrl) {
            this.tensorboardSharedUrl = tensorboardSharedUrl;
            return this;
        }

        public GetTensorboardSharedUrlResponseBody build() {
            return new GetTensorboardSharedUrlResponseBody(this);
        } 

    } 

}
