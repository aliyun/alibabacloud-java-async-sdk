// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @Body
    @NameInMap("CategoryId")
    @Validation(required = true)
    private String categoryId;

    @Body
    @NameInMap("CreatorId")
    private String creatorId;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("FileNameList")
    private java.util.List < String > fileNameList;

    @Query
    @NameInMap("SecretInfo")
    private SecretInfo secretInfo;

    @Body
    @NameInMap("Severity")
    @Validation(required = true, maximum = 1000)
    private Integer severity;

    @Body
    @NameInMap("Title")
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
    public java.util.List < String > getFileNameList() {
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
        private java.util.List < String > fileNameList; 
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
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * FileNameList.
         */
        public Builder fileNameList(java.util.List < String > fileNameList) {
            String fileNameListShrink = shrink(fileNameList, "FileNameList", "simple");
            this.putBodyParameter("FileNameList", fileNameListShrink);
            this.fileNameList = fileNameList;
            return this;
        }

        /**
         * SecretInfo.
         */
        public Builder secretInfo(SecretInfo secretInfo) {
            String secretInfoShrink = shrink(secretInfo, "SecretInfo", "json");
            this.putQueryParameter("SecretInfo", secretInfoShrink);
            this.secretInfo = secretInfo;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putBodyParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * Title.
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

    public static class SecretInfo extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("FileNameList")
        private java.util.List < String > fileNameList;

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
        public java.util.List < String > getFileNameList() {
            return this.fileNameList;
        }

        public static final class Builder {
            private String content; 
            private java.util.List < String > fileNameList; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FileNameList.
             */
            public Builder fileNameList(java.util.List < String > fileNameList) {
                this.fileNameList = fileNameList;
                return this;
            }

            public SecretInfo build() {
                return new SecretInfo(this);
            } 

        } 

    }
}
