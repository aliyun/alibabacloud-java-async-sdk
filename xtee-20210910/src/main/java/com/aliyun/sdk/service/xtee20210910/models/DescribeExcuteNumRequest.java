// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeExcuteNumRequest} extends {@link RequestModel}
 *
 * <p>DescribeExcuteNumRequest</p>
 */
public class DescribeExcuteNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Degree")
    private String degree;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private DescribeExcuteNumRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.degree = builder.degree;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExcuteNumRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return degree
     */
    public String getDegree() {
        return this.degree;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeExcuteNumRequest, Builder> {
        private String code; 
        private String degree; 
        private String endDate; 
        private String lang; 
        private String sourceIp; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExcuteNumRequest request) {
            super(request);
            this.code = request.code;
            this.degree = request.degree;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
        } 

        /**
         * <p>Service code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>saf_all</p>
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>This field is currently unused and has no query significance.</p>
         * 
         * <strong>example:</strong>
         * <p>暂时不需要传入</p>
         */
        public Builder degree(String degree) {
            this.putQueryParameter("Degree", degree);
            this.degree = degree;
            return this;
        }

        /**
         * <p>End date, format yyyy-MM-dd, e.g., 2025-03-13.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-15</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Request source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>220.250.21.83</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Start date, format yyyy-MM-dd, e.g., 2025-03-10.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-10</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeExcuteNumRequest build() {
            return new DescribeExcuteNumRequest(this);
        } 

    } 

}
