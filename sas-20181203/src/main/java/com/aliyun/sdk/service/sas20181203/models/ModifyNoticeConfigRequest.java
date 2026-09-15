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
 * {@link ModifyNoticeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNoticeConfigRequest</p>
 */
public class ModifyNoticeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FocusLevel")
    private String focusLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Route")
    private Integer route;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeLimit")
    private Integer timeLimit;

    private ModifyNoticeConfigRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.focusLevel = builder.focusLevel;
        this.project = builder.project;
        this.route = builder.route;
        this.sourceIp = builder.sourceIp;
        this.timeLimit = builder.timeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNoticeConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return focusLevel
     */
    public String getFocusLevel() {
        return this.focusLevel;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return route
     */
    public Integer getRoute() {
        return this.route;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return timeLimit
     */
    public Integer getTimeLimit() {
        return this.timeLimit;
    }

    public static final class Builder extends Request.Builder<ModifyNoticeConfigRequest, Builder> {
        private String bizType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String focusLevel; 
        private String project; 
        private Integer route; 
        private String sourceIp; 
        private Integer timeLimit; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNoticeConfigRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.focusLevel = request.focusLevel;
            this.project = request.project;
            this.route = request.route;
            this.sourceIp = request.sourceIp;
            this.timeLimit = request.timeLimit;
        } 

        /**
         * <p>The notification configuration type. By default, notifications are sent by SMS, email, or internal message. Valid values:</p>
         * <ul>
         * <li><strong>cms</strong>: CloudMonitor push.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run without executing the actual operation.</li>
         * <li>false: performs the actual operation.</li>
         * </ul>
         * <p>Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The focus level. Separate multiple levels with commas (,).</p>
         * <p>When <strong>Project</strong> is set to <strong>yundun_soar_incident_generate</strong> or <strong>yundun_soar_incident_update</strong>, valid values:</p>
         * <ul>
         * <li><strong>CRITICAL</strong>: Critical.</li>
         * <li><strong>HIGH</strong>: High.</li>
         * <li><strong>MEDIUM</strong>: Medium.</li>
         * <li><strong>LOW</strong>: Low.</li>
         * <li><strong>INFO</strong>: Informational.</li>
         * </ul>
         * <p>When <strong>Project</strong> is set to <strong>yundun_sas_antiransomware_task</strong>, valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: Execution succeeded.</li>
         * <li><strong>Failed</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CRITICAL,HIGH</p>
         */
        public Builder focusLevel(String focusLevel) {
            this.putQueryParameter("FocusLevel", focusLevel);
            this.focusLevel = focusLevel;
            return this;
        }

        /**
         * <h3>Project identity</h3>
         * <h4>When the BizType field is empty: valid values</h4>
         * <ul>
         * <li><strong>yundun_security_Weekreport</strong>: Security weekly report (email only)</li>
         * <li><strong>sas_healthcheck</strong>: Baseline check</li>
         * <li><strong>yundun_defennce_antiRansomware_overflow</strong>: Anti-ransomware storage space exceeded</li>
         * <li><strong>yundun_sas_cloudsiem_log</strong>: Threat analysis log excess notification</li>
         * <li><strong>sas_suspicious</strong>: Security alert</li>
         * <li><strong>yundun_aegis_AV_true</strong>: Precise defense</li>
         * <li><strong>yundun_sas_ak_leakage AccessKey</strong>: AccessKey leak intelligence</li>
         * <li><strong>yundun_sas_config_alert</strong>: Cloud platform configuration check</li>
         * <li><strong>yundun_sas_vul_Emergency</strong>: Emergency vulnerability intelligence</li>
         * <li><strong>yundun_webguard_event</strong>: Web tamper-proofing</li>
         * <li><strong>yundun_sas_cloud_native_firewall</strong>: Container firewall anomaly alert notification (email only)</li>
         * <li><strong>yundun_sas_cloud_native_firewall_Defense</strong>: Container firewall active defense notification (email only)</li>
         * <li><strong>yundun_IP_Blocking</strong>: Malicious IP blocking alerting notification</li>
         * <li><strong>yundun_sas_anti_virus_config</strong>: Virus scan notification</li>
         * <li><strong>yundun_sas_log</strong>: Log storage exceeded</li>
         * <li><strong>yundun_honeypot_alarm</strong>: Cloud honeypot alerting</li>
         * <li><strong>aliyun_rasp_alarm</strong>: Application protection alerting</li>
         * <li><strong>yundun_soar_incident_generate</strong>: New security incident</li>
         * <li><strong>yundun_soar_incident_update</strong>: Updated security incident<blockquote>
         * <p><strong>yundun_security_Weekreport</strong> is sent as a weekly report to notify you of unresolved vulnerabilities.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <hr>
         * <h4>When the BizType field is <code>cms</code>: valid values</h4>
         * <ul>
         * <li><strong>Vul_event</strong>: Vulnerability result details</li>
         * <li><strong>Hc_summary</strong>: Baseline check result summary</li>
         * <li><strong>Cspm_summary</strong>: Cloud Security Posture Management (CSPM) result summary</li>
         * <li><strong>Vul_summary</strong>: Vulnerability result summary</li>
         * <li><strong>Agentless_event</strong>: Agentless detection result details</li>
         * <li><strong>Filedetect_event</strong>: Malicious file SDK result details</li>
         * <li><strong>Rasp_event</strong>: Application protection result details</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yundun_webguard_event</p>
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * <h3>Notification method</h3>
         * <h4>When BizType is empty</h4>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: SMS enabled</li>
         * <li>2: email enabled</li>
         * <li>4: internal message enabled</li>
         * <li>3: SMS and email enabled</li>
         * <li>5: SMS and internal message enabled</li>
         * <li>6: email and internal message enabled</li>
         * <li>7: SMS, email, and internal message all enabled</li>
         * </ul>
         * <h4>When BizType is <code>cms</code></h4>
         * <ul>
         * <li>0: CloudMonitor push disabled</li>
         * <li>1: CloudMonitor push enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder route(Integer route) {
            this.putQueryParameter("Route", route);
            this.route = route;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>42.178.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <h3>Notification time limit</h3>
         * <h4>When the BizType field is empty: valid values</h4>
         * <ul>
         * <li><strong>0</strong>: No limit.</li>
         * <li><strong>1</strong>: Notifications are sent only during 08:00-22:00.</li>
         * </ul>
         * <h4>When the BizType field is <code>cms</code></h4>
         * <p>Specifies the push frequency limit, in seconds. The minimum value is <strong>60</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeLimit(Integer timeLimit) {
            this.putQueryParameter("TimeLimit", timeLimit);
            this.timeLimit = timeLimit;
            return this;
        }

        @Override
        public ModifyNoticeConfigRequest build() {
            return new ModifyNoticeConfigRequest(this);
        } 

    } 

}
