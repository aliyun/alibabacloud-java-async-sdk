// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateByAppForRegionResponseBody} extends {@link TeaModel}
 *
 * <p>SdkGenerateByAppForRegionResponseBody</p>
 */
public class SdkGenerateByAppForRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadLink")
    private String downloadLink;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SdkGenerateByAppForRegionResponseBody(Builder builder) {
        this.downloadLink = builder.downloadLink;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGenerateByAppForRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadLink
     */
    public String getDownloadLink() {
        return this.downloadLink;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String downloadLink; 
        private String requestId; 

        /**
         * DownloadLink.
         */
        public Builder downloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SdkGenerateByAppForRegionResponseBody build() {
            return new SdkGenerateByAppForRegionResponseBody(this);
        } 

    } 

}
