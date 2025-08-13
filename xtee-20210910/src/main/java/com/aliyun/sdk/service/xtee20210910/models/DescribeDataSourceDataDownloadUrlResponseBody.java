// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeDataSourceDataDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSourceDataDownloadUrlResponseBody</p>
 */
public class DescribeDataSourceDataDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeDataSourceDataDownloadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceDataDownloadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeDataSourceDataDownloadUrlResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeDataSourceDataDownloadUrlResponseBody build() {
            return new DescribeDataSourceDataDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataSourceDataDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataSourceDataDownloadUrlResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("downloadFileUrl")
        private String downloadFileUrl;

        private ResultObject(Builder builder) {
            this.downloadFileUrl = builder.downloadFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return downloadFileUrl
         */
        public String getDownloadFileUrl() {
            return this.downloadFileUrl;
        }

        public static final class Builder {
            private String downloadFileUrl; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.downloadFileUrl = model.downloadFileUrl;
            } 

            /**
             * <p>Download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>https:/xxxxx.oss-cn-xxxxxx.aliyuncs.com/xxxx/xxx/xxxxxx/xxx/xxxxxxxxxx?Expires=1753421064&amp;OSSAccessKeyId=xxxxxxx&amp;Signature=xxxxxxx%3D</p>
             */
            public Builder downloadFileUrl(String downloadFileUrl) {
                this.downloadFileUrl = downloadFileUrl;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
