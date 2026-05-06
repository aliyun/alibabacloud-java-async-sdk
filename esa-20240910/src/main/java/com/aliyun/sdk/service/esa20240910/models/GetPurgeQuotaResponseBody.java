// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetPurgeQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetPurgeQuotaResponseBody</p>
 */
public class GetPurgeQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private String quota;

    @com.aliyun.core.annotation.NameInMap("Quota30Day")
    private String quota30Day;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private String usage;

    @com.aliyun.core.annotation.NameInMap("Usage30Day")
    private String usage30Day;

    private GetPurgeQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.quota30Day = builder.quota30Day;
        this.requestId = builder.requestId;
        this.usage = builder.usage;
        this.usage30Day = builder.usage30Day;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPurgeQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quota
     */
    public String getQuota() {
        return this.quota;
    }

    /**
     * @return quota30Day
     */
    public String getQuota30Day() {
        return this.quota30Day;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return usage30Day
     */
    public String getUsage30Day() {
        return this.usage30Day;
    }

    public static final class Builder {
        private String quota; 
        private String quota30Day; 
        private String requestId; 
        private String usage; 
        private String usage30Day; 

        private Builder() {
        } 

        private Builder(GetPurgeQuotaResponseBody model) {
            this.quota = model.quota;
            this.quota30Day = model.quota30Day;
            this.requestId = model.requestId;
            this.usage = model.usage;
            this.usage30Day = model.usage30Day;
        } 

        /**
         * <p>The total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder quota(String quota) {
            this.quota = quota;
            return this;
        }

        /**
         * Quota30Day.
         */
        public Builder quota30Day(String quota30Day) {
            this.quota30Day = quota30Day;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The quota usage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Usage30Day.
         */
        public Builder usage30Day(String usage30Day) {
            this.usage30Day = usage30Day;
            return this;
        }

        public GetPurgeQuotaResponseBody build() {
            return new GetPurgeQuotaResponseBody(this);
        } 

    } 

}
