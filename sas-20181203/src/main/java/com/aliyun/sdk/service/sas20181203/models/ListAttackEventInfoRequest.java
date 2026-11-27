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
 * {@link ListAttackEventInfoRequest} extends {@link RequestModel}
 *
 * <p>ListAttackEventInfoRequest</p>
 */
public class ListAttackEventInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackInstance")
    private String attackInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPort")
    private String dstPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListAttackEventInfoRequest(Builder builder) {
        super(builder);
        this.attackInstance = builder.attackInstance;
        this.attackType = builder.attackType;
        this.currentPage = builder.currentPage;
        this.dstPort = builder.dstPort;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.srcIp = builder.srcIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttackEventInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackInstance
     */
    public String getAttackInstance() {
        return this.attackInstance;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dstPort
     */
    public String getDstPort() {
        return this.dstPort;
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
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAttackEventInfoRequest, Builder> {
        private String attackInstance; 
        private String attackType; 
        private Integer currentPage; 
        private String dstPort; 
        private Long endTime; 
        private String lang; 
        private Integer pageSize; 
        private String srcIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAttackEventInfoRequest request) {
            super(request);
            this.attackInstance = request.attackInstance;
            this.attackType = request.attackType;
            this.currentPage = request.currentPage;
            this.dstPort = request.dstPort;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.srcIp = request.srcIp;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The attacked asset. You can specify the instance name, public IP address, or private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_**</p>
         */
        public Builder attackInstance(String attackInstance) {
            this.putQueryParameter("AttackInstance", attackInstance);
            this.attackInstance = attackInstance;
            return this;
        }

        /**
         * <p>The attack type. Valid values:</p>
         * <ul>
         * <li>9: SQL Server brute-force attacks.</li>
         * <li>5: SSH brute-force attacks.</li>
         * <li>6: RDP brute-force attacks.</li>
         * <li>101: Java Struts2 attack interception.</li>
         * <li>102: Redis attack interception.</li>
         * <li>103: AntSword WebShell communication.</li>
         * <li>104: China Chopper WebShell communication.</li>
         * <li>133: XISE WebShell communication.</li>
         * <li>161: WebShell upload.</li>
         * <li>209: PHP WebShell upload.</li>
         * <li>210: JSP WebShell upload.</li>
         * <li>211: ASP WebShell upload.</li>
         * <li>215: WebShell upload with special suffix.</li>
         * <li>ai_webshell: Intelligent defense against WebShell upload.</li>
         * <li>java_common_rce: Interception of common Java RCE vulnerabilities.</li>
         * <li>alinet_webrce: Adaptive web attack defense.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>The page number of the current page for a paging query.</p>
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
         * <p>The attack target ports.</p>
         * 
         * <strong>example:</strong>
         * <p>9085</p>
         */
        public Builder dstPort(String dstPort) {
            this.putQueryParameter("DstPort", dstPort);
            this.dstPort = dstPort;
            return this;
        }

        /**
         * <p>The timestamp of the end time. This parameter is required. If it is not provided, the API returns an HTTP 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>1753152532550</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The maximum number of entries per page for a paging query.</p>
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
         * <p>The attack source IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>185.237.96.***</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * <p>The timestamp of the start time. The value is a UNIX timestamp in milliseconds. This parameter is required. If it is not provided, the API returns an HTTP 400 error.</p>
         * 
         * <strong>example:</strong>
         * <p>1752547732549</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAttackEventInfoRequest build() {
            return new ListAttackEventInfoRequest(this);
        } 

    } 

}
