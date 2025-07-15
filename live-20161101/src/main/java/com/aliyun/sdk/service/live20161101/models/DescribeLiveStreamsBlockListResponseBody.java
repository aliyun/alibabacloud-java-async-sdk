// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamsBlockListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsBlockListResponseBody</p>
 */
public class DescribeLiveStreamsBlockListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamUrls")
    private StreamUrls streamUrls;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeLiveStreamsBlockListResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.streamUrls = builder.streamUrls;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsBlockListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamUrls
     */
    public StreamUrls getStreamUrls() {
        return this.streamUrls;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String domainName; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private StreamUrls streamUrls; 
        private Integer totalNum; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsBlockListResponseBody model) {
            this.domainName = model.domainName;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.streamUrls = model.streamUrls;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D855EC8-CF71-4615-B164-F7DFCB23B41D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The complete URL of each live stream.</p>
         */
        public Builder streamUrls(StreamUrls streamUrls) {
            this.streamUrls = streamUrls;
            return this;
        }

        /**
         * <p>The total number of live stream URLs that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsBlockListResponseBody build() {
            return new DescribeLiveStreamsBlockListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsBlockListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsBlockListResponseBody</p>
     */
    public static class StreamUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamUrl")
        private java.util.List<String> streamUrl;

        private StreamUrls(Builder builder) {
            this.streamUrl = builder.streamUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamUrls create() {
            return builder().build();
        }

        /**
         * @return streamUrl
         */
        public java.util.List<String> getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private java.util.List<String> streamUrl; 

            private Builder() {
            } 

            private Builder(StreamUrls model) {
                this.streamUrl = model.streamUrl;
            } 

            /**
             * StreamUrl.
             */
            public Builder streamUrl(java.util.List<String> streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public StreamUrls build() {
                return new StreamUrls(this);
            } 

        } 

    }
}
