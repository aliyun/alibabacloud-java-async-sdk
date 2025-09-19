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
 * {@link DescribeAttackAnalysisDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackAnalysisDataResponseBody</p>
 */
public class DescribeAttackAnalysisDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeAttackAnalysisDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAnalysisDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String data; 
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeAttackAnalysisDataResponseBody model) {
            this.data = model.data;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The attack events. Valid values:</p>
         * <ul>
         * <li><p><strong>client_url</strong>: the URL of the attack request.</p>
         * </li>
         * <li><p><strong>internetIp</strong>: the IP address of the asset.</p>
         * </li>
         * <li><p><strong>instanceName</strong>: the name of the asset.</p>
         * </li>
         * <li><p><strong>table_src</strong>: the data source.</p>
         * </li>
         * <li><p><strong>uuid</strong>: the UUID of the asset.</p>
         * </li>
         * <li><p><strong>crack_method</strong>: the method of the attack request.</p>
         * </li>
         * <li><p><strong>crack_hour</strong>: the attack time.</p>
         * </li>
         * <li><p><strong>crack_src_ip</strong>: the IP address from which the attack is launched.</p>
         * </li>
         * <li><p><strong>instanceId</strong>: the ID of the asset.</p>
         * </li>
         * <li><p><strong>dst_port</strong>: the attacked port.</p>
         * </li>
         * <li><p><strong>client_ip</strong>: the attacked IP address.</p>
         * </li>
         * <li><p><strong>location</strong>: the region from which the attack is launched.</p>
         * </li>
         * <li><p><strong>aliuid</strong>: the ID of the Alibaba Cloud account.</p>
         * </li>
         * <li><p><strong>crack_cnt</strong>: the number of times that the attack is launched.</p>
         * </li>
         * <li><p><strong>crack_type</strong>: the type of the attack. Valid values:</p>
         * <ul>
         * <li><strong>113</strong>: improper authorization.</li>
         * <li><strong>112</strong>: redirection attack.</li>
         * <li><strong>upload</strong>: vulnerability upload.</li>
         * <li><strong>other</strong>: others.</li>
         * <li><strong>webshell</strong>: trojan script.</li>
         * <li><strong>201</strong>: suspicious connection.</li>
         * <li><strong>9</strong>: brute-force attack on Microsoft SQL Server.</li>
         * <li><strong>5</strong>: SSH brute-force attack.</li>
         * <li><strong>6</strong>: RDP brute-force attack.</li>
         * <li><strong>lfi</strong>: local file inclusion.</li>
         * <li><strong>7</strong>: code execution.</li>
         * <li><strong>sqli</strong>: SQL injection.</li>
         * <li><strong>209</strong>: web attack.</li>
         * <li><strong>31</strong>: buffer overflow.</li>
         * <li><strong>3</strong>: brute-force attack on MySQL.</li>
         * <li><strong>30</strong>: clickjacking.</li>
         * <li><strong>4</strong>: FTP brute-force attack.</li>
         * <li><strong>bypass</strong>: unauthorized access.</li>
         * <li><strong>33</strong>: format string.</li>
         * <li><strong>deeplearning</strong>: others.</li>
         * <li><strong>32</strong>: integer overflow.</li>
         * <li><strong>203</strong>: brute-force attack.</li>
         * <li><strong>34</strong>: race condition.</li>
         * <li><strong>rfi</strong>: remote file inclusion.</li>
         * <li><strong>0</strong>: SQL injection attack.</li>
         * <li><strong>212</strong>: mining behavior.</li>
         * <li><strong>213</strong>: reverse shell.</li>
         * <li><strong>211</strong>: worm.</li>
         * <li><strong>61</strong>: session timeout.</li>
         * <li><strong>20</strong>: directory traversal.</li>
         * <li><strong>xss</strong>: XSS attack.</li>
         * <li><strong>22</strong>: unauthorized access.</li>
         * <li><strong>21</strong>: scan attack.</li>
         * <li><strong>24</strong>: file modification.</li>
         * <li><strong>26</strong>: file deletion.</li>
         * <li><strong>25</strong>: file reading.</li>
         * <li><strong>28</strong>: CRLF injection.</li>
         * <li><strong>27</strong>: logic error.</li>
         * <li><strong>29</strong>: template injection.</li>
         * <li><strong>csrf</strong>: CSRF.</li>
         * <li><strong>path</strong>: directory traversal.</li>
         * <li><strong>crlf</strong>: CRLF.</li>
         * <li><strong>102</strong>: CSRF.</li>
         * <li><strong>103</strong>: server-side request forgery (SSRF).</li>
         * <li><strong>101</strong>: XSS.</li>
         * <li><strong>11</strong>: file inclusion.</li>
         * <li><strong>10</strong>: file upload.</li>
         * <li><strong>12</strong>: vulnerability upload.</li>
         * <li><strong>15</strong>: unauthorized access.</li>
         * <li><strong>14</strong>: information leakage.</li>
         * <li><strong>17</strong>: XML entity injection.</li>
         * <li><strong>16</strong>: insecure configuration.</li>
         * <li><strong>19</strong>: Lightweight Directory Access Protocol (LDAP) injection.</li>
         * <li><strong>18</strong>: XPath injection.</li>
         * <li><strong>codei</strong>: code execution.</li>
         * <li><strong>ai_webshell</strong>: intelligent defense against webshell upload.</li>
         * <li><strong>alinet_webrce</strong>: adaptive web attack defense.</li>
         * <li><strong>210</strong>: JSP webshell upload.</li>
         * <li><strong>161</strong>: webshell upload.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;crack_hour&quot;:1662480000000,&quot;crack_cnt&quot;:471},{&quot;crack_hour&quot;:1662483600000,&quot;crack_cnt&quot;:461},{&quot;crack_hour&quot;:1662487200000,&quot;crack_cnt&quot;:445},{&quot;crack_hour&quot;:1662490800000,&quot;crack_cnt&quot;:471},{&quot;crack_hour&quot;:1662494400000,&quot;crack_cnt&quot;:534},{&quot;crack_hour&quot;:1662498000000,&quot;crack_cnt&quot;:652},{&quot;crack_hour&quot;:1662501600000,&quot;crack_cnt&quot;:706},{&quot;crack_hour&quot;:1662505200000,&quot;crack_cnt&quot;:613},{&quot;crack_hour&quot;:1662508800000,&quot;crack_cnt&quot;:578},{&quot;crack_hour&quot;:1662512400000,&quot;crack_cnt&quot;:577},{&quot;crack_hour&quot;:1662516000000,&quot;crack_cnt&quot;:616},{&quot;crack_hour&quot;:1662519600000,&quot;crack_cnt&quot;:597},{&quot;crack_hour&quot;:1662523200000,&quot;crack_cnt&quot;:575},{&quot;crack_hour&quot;:1662526800000,&quot;crack_cnt&quot;:507}]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4C1AE3F3-18FA-4108-BBB9-AFA1A032756C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of attack events returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAttackAnalysisDataResponseBody build() {
            return new DescribeAttackAnalysisDataResponseBody(this);
        } 

    } 

}
