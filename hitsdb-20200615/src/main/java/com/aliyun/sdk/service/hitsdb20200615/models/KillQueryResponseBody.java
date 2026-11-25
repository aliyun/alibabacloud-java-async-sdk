// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link KillQueryResponseBody} extends {@link TeaModel}
 *
 * <p>KillQueryResponseBody</p>
 */
public class KillQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("RawData")
    private java.util.Map<String, ?> rawData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private KillQueryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.rawData = builder.rawData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return rawData
     */
    public java.util.Map<String, ?> getRawData() {
        return this.rawData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.Map<String, ?> rawData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(KillQueryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.rawData = model.rawData;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * RawData.
         */
        public Builder rawData(java.util.Map<String, ?> rawData) {
            this.rawData = rawData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public KillQueryResponseBody build() {
            return new KillQueryResponseBody(this);
        } 

    } 

}
