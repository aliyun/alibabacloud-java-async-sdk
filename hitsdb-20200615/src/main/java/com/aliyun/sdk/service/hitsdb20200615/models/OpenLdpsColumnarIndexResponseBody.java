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
 * {@link OpenLdpsColumnarIndexResponseBody} extends {@link TeaModel}
 *
 * <p>OpenLdpsColumnarIndexResponseBody</p>
 */
public class OpenLdpsColumnarIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OpenLdpsColumnarIndexResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenLdpsColumnarIndexResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OpenLdpsColumnarIndexResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenLdpsColumnarIndexResponseBody build() {
            return new OpenLdpsColumnarIndexResponseBody(this);
        } 

    } 

}
