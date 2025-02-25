// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CopyDataCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDataCacheResponseBody</p>
 */
public class CopyDataCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCacheId")
    private String dataCacheId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CopyDataCacheResponseBody(Builder builder) {
        this.dataCacheId = builder.dataCacheId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDataCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCacheId
     */
    public String getDataCacheId() {
        return this.dataCacheId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataCacheId; 
        private String requestId; 

        /**
         * <p>The ID generated for the DataCache in the destination region.</p>
         * 
         * <strong>example:</strong>
         * <p>edc-bp1423y6d7v7l6ua****</p>
         */
        public Builder dataCacheId(String dataCacheId) {
            this.dataCacheId = dataCacheId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58EE0CB3-C864-5395-A4F7-24F425074839</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopyDataCacheResponseBody build() {
            return new CopyDataCacheResponseBody(this);
        } 

    } 

}
