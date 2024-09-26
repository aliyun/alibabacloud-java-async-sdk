// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDataCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataCacheResponseBody</p>
 */
public class CreateDataCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCacheId")
    private String dataCacheId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataCacheResponseBody(Builder builder) {
        this.dataCacheId = builder.dataCacheId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataCacheResponseBody create() {
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
         * <p>The DataCache ID.</p>
         * 
         * <strong>example:</strong>
         * <p>edc-bp15l4vvys94oo******</p>
         */
        public Builder dataCacheId(String dataCacheId) {
            this.dataCacheId = dataCacheId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D81A4A13-6DCC-4579-AC62-90A6C3EC7BBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataCacheResponseBody build() {
            return new CreateDataCacheResponseBody(this);
        } 

    } 

}
