// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryImagesInfoResponseBody} extends {@link TeaModel}
 *
 * <p>SummaryImagesInfoResponseBody</p>
 */
public class SummaryImagesInfoResponseBody extends TeaModel {
    @NameInMap("ImagesInfo")
    private String imagesInfo;

    @NameInMap("RequestId")
    private String requestId;

    private SummaryImagesInfoResponseBody(Builder builder) {
        this.imagesInfo = builder.imagesInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SummaryImagesInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagesInfo
     */
    public String getImagesInfo() {
        return this.imagesInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imagesInfo; 
        private String requestId; 

        /**
         * ImagesInfo.
         */
        public Builder imagesInfo(String imagesInfo) {
            this.imagesInfo = imagesInfo;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SummaryImagesInfoResponseBody build() {
            return new SummaryImagesInfoResponseBody(this);
        } 

    } 

}
