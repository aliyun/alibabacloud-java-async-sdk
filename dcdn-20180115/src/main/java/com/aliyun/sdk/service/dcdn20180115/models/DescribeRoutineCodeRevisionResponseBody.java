// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCodeRevisionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRoutineCodeRevisionResponseBody</p>
 */
public class DescribeRoutineCodeRevisionResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.Map < String, ? > content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRoutineCodeRevisionResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineCodeRevisionResponseBody create() {
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
         * Content.
         */
        public Builder content(java.util.Map < String, ? > content) {
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

        public DescribeRoutineCodeRevisionResponseBody build() {
            return new DescribeRoutineCodeRevisionResponseBody(this);
        } 

    } 

}
