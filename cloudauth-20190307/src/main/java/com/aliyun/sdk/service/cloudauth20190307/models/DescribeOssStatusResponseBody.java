// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeOssStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssStatusResponseBody</p>
 */
public class DescribeOssStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOssStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssStatusResponseBody create() {
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

        private Builder(DescribeOssStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>F2DB870B-EEB7-51BD-9F0A-B5D8D3C79308</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssStatusResponseBody build() {
            return new DescribeOssStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private String userStatus;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return userStatus
         */
        public String getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private String bucketName; 
            private String userStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.userStatus = model.userStatus;
            } 

            /**
             * <p>The name of the OSS bucket for delivering authentication information.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-aliyun-cloudauth-20250516xxxxxx</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>User activation status, SUCCESS indicates activated.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
