// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link PublishCodeSourceResponseBody} extends {@link TeaModel}
 *
 * <p>PublishCodeSourceResponseBody</p>
 */
public class PublishCodeSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeSourceId")
    private String codeSourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublishCodeSourceResponseBody(Builder builder) {
        this.codeSourceId = builder.codeSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishCodeSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeSourceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PublishCodeSourceResponseBody model) {
            this.codeSourceId = model.codeSourceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the code source that is successfully published.</p>
         * 
         * <strong>example:</strong>
         * <p>code-a797*******</p>
         */
        public Builder codeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishCodeSourceResponseBody build() {
            return new PublishCodeSourceResponseBody(this);
        } 

    } 

}
