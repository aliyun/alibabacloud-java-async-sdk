// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetSnapshotUrlsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotUrlsResponseBody</p>
 */
public class GetSnapshotUrlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotUrls")
    private java.util.List<String> snapshotUrls;

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
     * @return snapshotUrls
     */
    public java.util.List<String> getSnapshotUrls() {
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
        private java.util.List<String> snapshotUrls; 
        private Integer total; 
        private String webVTTUrl; 

        private Builder() {
        } 

        private Builder(GetSnapshotUrlsResponseBody model) {
            this.requestId = model.requestId;
            this.snapshotUrls = model.snapshotUrls;
            this.total = model.total;
            this.webVTTUrl = model.webVTTUrl;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of snapshot URLs.</p>
         */
        public Builder snapshotUrls(java.util.List<String> snapshotUrls) {
            this.snapshotUrls = snapshotUrls;
            return this;
        }

        /**
         * <p>The total number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The URL of the WebVTT file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/ouoput.vtt">http://test-bucket.oss-cn-shanghai.aliyuncs.com/ouoput.vtt</a></p>
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
