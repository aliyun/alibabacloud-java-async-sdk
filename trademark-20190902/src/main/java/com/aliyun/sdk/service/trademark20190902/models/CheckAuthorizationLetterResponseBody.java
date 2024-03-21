// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAuthorizationLetterResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAuthorizationLetterResponseBody</p>
 */
public class CheckAuthorizationLetterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateUrl")
    private String templateUrl;

    @NameInMap("Tips")
    private String tips;

    private CheckAuthorizationLetterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateUrl = builder.templateUrl;
        this.tips = builder.tips;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAuthorizationLetterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateUrl
     */
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * @return tips
     */
    public String getTips() {
        return this.tips;
    }

    public static final class Builder {
        private String requestId; 
        private String templateUrl; 
        private String tips; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateUrl.
         */
        public Builder templateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }

        /**
         * Tips.
         */
        public Builder tips(String tips) {
            this.tips = tips;
            return this;
        }

        public CheckAuthorizationLetterResponseBody build() {
            return new CheckAuthorizationLetterResponseBody(this);
        } 

    } 

}
