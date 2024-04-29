// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private ValidateHcWarningsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.riskIds = builder.riskIds;
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
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ValidateHcWarningsRequest, Builder> {
        private String checkIds; 
        private String riskIds; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ValidateHcWarningsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.riskIds = request.riskIds;
            this.uuids = request.uuids;
        } 

        /**
         * The IDs of the check items. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of check items.
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * The list of IDs of the risk items that you want to verify. Separate multiple IDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of risk items.
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * The UUIDs of the servers on which you want to verify the risk items. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
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
