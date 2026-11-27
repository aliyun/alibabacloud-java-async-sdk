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
         * <p>Specifies whether to perform Base64 encoding on <strong>client_url</strong> in the query results. Valid values:</p>
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
         * <p>The number of the page to return. Pages start from <strong>1</strong>.</p>
         * <blockquote>
         * <p>If you set Type to <strong>DETAILS</strong>, this parameter is required.</p>
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
         * <p>The filter conditions for attack events.</p>
         * <blockquote>
         * <p>Description of the crack_type field:</p>
         * <ul>
         * <li>3: MySQL brute-force attacks</li>
         * <li>4: FTP brute-force attacks</li>
         * <li>5: SSH brute-force attacks</li>
         * <li>6: RDP brute-force attacks</li>
         * <li>9: SQL Server brute-force attacks</li>
         * <li>101: Java Struts2 attack interception</li>
         * <li>102: Redis attack interception</li>
         * <li>103: AntSword WebShell communication</li>
         * <li>104: China Chopper WebShell communication</li>
         * <li>133: XISE WebShell communication</li>
         * <li>sqli: SQL injection</li>
         * <li>codei: code execution</li>
         * <li>xss: XSS attack</li>
         * <li>lfi: local file inclusion (LFI)</li>
         * <li>rfi: remote file inclusion (RFI)</li>
         * <li>webshell: web shell</li>
         * <li>upload: upload vulnerability</li>
         * <li>path: directory traversal</li>
         * <li>bypass: unauthorized access</li>
         * <li>csrf: CSRF</li>
         * <li>crlf: CRLF</li>
         * <li>other: other</li>
         * </ul>
         * </blockquote>
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
         * <p>The timestamp when the attack ended. Unit: seconds.</p>
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
         * <p>The language of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>Settings for the paged query: the number of attack events to return on each paging page.</p>
         * <blockquote>
         * <p>If you set Type to <strong>DETAILS</strong>, this parameter is required.</p>
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
         * <p>The timestamp when the attack started. By default, the data of the last 7 days is queried. Unit: seconds.</p>
         * <blockquote>
         * <p>The start time can only be within the last 40 days.</p>
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
         * <p>The details of the attack analysis. Valid values:</p>
         * <ul>
         * <li><strong>TOTAL</strong>: the number of attacks</li>
         * <li><strong>TREND</strong>: the attack trend</li>
         * <li><strong>PIE_CHART</strong>: Attack Type Distribution</li>
         * <li><strong>SOURCE_TOP</strong>: the top 5 attack sources</li>
         * <li><strong>CLIENT_TOP</strong>: the top 5 attacked assets</li>
         * <li><strong>DETAILS</strong>: the list of attack details</li>
         * </ul>
         * <blockquote>
         * <p>If you set Type to <strong>DETAILS</strong>, the paging parameters are required.</p>
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
