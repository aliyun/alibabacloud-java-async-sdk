// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsBlockListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsBlockListResponseBody</p>
 */
public class DescribeLiveStreamsBlockListResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamUrls")
    private StreamUrls streamUrls;

    @NameInMap("TotalNum")
    private Integer totalNum;

    @NameInMap("TotalPage")
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

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamUrls.
         */
        public Builder streamUrls(StreamUrls streamUrls) {
            this.streamUrls = streamUrls;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeLiveStreamsBlockListResponseBody build() {
            return new DescribeLiveStreamsBlockListResponseBody(this);
        } 

    } 

    public static class StreamUrls extends TeaModel {
        @NameInMap("StreamUrl")
        private java.util.List < String > streamUrl;

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
        public java.util.List < String > getStreamUrl() {
            return this.streamUrl;
        }

        public static final class Builder {
            private java.util.List < String > streamUrl; 

            /**
             * StreamUrl.
             */
            public Builder streamUrl(java.util.List < String > streamUrl) {
                this.streamUrl = streamUrl;
                return this;
            }

            public StreamUrls build() {
                return new StreamUrls(this);
            } 

        } 

    }
}
