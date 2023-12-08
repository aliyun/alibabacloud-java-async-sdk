// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>FixCheckWarningsRequest</p>
 */
public class FixCheckWarningsRequest extends Request {
    @Query
    @NameInMap("CheckParams")
    @Validation(required = true)
    private String checkParams;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskId")
    private Long riskId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private FixCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkParams = builder.checkParams;
        this.lang = builder.lang;
        this.riskId = builder.riskId;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FixCheckWarningsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkParams
     */
    public String getCheckParams() {
        return this.checkParams;
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<FixCheckWarningsRequest, Builder> {
        private String checkParams; 
        private String lang; 
        private Long riskId; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(FixCheckWarningsRequest request) {
            super(request);
            this.checkParams = request.checkParams;
            this.lang = request.lang;
            this.riskId = request.riskId;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * The parameters for the baseline risk item that you want to fix.
         * <p>
         * 
         * *   **checkId**: the ID of the check item that corresponds to the baseline risk item.
         * 
         * *   **rules**: an array that consists of the rules applied to fixes.
         * 
         *     *   **value**: specifies whether a fix method is selected. Valid values: **0** and **1**. The value 0 indicates that no fix method is selected and the value 1 indicates that a fix method is selected.
         *     *   **ruleId**: the ID of the fix method.
         *     *   **paramList**: an array that consists of the details about the fix method.\
         *         • **paramName**: the name of the fix method.\
         *         • **value**: the value of the fix method.
         */
        public Builder checkParams(String checkParams) {
            this.putQueryParameter("CheckParams", checkParams);
            this.checkParams = checkParams;
            return this;
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
         * The ID of the baseline risk item.
         * <p>
         * 
         * >  To query specified baseline risk items and the check items of a specified server, you must provide the IDs of the baseline risk items. You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The UUID of the asset for which you want to fix the baseline risk item. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the UUIDs of assets.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public FixCheckWarningsRequest build() {
            return new FixCheckWarningsRequest(this);
        } 

    } 

}
