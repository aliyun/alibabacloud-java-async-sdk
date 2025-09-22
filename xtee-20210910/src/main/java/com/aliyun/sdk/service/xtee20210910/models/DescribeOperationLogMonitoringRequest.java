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
 * {@link DescribeOperationLogMonitoringRequest} extends {@link RequestModel}
 *
 * <p>DescribeOperationLogMonitoringRequest</p>
 */
public class DescribeOperationLogMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userNameSearch")
    private String userNameSearch;

    private DescribeOperationLogMonitoringRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.endDate = builder.endDate;
        this.regId = builder.regId;
        this.startDate = builder.startDate;
        this.userNameSearch = builder.userNameSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperationLogMonitoringRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userNameSearch
     */
    public String getUserNameSearch() {
        return this.userNameSearch;
    }

    public static final class Builder extends Request.Builder<DescribeOperationLogMonitoringRequest, Builder> {
        private String lang; 
        private String endDate; 
        private String regId; 
        private String startDate; 
        private String userNameSearch; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOperationLogMonitoringRequest request) {
            super(request);
            this.lang = request.lang;
            this.endDate = request.endDate;
            this.regId = request.regId;
            this.startDate = request.startDate;
            this.userNameSearch = request.userNameSearch;
        } 

        /**
         * <p>Language type of the returned message. Values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
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
         * <p>End date (in yyyy-MM-dd format, and the interval from the start date cannot exceed 90 days)</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Start date (in yyyy-MM-dd format, and the interval from the current date cannot exceed 90 days)</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-19</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>Operator.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder userNameSearch(String userNameSearch) {
            this.putQueryParameter("userNameSearch", userNameSearch);
            this.userNameSearch = userNameSearch;
            return this;
        }

        @Override
        public DescribeOperationLogMonitoringRequest build() {
            return new DescribeOperationLogMonitoringRequest(this);
        } 

    } 

}
