// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SemanticQueryResponseBody} extends {@link TeaModel}
 *
 * <p>SemanticQueryResponseBody</p>
 */
public class SemanticQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < File > files;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SemanticQueryResponseBody(Builder builder) {
        this.files = builder.files;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SemanticQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return files
     */
    public java.util.List < File > getFiles() {
        return this.files;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < File > files; 
        private String requestId; 

        /**
         * <p>The files.</p>
         */
        public Builder files(java.util.List < File > files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SemanticQueryResponseBody build() {
            return new SemanticQueryResponseBody(this);
        } 

    } 

}
