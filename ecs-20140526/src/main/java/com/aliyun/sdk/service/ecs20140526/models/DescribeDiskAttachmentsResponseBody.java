// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiskAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskAttachmentsResponseBody</p>
 */
public class DescribeDiskAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskAttachments")
    private java.util.List<DiskAttachments> diskAttachments;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskAttachmentsResponseBody(Builder builder) {
        this.diskAttachments = builder.diskAttachments;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskAttachmentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskAttachments
     */
    public java.util.List<DiskAttachments> getDiskAttachments() {
        return this.diskAttachments;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DiskAttachments> diskAttachments; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDiskAttachmentsResponseBody model) {
            this.diskAttachments = model.diskAttachments;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of disk attachments.</p>
         */
        public Builder diskAttachments(java.util.List<DiskAttachments> diskAttachments) {
            this.diskAttachments = diskAttachments;
            return this;
        }

        /**
         * <p>The maximum number of attachments returned in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. An empty value indicates that all attachments have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskAttachmentsResponseBody build() {
            return new DescribeDiskAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskAttachmentsResponseBody</p>
     */
    public static class DiskAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedTime")
        private String attachedTime;

        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private DiskAttachments(Builder builder) {
            this.attachedTime = builder.attachedTime;
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskAttachments create() {
            return builder().build();
        }

        /**
         * @return attachedTime
         */
        public String getAttachedTime() {
            return this.attachedTime;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String attachedTime; 
            private String device; 
            private String diskId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(DiskAttachments model) {
                this.attachedTime = model.attachedTime;
                this.device = model.device;
                this.diskId = model.diskId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The time when the disk was successfully attached, in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12T06:08:54Z</p>
             */
            public Builder attachedTime(String attachedTime) {
                this.attachedTime = attachedTime;
                return this;
            }

            /**
             * <p>The device name on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvdb</p>
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * <p>The disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp131n0q38u3a4zi****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The ID of the instance to which the disk is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp18pnlg1ds9rky4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public DiskAttachments build() {
                return new DiskAttachments(this);
            } 

        } 

    }
}
