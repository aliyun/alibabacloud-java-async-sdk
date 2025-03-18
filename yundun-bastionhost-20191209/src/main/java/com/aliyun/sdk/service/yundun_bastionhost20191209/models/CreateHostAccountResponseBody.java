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
 * {@link CreateHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostAccountResponseBody</p>
 */
public class CreateHostAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccountId")
    private String hostAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHostAccountResponseBody(Builder builder) {
        this.hostAccountId = builder.hostAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountId
     */
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHostAccountResponseBody model) {
            this.hostAccountId = model.hostAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>CreateHostAccount</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostAccountResponseBody build() {
            return new CreateHostAccountResponseBody(this);
        } 

    } 

}
