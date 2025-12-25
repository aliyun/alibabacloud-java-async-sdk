// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileNameList")
    private java.util.List<String> fileNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretInfo")
    private SecretInfo secretInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Severity")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000)
    private Integer severity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.creatorId = builder.creatorId;
        this.description = builder.description;
        this.email = builder.email;
        this.fileNameList = builder.fileNameList;
        this.secretInfo = builder.secretInfo;
        this.severity = builder.severity;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return fileNameList
     */
    public java.util.List<String> getFileNameList() {
        return this.fileNameList;
    }

    /**
     * @return secretInfo
     */
    public SecretInfo getSecretInfo() {
        return this.secretInfo;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String categoryId; 
        private String creatorId; 
        private String description; 
        private String email; 
        private java.util.List<String> fileNameList; 
        private SecretInfo secretInfo; 
        private Integer severity; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.creatorId = request.creatorId;
            this.description = request.description;
            this.email = request.email;
            this.fileNameList = request.fileNameList;
            this.secretInfo = request.secretInfo;
            this.severity = request.severity;
            this.title = request.title;
        } 

        /**
         * <p>The ID of the problem category. You can obtain the returned value from the ListCategories operation by using the CategoryId parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7161</p>
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>Submit the Alibaba Cloud UID of the account, which is required for the MPK virtual market scene.</p>
         * 
         * <strong>example:</strong>
         * <p>1289427240739141</p>
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The description of the ticket. Only pure text format is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why ECS backup failed?</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p><a href="mailto:sdahkjdshga@qq.com">sdahkjdshga@qq.com</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:163@163.com">163@163.com</a></p>
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The list of attachment names, GetAttachmentUploadUrl the ObjectKey field returned by the interface.</p>
         */
        public Builder fileNameList(java.util.List<String> fileNameList) {
            String fileNameListShrink = shrink(fileNameList, "FileNameList", "simple");
            this.putBodyParameter("FileNameList", fileNameListShrink);
            this.fileNameList = fileNameList;
            return this;
        }

        /**
         * <p>Sensitive information</p>
         */
        public Builder secretInfo(SecretInfo secretInfo) {
            String secretInfoShrink = shrink(secretInfo, "SecretInfo", "json");
            this.putQueryParameter("SecretInfo", secretInfoShrink);
            this.secretInfo = secretInfo;
            return this;
        }

        /**
         * <p>Enumeration value, 1 for general problem, 2 for urgent problem</p>
         * <p>Enumeration values:</p>
         * <ul>
         * <li>1: regular.</li>
         * <li>2: emergency.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder severity(Integer severity) {
            this.putBodyParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>The title of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>Why ECS backup failed?</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTicketRequest} extends {@link TeaModel}
     *
     * <p>CreateTicketRequest</p>
     */
    public static class SecretInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileNameList")
        private java.util.List<String> fileNameList;

        private SecretInfo(Builder builder) {
            this.content = builder.content;
            this.fileNameList = builder.fileNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileNameList
         */
        public java.util.List<String> getFileNameList() {
            return this.fileNameList;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<String> fileNameList; 

            private Builder() {
            } 

            private Builder(SecretInfo model) {
                this.content = model.content;
                this.fileNameList = model.fileNameList;
            } 

            /**
             * <p>Sensitive information-text content</p>
             * 
             * <strong>example:</strong>
             * <p>ID:330102xxxxxx</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Sensitive Information-Attachment Name List</p>
             */
            public Builder fileNameList(java.util.List<String> fileNameList) {
                this.fileNameList = fileNameList;
                return this;
            }

            public SecretInfo build() {
                return new SecretInfo(this);
            } 

        } 

    }
}
