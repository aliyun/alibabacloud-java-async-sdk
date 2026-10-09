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
 * {@link DescribeRiskEventStatisticRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskEventStatisticRequest</p>
 */
public class DescribeRiskEventStatisticRequest extends Request {
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

    private DescribeRiskEventStatisticRequest(Builder builder) {
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

    public static DescribeRiskEventStatisticRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRiskEventStatisticRequest, Builder> {
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

        private Builder(DescribeRiskEventStatisticRequest request) {
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
         * <p>The attacked application.</p>
         */
        public Builder attackApp(java.util.List<String> attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * <p>The attack type of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: anomalous connection</p>
         * </li>
         * <li><p><strong>2</strong>: command execution</p>
         * </li>
         * <li><p><strong>3</strong>: brute-force attack</p>
         * </li>
         * <li><p><strong>4</strong>: scanning</p>
         * </li>
         * <li><p><strong>5</strong>: other</p>
         * </li>
         * <li><p><strong>6</strong>: information leakage</p>
         * </li>
         * <li><p><strong>7</strong>: DoS attack</p>
         * </li>
         * <li><p><strong>8</strong>: overflow attack</p>
         * </li>
         * <li><p><strong>9</strong>: web attack</p>
         * </li>
         * <li><p><strong>10</strong>: trojan backdoor</p>
         * </li>
         * <li><p><strong>11</strong>: virus and worm</p>
         * </li>
         * <li><p><strong>12</strong>: mining</p>
         * </li>
         * <li><p><strong>13</strong>: reverse shell</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all attack types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>The edition of Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder buyVersion(String buyVersion) {
            this.putQueryParameter("BuyVersion", buyVersion);
            this.buyVersion = buyVersion;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408267</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the response.</p>
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
         * <p>The source IP address of the visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>218.76.30.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start time. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656664560</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRiskEventStatisticRequest build() {
            return new DescribeRiskEventStatisticRequest(this);
        } 

    } 

}
