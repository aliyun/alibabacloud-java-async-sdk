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

        private Builder() {
        } 

        private Builder(DescribeDasConfigResponseBody model) {
            this.requestId = model.requestId;
            this.storageAutoScale = model.storageAutoScale;
            this.storageUpperBound = model.storageUpperBound;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>593AE1C5-B70C-463F-9207-074639******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic storage scaling for the Standard Edition cluster. Valid values:</p>
         * <ul>
         * <li>Enable</li>
         * <li>Disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>The maximum storage capacity that is allowed for storage automatic scaling of the Standard Edition cluster. Unit: GB.</p>
         * <blockquote>
         * <p> This parameter is valid only when the StorageAutoScale parameter is set to Enable.</p>
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
