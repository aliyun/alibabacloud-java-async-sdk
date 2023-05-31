// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackAnalysisDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttackAnalysisDataRequest</p>
 */
public class DescribeAttackAnalysisDataRequest extends Request {
    @Query
    @NameInMap("Base64")
    private String base64;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Data")
    private String data;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeAttackAnalysisDataRequest(Builder builder) {
        super(builder);
        this.base64 = builder.base64;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAnalysisDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return base64
     */
    public String getBase64() {
        return this.base64;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeAttackAnalysisDataRequest, Builder> {
        private String base64; 
        private Integer currentPage; 
        private String data; 
        private Long endTime; 
        private String lang; 
        private Integer pageSize; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAttackAnalysisDataRequest request) {
            super(request);
            this.base64 = request.base64;
            this.currentPage = request.currentPage;
            this.data = request.data;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * Specifies whether to encode the value of the **client_url** field in the query results by using the Base64 algorithm. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder base64(String base64) {
            this.putQueryParameter("Base64", base64);
            this.base64 = base64;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**.
         * <p>
         * 
         * >  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage parameter.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The condition that is used to filter attack events.
         * <p>
         * 
         * >  The following list describes the valid values of crack_type:
         * 
         * *   3: brute-force attack on MySQL
         * 
         * *   4: FTP brute-force attack
         * 
         * *   5: SSH brute-force attack
         * 
         * *   6: RDP brute-force attack
         * 
         * *   9: brute-force attack on Microsoft SQL Server
         * 
         * *   101: intercepted attack on Java Struts 2
         * 
         * *   102: intercepted attack on Redis
         * 
         * *   103: communication with AntSword Webshell
         * 
         * *   104: communication with China Chopper Webshell
         * 
         * *   133: communication with XISE Webshell
         * 
         * *   sqli: SQL injection
         * 
         * *   codei: code execution
         * 
         * *   xss: cross-site scripting (XSS)
         * 
         * *   lfi: local file inclusion
         * 
         * *   rfi: remote file inclusion
         * 
         * *   webshell: trojan script
         * 
         * *   upload: vulnerability upload
         * 
         * *   path: directory traversal
         * 
         * *   bypass: unauthorized access
         * 
         * *   csrf: cross-site request forgery (CSRF)
         * 
         * *   crlf: carriage return line feed (CRLF)
         * 
         * *   other: others
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The timestamp when the attack stops. Unit: seconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The number of entries to return on each page.
         * <p>
         * 
         * >  If the Type parameter is set to **DETAILS**, you must specify the PageSize parameter.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The timestamp at which the attack starts. By default, the statistics of the previous seven days are queried. Unit: seconds.
         * <p>
         * 
         * >  The start time that you specify must be within the previous 40 days.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The details of attack analysis. Valid values:
         * <p>
         * 
         * *   **TOTAL**: number of attacks
         * *   **TREND**: attack trend
         * *   **PIE_CHART**: distribution of attacks by type
         * *   **SOURCE_TOP**: top 5 attack sources
         * *   **CLIENT_TOP**: top 5 attacked assets
         * *   **DETAILS**: attack details
         * 
         * >  If the Type parameter is set to **DETAILS**, you must specify the CurrentPage and PageSize parameters.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeAttackAnalysisDataRequest build() {
            return new DescribeAttackAnalysisDataRequest(this);
        } 

    } 

}
