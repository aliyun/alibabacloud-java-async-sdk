// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link CreateCommandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommandResponseBody</p>
 */
public class CreateCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ToolId")
    private String toolId;

    private CreateCommandResponseBody(Builder builder) {
        this.domainCode = builder.domainCode;
        this.requestId = builder.requestId;
        this.toolId = builder.toolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return toolId
     */
    public String getToolId() {
        return this.toolId;
    }

    public static final class Builder {
        private String domainCode; 
        private String requestId; 
        private String toolId; 

        private Builder() {
        } 

        private Builder(CreateCommandResponseBody model) {
            this.domainCode = model.domainCode;
            this.requestId = model.requestId;
            this.toolId = model.toolId;
        } 

        /**
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.domainCode = domainCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ToolId.
         */
        public Builder toolId(String toolId) {
            this.toolId = toolId;
            return this;
        }

        public CreateCommandResponseBody build() {
            return new CreateCommandResponseBody(this);
        } 

    } 

}
