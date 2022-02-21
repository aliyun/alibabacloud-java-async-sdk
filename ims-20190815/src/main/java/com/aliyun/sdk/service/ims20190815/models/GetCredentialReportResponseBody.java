// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetCredentialReportResponseBody</p>
 */
public class GetCredentialReportResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("GeneratedTime")
    private String generatedTime;

    @NameInMap("RequestId")
    private String requestId;

    private GetCredentialReportResponseBody(Builder builder) {
        this.content = builder.content;
        this.generatedTime = builder.generatedTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return generatedTime
     */
    public String getGeneratedTime() {
        return this.generatedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String generatedTime; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * GeneratedTime.
         */
        public Builder generatedTime(String generatedTime) {
            this.generatedTime = generatedTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCredentialReportResponseBody build() {
            return new GetCredentialReportResponseBody(this);
        } 

    } 

}
