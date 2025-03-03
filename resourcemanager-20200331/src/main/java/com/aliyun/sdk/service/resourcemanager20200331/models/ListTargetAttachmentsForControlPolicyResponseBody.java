// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListTargetAttachmentsForControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListTargetAttachmentsForControlPolicyResponseBody</p>
 */
public class ListTargetAttachmentsForControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetAttachments")
    private TargetAttachments targetAttachments;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B32BD3D6-1089-41F3-8E70-E0079BC7D760</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of objects to which the control policy is attached.</p>
         */
        public Builder targetAttachments(TargetAttachments targetAttachments) {
            this.targetAttachments = targetAttachments;
            return this;
        }

        /**
         * <p>The total number of objects to which the control policy is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTargetAttachmentsForControlPolicyResponseBody build() {
            return new ListTargetAttachmentsForControlPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTargetAttachmentsForControlPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListTargetAttachmentsForControlPolicyResponseBody</p>
     */
    public static class TargetAttachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>The time when the control policy was attached to the object.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-19T02:56:24Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-ZDNPiT****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev_Department</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the object. Valid values:</p>
             * <ul>
             * <li>Root: Root folder</li>
             * <li>Folder: child folder of the Root folder</li>
             * <li>Account: member account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Folder</p>
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
    /**
     * 
     * {@link ListTargetAttachmentsForControlPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListTargetAttachmentsForControlPolicyResponseBody</p>
     */
    public static class TargetAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetAttachment")
        private java.util.List<TargetAttachment> targetAttachment;

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
        public java.util.List<TargetAttachment> getTargetAttachment() {
            return this.targetAttachment;
        }

        public static final class Builder {
            private java.util.List<TargetAttachment> targetAttachment; 

            /**
             * TargetAttachment.
             */
            public Builder targetAttachment(java.util.List<TargetAttachment> targetAttachment) {
                this.targetAttachment = targetAttachment;
                return this;
            }

            public TargetAttachments build() {
                return new TargetAttachments(this);
            } 

        } 

    }
}
