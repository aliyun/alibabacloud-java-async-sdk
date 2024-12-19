// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDasConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDasConfigResponseBody</p>
 */
public class DescribeDasConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.NameInMap("StorageUpperBound")
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>593AE1C5-B70C-463F-9207-074639******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the automatic storage expansion feature is enabled for the standard cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>The maximum storage capacity of the standard cluster that is scaled up. Unit: GB.</p>
         * <blockquote>
         * <p> This parameter is returned when the StorageAutoScale parameter is set to Enable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
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
