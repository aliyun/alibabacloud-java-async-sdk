// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCheckFixDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckFixDetailsRequest</p>
 */
public class DescribeCheckFixDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private String checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
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
         * <p>The ID of the risk item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the IDs of risk items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The ID of the baseline.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to query the IDs of baselines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>51</p>
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
