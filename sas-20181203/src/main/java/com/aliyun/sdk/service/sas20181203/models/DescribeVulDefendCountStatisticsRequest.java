// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVulDefendCountStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulDefendCountStatisticsRequest</p>
 */
public class DescribeVulDefendCountStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulType")
    private String vulType;

    private DescribeVulDefendCountStatisticsRequest(Builder builder) {
        super(builder);
        this.vulType = builder.vulType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDefendCountStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vulType
     */
    public String getVulType() {
        return this.vulType;
    }

    public static final class Builder extends Request.Builder<DescribeVulDefendCountStatisticsRequest, Builder> {
        private String vulType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulDefendCountStatisticsRequest request) {
            super(request);
            this.vulType = request.vulType;
        } 

        /**
         * <p>The type of the vulnerabilities. Valid values:</p>
         * <ul>
         * <li>app: application vulnerabilities</li>
         * <li>emg: urgent vulnerabilities</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>emg</p>
         */
        public Builder vulType(String vulType) {
            this.putQueryParameter("VulType", vulType);
            this.vulType = vulType;
            return this;
        }

        @Override
        public DescribeVulDefendCountStatisticsRequest build() {
            return new DescribeVulDefendCountStatisticsRequest(this);
        } 

    } 

}
