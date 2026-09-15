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
 * {@link ValidateHcWarningsRequest} extends {@link RequestModel}
 *
 * <p>ValidateHcWarningsRequest</p>
 */
public class ValidateHcWarningsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private String checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskIds")
    private String riskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ValidateHcWarningsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.riskIds = builder.riskIds;
        this.status = builder.status;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateHcWarningsRequest create() {
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
     * @return riskIds
     */
    public String getRiskIds() {
        return this.riskIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ValidateHcWarningsRequest, Builder> {
        private String checkIds; 
        private String riskIds; 
        private Integer status; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ValidateHcWarningsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.riskIds = request.riskIds;
            this.status = request.status;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The IDs of the check items. Separate multiple check item IDs with commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to obtain check item IDs.
         * Note: You must specify at least one of RiskIds and CheckIds. Otherwise, the API returns the HcIllegalParameter error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>695,234</p>
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The IDs of the risk items to verify. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCheckWarnings~~">DescribeCheckWarnings</a> operation to obtain this parameter.
         * Note: You must specify at least one of RiskIds and CheckIds. Otherwise, the API returns the HcIllegalParameter error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * <p>The status of the check items to verify.</p>
         * <ul>
         * <li><p>1: Not passed</p>
         * </li>
         * <li><p>3: Passed</p>
         * </li>
         * <li><p>5: Expired</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to verify. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain server UUIDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>78645c8e-2e89-441b-8eb***,a9622a6b-adb5-4dd3-929e,0136460a-1cb5-44e8-****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ValidateHcWarningsRequest build() {
            return new ValidateHcWarningsRequest(this);
        } 

    } 

}
