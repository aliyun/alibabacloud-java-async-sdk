// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetInstanceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceSummaryResponseBody</p>
 */
public class GetInstanceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoReissueCount")
    private Integer autoReissueCount;

    @com.aliyun.core.annotation.NameInMap("CertificateCount")
    private Integer certificateCount;

    @com.aliyun.core.annotation.NameInMap("InactiveCount")
    private Integer inactiveCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WillExpireCount")
    private Integer willExpireCount;

    private GetInstanceSummaryResponseBody(Builder builder) {
        this.autoReissueCount = builder.autoReissueCount;
        this.certificateCount = builder.certificateCount;
        this.inactiveCount = builder.inactiveCount;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.willExpireCount = builder.willExpireCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReissueCount
     */
    public Integer getAutoReissueCount() {
        return this.autoReissueCount;
    }

    /**
     * @return certificateCount
     */
    public Integer getCertificateCount() {
        return this.certificateCount;
    }

    /**
     * @return inactiveCount
     */
    public Integer getInactiveCount() {
        return this.inactiveCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return willExpireCount
     */
    public Integer getWillExpireCount() {
        return this.willExpireCount;
    }

    public static final class Builder {
        private Integer autoReissueCount; 
        private Integer certificateCount; 
        private Integer inactiveCount; 
        private String requestId; 
        private Integer totalCount; 
        private Integer willExpireCount; 

        private Builder() {
        } 

        private Builder(GetInstanceSummaryResponseBody model) {
            this.autoReissueCount = model.autoReissueCount;
            this.certificateCount = model.certificateCount;
            this.inactiveCount = model.inactiveCount;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.willExpireCount = model.willExpireCount;
        } 

        /**
         * AutoReissueCount.
         */
        public Builder autoReissueCount(Integer autoReissueCount) {
            this.autoReissueCount = autoReissueCount;
            return this;
        }

        /**
         * CertificateCount.
         */
        public Builder certificateCount(Integer certificateCount) {
            this.certificateCount = certificateCount;
            return this;
        }

        /**
         * InactiveCount.
         */
        public Builder inactiveCount(Integer inactiveCount) {
            this.inactiveCount = inactiveCount;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * WillExpireCount.
         */
        public Builder willExpireCount(Integer willExpireCount) {
            this.willExpireCount = willExpireCount;
            return this;
        }

        public GetInstanceSummaryResponseBody build() {
            return new GetInstanceSummaryResponseBody(this);
        } 

    } 

}
