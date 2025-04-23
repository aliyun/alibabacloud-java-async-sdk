// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeIspFlushCacheRemainQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheRemainQuotaResponseBody</p>
 */
public class DescribeIspFlushCacheRemainQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TelecomRemainQuota")
    private Integer telecomRemainQuota;

    private DescribeIspFlushCacheRemainQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.telecomRemainQuota = builder.telecomRemainQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspFlushCacheRemainQuotaResponseBody create() {
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
     * @return telecomRemainQuota
     */
    public Integer getTelecomRemainQuota() {
        return this.telecomRemainQuota;
    }

    public static final class Builder {
        private String requestId; 
        private Integer telecomRemainQuota; 

        private Builder() {
        } 

        private Builder(DescribeIspFlushCacheRemainQuotaResponseBody model) {
            this.requestId = model.requestId;
            this.telecomRemainQuota = model.telecomRemainQuota;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TelecomRemainQuota.
         */
        public Builder telecomRemainQuota(Integer telecomRemainQuota) {
            this.telecomRemainQuota = telecomRemainQuota;
            return this;
        }

        public DescribeIspFlushCacheRemainQuotaResponseBody build() {
            return new DescribeIspFlushCacheRemainQuotaResponseBody(this);
        } 

    } 

}
