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
 * {@link CreateHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostGroupResponseBody</p>
 */
public class CreateHostGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostGroupId")
    private String hostGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHostGroupResponseBody(Builder builder) {
        this.hostGroupId = builder.hostGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHostGroupResponseBody model) {
            this.hostGroupId = model.hostGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
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

        public CreateHostGroupResponseBody build() {
            return new CreateHostGroupResponseBody(this);
        } 

    } 

}
