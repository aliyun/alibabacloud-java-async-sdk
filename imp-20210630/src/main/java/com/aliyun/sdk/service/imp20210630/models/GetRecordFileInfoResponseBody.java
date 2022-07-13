// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordFileInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecordFileInfoResponseBody</p>
 */
public class GetRecordFileInfoResponseBody extends TeaModel {
    @NameInMap("DownloadUrl")
    private String downloadUrl;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetRecordFileInfoResponseBody(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordFileInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String downloadUrl; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Result result; 

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetRecordFileInfoResponseBody build() {
            return new GetRecordFileInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ETag")
        private String eTag;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FileName")
        private String fileName;

        private Result(Builder builder) {
            this.eTag = builder.eTag;
            this.expireTime = builder.expireTime;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String eTag; 
            private String expireTime; 
            private String fileName; 

            /**
             * ETag.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
