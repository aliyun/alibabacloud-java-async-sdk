// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeDataSourceDataDownloadUrlResponseBody build() {
            return new DescribeDataSourceDataDownloadUrlResponseBody(this);
        } 

    } 

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

            /**
             * downloadFileUrl.
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
