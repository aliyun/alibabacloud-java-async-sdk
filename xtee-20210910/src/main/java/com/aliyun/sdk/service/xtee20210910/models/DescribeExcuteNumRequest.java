// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * Degree.
         */
        public Builder degree(String degree) {
            this.putQueryParameter("Degree", degree);
            this.degree = degree;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * StartDate.
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
