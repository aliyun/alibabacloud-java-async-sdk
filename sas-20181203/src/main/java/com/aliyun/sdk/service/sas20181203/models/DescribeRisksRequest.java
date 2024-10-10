// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The baseline ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the baseline IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>docker</p>
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
