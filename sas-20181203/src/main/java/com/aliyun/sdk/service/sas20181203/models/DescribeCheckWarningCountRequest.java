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
 * {@link DescribeCheckWarningCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckWarningCountRequest</p>
 */
public class DescribeCheckWarningCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeCheckWarningCountRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.checkId = builder.checkId;
        this.riskId = builder.riskId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckWarningCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
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

    public static final class Builder extends Request.Builder<DescribeCheckWarningCountRequest, Builder> {
        private Long aliUid; 
        private Long checkId; 
        private Long riskId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckWarningCountRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.checkId = request.checkId;
            this.riskId = request.riskId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>103784262032****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCheckItemWarningSummary~~">ListCheckItemWarningSummary</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>926</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The ID of the risk item.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>2</strong>: verifying</li>
         * <li><strong>3</strong>: passed</li>
         * <li><strong>6</strong>: ignored</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCheckWarningCountRequest build() {
            return new DescribeCheckWarningCountRequest(this);
        } 

    } 

}
