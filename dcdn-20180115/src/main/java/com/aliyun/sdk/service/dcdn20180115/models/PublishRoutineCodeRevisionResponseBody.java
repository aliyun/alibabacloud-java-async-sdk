// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link PublishRoutineCodeRevisionResponseBody} extends {@link TeaModel}
 *
 * <p>PublishRoutineCodeRevisionResponseBody</p>
 */
public class PublishRoutineCodeRevisionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PublishRoutineCodeRevisionResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRoutineCodeRevisionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PublishRoutineCodeRevisionResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The version of the routine code that is published to the specified environment.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;CodeRevision&quot;: &quot;1620876959997924701&quot;</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A513734D-D17B-411E-864D-XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishRoutineCodeRevisionResponseBody build() {
            return new PublishRoutineCodeRevisionResponseBody(this);
        } 

    } 

}
