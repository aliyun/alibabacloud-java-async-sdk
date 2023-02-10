// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckFixDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckFixDetailsRequest</p>
 */
public class DescribeCheckFixDetailsRequest extends Request {
    @Query
    @NameInMap("CheckIds")
    private String checkIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskId")
    private Long riskId;

    private DescribeCheckFixDetailsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.lang = builder.lang;
        this.riskId = builder.riskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckFixDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public String getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    public static final class Builder extends Request.Builder<DescribeCheckFixDetailsRequest, Builder> {
        private String checkIds; 
        private String lang; 
        private Long riskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckFixDetailsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.lang = request.lang;
            this.riskId = request.riskId;
        } 

        /**
         * The ID of the risk item.
         * <p>
         * 
         * >  You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the IDs of risk items.
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
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
         * The ID of the baseline.
         * <p>
         * 
         * >  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of baselines.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        @Override
        public DescribeCheckFixDetailsRequest build() {
            return new DescribeCheckFixDetailsRequest(this);
        } 

    } 

}
