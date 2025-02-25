// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateOrgHonorTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrgHonorTemplateResponseBody</p>
 */
public class CreateOrgHonorTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("honorId")
    private String honorId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateOrgHonorTemplateResponseBody(Builder builder) {
        this.honorId = builder.honorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrgHonorTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return honorId
     */
    public String getHonorId() {
        return this.honorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String honorId; 
        private String requestId; 

        /**
         * honorId.
         */
        public Builder honorId(String honorId) {
            this.honorId = honorId;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrgHonorTemplateResponseBody build() {
            return new CreateOrgHonorTemplateResponseBody(this);
        } 

    } 

}
