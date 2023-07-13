// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryImagesResponseBody} extends {@link TeaModel}
 *
 * <p>SummaryImagesResponseBody</p>
 */
public class SummaryImagesResponseBody extends TeaModel {
    @NameInMap("ImagesName")
    private String imagesName;

    @NameInMap("RequestId")
    private String requestId;

    private SummaryImagesResponseBody(Builder builder) {
        this.imagesName = builder.imagesName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SummaryImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagesName
     */
    public String getImagesName() {
        return this.imagesName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imagesName; 
        private String requestId; 

        /**
         * ImagesName.
         */
        public Builder imagesName(String imagesName) {
            this.imagesName = imagesName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SummaryImagesResponseBody build() {
            return new SummaryImagesResponseBody(this);
        } 

    } 

}
