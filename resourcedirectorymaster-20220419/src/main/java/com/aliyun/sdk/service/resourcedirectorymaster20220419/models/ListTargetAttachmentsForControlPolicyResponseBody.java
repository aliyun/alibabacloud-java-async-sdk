// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTargetAttachmentsForControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListTargetAttachmentsForControlPolicyResponseBody</p>
 */
public class ListTargetAttachmentsForControlPolicyResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetAttachments")
    private TargetAttachments targetAttachments;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTargetAttachmentsForControlPolicyResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.targetAttachments = builder.targetAttachments;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetAttachmentsForControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetAttachments
     */
    public TargetAttachments getTargetAttachments() {
        return this.targetAttachments;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private TargetAttachments targetAttachments; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TargetAttachments.
         */
        public Builder targetAttachments(TargetAttachments targetAttachments) {
            this.targetAttachments = targetAttachments;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTargetAttachmentsForControlPolicyResponseBody build() {
            return new ListTargetAttachmentsForControlPolicyResponseBody(this);
        } 

    } 

    public static class TargetAttachment extends TeaModel {
        @NameInMap("AttachDate")
        private String attachDate;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        private TargetAttachment(Builder builder) {
            this.attachDate = builder.attachDate;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetAttachment create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String attachDate; 
            private String targetId; 
            private String targetName; 
            private String targetType; 

            /**
             * AttachDate.
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetAttachment build() {
                return new TargetAttachment(this);
            } 

        } 

    }
    public static class TargetAttachments extends TeaModel {
        @NameInMap("TargetAttachment")
        private java.util.List < TargetAttachment> targetAttachment;

        private TargetAttachments(Builder builder) {
            this.targetAttachment = builder.targetAttachment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetAttachments create() {
            return builder().build();
        }

        /**
         * @return targetAttachment
         */
        public java.util.List < TargetAttachment> getTargetAttachment() {
            return this.targetAttachment;
        }

        public static final class Builder {
            private java.util.List < TargetAttachment> targetAttachment; 

            /**
             * TargetAttachment.
             */
            public Builder targetAttachment(java.util.List < TargetAttachment> targetAttachment) {
                this.targetAttachment = targetAttachment;
                return this;
            }

            public TargetAttachments build() {
                return new TargetAttachments(this);
            } 

        } 

    }
}
