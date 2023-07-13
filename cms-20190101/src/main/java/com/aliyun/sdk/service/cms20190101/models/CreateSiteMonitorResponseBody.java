// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSiteMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSiteMonitorResponseBody</p>
 */
public class CreateSiteMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateResultList")
    private CreateResultList createResultList;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CreateSiteMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.createResultList = builder.createResultList;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSiteMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createResultList
     */
    public CreateResultList getCreateResultList() {
        return this.createResultList;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CreateResultList createResultList; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateResultList.
         */
        public Builder createResultList(CreateResultList createResultList) {
            this.createResultList = createResultList;
            return this;
        }

        /**
         * The result of the site monitoring task.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The URL or IP address that is monitored by the task.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the alert rule.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The interval at which detection requests are sent.
         * <p>
         * 
         * Valid values: 1, 5, 15, 30, and 60. Unit: minutes.
         * 
         * Default value: 1.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateSiteMonitorResponseBody build() {
            return new CreateSiteMonitorResponseBody(this);
        } 

    } 

    public static class CreateResultListCreateResultList extends TeaModel {
        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private CreateResultListCreateResultList(Builder builder) {
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultListCreateResultList create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String taskId; 
            private String taskName; 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public CreateResultListCreateResultList build() {
                return new CreateResultListCreateResultList(this);
            } 

        } 

    }
    public static class CreateResultList extends TeaModel {
        @NameInMap("CreateResultList")
        private java.util.List < CreateResultListCreateResultList> createResultList;

        private CreateResultList(Builder builder) {
            this.createResultList = builder.createResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResultList create() {
            return builder().build();
        }

        /**
         * @return createResultList
         */
        public java.util.List < CreateResultListCreateResultList> getCreateResultList() {
            return this.createResultList;
        }

        public static final class Builder {
            private java.util.List < CreateResultListCreateResultList> createResultList; 

            /**
             * CreateResultList.
             */
            public Builder createResultList(java.util.List < CreateResultListCreateResultList> createResultList) {
                this.createResultList = createResultList;
                return this;
            }

            public CreateResultList build() {
                return new CreateResultList(this);
            } 

        } 

    }
    public static class Contact extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Success")
        private String success;

        private Contact(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.ruleId = builder.ruleId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String requestId; 
            private String ruleId; 
            private String success; 

            /**
             * The status code that is returned after you associate the existing alert rule with the site monitoring task.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The following tables describe the extended options of the HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP. POP3, and FTP protocols specified by the TaskType parameter.  
             * <p>
             * 
             * - HTTP or HTTPS
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | http_method | String | The HTTP or HTTPS request method. Valid values: GET, POST, and HEAD. Default value: GET. |
             * | header | String | The custom HTTP headers that are separated by line feeds (\n). 
             * 
             * Each header must comply with the HTTP protocol. Each header must be a key-value pair in which the key and value are separated by a colon (:). |
             * | cookie | String | The HTTP cookie that is specified in compliance with the HTTP request standard. |
             * | request_content | String | The content of the request. The content can be in the JSON or form format. If this parameter is not specified, the request body is empty. |
             * | response_content | String | The expected content of the response. The first 64 bytes of the content returned by the HTTP server are checked during site monitoring. |
             * | match_rule | String | 0: If the response does not contain the content specified by the response_content parameter, the detection is successful.  
             * 
             * 1: If the response contains the content specified by the response_content parameter, the detection is successful. |
             * | username | String | If the username parameter is specified, the HTTP request contains the basic authentication header. |
             * | password | String | The password that is used to authenticate the HTTP or HTTPS request. |
             * | time_out | int | The timeout period. Unit: milliseconds. Default value: 5. |
             * | max_redirect | int | The maximum number of redirections. The default value is 5 for a detection point that is running on an Elastic Compute Service (ECS) instance and 2 for a detection point that is provided by a carrier.  
             * 
             * To disable redirections, set the value to 0. 
             * 
             * Valid values: 0 to 50. |
             * - PING
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | failure_rate | Text | If the rate of the failed pings exceeds the value of this parameter, the detection fails and the status code 610 or 615 is returned. The error message of the status code 610 is PingAllFail and the error message of the status code 615 is PingPartialFail. 
             * 
             * Default value: 0.1. |
             * | ping_num | int | The number of times that the monitored address is pinged. Default value: 10. 
             * 
             * Valid values: 1 to 100. |
             * - DNS
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | dns_server | string | The domain name or IP address of the Domain Name System (DNS) server. |
             * | dns_type | string | The type of the DNS records to query. Valid values: A, NS, CNAME, MX, TXT, ANY, and AAAA. |
             * | expect_value | string | The list of expected values. Separate the expected values with space characters. |
             * | match_rule | string | The relationship between the list of expected values and the list of DNS results. If the two lists do not meet the specified relationship, the detection fails. Valid values:    
             * 
             * Empty string or IN_DNS: The list of expected values is a subset of the list of DNS results.   
             * 
             * DNS_IN: The list of DNS results is a subset of the list of expected values.    
             * 
             * EQUAL: The list of DNS results is the same as the list of expected values.   
             * 
             * ANY: The list of DNS results intersects with the list of expected values. |
             * - FTP
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | port | int | The port number of the FTP server. If this parameter is not specified, the default value is used. The default port number is 21 for FTP and 990 for FTPS. |
             * | username | string | The username that is used to log on to the FTP server.  If this parameter is not specified, anonymous logon is used. |
             * | password | string | The password that is used to log on to the FTP server. |
             * - POP3 or SMTP
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | port | int | The port number of the POP3 or SMTP server. The default port number is 110 for POP3, 995 for POPS3, and 25 for SMTP. |
             * | username | string | The username that is used to log on to the POP3 or SMTP server. The username and password that are used to log on to the POP3 or SMTP server are required. |
             * | password | string | The password that is used to log on to the POP3 or SMTP server. The username and password that are used to log on to the POP3 or SMTP server are required. |
             * - TCP or UDP
             * 
             * | Parameter | Type | Description |
             * | --------- | ---- | ----------- |
             * | port | int | The port number of the TCP or UDP server. |
             * | request_content | string | The content of the request. If the request_format parameter is set to hex, the value of the request_content parameter is parsed in the hexadecimal format. |
             * | request_format | string | If the request_format parameter is set to another value, the value of the request_content parameter is sent to the TCP or UDP server as a regular string. |
             * | response_content | string | The content of the response. If the response from the TCP or UDP server does not contain the content specified by the response_content parameter, the detection fails.  
             * 
             * If the response_format parameter is set to hex, the value of the response_content parameter is parsed in the hexadecimal format.  
             * 
             * If the response_format parameter is set to another value, the value of the response_content parameter is parsed as a regular string. |
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Creates a site monitoring task.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The interval at which detection requests are sent.
             * <p>
             * 
             * Valid values: 1, 5, 15, 30, and 60. Unit: minutes.
             * 
             * Default value: 1.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    public static class AttachAlertResult extends TeaModel {
        @NameInMap("Contact")
        private java.util.List < Contact> contact;

        private AttachAlertResult(Builder builder) {
            this.contact = builder.contact;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachAlertResult create() {
            return builder().build();
        }

        /**
         * @return contact
         */
        public java.util.List < Contact> getContact() {
            return this.contact;
        }

        public static final class Builder {
            private java.util.List < Contact> contact; 

            /**
             * Contact.
             */
            public Builder contact(java.util.List < Contact> contact) {
                this.contact = contact;
                return this;
            }

            public AttachAlertResult build() {
                return new AttachAlertResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AttachAlertResult")
        private AttachAlertResult attachAlertResult;

        private Data(Builder builder) {
            this.attachAlertResult = builder.attachAlertResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachAlertResult
         */
        public AttachAlertResult getAttachAlertResult() {
            return this.attachAlertResult;
        }

        public static final class Builder {
            private AttachAlertResult attachAlertResult; 

            /**
             * The ID of the request.
             */
            public Builder attachAlertResult(AttachAlertResult attachAlertResult) {
                this.attachAlertResult = attachAlertResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
