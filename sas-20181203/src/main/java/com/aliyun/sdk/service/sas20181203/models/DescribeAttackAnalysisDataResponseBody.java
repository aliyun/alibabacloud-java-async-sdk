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
         * <p>The list of attack events. This parameter contains the following fields:</p>
         * <ul>
         * <li><strong>client_url</strong>: the URL of the attack request</li>
         * <li><strong>internetIp</strong>: the IP address of the asset instance</li>
         * <li><strong>instanceName</strong>: the name of the asset instance</li>
         * <li><strong>table_src</strong>: the data source</li>
         * <li><strong>uuid</strong>: the UUID of the asset instance</li>
         * <li><strong>crack_method</strong>: the attack request method</li>
         * <li><strong>crack_hour</strong>: the attack time</li>
         * <li><strong>crack_src_ip</strong>: the IP address of the attacker</li>
         * <li><strong>instanceId</strong>: the instance ID</li>
         * <li><strong>dst_port</strong>: the attacked port</li>
         * <li><strong>client_ip</strong>: the attacked IP address</li>
         * <li><strong>location</strong>: the region of the attacker</li>
         * <li><strong>aliuid</strong>: the Alibaba Cloud account ID</li>
         * <li><strong>crack_cnt</strong>: the number of attacks</li>
         * <li><strong>crack_type</strong>: the attack type. Valid values:<ul>
         * <li><strong>113</strong>: improper permissions</li>
         * <li><strong>112</strong>: redirect attack</li>
         * <li><strong>upload</strong>: upload vulnerability</li>
         * <li><strong>other</strong>: other</li>
         * <li><strong>webshell</strong>: web shell</li>
         * <li><strong>201</strong>: abnormal connection attack</li>
         * <li><strong>9</strong>: SQL Server brute-force attacks</li>
         * <li><strong>5</strong>: SSH brute-force attacks</li>
         * <li><strong>6</strong>: RDP brute-force attacks</li>
         * <li><strong>lfi</strong>: local file inclusion (LFI)</li>
         * <li><strong>7</strong>: code execution attack</li>
         * <li><strong>sqli</strong>: SQL injection</li>
         * <li><strong>209</strong>: web attack</li>
         * <li><strong>31</strong>: buffer overflow attack</li>
         * <li><strong>3</strong>: MySQL brute-force attacks</li>
         * <li><strong>30</strong>: clickjacking</li>
         * <li><strong>4</strong>: FTP brute-force attacks</li>
         * <li><strong>bypass</strong>: unauthorized access</li>
         * <li><strong>33</strong>: format character string</li>
         * <li><strong>deeplearning</strong>: other</li>
         * <li><strong>32</strong>: integer overflow attack</li>
         * <li><strong>203</strong>: brute-force attacks</li>
         * <li><strong>34</strong>: race condition</li>
         * <li><strong>rfi</strong>: remote file inclusion (RFI)</li>
         * <li><strong>0</strong>: SQL injection attack</li>
         * <li><strong>212</strong>: mining behavior</li>
         * <li><strong>213</strong>: reverse shell attack</li>
         * <li><strong>211</strong>: worms virus request</li>
         * <li><strong>61</strong>: timeout attack</li>
         * <li><strong>20</strong>: directory traversal attack</li>
         * <li><strong>xss</strong>: XSS attack</li>
         * <li><strong>22</strong>: unauthorized access attack</li>
         * <li><strong>21</strong>: scan attack</li>
         * <li><strong>24</strong>: file modification attack</li>
         * <li><strong>26</strong>: file delete attack</li>
         * <li><strong>25</strong>: file read attack</li>
         * <li><strong>28</strong>: CRLF injection attack</li>
         * <li><strong>27</strong>: logic error</li>
         * <li><strong>29</strong>: template injection attack</li>
         * <li><strong>csrf</strong>: CSRF</li>
         * <li><strong>path</strong>: directory traversal</li>
         * <li><strong>crlf</strong>: CRLF</li>
         * <li><strong>102</strong>: cross-site request forgery attack</li>
         * <li><strong>103</strong>: server-side request forgery (SSRF) attack</li>
         * <li><strong>101</strong>: cross-site scripting (XSS) attack</li>
         * <li><strong>11</strong>: file inclusion attack</li>
         * <li><strong>10</strong>: file upload attack</li>
         * <li><strong>12</strong>: upload vulnerability</li>
         * <li><strong>15</strong>: access without authorization</li>
         * <li><strong>14</strong>: information leak attack</li>
         * <li><strong>17</strong>: XML entity injection attack</li>
         * <li><strong>16</strong>: insecure configuration</li>
         * <li><strong>19</strong>: LDAP injection attack</li>
         * <li><strong>18</strong>: XPath injection attack</li>
         * <li><strong>codei</strong>: code execution</li>
         * <li><strong>ai_webshell</strong>: intelligent defense against web shell upload</li>
         * <li><strong>alinet_webrce</strong>: adaptive web attack defense</li>
         * <li><strong>210</strong>: JSP web shell upload</li>
         * <li><strong>161</strong>: web shell upload</li>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The number of attack events returned per page during a paged query. Default value: 10, which indicates that 10 attack events are displayed per paging page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request. It is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>4C1AE3F3-18FA-4108-BBB9-AFA1A032756C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried attack events.</p>
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
