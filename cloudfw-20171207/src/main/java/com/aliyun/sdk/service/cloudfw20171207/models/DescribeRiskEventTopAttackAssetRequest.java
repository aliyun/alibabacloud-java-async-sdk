// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeRiskEventTopAttackAssetRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskEventTopAttackAssetRequest</p>
 */
public class DescribeRiskEventTopAttackAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackApp")
    private java.util.List<String> attackApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyVersion")
    private String buyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeRiskEventTopAttackAssetRequest(Builder builder) {
        super(builder);
        this.attackApp = builder.attackApp;
        this.attackType = builder.attackType;
        this.buyVersion = builder.buyVersion;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventTopAttackAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackApp
     */
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return buyVersion
     */
    public String getBuyVersion() {
        return this.buyVersion;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRiskEventTopAttackAssetRequest, Builder> {
        private java.util.List<String> attackApp; 
        private String attackType; 
        private String buyVersion; 
        private String endTime; 
        private String lang; 
        private String sourceIp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskEventTopAttackAssetRequest request) {
            super(request);
            this.attackApp = request.attackApp;
            this.attackType = request.attackType;
            this.buyVersion = request.buyVersion;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * AttackApp.
         */
        public Builder attackApp(java.util.List<String> attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * AttackType.
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * BuyVersion.
         */
        public Builder buyVersion(String buyVersion) {
            this.putQueryParameter("BuyVersion", buyVersion);
            this.buyVersion = buyVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1742955867</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1754273436</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRiskEventTopAttackAssetRequest build() {
            return new DescribeRiskEventTopAttackAssetRequest(this);
        } 

    } 

}
