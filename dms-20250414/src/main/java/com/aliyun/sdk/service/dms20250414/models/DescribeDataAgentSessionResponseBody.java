// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAgentSessionResponseBody</p>
 */
public class DescribeDataAgentSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDataAgentSessionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDataAgentSessionResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>18****-*****-*******7A3122F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The deletion succeeded.</li>
         * <li><strong>false</strong>: The deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDataAgentSessionResponseBody build() {
            return new DescribeDataAgentSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReceiveTime")
        private String receiveTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Artifacts(Builder builder) {
            this.description = builder.description;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.name = builder.name;
            this.receiveTime = builder.receiveTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String finishTime; 
            private String id; 
            private String name; 
            private String receiveTime; 
            private String startTime; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.description = model.description;
                this.finishTime = model.finishTime;
                this.id = model.id;
                this.name = model.name;
                this.receiveTime = model.receiveTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The brief description of the artifact. This field may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>a simple report</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the backend completed the artifact task. The value is a UNIX timestamp accurate to seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1778743587</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The globally unique artifact ID. If the report is generated by calling the SendChatMessage operation with MessageType set to REPORT, the artifact ID is the same as the MessageId value returned by the SendChatMessage operation.</p>
             * 
             * <strong>example:</strong>
             * <p>bab******33e1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The artifact name. This is usually a concatenated string generated by the project and aligns with the name field in the ListFileUpload operation. You can use this field to query the download URL of the artifact file.</p>
             * 
             * <strong>example:</strong>
             * <p>report_****_2026****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the backend received the artifact request. The value is a UNIX timestamp accurate to seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1778743587</p>
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * <p>The time when the backend actually started running the artifact task. The value is a UNIX timestamp accurate to seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1778743587</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The artifact status. Valid values:</p>
             * <ul>
             * <li>PENDING: The backend has received the task but has not started it.</li>
             * <li>RUNNING: The backend has started the task but has not completed it.</li>
             * <li>SUCCESS: The task succeeded. You can query the file information by calling the ListFileUpload operation.</li>
             * <li>FAILED: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The artifact type. Valid values: TextReport and WebReport.</p>
             * 
             * <strong>example:</strong>
             * <p>WebReport</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Capabilities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Capabilities(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capabilities create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(Capabilities model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the mounted capability.</p>
             * <ul>
             * <li>If Type is set to skill, the value indicates the skill ID.</li>
             * <li>If Type is set to dms_kb, the value indicates the knowledge base ID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kb-HZ-s3df*******ld08d</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type. Valid values:</p>
             * <ul>
             * <li>skill: skill</li>
             * <li>dms_kb: knowledge base</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dms_kb</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Capabilities build() {
                return new Capabilities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class ChatHistoryLocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ChatHistoryLocations(Builder builder) {
            this.key = builder.key;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatHistoryLocations create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String key; 
            private String url; 

            private Builder() {
            } 

            private Builder(ChatHistoryLocations model) {
                this.key = model.key;
                this.url = model.url;
            } 

            /**
             * <p>The key of the session playback history.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The OSS download URL of the session playback history.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ChatHistoryLocations build() {
                return new ChatHistoryLocations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        private DataSources(Builder builder) {
            this.category = builder.category;
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private String category; 
            private String detail; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.category = model.category;
                this.detail = model.detail;
            } 

            /**
             * <p>The data source category. Valid values:</p>
             * <ul>
             * <li><strong>CHAT</strong>: The data source is specified in a conversation by calling the CreateDataAgentSession or SendChatMessage operation.</li>
             * <li><strong>CUSTOM_AGENT</strong>: The data source comes from the preset analysis data scope in a custom agent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHAT</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The data source details. When Category is set to CHAT or CUSTOM_AGENT, the structure of Detail aligns with the structure of a single element in the DataSources parameter of the SendChatMessage operation.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private Long sendTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.id = builder.id;
            this.sendTime = builder.sendTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return sendTime
         */
        public Long getSendTime() {
            return this.sendTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String content; 
            private String id; 
            private Long sendTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.id = model.id;
                this.sendTime = model.sendTime;
                this.status = model.status;
            } 

            /**
             * <p>The content of the historical conversation message.</p>
             * 
             * <strong>example:</strong>
             * <p>Help me check the sales of restaurants in the UK in 2022</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The unique ID of the historical conversation message.</p>
             * 
             * <strong>example:</strong>
             * <p>a5bb5ff643de4124afd4317f79417a81</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The send time of the historical conversation message.</p>
             * 
             * <strong>example:</strong>
             * <p>1790650646000</p>
             */
            public Builder sendTime(Long sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * <p>The status of the historical conversation message.</p>
             * 
             * <strong>example:</strong>
             * <p>SENT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class CallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackArgs")
        private String callbackArgs;

        @com.aliyun.core.annotation.NameInMap("CallbackPrompt")
        private String callbackPrompt;

        @com.aliyun.core.annotation.NameInMap("CallbackTime")
        private Integer callbackTime;

        @com.aliyun.core.annotation.NameInMap("ToolId")
        private String toolId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CallbackConfig(Builder builder) {
            this.callbackArgs = builder.callbackArgs;
            this.callbackPrompt = builder.callbackPrompt;
            this.callbackTime = builder.callbackTime;
            this.toolId = builder.toolId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackConfig create() {
            return builder().build();
        }

        /**
         * @return callbackArgs
         */
        public String getCallbackArgs() {
            return this.callbackArgs;
        }

        /**
         * @return callbackPrompt
         */
        public String getCallbackPrompt() {
            return this.callbackPrompt;
        }

        /**
         * @return callbackTime
         */
        public Integer getCallbackTime() {
            return this.callbackTime;
        }

        /**
         * @return toolId
         */
        public String getToolId() {
            return this.toolId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String callbackArgs; 
            private String callbackPrompt; 
            private Integer callbackTime; 
            private String toolId; 
            private String type; 

            private Builder() {
            } 

            private Builder(CallbackConfig model) {
                this.callbackArgs = model.callbackArgs;
                this.callbackPrompt = model.callbackPrompt;
                this.callbackTime = model.callbackTime;
                this.toolId = model.toolId;
                this.type = model.type;
            } 

            /**
             * <p>The callback tool invocation parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;ID&quot;: &quot;test&quot;
             * }</p>
             */
            public Builder callbackArgs(String callbackArgs) {
                this.callbackArgs = callbackArgs;
                return this;
            }

            /**
             * <p>The prompt used to generate callback tool invocation parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>send web report to <a href="mailto:123456@163.com">123456@163.com</a></p>
             */
            public Builder callbackPrompt(String callbackPrompt) {
                this.callbackPrompt = callbackPrompt;
                return this;
            }

            /**
             * <p>The timing for callback tool invocation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder callbackTime(Integer callbackTime) {
                this.callbackTime = callbackTime;
                return this;
            }

            /**
             * <p>The callback tool identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Mcp serverId (6te...g7a)</p>
             */
            public Builder toolId(String toolId) {
                this.toolId = toolId;
                return this;
            }

            /**
             * <p>The callback tool type.</p>
             * 
             * <strong>example:</strong>
             * <p>Mcp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CallbackConfig build() {
                return new CallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class ExecutionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClarificationTendency")
        private Double clarificationTendency;

        @com.aliyun.core.annotation.NameInMap("ForbiddenAppendDataSource")
        private Boolean forbiddenAppendDataSource;

        @com.aliyun.core.annotation.NameInMap("SkipAskHuman")
        private Boolean skipAskHuman;

        @com.aliyun.core.annotation.NameInMap("SkipPlan")
        private Boolean skipPlan;

        @com.aliyun.core.annotation.NameInMap("SkipSqlConfirm")
        private Boolean skipSqlConfirm;

        @com.aliyun.core.annotation.NameInMap("SkipWebReportConfirm")
        private Boolean skipWebReportConfirm;

        private ExecutionConfig(Builder builder) {
            this.clarificationTendency = builder.clarificationTendency;
            this.forbiddenAppendDataSource = builder.forbiddenAppendDataSource;
            this.skipAskHuman = builder.skipAskHuman;
            this.skipPlan = builder.skipPlan;
            this.skipSqlConfirm = builder.skipSqlConfirm;
            this.skipWebReportConfirm = builder.skipWebReportConfirm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionConfig create() {
            return builder().build();
        }

        /**
         * @return clarificationTendency
         */
        public Double getClarificationTendency() {
            return this.clarificationTendency;
        }

        /**
         * @return forbiddenAppendDataSource
         */
        public Boolean getForbiddenAppendDataSource() {
            return this.forbiddenAppendDataSource;
        }

        /**
         * @return skipAskHuman
         */
        public Boolean getSkipAskHuman() {
            return this.skipAskHuman;
        }

        /**
         * @return skipPlan
         */
        public Boolean getSkipPlan() {
            return this.skipPlan;
        }

        /**
         * @return skipSqlConfirm
         */
        public Boolean getSkipSqlConfirm() {
            return this.skipSqlConfirm;
        }

        /**
         * @return skipWebReportConfirm
         */
        public Boolean getSkipWebReportConfirm() {
            return this.skipWebReportConfirm;
        }

        public static final class Builder {
            private Double clarificationTendency; 
            private Boolean forbiddenAppendDataSource; 
            private Boolean skipAskHuman; 
            private Boolean skipPlan; 
            private Boolean skipSqlConfirm; 
            private Boolean skipWebReportConfirm; 

            private Builder() {
            } 

            private Builder(ExecutionConfig model) {
                this.clarificationTendency = model.clarificationTendency;
                this.forbiddenAppendDataSource = model.forbiddenAppendDataSource;
                this.skipAskHuman = model.skipAskHuman;
                this.skipPlan = model.skipPlan;
                this.skipSqlConfirm = model.skipSqlConfirm;
                this.skipWebReportConfirm = model.skipWebReportConfirm;
            } 

            /**
             * <p>The tendency of the agent to ask follow-up questions to clarify requirements. <strong>This parameter takes effect only when SkipAskHuman is set to false and SkipPlan is set to false.</strong> Valid values: 0 to 1.</p>
             * <p>The following list describes some tendency values:</p>
             * <ul>
             * <li>0.0: Do not ask questions. The agent does not ask the user any questions, skips confirmation after generating a plan, and directly executes the plan.</li>
             * <li>0.1: Confirm the plan only. The agent confirms the generated plan only once and does not ask additional questions about requirements or details.</li>
             * <li>0.4: Ask questions when the task is blocked. The agent handles the task autonomously by default and asks questions only when the task cannot proceed or be completed.</li>
             * <li>0.7: Ask questions when key criteria are uncertain. The agent proactively asks questions when there is critical ambiguity in the goals, scope, business criteria, or acceptance criteria.</li>
             * <li>1.0: Fully align throughout the process. The agent proactively clarifies requirements during planning and execution, and continuously confirms when encountering important ambiguities, assumptions, or solution branches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder clarificationTendency(Double clarificationTendency) {
                this.clarificationTendency = clarificationTendency;
                return this;
            }

            /**
             * <p>Indicates whether appending data sources in the session is prohibited.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forbiddenAppendDataSource(Boolean forbiddenAppendDataSource) {
                this.forbiddenAppendDataSource = forbiddenAppendDataSource;
                return this;
            }

            /**
             * <p>Indicates whether user inquiries during the process are prohibited.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipAskHuman(Boolean skipAskHuman) {
                this.skipAskHuman = skipAskHuman;
                return this;
            }

            /**
             * <p>Indicates whether the plan confirmation step is skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipPlan(Boolean skipPlan) {
                this.skipPlan = skipPlan;
                return this;
            }

            /**
             * <p>Indicates whether all SQL confirmations are skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipSqlConfirm(Boolean skipSqlConfirm) {
                this.skipSqlConfirm = skipSqlConfirm;
                return this;
            }

            /**
             * <p>Indicates whether the confirmation for generating a web report is skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder skipWebReportConfirm(Boolean skipWebReportConfirm) {
                this.skipWebReportConfirm = skipWebReportConfirm;
                return this;
            }

            public ExecutionConfig build() {
                return new ExecutionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class KnowledgeConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("KbUuid")
        private String kbUuid;

        @com.aliyun.core.annotation.NameInMap("McpServerId")
        private String mcpServerId;

        private KnowledgeConfigList(Builder builder) {
            this.accessType = builder.accessType;
            this.kbUuid = builder.kbUuid;
            this.mcpServerId = builder.mcpServerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeConfigList create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return kbUuid
         */
        public String getKbUuid() {
            return this.kbUuid;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public static final class Builder {
            private String accessType; 
            private String kbUuid; 
            private String mcpServerId; 

            private Builder() {
            } 

            private Builder(KnowledgeConfigList model) {
                this.accessType = model.accessType;
                this.kbUuid = model.kbUuid;
                this.mcpServerId = model.mcpServerId;
            } 

            /**
             * <p>The access type. If this parameter is not specified, the default value is mcp. Valid values:</p>
             * <ul>
             * <li>mcp: MCP access. You must specify the McpServerId parameter.</li>
             * <li>dms_kb: DMS knowledge base access. You must specify the KbUuid parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mcp</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The knowledge base ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kb-HZ-rtcdseb*****pmyt</p>
             */
            public Builder kbUuid(String kbUuid) {
                this.kbUuid = kbUuid;
                return this;
            }

            /**
             * <p>The MCP server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7shre9b6x*******djz3q7jya</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            public KnowledgeConfigList build() {
                return new KnowledgeConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class KnowledgeSemanticConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
        private String knowledgeUuid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KnowledgeSemanticConfigList(Builder builder) {
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.knowledgeUuid = builder.knowledgeUuid;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeSemanticConfigList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return knowledgeUuid
         */
        public String getKnowledgeUuid() {
            return this.knowledgeUuid;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String dbId; 
            private String instanceId; 
            private String knowledgeUuid; 
            private String type; 

            private Builder() {
            } 

            private Builder(KnowledgeSemanticConfigList model) {
                this.dbId = model.dbId;
                this.instanceId = model.instanceId;
                this.knowledgeUuid = model.knowledgeUuid;
                this.type = model.type;
            } 

            /**
             * <p>The DMS database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69942325</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The DMS instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2952387</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The knowledge UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>7ca8f50d7823********02e87</p>
             */
            public Builder knowledgeUuid(String knowledgeUuid) {
                this.knowledgeUuid = knowledgeUuid;
                return this;
            }

            /**
             * <p>The knowledge semantic type. Valid values:</p>
             * <ul>
             * <li>sql_template: SQL template</li>
             * <li>ossie_model: Ossie semantic view</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sql_template</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KnowledgeSemanticConfigList build() {
                return new KnowledgeSemanticConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class ScheduleTaskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("RelatedSessionId")
        private String relatedSessionId;

        private ScheduleTaskConfig(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.query = builder.query;
            this.relatedSessionId = builder.relatedSessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleTaskConfig create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return relatedSessionId
         */
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        public static final class Builder {
            private String cronExpression; 
            private String query; 
            private String relatedSessionId; 

            private Builder() {
            } 

            private Builder(ScheduleTaskConfig model) {
                this.cronExpression = model.cronExpression;
                this.query = model.query;
                this.relatedSessionId = model.relatedSessionId;
            } 

            /**
             * <p>The cron expression for scheduled runs.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0 ? * 1-7</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The question for scheduled runs.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyze the data and provide the report</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The ID of the referenced session.</p>
             * 
             * <strong>example:</strong>
             * <p>4m24*****mg7j2v</p>
             */
            public Builder relatedSessionId(String relatedSessionId) {
                this.relatedSessionId = relatedSessionId;
                return this;
            }

            public ScheduleTaskConfig build() {
                return new ScheduleTaskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class PreviewCustomAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunParentUid")
        private String aliyunParentUid;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CallbackConfig")
        private CallbackConfig callbackConfig;

        @com.aliyun.core.annotation.NameInMap("CreatorUserName")
        private String creatorUserName;

        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("DMSUnit")
        private String DMSUnit;

        @com.aliyun.core.annotation.NameInMap("DataJson")
        private String dataJson;

        @com.aliyun.core.annotation.NameInMap("DefaultAgent")
        private Integer defaultAgent;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DmsUnit")
        private String dmsUnit;

        @com.aliyun.core.annotation.NameInMap("ExecutionConfig")
        private ExecutionConfig executionConfig;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("IsScheduleTask")
        private Boolean isScheduleTask;

        @com.aliyun.core.annotation.NameInMap("Knowledge")
        private String knowledge;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfigList")
        private java.util.List<KnowledgeConfigList> knowledgeConfigList;

        @com.aliyun.core.annotation.NameInMap("KnowledgeSemanticConfigList")
        private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierUserName")
        private String modifierUserName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextRuntime")
        private Long nextRuntime;

        @com.aliyun.core.annotation.NameInMap("OfflineTime")
        private String offlineTime;

        @com.aliyun.core.annotation.NameInMap("RecommendQuestionList")
        private java.util.List<String> recommendQuestionList;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RelatedSessionId")
        private String relatedSessionId;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("ScheduleTaskConfig")
        private ScheduleTaskConfig scheduleTaskConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TextReportConfig")
        private String textReportConfig;

        @com.aliyun.core.annotation.NameInMap("UserSpecifiedSkillList")
        private java.util.List<String> userSpecifiedSkillList;

        @com.aliyun.core.annotation.NameInMap("WebReportConfig")
        private String webReportConfig;

        @com.aliyun.core.annotation.NameInMap("WebReportTheme")
        private String webReportTheme;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private PreviewCustomAgent(Builder builder) {
            this.aliyunParentUid = builder.aliyunParentUid;
            this.aliyunUid = builder.aliyunUid;
            this.callbackConfig = builder.callbackConfig;
            this.creatorUserName = builder.creatorUserName;
            this.customAgentId = builder.customAgentId;
            this.DMSUnit = builder.DMSUnit;
            this.dataJson = builder.dataJson;
            this.defaultAgent = builder.defaultAgent;
            this.description = builder.description;
            this.dmsUnit = builder.dmsUnit;
            this.executionConfig = builder.executionConfig;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.instruction = builder.instruction;
            this.isScheduleTask = builder.isScheduleTask;
            this.knowledge = builder.knowledge;
            this.knowledgeConfigList = builder.knowledgeConfigList;
            this.knowledgeSemanticConfigList = builder.knowledgeSemanticConfigList;
            this.modifier = builder.modifier;
            this.modifierUserName = builder.modifierUserName;
            this.name = builder.name;
            this.nextRuntime = builder.nextRuntime;
            this.offlineTime = builder.offlineTime;
            this.recommendQuestionList = builder.recommendQuestionList;
            this.region = builder.region;
            this.relatedSessionId = builder.relatedSessionId;
            this.releaseTime = builder.releaseTime;
            this.scheduleTaskConfig = builder.scheduleTaskConfig;
            this.status = builder.status;
            this.textReportConfig = builder.textReportConfig;
            this.userSpecifiedSkillList = builder.userSpecifiedSkillList;
            this.webReportConfig = builder.webReportConfig;
            this.webReportTheme = builder.webReportTheme;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreviewCustomAgent create() {
            return builder().build();
        }

        /**
         * @return aliyunParentUid
         */
        public String getAliyunParentUid() {
            return this.aliyunParentUid;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return callbackConfig
         */
        public CallbackConfig getCallbackConfig() {
            return this.callbackConfig;
        }

        /**
         * @return creatorUserName
         */
        public String getCreatorUserName() {
            return this.creatorUserName;
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return DMSUnit
         */
        public String getDMSUnit() {
            return this.DMSUnit;
        }

        /**
         * @return dataJson
         */
        public String getDataJson() {
            return this.dataJson;
        }

        /**
         * @return defaultAgent
         */
        public Integer getDefaultAgent() {
            return this.defaultAgent;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dmsUnit
         */
        public String getDmsUnit() {
            return this.dmsUnit;
        }

        /**
         * @return executionConfig
         */
        public ExecutionConfig getExecutionConfig() {
            return this.executionConfig;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return isScheduleTask
         */
        public Boolean getIsScheduleTask() {
            return this.isScheduleTask;
        }

        /**
         * @return knowledge
         */
        public String getKnowledge() {
            return this.knowledge;
        }

        /**
         * @return knowledgeConfigList
         */
        public java.util.List<KnowledgeConfigList> getKnowledgeConfigList() {
            return this.knowledgeConfigList;
        }

        /**
         * @return knowledgeSemanticConfigList
         */
        public java.util.List<KnowledgeSemanticConfigList> getKnowledgeSemanticConfigList() {
            return this.knowledgeSemanticConfigList;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierUserName
         */
        public String getModifierUserName() {
            return this.modifierUserName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextRuntime
         */
        public Long getNextRuntime() {
            return this.nextRuntime;
        }

        /**
         * @return offlineTime
         */
        public String getOfflineTime() {
            return this.offlineTime;
        }

        /**
         * @return recommendQuestionList
         */
        public java.util.List<String> getRecommendQuestionList() {
            return this.recommendQuestionList;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relatedSessionId
         */
        public String getRelatedSessionId() {
            return this.relatedSessionId;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return scheduleTaskConfig
         */
        public ScheduleTaskConfig getScheduleTaskConfig() {
            return this.scheduleTaskConfig;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return textReportConfig
         */
        public String getTextReportConfig() {
            return this.textReportConfig;
        }

        /**
         * @return userSpecifiedSkillList
         */
        public java.util.List<String> getUserSpecifiedSkillList() {
            return this.userSpecifiedSkillList;
        }

        /**
         * @return webReportConfig
         */
        public String getWebReportConfig() {
            return this.webReportConfig;
        }

        /**
         * @return webReportTheme
         */
        public String getWebReportTheme() {
            return this.webReportTheme;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String aliyunParentUid; 
            private String aliyunUid; 
            private CallbackConfig callbackConfig; 
            private String creatorUserName; 
            private String customAgentId; 
            private String DMSUnit; 
            private String dataJson; 
            private Integer defaultAgent; 
            private String description; 
            private String dmsUnit; 
            private ExecutionConfig executionConfig; 
            private String gmtCreated; 
            private String gmtModified; 
            private String instruction; 
            private Boolean isScheduleTask; 
            private String knowledge; 
            private java.util.List<KnowledgeConfigList> knowledgeConfigList; 
            private java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList; 
            private String modifier; 
            private String modifierUserName; 
            private String name; 
            private Long nextRuntime; 
            private String offlineTime; 
            private java.util.List<String> recommendQuestionList; 
            private String region; 
            private String relatedSessionId; 
            private String releaseTime; 
            private ScheduleTaskConfig scheduleTaskConfig; 
            private String status; 
            private String textReportConfig; 
            private java.util.List<String> userSpecifiedSkillList; 
            private String webReportConfig; 
            private String webReportTheme; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(PreviewCustomAgent model) {
                this.aliyunParentUid = model.aliyunParentUid;
                this.aliyunUid = model.aliyunUid;
                this.callbackConfig = model.callbackConfig;
                this.creatorUserName = model.creatorUserName;
                this.customAgentId = model.customAgentId;
                this.DMSUnit = model.DMSUnit;
                this.dataJson = model.dataJson;
                this.defaultAgent = model.defaultAgent;
                this.description = model.description;
                this.dmsUnit = model.dmsUnit;
                this.executionConfig = model.executionConfig;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.instruction = model.instruction;
                this.isScheduleTask = model.isScheduleTask;
                this.knowledge = model.knowledge;
                this.knowledgeConfigList = model.knowledgeConfigList;
                this.knowledgeSemanticConfigList = model.knowledgeSemanticConfigList;
                this.modifier = model.modifier;
                this.modifierUserName = model.modifierUserName;
                this.name = model.name;
                this.nextRuntime = model.nextRuntime;
                this.offlineTime = model.offlineTime;
                this.recommendQuestionList = model.recommendQuestionList;
                this.region = model.region;
                this.relatedSessionId = model.relatedSessionId;
                this.releaseTime = model.releaseTime;
                this.scheduleTaskConfig = model.scheduleTaskConfig;
                this.status = model.status;
                this.textReportConfig = model.textReportConfig;
                this.userSpecifiedSkillList = model.userSpecifiedSkillList;
                this.webReportConfig = model.webReportConfig;
                this.webReportTheme = model.webReportTheme;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The Alibaba Cloud main account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16738266********</p>
             */
            public Builder aliyunParentUid(String aliyunParentUid) {
                this.aliyunParentUid = aliyunParentUid;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20372822********</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The callback configuration.</p>
             */
            public Builder callbackConfig(CallbackConfig callbackConfig) {
                this.callbackConfig = callbackConfig;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>HaoY***</p>
             */
            public Builder creatorUserName(String creatorUserName) {
                this.creatorUserName = creatorUserName;
                return this;
            }

            /**
             * <p>The custom agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-ozq551*******jphnqfu</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>The current DMS unit.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder DMSUnit(String DMSUnit) {
                this.DMSUnit = DMSUnit;
                return this;
            }

            /**
             * <p>The specified data scope in JSON string format.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;tableFlag&quot;: true,
             *       &quot;scope&quot;: &quot;personal&quot;,
             *       &quot;personal&quot;: {
             *             &quot;DataSourceType&quot;: &quot;remote_data_center&quot;,
             *             &quot;FileId&quot;: &quot;f-5qlrwaw10<strong><strong><strong><strong>s3gpw1z&quot;,
             *             &quot;Database&quot;: &quot;test-table</strong></strong></strong>.xlsx&quot;,
             *             &quot;Tables&quot;: [
             *                   &quot;Sheet1&quot;
             *             ],
             *             &quot;TableIds&quot;: [
             *                   &quot;</strong>****&quot;
             *             ],
             *             &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
             *       }
             * }</p>
             */
            public Builder dataJson(String dataJson) {
                this.dataJson = dataJson;
                return this;
            }

            /**
             * <p>Indicates whether the agent is displayed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defaultAgent(Integer defaultAgent) {
                this.defaultAgent = defaultAgent;
                return this;
            }

            /**
             * <p>The custom agent description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description for the test agent.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The current DMS unit.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder dmsUnit(String dmsUnit) {
                this.dmsUnit = dmsUnit;
                return this;
            }

            /**
             * <p>The execution configuration.</p>
             */
            public Builder executionConfig(ExecutionConfig executionConfig) {
                this.executionConfig = executionConfig;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instruction.</p>
             * 
             * <strong>example:</strong>
             * <p>Analytical framework:</p>
             * <p>Monitor core metrics (GMV, order volume, UV, and conversion rate) on a daily, weekly, and monthly basis to analyze trends and identify year-over-year and month-over-month fluctuations.
             * Segment by new vs. returning customers, channels, and regions to identify growth drivers and areas of weakness.
             * Conduct funnel analysis based on user behavior paths (browse → add to cart → purchase) to pinpoint stages where user drop-off occurs.</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>Indicates whether a periodic task is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isScheduleTask(Boolean isScheduleTask) {
                this.isScheduleTask = isScheduleTask;
                return this;
            }

            /**
             * <p>The knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>Core metric definitions:</p>
             * <p>GMV (Gross Merchandise Volume) refers to the total sum of order amounts, including both paid and unpaid orders.
             * Order volume refers to the number of valid orders placed per day.
             * UV (Unique Visitors) refers to the deduplicated number of users who visit the website or app.
             * Conversion rate = paid orders / UV, reflecting the efficiency of traffic conversion.</p>
             */
            public Builder knowledge(String knowledge) {
                this.knowledge = knowledge;
                return this;
            }

            /**
             * <p>The external knowledge bases.</p>
             */
            public Builder knowledgeConfigList(java.util.List<KnowledgeConfigList> knowledgeConfigList) {
                this.knowledgeConfigList = knowledgeConfigList;
                return this;
            }

            /**
             * <p>The knowledge semantic configuration struct.</p>
             */
            public Builder knowledgeSemanticConfigList(java.util.List<KnowledgeSemanticConfigList> knowledgeSemanticConfigList) {
                this.knowledgeSemanticConfigList = knowledgeSemanticConfigList;
                return this;
            }

            /**
             * <p>The modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>20372822********</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>HaoY***</p>
             */
            public Builder modifierUserName(String modifierUserName) {
                this.modifierUserName = modifierUserName;
                return this;
            }

            /**
             * <p>The name of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>Test agent name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The next run time of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>1767715200</p>
             */
            public Builder nextRuntime(Long nextRuntime) {
                this.nextRuntime = nextRuntime;
                return this;
            }

            /**
             * <p>The offline time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder offlineTime(String offlineTime) {
                this.offlineTime = offlineTime;
                return this;
            }

            /**
             * <p>The list of recommended questions.</p>
             * <ul>
             * <li>Up to 10 recommended questions can be configured.</li>
             * </ul>
             */
            public Builder recommendQuestionList(java.util.List<String> recommendQuestionList) {
                this.recommendQuestionList = recommendQuestionList;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the referenced historical session.</p>
             * 
             * <strong>example:</strong>
             * <p>5xyz...</p>
             */
            public Builder relatedSessionId(String relatedSessionId) {
                this.relatedSessionId = relatedSessionId;
                return this;
            }

            /**
             * <p>The release time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T14:04:32.000+00:00</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The scheduled task configuration.</p>
             */
            public Builder scheduleTaskConfig(ScheduleTaskConfig scheduleTaskConfig) {
                this.scheduleTaskConfig = scheduleTaskConfig;
                return this;
            }

            /**
             * <p>The status of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The text report format.</p>
             * 
             * <strong>example:</strong>
             * <p>The text report requires that all numbers be written in Chinese numerals rather than Arabic numerals.</p>
             */
            public Builder textReportConfig(String textReportConfig) {
                this.textReportConfig = textReportConfig;
                return this;
            }

            /**
             * <p>The list of user-specified skills.</p>
             */
            public Builder userSpecifiedSkillList(java.util.List<String> userSpecifiedSkillList) {
                this.userSpecifiedSkillList = userSpecifiedSkillList;
                return this;
            }

            /**
             * <p>The web report format.</p>
             * 
             * <strong>example:</strong>
             * <p>The web report requires that all numbers be written in Chinese numerals rather than Arabic numerals.</p>
             */
            public Builder webReportConfig(String webReportConfig) {
                this.webReportConfig = webReportConfig;
                return this;
            }

            /**
             * <p>The web report theme. Valid values:</p>
             * <ul>
             * <li>default: default</li>
             * <li>journal: journal</li>
             * <li>legacy: legacy</li>
             * <li>neobrutalism: stylized</li>
             * <li>infographic: infographic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder webReportTheme(String webReportTheme) {
                this.webReportTheme = webReportTheme;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>56kv1pvl9uvt9**********bb</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public PreviewCustomAgent build() {
                return new PreviewCustomAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class RecallResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecallResults(Builder builder) {
            this.content = builder.content;
            this.score = builder.score;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallResults create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private Double score; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecallResults model) {
                this.content = model.content;
                this.score = model.score;
                this.type = model.type;
            } 

            /**
             * <p>The content of the recalled knowledge chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>sky is blue</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The similarity score of this data entry. The scoring algorithm is related to the algorithm specified when the index is created, such as l2, ip, or cosine.</p>
             * 
             * <strong>example:</strong>
             * <p>0.65</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The category of the recalled knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>memory</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecallResults build() {
                return new RecallResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class SessionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("CustomAgentStage")
        private String customAgentStage;

        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("EncryptKey")
        private String encryptKey;

        @com.aliyun.core.annotation.NameInMap("EncryptType")
        private String encryptType;

        @com.aliyun.core.annotation.NameInMap("KbUuidList")
        private java.util.List<String> kbUuidList;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("McpServerIds")
        private java.util.List<String> mcpServerIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("ReportPageWidth")
        private Long reportPageWidth;

        @com.aliyun.core.annotation.NameInMap("ReportWaterMark")
        private String reportWaterMark;

        @com.aliyun.core.annotation.NameInMap("UserOssBucket")
        private String userOssBucket;

        private SessionConfig(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.customAgentStage = builder.customAgentStage;
            this.enableSearch = builder.enableSearch;
            this.encryptKey = builder.encryptKey;
            this.encryptType = builder.encryptType;
            this.kbUuidList = builder.kbUuidList;
            this.language = builder.language;
            this.mcpServerIds = builder.mcpServerIds;
            this.mode = builder.mode;
            this.reportPageWidth = builder.reportPageWidth;
            this.reportWaterMark = builder.reportWaterMark;
            this.userOssBucket = builder.userOssBucket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionConfig create() {
            return builder().build();
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return customAgentStage
         */
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return encryptKey
         */
        public String getEncryptKey() {
            return this.encryptKey;
        }

        /**
         * @return encryptType
         */
        public String getEncryptType() {
            return this.encryptType;
        }

        /**
         * @return kbUuidList
         */
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return mcpServerIds
         */
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return reportPageWidth
         */
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        /**
         * @return reportWaterMark
         */
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        /**
         * @return userOssBucket
         */
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

        public static final class Builder {
            private String customAgentId; 
            private String customAgentStage; 
            private Boolean enableSearch; 
            private String encryptKey; 
            private String encryptType; 
            private java.util.List<String> kbUuidList; 
            private String language; 
            private java.util.List<String> mcpServerIds; 
            private String mode; 
            private Long reportPageWidth; 
            private String reportWaterMark; 
            private String userOssBucket; 

            private Builder() {
            } 

            private Builder(SessionConfig model) {
                this.customAgentId = model.customAgentId;
                this.customAgentStage = model.customAgentStage;
                this.enableSearch = model.enableSearch;
                this.encryptKey = model.encryptKey;
                this.encryptType = model.encryptType;
                this.kbUuidList = model.kbUuidList;
                this.language = model.language;
                this.mcpServerIds = model.mcpServerIds;
                this.mode = model.mode;
                this.reportPageWidth = model.reportPageWidth;
                this.reportWaterMark = model.reportWaterMark;
                this.userOssBucket = model.userOssBucket;
            } 

            /**
             * <p>The ID of the custom agent.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-e*******ckd</p>
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * <p>The usage stage of the custom agent. Valid values:</p>
             * <ul>
             * <li><strong>debug</strong>: Debug stage.</li>
             * <li><strong>prod</strong>: Production stage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>debug</p>
             */
            public Builder customAgentStage(String customAgentStage) {
                this.customAgentStage = customAgentStage;
                return this;
            }

            /**
             * <p>Specifies whether to enable web search.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * <p>The encryption key for storing artifacts in OSS, including built-in and user OSS. This key is typically specified in CreateDataAgentSession.</p>
             * 
             * <strong>example:</strong>
             * <p>ay***1Te</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>The encryption type for storing artifacts in OSS, including built-in and user OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder encryptType(String encryptType) {
                this.encryptType = encryptType;
                return this;
            }

            /**
             * <p>The list of knowledge base IDs for the current session.</p>
             */
            public Builder kbUuidList(java.util.List<String> kbUuidList) {
                this.kbUuidList = kbUuidList;
                return this;
            }

            /**
             * <p>The language. Valid values:</p>
             * <ul>
             * <li><strong>CHINESE</strong>: Chinese.</li>
             * <li><strong>ENGLISH</strong>: English.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHINESE</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The list of MCP server IDs in the session configuration.</p>
             */
            public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
                this.mcpServerIds = mcpServerIds;
                return this;
            }

            /**
             * <p>The mode. Valid values:</p>
             * <ul>
             * <li><strong>ASK_DATA</strong>: Data query mode.</li>
             * <li><strong>ANALYSIS</strong>: Analysis mode.</li>
             * <li><strong>INSIGHT</strong>: Insight mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ANALYSIS</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The report page width.</p>
             * 
             * <strong>example:</strong>
             * <p>300mm</p>
             */
            public Builder reportPageWidth(Long reportPageWidth) {
                this.reportPageWidth = reportPageWidth;
                return this;
            }

            /**
             * <p>The report watermark.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder reportWaterMark(String reportWaterMark) {
                this.reportWaterMark = reportWaterMark;
                return this;
            }

            /**
             * <p>The name of the user OSS bucket.</p>
             * <ul>
             * <li>Analysis process files and report artifacts can be uploaded to the user-specified OSS bucket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user-oss-bucket</p>
             */
            public Builder userOssBucket(String userOssBucket) {
                this.userOssBucket = userOssBucket;
                return this;
            }

            public SessionConfig build() {
                return new SessionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataAgentSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("Artifacts")
        private java.util.List<Artifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("Capabilities")
        private java.util.List<Capabilities> capabilities;

        @com.aliyun.core.annotation.NameInMap("ChatHistoryLocations")
        private java.util.List<ChatHistoryLocations> chatHistoryLocations;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List<DataSources> dataSources;

        @com.aliyun.core.annotation.NameInMap("FavoriteInWorkspace")
        private String favoriteInWorkspace;

        @com.aliyun.core.annotation.NameInMap("File")
        private String file;

        @com.aliyun.core.annotation.NameInMap("Messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("PreviewCustomAgent")
        private PreviewCustomAgent previewCustomAgent;

        @com.aliyun.core.annotation.NameInMap("RecallResults")
        private java.util.List<RecallResults> recallResults;

        @com.aliyun.core.annotation.NameInMap("Saved")
        private Boolean saved;

        @com.aliyun.core.annotation.NameInMap("SessionConfig")
        private SessionConfig sessionConfig;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("SessionStatus")
        private String sessionStatus;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentStatus = builder.agentStatus;
            this.artifacts = builder.artifacts;
            this.capabilities = builder.capabilities;
            this.chatHistoryLocations = builder.chatHistoryLocations;
            this.createTime = builder.createTime;
            this.dataSources = builder.dataSources;
            this.favoriteInWorkspace = builder.favoriteInWorkspace;
            this.file = builder.file;
            this.messages = builder.messages;
            this.previewCustomAgent = builder.previewCustomAgent;
            this.recallResults = builder.recallResults;
            this.saved = builder.saved;
            this.sessionConfig = builder.sessionConfig;
            this.sessionId = builder.sessionId;
            this.sessionStatus = builder.sessionStatus;
            this.title = builder.title;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return artifacts
         */
        public java.util.List<Artifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return capabilities
         */
        public java.util.List<Capabilities> getCapabilities() {
            return this.capabilities;
        }

        /**
         * @return chatHistoryLocations
         */
        public java.util.List<ChatHistoryLocations> getChatHistoryLocations() {
            return this.chatHistoryLocations;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSources
         */
        public java.util.List<DataSources> getDataSources() {
            return this.dataSources;
        }

        /**
         * @return favoriteInWorkspace
         */
        public String getFavoriteInWorkspace() {
            return this.favoriteInWorkspace;
        }

        /**
         * @return file
         */
        public String getFile() {
            return this.file;
        }

        /**
         * @return messages
         */
        public java.util.List<Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return previewCustomAgent
         */
        public PreviewCustomAgent getPreviewCustomAgent() {
            return this.previewCustomAgent;
        }

        /**
         * @return recallResults
         */
        public java.util.List<RecallResults> getRecallResults() {
            return this.recallResults;
        }

        /**
         * @return saved
         */
        public Boolean getSaved() {
            return this.saved;
        }

        /**
         * @return sessionConfig
         */
        public SessionConfig getSessionConfig() {
            return this.sessionConfig;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agentId; 
            private String agentStatus; 
            private java.util.List<Artifacts> artifacts; 
            private java.util.List<Capabilities> capabilities; 
            private java.util.List<ChatHistoryLocations> chatHistoryLocations; 
            private Long createTime; 
            private java.util.List<DataSources> dataSources; 
            private String favoriteInWorkspace; 
            private String file; 
            private java.util.List<Messages> messages; 
            private PreviewCustomAgent previewCustomAgent; 
            private java.util.List<RecallResults> recallResults; 
            private Boolean saved; 
            private SessionConfig sessionConfig; 
            private String sessionId; 
            private String sessionStatus; 
            private String title; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentStatus = model.agentStatus;
                this.artifacts = model.artifacts;
                this.capabilities = model.capabilities;
                this.chatHistoryLocations = model.chatHistoryLocations;
                this.createTime = model.createTime;
                this.dataSources = model.dataSources;
                this.favoriteInWorkspace = model.favoriteInWorkspace;
                this.file = model.file;
                this.messages = model.messages;
                this.previewCustomAgent = model.previewCustomAgent;
                this.recallResults = model.recallResults;
                this.saved = model.saved;
                this.sessionConfig = model.sessionConfig;
                this.sessionId = model.sessionId;
                this.sessionStatus = model.sessionStatus;
                this.title = model.title;
                this.userId = model.userId;
            } 

            /**
             * <p>The current agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cu0cs*******mf</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The current agent status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * <p>The list of artifacts generated by the session. Currently, only reports are included.</p>
             */
            public Builder artifacts(java.util.List<Artifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * <p>The capabilities mounted to the session, such as knowledge bases and skills.</p>
             */
            public Builder capabilities(java.util.List<Capabilities> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            /**
             * <p>The session playback history.</p>
             */
            public Builder chatHistoryLocations(java.util.List<ChatHistoryLocations> chatHistoryLocations) {
                this.chatHistoryLocations = chatHistoryLocations;
                return this;
            }

            /**
             * <p>The session creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1731645908000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The list of data sources used in the current session.</p>
             */
            public Builder dataSources(java.util.List<DataSources> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>Indicates whether the session is favorited by the current logged-on user in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder favoriteInWorkspace(String favoriteInWorkspace) {
                this.favoriteInWorkspace = favoriteInWorkspace;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-8*******01m</p>
             */
            public Builder file(String file) {
                this.file = file;
                return this;
            }

            /**
             * <p>The list of historical conversation messages in the session.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>The custom agent for the intelligent development session preview.</p>
             */
            public Builder previewCustomAgent(PreviewCustomAgent previewCustomAgent) {
                this.previewCustomAgent = previewCustomAgent;
                return this;
            }

            /**
             * <p>The recall results from the knowledge base and memory for the current session.</p>
             */
            public Builder recallResults(java.util.List<RecallResults> recallResults) {
                this.recallResults = recallResults;
                return this;
            }

            /**
             * <p>Indicates whether the session is favorited by the current logged-on user.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder saved(Boolean saved) {
                this.saved = saved;
                return this;
            }

            /**
             * <p>The session configuration items.</p>
             */
            public Builder sessionConfig(SessionConfig sessionConfig) {
                this.sessionConfig = sessionConfig;
                return this;
            }

            /**
             * <p>The agent session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>976*********p</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The session status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyze this document and generate a report</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The ID of the session owner.</p>
             * 
             * <strong>example:</strong>
             * <p>2096******</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
