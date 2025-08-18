// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetGlobalEventsStorageRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetGlobalEventsStorageRegionResponseBody</p>
 */
public class GetGlobalEventsStorageRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageRegion")
    private String storageRegion;

    private GetGlobalEventsStorageRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageRegion = builder.storageRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalEventsStorageRegionResponseBody create() {
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
     * @return storageRegion
     */
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public static final class Builder {
        private String requestId; 
        private String storageRegion; 

        private Builder() {
        } 

        private Builder(GetGlobalEventsStorageRegionResponseBody model) {
            this.requestId = model.requestId;
            this.storageRegion = model.storageRegion;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0474CD9D-DF37-55D4-8383-D978CFBE13A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The region where global events are stored.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ap-southeast-1</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the Singapore region</p>
         * <!-- -->
         * </li>
         * <li><p>cn-hangzhou</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>the China (Hangzhou) region</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder storageRegion(String storageRegion) {
            this.storageRegion = storageRegion;
            return this;
        }

        public GetGlobalEventsStorageRegionResponseBody build() {
            return new GetGlobalEventsStorageRegionResponseBody(this);
        } 

    } 

}
