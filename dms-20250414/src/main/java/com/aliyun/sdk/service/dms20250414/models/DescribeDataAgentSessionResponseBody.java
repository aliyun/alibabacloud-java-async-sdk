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
         * <p>The return value description. Valid values:</p>
         * <ul>
         * <li>true: The deletion succeeded.</li>
         * <li>false: The deletion failed.</li>
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
             * <p>The globally unique artifact ID. If the artifact is a report generated by specifying MessageType as REPORT in the SendChatMessage operation, the artifact ID is the same as the MessageId value returned by the SendChatMessage operation.</p>
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
             * <li>If Type is set to skill, this parameter indicates the skill ID.</li>
             * <li>If Type is set to dms_kb, this parameter indicates the knowledge base ID.</li>
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
             * <p>The capability type. Valid values:</p>
             * <ul>
             * <li>skill: Skill.</li>
             * <li>dms_kb: Knowledge base.</li>
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
             * <p>The source of the data source. Valid values:</p>
             * <ul>
             * <li>CHAT: The data source is specified in a conversation by calling the CreateDataAgentSession or SendChatMessage operation.</li>
             * <li>CUSTOM_AGENT: The data source is from the preset analysis data scope in a custom agent.</li>
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
             * <p>The content of the historical session message.</p>
             * 
             * <strong>example:</strong>
             * <p>Show me the sales of restaurants in the UK in 2022</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The unique ID of the historical session message.</p>
             * 
             * <strong>example:</strong>
             * <p>a5bb5ff643de4124afd4317f79417a81</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the historical session message was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>1790650646000</p>
             */
            public Builder sendTime(Long sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * <p>The status of the historical session message.</p>
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
             * <p>The content of the recalled knowledge block.</p>
             * 
             * <strong>example:</strong>
             * <p>sky is blue</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The similarity score of this data entry. The scoring algorithm is related to the algorithm specified when the index was created, such as l2, ip, or cosine.</p>
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
             * <p>The custom agent ID.</p>
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
             * <li>debug: Debugging stage.</li>
             * <li>prod: Production stage.</li>
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
             * <p>The encryption key for artifacts stored in OSS, including built-in and user OSS buckets. This key is usually specified in the CreateDataAgentSession operation.</p>
             * 
             * <strong>example:</strong>
             * <p>ay***1Te</p>
             */
            public Builder encryptKey(String encryptKey) {
                this.encryptKey = encryptKey;
                return this;
            }

            /**
             * <p>The encryption type for artifacts stored in OSS, including built-in and user OSS buckets.</p>
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
             * <li>CHINESE: Chinese.</li>
             * <li>ENGLISH: English.</li>
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
             * <p>The list of MCP server IDs in the session configurations.</p>
             */
            public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
                this.mcpServerIds = mcpServerIds;
                return this;
            }

            /**
             * <p>The mode. Valid values:</p>
             * <ul>
             * <li>ASK_DATA: Data query mode.</li>
             * <li>ANALYSIS: Analysis mode.</li>
             * <li>INSIGHT: Insight mode.</li>
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
             * <p>The page width of the report.</p>
             * 
             * <strong>example:</strong>
             * <p>300mm</p>
             */
            public Builder reportPageWidth(Long reportPageWidth) {
                this.reportPageWidth = reportPageWidth;
                return this;
            }

            /**
             * <p>The watermark of the report.</p>
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
             * <li>Files generated during the analysis process and report artifacts can be uploaded to the user-specified OSS bucket.</li>
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
             * <p>The time when the session was created.</p>
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
             * <p>The list of historical session messages.</p>
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
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
             * <p>The session configurations.</p>
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
             * <p>Analyze this file and generate a report</p>
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
