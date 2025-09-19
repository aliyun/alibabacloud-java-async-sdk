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
 * {@link DescribeAttackAnalysisDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeAttackAnalysisDataRequest</p>
 */
public class DescribeAttackAnalysisDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Base64")
    private String base64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to encode the value of the <strong>client_url</strong> field in the query results by using the Base64 algorithm. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder base64(String base64) {
            this.putQueryParameter("Base64", base64);
            this.base64 = base64;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>.</p>
         * <blockquote>
         * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the CurrentPage parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The condition that is used to filter attack events.</p>
         * <blockquote>
         * <p> The following list describes the valid values of crack_type:</p>
         * </blockquote>
         * <ul>
         * <li><p>3: brute-force attack on MySQL</p>
         * </li>
         * <li><p>4: FTP brute-force attack</p>
         * </li>
         * <li><p>5: SSH brute-force attack</p>
         * </li>
         * <li><p>6: RDP brute-force attack</p>
         * </li>
         * <li><p>9: brute-force attack on Microsoft SQL Server</p>
         * </li>
         * <li><p>101: intercepted attack on Java Struts 2</p>
         * </li>
         * <li><p>102: intercepted attack on Redis</p>
         * </li>
         * <li><p>103: communication with AntSword Webshell</p>
         * </li>
         * <li><p>104: communication with China Chopper Webshell</p>
         * </li>
         * <li><p>133: communication with XISE Webshell</p>
         * </li>
         * <li><p>sqli: SQL injection</p>
         * </li>
         * <li><p>codei: code execution</p>
         * </li>
         * <li><p>xss: cross-site scripting (XSS)</p>
         * </li>
         * <li><p>lfi: local file inclusion</p>
         * </li>
         * <li><p>rfi: remote file inclusion</p>
         * </li>
         * <li><p>webshell: trojan script</p>
         * </li>
         * <li><p>upload: vulnerability upload</p>
         * </li>
         * <li><p>path: directory traversal</p>
         * </li>
         * <li><p>bypass: unauthorized access</p>
         * </li>
         * <li><p>csrf: cross-site request forgery (CSRF)</p>
         * </li>
         * <li><p>crlf: carriage return line feed (CRLF)</p>
         * </li>
         * <li><p>other: others</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;crack_type&quot;:&quot;9&quot;}</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The timestamp when the attack stops. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1649040221</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The number of entries to return on each page.</p>
         * <blockquote>
         * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the PageSize parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The timestamp at which the attack starts. By default, the statistics of the previous seven days are queried. Unit: seconds.</p>
         * <blockquote>
         * <p> The start time that you specify must be within the previous 40 days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1644027670</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The details of attack analysis. Valid values:</p>
         * <ul>
         * <li><strong>TOTAL</strong>: number of attacks</li>
         * <li><strong>TREND</strong>: attack trend</li>
         * <li><strong>PIE_CHART</strong>: distribution of attacks by type</li>
         * <li><strong>SOURCE_TOP</strong>: top 5 attack sources</li>
         * <li><strong>CLIENT_TOP</strong>: top 5 attacked assets</li>
         * <li><strong>DETAILS</strong>: attack details</li>
         * </ul>
         * <blockquote>
         * <p> If the Type parameter is set to <strong>DETAILS</strong>, you must specify the CurrentPage and PageSize parameters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DETAILS</p>
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
