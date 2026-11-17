// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateWebFilterTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWebFilterTemplateResponseBody</p>
 */
public class CreateWebFilterTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateId")
    private String webFilterTemplateId;

    private CreateWebFilterTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webFilterTemplateId = builder.webFilterTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebFilterTemplateResponseBody create() {
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
     * @return webFilterTemplateId
     */
    public String getWebFilterTemplateId() {
        return this.webFilterTemplateId;
    }

    public static final class Builder {
        private String requestId; 
        private String webFilterTemplateId; 

        private Builder() {
        } 

        private Builder(CreateWebFilterTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.webFilterTemplateId = model.webFilterTemplateId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the newly created web filtering template.</p>
         * 
         * <strong>example:</strong>
         * <p>wft-3f2a9c1d4b5e6f70</p>
         */
        public Builder webFilterTemplateId(String webFilterTemplateId) {
            this.webFilterTemplateId = webFilterTemplateId;
            return this;
        }

        public CreateWebFilterTemplateResponseBody build() {
            return new CreateWebFilterTemplateResponseBody(this);
        } 

    } 

}
