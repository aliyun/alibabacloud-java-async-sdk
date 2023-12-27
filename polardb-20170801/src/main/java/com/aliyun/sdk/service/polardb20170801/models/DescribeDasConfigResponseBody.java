// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDasConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDasConfigResponseBody</p>
 */
public class DescribeDasConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @NameInMap("StorageUpperBound")
    private Long storageUpperBound;

    private DescribeDasConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageUpperBound = builder.storageUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDasConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageUpperBound
     */
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public static final class Builder {
        private String requestId; 
        private String storageAutoScale; 
        private Long storageUpperBound; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageAutoScale.
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * StorageUpperBound.
         */
        public Builder storageUpperBound(Long storageUpperBound) {
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        public DescribeDasConfigResponseBody build() {
            return new DescribeDasConfigResponseBody(this);
        } 

    } 

}
