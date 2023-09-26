// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateResponseBody} extends {@link TeaModel}
 *
 * <p>SdkGenerateResponseBody</p>
 */
public class SdkGenerateResponseBody extends TeaModel {
    @NameInMap("DownloadLink")
    private String downloadLink;

    @NameInMap("RequestId")
    private String requestId;

    private SdkGenerateResponseBody(Builder builder) {
        this.downloadLink = builder.downloadLink;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGenerateResponseBody create() {
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

        public SdkGenerateResponseBody build() {
            return new SdkGenerateResponseBody(this);
        } 

    } 

}
