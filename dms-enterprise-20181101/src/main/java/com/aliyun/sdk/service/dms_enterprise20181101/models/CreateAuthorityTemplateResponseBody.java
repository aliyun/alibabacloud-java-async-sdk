// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthorityTemplateResponseBody</p>
 */
public class CreateAuthorityTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityTemplateView")
    private AuthorityTemplateView authorityTemplateView;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private CreateAuthorityTemplateResponseBody(Builder builder) {
        this.authorityTemplateView = builder.authorityTemplateView;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorityTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityTemplateView
     */
    public AuthorityTemplateView getAuthorityTemplateView() {
        return this.authorityTemplateView;
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

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder {
        private AuthorityTemplateView authorityTemplateView; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long tid; 

        /**
         * The details of the permission template.
         */
        public Builder authorityTemplateView(AuthorityTemplateView authorityTemplateView) {
            this.authorityTemplateView = authorityTemplateView;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        public CreateAuthorityTemplateResponseBody build() {
            return new CreateAuthorityTemplateResponseBody(this);
        } 

    } 

    public static class AuthorityTemplateView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private AuthorityTemplateView(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityTemplateView create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
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
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String createTime; 
            private Long creatorId; 
            private String description; 
            private String name; 
            private Long templateId; 

            /**
             * The time when the permission template was created. The time is in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the user who created the permission template.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the permission template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the permission template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the permission template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public AuthorityTemplateView build() {
                return new AuthorityTemplateView(this);
            } 

        } 

    }
}
