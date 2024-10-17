// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSnapshotUrlsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotUrlsResponseBody</p>
 */
public class GetSnapshotUrlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotUrls")
    private java.util.List < String > snapshotUrls;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("WebVTTUrl")
    private String webVTTUrl;

    private GetSnapshotUrlsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotUrls = builder.snapshotUrls;
        this.total = builder.total;
        this.webVTTUrl = builder.webVTTUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotUrlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotUrls
     */
    public java.util.List < String > getSnapshotUrls() {
        return this.snapshotUrls;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return webVTTUrl
     */
    public String getWebVTTUrl() {
        return this.webVTTUrl;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > snapshotUrls; 
        private Integer total; 
        private String webVTTUrl; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotUrls.
         */
        public Builder snapshotUrls(java.util.List < String > snapshotUrls) {
            this.snapshotUrls = snapshotUrls;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * WebVTTUrl.
         */
        public Builder webVTTUrl(String webVTTUrl) {
            this.webVTTUrl = webVTTUrl;
            return this;
        }

        public GetSnapshotUrlsResponseBody build() {
            return new GetSnapshotUrlsResponseBody(this);
        } 

    } 

}
