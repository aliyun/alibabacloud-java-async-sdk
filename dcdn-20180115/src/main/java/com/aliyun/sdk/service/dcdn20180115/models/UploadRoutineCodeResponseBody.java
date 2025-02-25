// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadRoutineCodeResponseBody} extends {@link TeaModel}
 *
 * <p>UploadRoutineCodeResponseBody</p>
 */
public class UploadRoutineCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map < String, ? > content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadRoutineCodeResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadRoutineCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.Map < String, ? > getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, ? > content; 
        private String requestId; 

        /**
         * <p>The content returned, such as the code version number and information about the code upload.</p>
         */
        public Builder content(java.util.Map < String, ? > content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DFA2027F-86C0-4421-9593-581A7993696C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadRoutineCodeResponseBody build() {
            return new UploadRoutineCodeResponseBody(this);
        } 

    } 

}
