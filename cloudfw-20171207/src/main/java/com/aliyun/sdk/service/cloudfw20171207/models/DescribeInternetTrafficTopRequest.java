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
 * {@link DescribeInternetTrafficTopRequest} extends {@link RequestModel}
 *
 * <p>DescribeInternetTrafficTopRequest</p>
 */
public class DescribeInternetTrafficTopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleResult")
    private String ruleResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSource")
    private String ruleSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowCountryName")
    private String showCountryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeInternetTrafficTopRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.direction = builder.direction;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.limit = builder.limit;
        this.ruleResult = builder.ruleResult;
        this.ruleSource = builder.ruleSource;
        this.showCountryName = builder.showCountryName;
        this.sort = builder.sort;
        this.sourceCode = builder.sourceCode;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTrafficTopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
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
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return ruleResult
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * @return ruleSource
     */
    public String getRuleSource() {
        return this.ruleSource;
    }

    /**
     * @return showCountryName
     */
    public String getShowCountryName() {
        return this.showCountryName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceCode
     */
    public String getSourceCode() {
        return this.sourceCode;
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

    public static final class Builder extends Request.Builder<DescribeInternetTrafficTopRequest, Builder> {
        private String dataType; 
        private String direction; 
        private String endTime; 
        private String lang; 
        private String limit; 
        private String ruleResult; 
        private String ruleSource; 
        private String showCountryName; 
        private String sort; 
        private String sourceCode; 
        private String sourceIp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInternetTrafficTopRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.direction = request.direction;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.limit = request.limit;
            this.ruleResult = request.ruleResult;
            this.ruleSource = request.ruleSource;
            this.showCountryName = request.showCountryName;
            this.sort = request.sort;
            this.sourceCode = request.sourceCode;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The type of traffic data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in_src_ip</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The traffic direction.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The end time. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1734055824</p>
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
         * <p>The maximum number of top entries to return. The default value is 50. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The action of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * <p>The source of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleSource(String ruleSource) {
            this.putQueryParameter("RuleSource", ruleSource);
            this.ruleSource = ruleSource;
            return this;
        }

        /**
         * <p>The name of the country to display.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        public Builder showCountryName(String showCountryName) {
            this.putQueryParameter("ShowCountryName", showCountryName);
            this.showCountryName = showCountryName;
            return this;
        }

        /**
         * <p>The sorting method.</p>
         * 
         * <strong>example:</strong>
         * <p>in_bytes</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The tracing code for the source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun</p>
         */
        public Builder sourceCode(String sourceCode) {
            this.putQueryParameter("SourceCode", sourceCode);
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>117.82.14.XXX</p>
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
        public DescribeInternetTrafficTopRequest build() {
            return new DescribeInternetTrafficTopRequest(this);
        } 

    } 

}
