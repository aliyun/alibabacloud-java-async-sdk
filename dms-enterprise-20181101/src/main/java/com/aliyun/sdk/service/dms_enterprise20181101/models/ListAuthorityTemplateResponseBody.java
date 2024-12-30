// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListAuthorityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorityTemplateResponseBody</p>
 */
public class ListAuthorityTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityTemplateViewList")
    private AuthorityTemplateViewList authorityTemplateViewList;

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

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthorityTemplateResponseBody(Builder builder) {
        this.authorityTemplateViewList = builder.authorityTemplateViewList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tid = builder.tid;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorityTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityTemplateViewList
     */
    public AuthorityTemplateViewList getAuthorityTemplateViewList() {
        return this.authorityTemplateViewList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AuthorityTemplateViewList authorityTemplateViewList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long tid; 
        private Long totalCount; 

        /**
         * AuthorityTemplateViewList.
         */
        public Builder authorityTemplateViewList(AuthorityTemplateViewList authorityTemplateViewList) {
            this.authorityTemplateViewList = authorityTemplateViewList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorityTemplateResponseBody build() {
            return new ListAuthorityTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorityTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityTemplateResponseBody</p>
     */
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
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
    /**
     * 
     * {@link ListAuthorityTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorityTemplateResponseBody</p>
     */
    public static class AuthorityTemplateViewList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorityTemplateView")
        private java.util.List<AuthorityTemplateView> authorityTemplateView;

        private AuthorityTemplateViewList(Builder builder) {
            this.authorityTemplateView = builder.authorityTemplateView;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityTemplateViewList create() {
            return builder().build();
        }

        /**
         * @return authorityTemplateView
         */
        public java.util.List<AuthorityTemplateView> getAuthorityTemplateView() {
            return this.authorityTemplateView;
        }

        public static final class Builder {
            private java.util.List<AuthorityTemplateView> authorityTemplateView; 

            /**
             * AuthorityTemplateView.
             */
            public Builder authorityTemplateView(java.util.List<AuthorityTemplateView> authorityTemplateView) {
                this.authorityTemplateView = authorityTemplateView;
                return this;
            }

            public AuthorityTemplateViewList build() {
                return new AuthorityTemplateViewList(this);
            } 

        } 

    }
}
