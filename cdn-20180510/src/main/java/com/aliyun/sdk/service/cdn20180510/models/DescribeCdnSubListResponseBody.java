// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSubListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSubListResponseBody</p>
 */
public class DescribeCdnSubListResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnSubListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSubListResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * The information about the custom report task.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnSubListResponseBody build() {
            return new DescribeCdnSubListResponseBody(this);
        } 

    } 

}
