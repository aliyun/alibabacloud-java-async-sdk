// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SendAsyncChatMessageRequest} extends {@link RequestModel}
 *
 * <p>SendAsyncChatMessageRequest</p>
 */
public class SendAsyncChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextItems")
    private java.util.List<ContextItems> contextItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private java.util.List<String> digitalEmployeeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directChat")
    private Boolean directChat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directMaxHistoryRounds")
    private Object directMaxHistoryRounds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableWebSearch")
    private Boolean enableWebSearch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("locale")
    private String locale;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reuseLastSession")
    private Boolean reuseLastSession;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("segments")
    private java.util.List<Segments> segments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskExecution")
    private TaskExecution taskExecution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workMode")
    private String workMode;

    private SendAsyncChatMessageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.contextItems = builder.contextItems;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.directChat = builder.directChat;
        this.directMaxHistoryRounds = builder.directMaxHistoryRounds;
        this.enableWebSearch = builder.enableWebSearch;
        this.files = builder.files;
        this.locale = builder.locale;
        this.model = builder.model;
        this.reuseLastSession = builder.reuseLastSession;
        this.segments = builder.segments;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.taskExecution = builder.taskExecution;
        this.tenantId = builder.tenantId;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAsyncChatMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return contextItems
     */
    public java.util.List<ContextItems> getContextItems() {
        return this.contextItems;
    }

    /**
     * @return digitalEmployeeName
     */
    public java.util.List<String> getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return directChat
     */
    public Boolean getDirectChat() {
        return this.directChat;
    }

    /**
     * @return directMaxHistoryRounds
     */
    public Object getDirectMaxHistoryRounds() {
        return this.directMaxHistoryRounds;
    }

    /**
     * @return enableWebSearch
     */
    public Boolean getEnableWebSearch() {
        return this.enableWebSearch;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return reuseLastSession
     */
    public Boolean getReuseLastSession() {
        return this.reuseLastSession;
    }

    /**
     * @return segments
     */
    public java.util.List<Segments> getSegments() {
        return this.segments;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return taskExecution
     */
    public TaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<SendAsyncChatMessageRequest, Builder> {
        private String content; 
        private String contentType; 
        private java.util.List<ContextItems> contextItems; 
        private java.util.List<String> digitalEmployeeName; 
        private Boolean directChat; 
        private Object directMaxHistoryRounds; 
        private Boolean enableWebSearch; 
        private java.util.List<Files> files; 
        private String locale; 
        private String model; 
        private Boolean reuseLastSession; 
        private java.util.List<Segments> segments; 
        private String sessionId; 
        private Boolean stream; 
        private TaskExecution taskExecution; 
        private String tenantId; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(SendAsyncChatMessageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.contextItems = request.contextItems;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.directChat = request.directChat;
            this.directMaxHistoryRounds = request.directMaxHistoryRounds;
            this.enableWebSearch = request.enableWebSearch;
            this.files = request.files;
            this.locale = request.locale;
            this.model = request.model;
            this.reuseLastSession = request.reuseLastSession;
            this.segments = request.segments;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.taskExecution = request.taskExecution;
            this.tenantId = request.tenantId;
            this.workMode = request.workMode;
        } 

        /**
         * <p>The body of the user message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample content</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The message type. Valid values: Text and Markdown.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The message or file entries referenced as context for the current turn.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder contextItems(java.util.List<ContextItems> contextItems) {
            String contextItemsShrink = shrink(contextItems, "contextItems", "json");
            this.putBodyParameter("contextItems", contextItemsShrink);
            this.contextItems = contextItems;
            return this;
        }

        /**
         * <p>The list of digital employee names. For backward compatibility, a single string can also be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;pcitc-magent&quot;]</p>
         */
        public Builder digitalEmployeeName(java.util.List<String> digitalEmployeeName) {
            String digitalEmployeeNameShrink = shrink(digitalEmployeeName, "digitalEmployeeName", "json");
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeNameShrink);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * <p>Specifies whether to enable direct connection mode. If set to true, regular scenario routing is skipped and the direct conversation scenario is entered directly.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder directChat(Boolean directChat) {
            this.putBodyParameter("directChat", directChat);
            this.directChat = directChat;
            return this;
        }

        /**
         * <p>The number of recent complete direct Q&amp;A rounds carried in the current turn, excluding the current input. This parameter takes effect only when workMode is set to direct or directChat is set to true. Valid values are JSON integers from 0 to 100. If omitted, the backend processes it as 0, carrying no history but still saving the current round. Null, Boolean, string, decimal, and out-of-bounds values are processed through the original direct path, and the gateway retains the original values for backend determination. This field is ignored in work and ask modes. This parameter does not limit the history range when switching to the work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder directMaxHistoryRounds(Object directMaxHistoryRounds) {
            this.putBodyParameter("directMaxHistoryRounds", directMaxHistoryRounds);
            this.directMaxHistoryRounds = directMaxHistoryRounds;
            return this;
        }

        /**
         * <p>Specifies whether to enable web search. Default value: false. In task execution scenarios where taskExecution is passed, the task configuration prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableWebSearch(Boolean enableWebSearch) {
            this.putBodyParameter("enableWebSearch", enableWebSearch);
            this.enableWebSearch = enableWebSearch;
            return this;
        }

        /**
         * <p>The list of file references. Each item is an object, and fileId is required, which is returned by uploadChatFile.</p>
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "files", "json");
            this.putBodyParameter("files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>The language for the current turn. Valid values: zh-CN and en-US. This parameter is used for API error messages and passed through to CodeAgent. If omitted, the current language behavior is retained and user settings are not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder locale(String locale) {
            this.putBodyParameter("locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * <p>The abstract model tier. Valid values: quick, standard, and flagship. If not specified, standard is used for new sessions, and the current tier is retained for existing sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>quick</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Specifies whether to reuse the most recent session under the digital employee when sessionId is not provided, which applies to CLI scenarios. Default value: false, which means a new session is created.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reuseLastSession(Boolean reuseLastSession) {
            this.putBodyParameter("reuseLastSession", reuseLastSession);
            this.reuseLastSession = reuseLastSession;
            return this;
        }

        /**
         * <p>The structured segments in the message, such as session or object mentions.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder segments(java.util.List<Segments> segments) {
            String segmentsShrink = shrink(segments, "segments", "json");
            this.putBodyParameter("segments", segmentsShrink);
            this.segments = segments;
            return this;
        }

        /**
         * <p>The session ID. If not specified, a new session is created.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Specifies whether to use streaming generation. This API always generates background content in streaming mode and writes it to the message stream. The value does not change the response structure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>The task execution metadata returned by executeScheduledTask. If passed, the request is processed through the task execution pipeline.</p>
         */
        public Builder taskExecution(TaskExecution taskExecution) {
            String taskExecutionShrink = shrink(taskExecution, "taskExecution", "json");
            this.putBodyParameter("taskExecution", taskExecutionShrink);
            this.taskExecution = taskExecution;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The session work mode. Valid values:</p>
         * <ul>
         * <li>ask: Quick Q&amp;A mode. Trims tools, skills, and connectors for single-turn direct answers.</li>
         * <li>work: Deep work mode. This is the default value.</li>
         * <li>direct: Direct connection mode at the request level. Does not start a sandbox and prevents context pollution. Equivalent to setting directChat to true.
         * The ask and work modes are session-level. Once selected during session creation, the mode is fixed and inherited by default in subsequent chats. If the explicitly passed value conflicts with the session mode, a parameter error is returned. To switch modes, create a new session or fork the current one. In scenarios with multiple digital employees or task execution, passing ask takes effect as work. This parameter is ignored when directChat is set to true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder workMode(String workMode) {
            this.putBodyParameter("workMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public SendAsyncChatMessageRequest build() {
            return new SendAsyncChatMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class AnnotationFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("filePublicUrl")
        private String filePublicUrl;

        @com.aliyun.core.annotation.NameInMap("fileRecordId")
        private String fileRecordId;

        @com.aliyun.core.annotation.NameInMap("fileUrl")
        private String fileUrl;

        private AnnotationFiles(Builder builder) {
            this.fileName = builder.fileName;
            this.filePublicUrl = builder.filePublicUrl;
            this.fileRecordId = builder.fileRecordId;
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnnotationFiles create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePublicUrl
         */
        public String getFilePublicUrl() {
            return this.filePublicUrl;
        }

        /**
         * @return fileRecordId
         */
        public String getFileRecordId() {
            return this.fileRecordId;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private String fileName; 
            private String filePublicUrl; 
            private String fileRecordId; 
            private String fileUrl; 

            private Builder() {
            } 

            private Builder(AnnotationFiles model) {
                this.fileName = model.fileName;
                this.filePublicUrl = model.filePublicUrl;
                this.fileRecordId = model.fileRecordId;
                this.fileUrl = model.fileUrl;
            } 

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>SupplementaryNotes.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The public access URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/public/file">https://example.com/public/file</a></p>
             */
            public Builder filePublicUrl(String filePublicUrl) {
                this.filePublicUrl = filePublicUrl;
                return this;
            }

            /**
             * <p>The file record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileRecordId</p>
             */
            public Builder fileRecordId(String fileRecordId) {
                this.fileRecordId = fileRecordId;
                return this;
            }

            /**
             * <p>The internal access URL of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/file">https://example.com/file</a></p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public AnnotationFiles build() {
                return new AnnotationFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class ContextItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotation")
        private String annotation;

        @com.aliyun.core.annotation.NameInMap("annotationFiles")
        private java.util.List<AnnotationFiles> annotationFiles;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("senderName")
        private String senderName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ContextItems(Builder builder) {
            this.annotation = builder.annotation;
            this.annotationFiles = builder.annotationFiles;
            this.content = builder.content;
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.messageId = builder.messageId;
            this.senderName = builder.senderName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContextItems create() {
            return builder().build();
        }

        /**
         * @return annotation
         */
        public String getAnnotation() {
            return this.annotation;
        }

        /**
         * @return annotationFiles
         */
        public java.util.List<AnnotationFiles> getAnnotationFiles() {
            return this.annotationFiles;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return senderName
         */
        public String getSenderName() {
            return this.senderName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String annotation; 
            private java.util.List<AnnotationFiles> annotationFiles; 
            private String content; 
            private String fileId; 
            private String fileName; 
            private String fileType; 
            private String messageId; 
            private String senderName; 
            private String type; 

            private Builder() {
            } 

            private Builder(ContextItems model) {
                this.annotation = model.annotation;
                this.annotationFiles = model.annotationFiles;
                this.content = model.content;
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.messageId = model.messageId;
                this.senderName = model.senderName;
                this.type = model.type;
            } 

            /**
             * <p>The user\&quot;s annotation on the referenced content.</p>
             * 
             * <strong>example:</strong>
             * <p>Please verify the data for the East China region</p>
             */
            public Builder annotation(String annotation) {
                this.annotation = annotation;
                return this;
            }

            /**
             * <p>The list of files associated with the annotation.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder annotationFiles(java.util.List<AnnotationFiles> annotationFiles) {
                this.annotationFiles = annotationFiles;
                return this;
            }

            /**
             * <p>The body of the referenced content.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales revenue for this month</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the referenced file.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileId</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the referenced file.</p>
             * 
             * <strong>example:</strong>
             * <p>SalesData.xlsx</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The type of the referenced file.</p>
             * 
             * <strong>example:</strong>
             * <p>xlsx</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The ID of the referenced message.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleMessageId</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The name of the message sender.</p>
             * 
             * <strong>example:</strong>
             * <p>Sales Assistant</p>
             */
            public Builder senderName(String senderName) {
                this.senderName = senderName;
                return this;
            }

            /**
             * <p>The context entry type.</p>
             * 
             * <strong>example:</strong>
             * <p>message_annotation</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ContextItems build() {
                return new ContextItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Files(Builder builder) {
            this.fileId = builder.fileId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String fileId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileId = model.fileId;
                this.type = model.type;
            } 

            /**
             * <p>The file ID, which is returned by uploadChatFile.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleFileId</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class Segments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("mentionType")
        private String mentionType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("sessionType")
        private String sessionType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Segments(Builder builder) {
            this.content = builder.content;
            this.mentionType = builder.mentionType;
            this.name = builder.name;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
            this.sessionType = builder.sessionType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Segments create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return mentionType
         */
        public String getMentionType() {
            return this.mentionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return sessionType
         */
        public String getSessionType() {
            return this.sessionType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String mentionType; 
            private String name; 
            private String objectId; 
            private String objectType; 
            private String sessionType; 
            private String type; 

            private Builder() {
            } 

            private Builder(Segments model) {
                this.content = model.content;
                this.mentionType = model.mentionType;
                this.name = model.name;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
                this.sessionType = model.sessionType;
                this.type = model.type;
            } 

            /**
             * <p>The display content of the segment.</p>
             * 
             * <strong>example:</strong>
             * <p>Old session</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The category of the mentioned object.</p>
             * 
             * <strong>example:</strong>
             * <p>conversations</p>
             */
            public Builder mentionType(String mentionType) {
                this.mentionType = mentionType;
                return this;
            }

            /**
             * <p>The name of the referenced object.</p>
             * 
             * <strong>example:</strong>
             * <p>Old session</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the referenced object.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The referenced object type.</p>
             * 
             * <strong>example:</strong>
             * <p>conversation</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The session type.</p>
             * 
             * <strong>example:</strong>
             * <p>personal</p>
             */
            public Builder sessionType(String sessionType) {
                this.sessionType = sessionType;
                return this;
            }

            /**
             * <p>The segment type.</p>
             * 
             * <strong>example:</strong>
             * <p>mention</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Segments build() {
                return new Segments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendAsyncChatMessageRequest} extends {@link TeaModel}
     *
     * <p>SendAsyncChatMessageRequest</p>
     */
    public static class TaskExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("billingId")
        private String billingId;

        @com.aliyun.core.annotation.NameInMap("enableWebSearch")
        private Boolean enableWebSearch;

        @com.aliyun.core.annotation.NameInMap("executionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String executionId;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private String operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("skillCodes")
        private java.util.List<String> skillCodes;

        @com.aliyun.core.annotation.NameInMap("taskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("taskUnderstand")
        private String taskUnderstand;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private TaskExecution(Builder builder) {
            this.billingId = builder.billingId;
            this.enableWebSearch = builder.enableWebSearch;
            this.executionId = builder.executionId;
            this.operatingObjectName = builder.operatingObjectName;
            this.skillCodes = builder.skillCodes;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskUnderstand = builder.taskUnderstand;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecution create() {
            return builder().build();
        }

        /**
         * @return billingId
         */
        public String getBillingId() {
            return this.billingId;
        }

        /**
         * @return enableWebSearch
         */
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        /**
         * @return operatingObjectName
         */
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return skillCodes
         */
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
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

        /**
         * @return taskUnderstand
         */
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String billingId; 
            private Boolean enableWebSearch; 
            private String executionId; 
            private String operatingObjectName; 
            private java.util.List<String> skillCodes; 
            private String taskId; 
            private String taskName; 
            private String taskUnderstand; 
            private String tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TaskExecution model) {
                this.billingId = model.billingId;
                this.enableWebSearch = model.enableWebSearch;
                this.executionId = model.executionId;
                this.operatingObjectName = model.operatingObjectName;
                this.skillCodes = model.skillCodes;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskUnderstand = model.taskUnderstand;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>The billing ID.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleBillingId</p>
             */
            public Builder billingId(String billingId) {
                this.billingId = billingId;
                return this;
            }

            /**
             * <p>Specifies whether to enable web search.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableWebSearch(Boolean enableWebSearch) {
                this.enableWebSearch = enableWebSearch;
                return this;
            }

            /**
             * <p>The execution record ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleExecutionId</p>
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            /**
             * <p>The digital employee name.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>The list of associated skill codes.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;code&quot;]</p>
             */
            public Builder skillCodes(java.util.List<String> skillCodes) {
                this.skillCodes = skillCodes;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskId</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task understanding content.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder taskUnderstand(String taskUnderstand) {
                this.taskUnderstand = taskUnderstand;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the user to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleUserId</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TaskExecution build() {
                return new TaskExecution(this);
            } 

        } 

    }
}
