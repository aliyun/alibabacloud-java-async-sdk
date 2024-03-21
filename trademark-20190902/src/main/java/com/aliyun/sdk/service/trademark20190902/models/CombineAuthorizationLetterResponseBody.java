// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CombineAuthorizationLetterResponseBody} extends {@link TeaModel}
 *
 * <p>CombineAuthorizationLetterResponseBody</p>
 */
public class CombineAuthorizationLetterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateCombineUrl")
    private String templateCombineUrl;

    private CombineAuthorizationLetterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateCombineUrl = builder.templateCombineUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CombineAuthorizationLetterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateCombineUrl
     */
    public String getTemplateCombineUrl() {
        return this.templateCombineUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String templateCombineUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateCombineUrl.
         */
        public Builder templateCombineUrl(String templateCombineUrl) {
            this.templateCombineUrl = templateCombineUrl;
            return this;
        }

        public CombineAuthorizationLetterResponseBody build() {
            return new CombineAuthorizationLetterResponseBody(this);
        } 

    } 

}
