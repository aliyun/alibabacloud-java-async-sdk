// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link PreviewMCTableResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewMCTableResponseBody</p>
 */
public class PreviewMCTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<java.util.List<String>> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreviewMCTableResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewMCTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<java.util.List<String>> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<java.util.List<String>> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PreviewMCTableResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.List<java.util.List<String>> content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreviewMCTableResponseBody build() {
            return new PreviewMCTableResponseBody(this);
        } 

    } 

}
