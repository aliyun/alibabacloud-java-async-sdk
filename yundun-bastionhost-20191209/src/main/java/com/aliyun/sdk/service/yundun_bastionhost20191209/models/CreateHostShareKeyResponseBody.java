// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostShareKeyResponseBody</p>
 */
public class CreateHostShareKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostShareKeyId")
    private Long hostShareKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHostShareKeyResponseBody(Builder builder) {
        this.hostShareKeyId = builder.hostShareKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostShareKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostShareKeyId
     */
    public Long getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long hostShareKeyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHostShareKeyResponseBody model) {
            this.hostShareKeyId = model.hostShareKeyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the shared key.</p>
         * 
         * <strong>example:</strong>
         * <p>10235</p>
         */
        public Builder hostShareKeyId(Long hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostShareKeyResponseBody build() {
            return new CreateHostShareKeyResponseBody(this);
        } 

    } 

}
