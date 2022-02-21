// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllCustomTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllCustomTemplatesResponseBody</p>
 */
public class GetAllCustomTemplatesResponseBody extends TeaModel {
    @NameInMap("CustomTemplates")
    private String customTemplates;

    @NameInMap("RequestId")
    private String requestId;

    private GetAllCustomTemplatesResponseBody(Builder builder) {
        this.customTemplates = builder.customTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllCustomTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return customTemplates
     */
    public String getCustomTemplates() {
        return this.customTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customTemplates; 
        private String requestId; 

        /**
         * CustomTemplates.
         */
        public Builder customTemplates(String customTemplates) {
            this.customTemplates = customTemplates;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAllCustomTemplatesResponseBody build() {
            return new GetAllCustomTemplatesResponseBody(this);
        } 

    } 

}
