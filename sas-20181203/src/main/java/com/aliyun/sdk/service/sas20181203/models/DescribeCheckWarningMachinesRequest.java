// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckWarningMachinesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningMachinesRequest</p>
 */
public class DescribeCheckWarningMachinesRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private Long checkId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RiskId")
    private Long riskId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeCheckWarningMachinesRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.lang = builder.lang;
        this.riskId = builder.riskId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningMachinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCheckWarningMachinesRequest, Builder> {
        private Long checkId; 
        private String lang; 
        private Long riskId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningMachinesRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.lang = request.lang;
            this.riskId = request.riskId;
            this.status = request.status;
        } 

        /**
         * The ID of the check item.
         * <p>
         * 
         * > You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of check items.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
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
         * > You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of baselines.
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * Specifies whether the check item passed the baseline check. Valid values:
         * <p>
         * *   **1**: no
         * *   **3**: yes
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCheckWarningMachinesRequest build() {
            return new DescribeCheckWarningMachinesRequest(this);
        } 

    } 

}
