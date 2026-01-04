// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link GetSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchemaResponseBody</p>
 */
public class GetSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RecordSchema")
    private String recordSchema;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private Integer versionId;

    private GetSchemaResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.projectName = builder.projectName;
        this.recordSchema = builder.recordSchema;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.topicName = builder.topicName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return recordSchema
     */
    public String getRecordSchema() {
        return this.recordSchema;
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return versionId
     */
    public Integer getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private Long createTime; 
        private String creator; 
        private String projectName; 
        private String recordSchema; 
        private String requestId; 
        private Boolean success; 
        private String topicName; 
        private Integer versionId; 

        private Builder() {
        } 

        private Builder(GetSchemaResponseBody model) {
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.projectName = model.projectName;
            this.recordSchema = model.recordSchema;
            this.requestId = model.requestId;
            this.success = model.success;
            this.topicName = model.topicName;
            this.versionId = model.versionId;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RecordSchema.
         */
        public Builder recordSchema(String recordSchema) {
            this.recordSchema = recordSchema;
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
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }

        public GetSchemaResponseBody build() {
            return new GetSchemaResponseBody(this);
        } 

    } 

}
