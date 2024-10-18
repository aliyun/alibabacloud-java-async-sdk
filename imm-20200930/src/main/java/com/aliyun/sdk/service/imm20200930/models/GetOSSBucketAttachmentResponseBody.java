// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOSSBucketAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOSSBucketAttachmentResponseBody</p>
 */
public class GetOSSBucketAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetOSSBucketAttachmentResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSBucketAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String projectName; 
        private String requestId; 
        private String updateTime; 

        /**
         * <p>The time when the dataset was created.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;2023-12-19T17:29:34.790931971+08:00&quot;</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Dataset&quot;</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5F74C5C9-5AC0-49F9-914D-E01589D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the dataset was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;2023-12-19T17:29:34.790931971+08:00&quot;</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetOSSBucketAttachmentResponseBody build() {
            return new GetOSSBucketAttachmentResponseBody(this);
        } 

    } 

}
