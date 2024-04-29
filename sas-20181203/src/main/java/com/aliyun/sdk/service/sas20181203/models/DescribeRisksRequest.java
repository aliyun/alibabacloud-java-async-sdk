// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeRisksRequest</p>
 */
public class DescribeRisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskName")
    private String riskName;

    private DescribeRisksRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.limit = builder.limit;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.riskId = builder.riskId;
        this.riskName = builder.riskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRisksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return riskName
     */
    public String getRiskName() {
        return this.riskName;
    }

    public static final class Builder extends Request.Builder<DescribeRisksRequest, Builder> {
        private String lang; 
        private Integer limit; 
        private Long resourceDirectoryAccountId; 
        private Long riskId; 
        private String riskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRisksRequest request) {
            super(request);
            this.lang = request.lang;
            this.limit = request.limit;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.riskId = request.riskId;
            this.riskName = request.riskName;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The maximum number of entries to return. Default value: 20.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The baseline ID.
         * <p>
         * 
         * >  You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the baseline IDs.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * The name of the baseline.
         */
        public Builder riskName(String riskName) {
            this.putQueryParameter("RiskName", riskName);
            this.riskName = riskName;
            return this;
        }

        @Override
        public DescribeRisksRequest build() {
            return new DescribeRisksRequest(this);
        } 

    } 

}
