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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAuthorityTemplateResponseBody model) {
            this.authorityTemplateViewList = model.authorityTemplateViewList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tid = model.tid;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The permission templates.</p>
         */
        public Builder authorityTemplateViewList(AuthorityTemplateViewList authorityTemplateViewList) {
            this.authorityTemplateViewList = authorityTemplateViewList;
            return this;
        }

        /**
         * <p>The error code that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>31853A2B-DC9D-5B39-8492-D2AC8BCF550E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        /**
         * <p>The total number of permission templates.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

            private Builder() {
            } 

            private Builder(AuthorityTemplateView model) {
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.name = model.name;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The time when the permission template was created. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-26 11:37:47</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the user who created the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>522****</p>
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description of the permission template.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission template.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>2592</p>
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

            private Builder() {
            } 

            private Builder(AuthorityTemplateViewList model) {
                this.authorityTemplateView = model.authorityTemplateView;
            } 

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
