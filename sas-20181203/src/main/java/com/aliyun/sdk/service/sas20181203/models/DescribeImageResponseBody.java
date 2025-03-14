// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageResponseBody</p>
 */
public class DescribeImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeImageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the image digest.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageResponseBody build() {
            return new DescribeImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        private Data(Builder builder) {
            this.digest = builder.digest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        public static final class Builder {
            private String digest; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.digest = model.digest;
            } 

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>0afb98d97f1a4030782fcf47e186909e5ad957bcc182d8be70334e0684b2****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
