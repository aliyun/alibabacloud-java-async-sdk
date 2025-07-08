// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsPackageSummaryNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsPackageSummaryNewResponseBody</p>
 */
public class QuerySmsPackageSummaryNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertifyType")
    private Integer certifyType;

    @com.aliyun.core.annotation.NameInMap("InterPackageCount")
    private Long interPackageCount;

    @com.aliyun.core.annotation.NameInMap("InterPackageSum")
    private Long interPackageSum;

    @com.aliyun.core.annotation.NameInMap("MktPackageCount")
    private Long mktPackageCount;

    @com.aliyun.core.annotation.NameInMap("MktPackageSum")
    private Long mktPackageSum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsPackageCount")
    private Long smsPackageCount;

    @com.aliyun.core.annotation.NameInMap("SmsPackageSum")
    private Long smsPackageSum;

    @com.aliyun.core.annotation.NameInMap("SysPackageCount")
    private Long sysPackageCount;

    @com.aliyun.core.annotation.NameInMap("SysPackageSum")
    private Long sysPackageSum;

    private QuerySmsPackageSummaryNewResponseBody(Builder builder) {
        this.certifyType = builder.certifyType;
        this.interPackageCount = builder.interPackageCount;
        this.interPackageSum = builder.interPackageSum;
        this.mktPackageCount = builder.mktPackageCount;
        this.mktPackageSum = builder.mktPackageSum;
        this.requestId = builder.requestId;
        this.smsPackageCount = builder.smsPackageCount;
        this.smsPackageSum = builder.smsPackageSum;
        this.sysPackageCount = builder.sysPackageCount;
        this.sysPackageSum = builder.sysPackageSum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsPackageSummaryNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certifyType
     */
    public Integer getCertifyType() {
        return this.certifyType;
    }

    /**
     * @return interPackageCount
     */
    public Long getInterPackageCount() {
        return this.interPackageCount;
    }

    /**
     * @return interPackageSum
     */
    public Long getInterPackageSum() {
        return this.interPackageSum;
    }

    /**
     * @return mktPackageCount
     */
    public Long getMktPackageCount() {
        return this.mktPackageCount;
    }

    /**
     * @return mktPackageSum
     */
    public Long getMktPackageSum() {
        return this.mktPackageSum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsPackageCount
     */
    public Long getSmsPackageCount() {
        return this.smsPackageCount;
    }

    /**
     * @return smsPackageSum
     */
    public Long getSmsPackageSum() {
        return this.smsPackageSum;
    }

    /**
     * @return sysPackageCount
     */
    public Long getSysPackageCount() {
        return this.sysPackageCount;
    }

    /**
     * @return sysPackageSum
     */
    public Long getSysPackageSum() {
        return this.sysPackageSum;
    }

    public static final class Builder {
        private Integer certifyType; 
        private Long interPackageCount; 
        private Long interPackageSum; 
        private Long mktPackageCount; 
        private Long mktPackageSum; 
        private String requestId; 
        private Long smsPackageCount; 
        private Long smsPackageSum; 
        private Long sysPackageCount; 
        private Long sysPackageSum; 

        private Builder() {
        } 

        private Builder(QuerySmsPackageSummaryNewResponseBody model) {
            this.certifyType = model.certifyType;
            this.interPackageCount = model.interPackageCount;
            this.interPackageSum = model.interPackageSum;
            this.mktPackageCount = model.mktPackageCount;
            this.mktPackageSum = model.mktPackageSum;
            this.requestId = model.requestId;
            this.smsPackageCount = model.smsPackageCount;
            this.smsPackageSum = model.smsPackageSum;
            this.sysPackageCount = model.sysPackageCount;
            this.sysPackageSum = model.sysPackageSum;
        } 

        /**
         * CertifyType.
         */
        public Builder certifyType(Integer certifyType) {
            this.certifyType = certifyType;
            return this;
        }

        /**
         * InterPackageCount.
         */
        public Builder interPackageCount(Long interPackageCount) {
            this.interPackageCount = interPackageCount;
            return this;
        }

        /**
         * InterPackageSum.
         */
        public Builder interPackageSum(Long interPackageSum) {
            this.interPackageSum = interPackageSum;
            return this;
        }

        /**
         * MktPackageCount.
         */
        public Builder mktPackageCount(Long mktPackageCount) {
            this.mktPackageCount = mktPackageCount;
            return this;
        }

        /**
         * MktPackageSum.
         */
        public Builder mktPackageSum(Long mktPackageSum) {
            this.mktPackageSum = mktPackageSum;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmsPackageCount.
         */
        public Builder smsPackageCount(Long smsPackageCount) {
            this.smsPackageCount = smsPackageCount;
            return this;
        }

        /**
         * SmsPackageSum.
         */
        public Builder smsPackageSum(Long smsPackageSum) {
            this.smsPackageSum = smsPackageSum;
            return this;
        }

        /**
         * SysPackageCount.
         */
        public Builder sysPackageCount(Long sysPackageCount) {
            this.sysPackageCount = sysPackageCount;
            return this;
        }

        /**
         * SysPackageSum.
         */
        public Builder sysPackageSum(Long sysPackageSum) {
            this.sysPackageSum = sysPackageSum;
            return this;
        }

        public QuerySmsPackageSummaryNewResponseBody build() {
            return new QuerySmsPackageSummaryNewResponseBody(this);
        } 

    } 

}
