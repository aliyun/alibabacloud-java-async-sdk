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
 * {@link FixCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>FixCheckWarningsRequest</p>
 */
public class FixCheckWarningsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionDays")
    private Integer retentionDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private Long riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private FixCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkParams = builder.checkParams;
        this.lang = builder.lang;
        this.retentionDays = builder.retentionDays;
        this.riskId = builder.riskId;
        this.snapshotName = builder.snapshotName;
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
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    /**
     * @return riskId
     */
    public Long getRiskId() {
        return this.riskId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
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
        private Integer retentionDays; 
        private Long riskId; 
        private String snapshotName; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(FixCheckWarningsRequest request) {
            super(request);
            this.checkParams = request.checkParams;
            this.lang = request.lang;
            this.retentionDays = request.retentionDays;
            this.riskId = request.riskId;
            this.snapshotName = request.snapshotName;
            this.sourceIp = request.sourceIp;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The parameters for the baseline risk item that you want to fix.</p>
         * <ul>
         * <li><p><strong>checkId</strong>: the ID of the check item that corresponds to the baseline risk item.</p>
         * </li>
         * <li><p><strong>rules</strong>: an array that consists of the rules applied to fixes.</p>
         * <ul>
         * <li><strong>value</strong>: specifies whether a fix method is selected. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that no fix method is selected and the value 1 indicates that a fix method is selected.</li>
         * <li><strong>ruleId</strong>: the ID of the fix method.</li>
         * <li><strong>paramList</strong>: an array that consists of the details about the fix method.<br>• <strong>paramName</strong>: the name of the fix method.<br>• <strong>value</strong>: the value of the fix method.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;checkId&quot;:8,&quot;rules&quot;:[{&quot;ruleId&quot;:&quot;rule.ssh_Idle.interval&quot;,&quot;value&quot;:1,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;600&quot;},{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;600&quot;}]},{&quot;ruleId&quot;:&quot;rule.ssh_Idle.count&quot;,&quot;value&quot;:1,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;3&quot;}]}]}]</p>
         */
        public Builder checkParams(String checkParams) {
            this.putQueryParameter("CheckParams", checkParams);
            this.checkParams = checkParams;
            return this;
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
         * <p>The retention period of the snapshot that is created when you fix the baseline risk. Valid values: 1 to 365. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder retentionDays(Integer retentionDays) {
            this.putQueryParameter("RetentionDays", retentionDays);
            this.retentionDays = retentionDays;
            return this;
        }

        /**
         * <p>The ID of the risk item.</p>
         * <blockquote>
         * <p> To query the information about the risk items and check items of a server, you must specify the IDs of the risk items. You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10354</p>
         */
        public Builder riskId(Long riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * <p>The name of the snapshot that is created when you fix the baseline risk.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_fix_2024-12-04</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>165.225.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The UUID of the asset for which you want to fix the baseline risk item. You can call the <a href="~~DescribeWarningMachines~~">DescribeWarningMachines</a> operation to query the UUIDs of assets.</p>
         * 
         * <strong>example:</strong>
         * <p>75a417dda5f25edb5bed8f208a9a****,c7e10fd794262a1510d5648f9e5d****</p>
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
