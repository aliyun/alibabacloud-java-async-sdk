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
 * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOutputFilesResponseBody</p>
 */
public class ListOutputFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListOutputFilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOutputFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListOutputFilesResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>符合条件的产出总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListOutputFilesResponseBody build() {
            return new ListOutputFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutputFilesResponseBody</p>
     */
    public static class EmailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("recipients")
        private java.util.List<String> recipients;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        private EmailInfo(Builder builder) {
            this.body = builder.body;
            this.contentType = builder.contentType;
            this.recipients = builder.recipients;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmailInfo create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return recipients
         */
        public java.util.List<String> getRecipients() {
            return this.recipients;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String body; 
            private String contentType; 
            private java.util.List<String> recipients; 
            private String subject; 

            private Builder() {
            } 

            private Builder(EmailInfo model) {
                this.body = model.body;
                this.contentType = model.contentType;
                this.recipients = model.recipients;
                this.subject = model.subject;
            } 

            /**
             * <p>邮件内容</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>内容类型，如 MARKDOWN/JSONML/HTML</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>recipients</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder recipients(java.util.List<String> recipients) {
                this.recipients = recipients;
                return this;
            }

            /**
             * <p>邮件主题</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public EmailInfo build() {
                return new EmailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutputFilesResponseBody</p>
     */
    public static class FileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private FileInfo(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfo create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(FileInfo model) {
                this.description = model.description;
                this.name = model.name;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>文件描述</p>
             * 
             * <strong>example:</strong>
             * <p>示例描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>文件 OSS URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>文件类型，如 .pdf, .md</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FileInfo build() {
                return new FileInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutputFilesResponseBody</p>
     */
    public static class SlidesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completedSlides")
        private Long completedSlides;

        @com.aliyun.core.annotation.NameInMap("pptId")
        private String pptId;

        @com.aliyun.core.annotation.NameInMap("pptName")
        private String pptName;

        @com.aliyun.core.annotation.NameInMap("totalSlides")
        private Long totalSlides;

        private SlidesInfo(Builder builder) {
            this.completedSlides = builder.completedSlides;
            this.pptId = builder.pptId;
            this.pptName = builder.pptName;
            this.totalSlides = builder.totalSlides;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlidesInfo create() {
            return builder().build();
        }

        /**
         * @return completedSlides
         */
        public Long getCompletedSlides() {
            return this.completedSlides;
        }

        /**
         * @return pptId
         */
        public String getPptId() {
            return this.pptId;
        }

        /**
         * @return pptName
         */
        public String getPptName() {
            return this.pptName;
        }

        /**
         * @return totalSlides
         */
        public Long getTotalSlides() {
            return this.totalSlides;
        }

        public static final class Builder {
            private Long completedSlides; 
            private String pptId; 
            private String pptName; 
            private Long totalSlides; 

            private Builder() {
            } 

            private Builder(SlidesInfo model) {
                this.completedSlides = model.completedSlides;
                this.pptId = model.pptId;
                this.pptName = model.pptName;
                this.totalSlides = model.totalSlides;
            } 

            /**
             * <p>已完成幻灯片数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder completedSlides(Long completedSlides) {
                this.completedSlides = completedSlides;
                return this;
            }

            /**
             * <p>PPT ID</p>
             * 
             * <strong>example:</strong>
             * <p>examplePptId</p>
             */
            public Builder pptId(String pptId) {
                this.pptId = pptId;
                return this;
            }

            /**
             * <p>PPT 名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder pptName(String pptName) {
                this.pptName = pptName;
                return this;
            }

            /**
             * <p>总幻灯片数</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalSlides(Long totalSlides) {
                this.totalSlides = totalSlides;
                return this;
            }

            public SlidesInfo build() {
                return new SlidesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutputFilesResponseBody</p>
     */
    public static class OutputItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("emailInfo")
        private EmailInfo emailInfo;

        @com.aliyun.core.annotation.NameInMap("fileInfo")
        private FileInfo fileInfo;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("itemTypeDisplayName")
        private String itemTypeDisplayName;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("outputItemId")
        private String outputItemId;

        @com.aliyun.core.annotation.NameInMap("shareEnabled")
        private Boolean shareEnabled;

        @com.aliyun.core.annotation.NameInMap("shareToken")
        private String shareToken;

        @com.aliyun.core.annotation.NameInMap("skillOutputId")
        private String skillOutputId;

        @com.aliyun.core.annotation.NameInMap("slidesInfo")
        private SlidesInfo slidesInfo;

        @com.aliyun.core.annotation.NameInMap("taskExecutionId")
        private String taskExecutionId;

        private OutputItems(Builder builder) {
            this.createTime = builder.createTime;
            this.emailInfo = builder.emailInfo;
            this.fileInfo = builder.fileInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itemName = builder.itemName;
            this.itemType = builder.itemType;
            this.itemTypeDisplayName = builder.itemTypeDisplayName;
            this.messageId = builder.messageId;
            this.outputItemId = builder.outputItemId;
            this.shareEnabled = builder.shareEnabled;
            this.shareToken = builder.shareToken;
            this.skillOutputId = builder.skillOutputId;
            this.slidesInfo = builder.slidesInfo;
            this.taskExecutionId = builder.taskExecutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputItems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return emailInfo
         */
        public EmailInfo getEmailInfo() {
            return this.emailInfo;
        }

        /**
         * @return fileInfo
         */
        public FileInfo getFileInfo() {
            return this.fileInfo;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return itemTypeDisplayName
         */
        public String getItemTypeDisplayName() {
            return this.itemTypeDisplayName;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return outputItemId
         */
        public String getOutputItemId() {
            return this.outputItemId;
        }

        /**
         * @return shareEnabled
         */
        public Boolean getShareEnabled() {
            return this.shareEnabled;
        }

        /**
         * @return shareToken
         */
        public String getShareToken() {
            return this.shareToken;
        }

        /**
         * @return skillOutputId
         */
        public String getSkillOutputId() {
            return this.skillOutputId;
        }

        /**
         * @return slidesInfo
         */
        public SlidesInfo getSlidesInfo() {
            return this.slidesInfo;
        }

        /**
         * @return taskExecutionId
         */
        public String getTaskExecutionId() {
            return this.taskExecutionId;
        }

        public static final class Builder {
            private String createTime; 
            private EmailInfo emailInfo; 
            private FileInfo fileInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private String itemName; 
            private String itemType; 
            private String itemTypeDisplayName; 
            private String messageId; 
            private String outputItemId; 
            private Boolean shareEnabled; 
            private String shareToken; 
            private String skillOutputId; 
            private SlidesInfo slidesInfo; 
            private String taskExecutionId; 

            private Builder() {
            } 

            private Builder(OutputItems model) {
                this.createTime = model.createTime;
                this.emailInfo = model.emailInfo;
                this.fileInfo = model.fileInfo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itemName = model.itemName;
                this.itemType = model.itemType;
                this.itemTypeDisplayName = model.itemTypeDisplayName;
                this.messageId = model.messageId;
                this.outputItemId = model.outputItemId;
                this.shareEnabled = model.shareEnabled;
                this.shareToken = model.shareToken;
                this.skillOutputId = model.skillOutputId;
                this.slidesInfo = model.slidesInfo;
                this.taskExecutionId = model.taskExecutionId;
            } 

            /**
             * <p>创建时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * emailInfo.
             */
            public Builder emailInfo(EmailInfo emailInfo) {
                this.emailInfo = emailInfo;
                return this;
            }

            /**
             * fileInfo.
             */
            public Builder fileInfo(FileInfo fileInfo) {
                this.fileInfo = fileInfo;
                return this;
            }

            /**
             * <p>数据库创建时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>数据库更新时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-01T12:00:00Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>产出名称</p>
             * 
             * <strong>example:</strong>
             * <p>exampleItemName</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>产出明细类型: ppt/html/document/picture/slides/video/audio/email/others</p>
             * 
             * <strong>example:</strong>
             * <p>ppt</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * <p>产出明细类型国际化展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder itemTypeDisplayName(String itemTypeDisplayName) {
                this.itemTypeDisplayName = itemTypeDisplayName;
                return this;
            }

            /**
             * <p>助手消息ID，由 sendAsyncChatMessage 返回；不属于当前租户时返回 404</p>
             * 
             * <strong>example:</strong>
             * <p>exampleMessageId</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>产出明细 ID</p>
             * 
             * <strong>example:</strong>
             * <p>string_example_value</p>
             */
            public Builder outputItemId(String outputItemId) {
                this.outputItemId = outputItemId;
                return this;
            }

            /**
             * <p>是否开启分享</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder shareEnabled(Boolean shareEnabled) {
                this.shareEnabled = shareEnabled;
                return this;
            }

            /**
             * <p>分享令牌</p>
             * 
             * <strong>example:</strong>
             * <p>example_share_token</p>
             */
            public Builder shareToken(String shareToken) {
                this.shareToken = shareToken;
                return this;
            }

            /**
             * <p>技能产出 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSkillOutputId</p>
             */
            public Builder skillOutputId(String skillOutputId) {
                this.skillOutputId = skillOutputId;
                return this;
            }

            /**
             * slidesInfo.
             */
            public Builder slidesInfo(SlidesInfo slidesInfo) {
                this.slidesInfo = slidesInfo;
                return this;
            }

            /**
             * <p>任务执行 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleTaskExecutionId</p>
             */
            public Builder taskExecutionId(String taskExecutionId) {
                this.taskExecutionId = taskExecutionId;
                return this;
            }

            public OutputItems build() {
                return new OutputItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOutputFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOutputFilesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operatingObjectName")
        private String operatingObjectName;

        @com.aliyun.core.annotation.NameInMap("outputId")
        private String outputId;

        @com.aliyun.core.annotation.NameInMap("outputItems")
        private java.util.List<OutputItems> outputItems;

        @com.aliyun.core.annotation.NameInMap("outputType")
        private String outputType;

        @com.aliyun.core.annotation.NameInMap("outputTypeDisplayName")
        private String outputTypeDisplayName;

        @com.aliyun.core.annotation.NameInMap("skillOutputId")
        private String skillOutputId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Items(Builder builder) {
            this.conversationId = builder.conversationId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.operatingObjectName = builder.operatingObjectName;
            this.outputId = builder.outputId;
            this.outputItems = builder.outputItems;
            this.outputType = builder.outputType;
            this.outputTypeDisplayName = builder.outputTypeDisplayName;
            this.skillOutputId = builder.skillOutputId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operatingObjectName
         */
        public String getOperatingObjectName() {
            return this.operatingObjectName;
        }

        /**
         * @return outputId
         */
        public String getOutputId() {
            return this.outputId;
        }

        /**
         * @return outputItems
         */
        public java.util.List<OutputItems> getOutputItems() {
            return this.outputItems;
        }

        /**
         * @return outputType
         */
        public String getOutputType() {
            return this.outputType;
        }

        /**
         * @return outputTypeDisplayName
         */
        public String getOutputTypeDisplayName() {
            return this.outputTypeDisplayName;
        }

        /**
         * @return skillOutputId
         */
        public String getSkillOutputId() {
            return this.skillOutputId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String conversationId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String name; 
            private String operatingObjectName; 
            private String outputId; 
            private java.util.List<OutputItems> outputItems; 
            private String outputType; 
            private String outputTypeDisplayName; 
            private String skillOutputId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.conversationId = model.conversationId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.name = model.name;
                this.operatingObjectName = model.operatingObjectName;
                this.outputId = model.outputId;
                this.outputItems = model.outputItems;
                this.outputType = model.outputType;
                this.outputTypeDisplayName = model.outputTypeDisplayName;
                this.skillOutputId = model.skillOutputId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>会话 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleConversationId</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>创建时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>更新时间(ISO8601)</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例名称.pdf</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>数字员工（运营对象）名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder operatingObjectName(String operatingObjectName) {
                this.operatingObjectName = operatingObjectName;
                return this;
            }

            /**
             * <p>产出 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleOutputId</p>
             */
            public Builder outputId(String outputId) {
                this.outputId = outputId;
                return this;
            }

            /**
             * outputItems.
             */
            public Builder outputItems(java.util.List<OutputItems> outputItems) {
                this.outputItems = outputItems;
                return this;
            }

            /**
             * <p>产出类型: conversation/skill/task</p>
             * 
             * <strong>example:</strong>
             * <p>conversation</p>
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * <p>产出类型国际化展示名称</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder outputTypeDisplayName(String outputTypeDisplayName) {
                this.outputTypeDisplayName = outputTypeDisplayName;
                return this;
            }

            /**
             * <p>技能产出 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleSkillOutputId</p>
             */
            public Builder skillOutputId(String skillOutputId) {
                this.skillOutputId = skillOutputId;
                return this;
            }

            /**
             * <p>任务 ID</p>
             * 
             * <strong>example:</strong>
             * <p>string_example_value</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
