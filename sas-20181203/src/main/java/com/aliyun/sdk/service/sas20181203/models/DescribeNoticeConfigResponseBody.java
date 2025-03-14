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
 * {@link DescribeNoticeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNoticeConfigResponseBody</p>
 */
public class DescribeNoticeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NoticeConfigList")
    private java.util.List<NoticeConfigList> noticeConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNoticeConfigResponseBody(Builder builder) {
        this.noticeConfigList = builder.noticeConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNoticeConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return noticeConfigList
     */
    public java.util.List<NoticeConfigList> getNoticeConfigList() {
        return this.noticeConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NoticeConfigList> noticeConfigList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNoticeConfigResponseBody model) {
            this.noticeConfigList = model.noticeConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the notification settings.</p>
         */
        public Builder noticeConfigList(java.util.List<NoticeConfigList> noticeConfigList) {
            this.noticeConfigList = noticeConfigList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>D185B7FF-E24C-422D-83D3-C2A25C7A2727</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNoticeConfigResponseBody build() {
            return new DescribeNoticeConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNoticeConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNoticeConfigResponseBody</p>
     */
    public static class NoticeConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Route")
        private Integer route;

        @com.aliyun.core.annotation.NameInMap("TimeLimit")
        private Integer timeLimit;

        private NoticeConfigList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.currentPage = builder.currentPage;
            this.project = builder.project;
            this.route = builder.route;
            this.timeLimit = builder.timeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NoticeConfigList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
         * @return timeLimit
         */
        public Integer getTimeLimit() {
            return this.timeLimit;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer currentPage; 
            private String project; 
            private Integer route; 
            private Integer timeLimit; 

            private Builder() {
            } 

            private Builder(NoticeConfigList model) {
                this.aliUid = model.aliUid;
                this.currentPage = model.currentPage;
                this.project = model.project;
                this.route = model.route;
                this.timeLimit = model.timeLimit;
            } 

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>12123414****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The identifier of the notification item. Valid values:</p>
             * <ul>
             * <li><strong>yundun_security_Weekreport</strong>: notification for vulnerabilities</li>
             * <li><strong>yundun_sas_antiransomware_task</strong>: notification for results of restoration tasks</li>
             * <li><strong>sas_healthcheck</strong>: notification for baseline checks</li>
             * <li><strong>sas_suspicious</strong>: notification for alerts generated by Security Center</li>
             * <li><strong>yundun_aegis_AV_true</strong>: notification for precision defense</li>
             * <li><strong>yundun_sas_ak_leakage</strong>: notification for AccessKey pair leaks</li>
             * <li><strong>yundun_sas_config_alert</strong>: notification for configuration assessment</li>
             * <li><strong>yundun_sas_vul_Emergency</strong>: notification for urgent vulnerabilities</li>
             * <li><strong>yundun_webguard_event</strong>: notification for web tamper proofing</li>
             * <li><strong>yundun_sas_cloud_native_firewall</strong>: notification for alerts generated by the container firewall feature</li>
             * <li><strong>yundun_sas_cloud_native_firewall_Defense</strong>: notification for proactive defense implemented by the container firewall feature</li>
             * <li><strong>yundun_IP_Blocking</strong>: notification for blocked brute-force attacks initiated from malicious IP addresses</li>
             * <li><strong>yundun_sas_anti_virus_config</strong>: notification for virus scan</li>
             * <li><strong>yundun_sas_log</strong>: notification for excess logs</li>
             * <li><strong>yundun_honeypot_alarm</strong>: notification for alerts generated by the honeypot feature</li>
             * <li><strong>aliyun_rasp_alarm</strong>: notification for alerts generated by the application security feature</li>
             * <li><strong>virusScheduleTask</strong>: notification for completion of scheduled virus scans</li>
             * <li><strong>yundun_anti_Virus</strong>: notification that no security checks are performed</li>
             * <li><strong>sas_vulnerability</strong>: notification for vulnerabilities</li>
             * <li><strong>weeklyreport</strong>: notification for weekly reports</li>
             * <li><strong>agent</strong>: notification that the Security Center agent is offline</li>
             * <li><strong>bruteforcesuccess</strong>: notification for protection against brute-force attacks</li>
             * <li><strong>webshell</strong>: notification for webshells</li>
             * <li><strong>suspicious</strong>: notification for alerts generated by Server Guard</li>
             * <li><strong>patch</strong>: deprecated</li>
             * <li><strong>remotelogin</strong>: notification for remote logons</li>
             * <li><strong>health</strong>: notification for security checks</li>
             * <li><strong>yundun_sas_cloudsiem_log</strong>: notifications of insufficient threat analysis log capacity</li>
             * </ul>
             * <blockquote>
             * <p>If the value is <strong>yundun_security_Weekreport</strong>, weekly reports are sent to notify you of unhandled vulnerabilities.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sas_suspicious</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: text message</li>
             * <li><strong>2</strong>: email</li>
             * <li><strong>4</strong>: internal message</li>
             * <li><strong>3</strong>: text message and email</li>
             * <li><strong>5</strong>: text message and internal message</li>
             * <li><strong>6</strong>: email and internal message</li>
             * <li><strong>7</strong>: text message, email, and internal message</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder route(Integer route) {
                this.route = route;
                return this;
            }

            /**
             * <p>The time period during which Security Center sends notifications. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: any time</li>
             * <li><strong>1</strong>: 08:00 to 22:00</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder timeLimit(Integer timeLimit) {
                this.timeLimit = timeLimit;
                return this;
            }

            public NoticeConfigList build() {
                return new NoticeConfigList(this);
            } 

        } 

    }
}
