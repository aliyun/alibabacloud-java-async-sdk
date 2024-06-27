// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplateDownloadResponseBody</p>
 */
public class DescribeTemplateDownloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Boolean data;

    private DescribeTemplateDownloadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateDownloadResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        public DescribeTemplateDownloadResponseBody build() {
            return new DescribeTemplateDownloadResponseBody(this);
        } 

    } 

}
