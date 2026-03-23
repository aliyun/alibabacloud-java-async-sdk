// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetAttachmentUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttachmentUrlResponseBody</p>
 */
public class GetAttachmentUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessFileUrl")
    private String accessFileUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttachmentUrlResponseBody(Builder builder) {
        this.accessFileUrl = builder.accessFileUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachmentUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessFileUrl
     */
    public String getAccessFileUrl() {
        return this.accessFileUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessFileUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAttachmentUrlResponseBody model) {
            this.accessFileUrl = model.accessFileUrl;
            this.requestId = model.requestId;
        } 

        /**
         * AccessFileUrl.
         */
        public Builder accessFileUrl(String accessFileUrl) {
            this.accessFileUrl = accessFileUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttachmentUrlResponseBody build() {
            return new GetAttachmentUrlResponseBody(this);
        } 

    } 

}
