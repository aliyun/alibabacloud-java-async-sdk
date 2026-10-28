// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResourceOperation} extends {@link TeaModel}
 *
 * <p>ResourceOperation</p>
 */
public class ResourceOperation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtEndTime")
    private String gmtEndTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("OperationDescription")
    private String operationDescription;

    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("OperationSpecJson")
    private String operationSpecJson;

    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ResourceOperation(Builder builder) {
        this.creatorId = builder.creatorId;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtEndTime = builder.gmtEndTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.operationDescription = builder.operationDescription;
        this.operationId = builder.operationId;
        this.operationSpecJson = builder.operationSpecJson;
        this.operationType = builder.operationType;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceOperation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtEndTime
     */
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtStartTime
     */
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operationDescription
     */
    public String getOperationDescription() {
        return this.operationDescription;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return operationSpecJson
     */
    public String getOperationSpecJson() {
        return this.operationSpecJson;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String creatorId; 
        private String gmtCreatedTime; 
        private String gmtEndTime; 
        private String gmtModifiedTime; 
        private String gmtStartTime; 
        private String objectId; 
        private String objectType; 
        private String operationDescription; 
        private String operationId; 
        private String operationSpecJson; 
        private String operationType; 
        private String reasonCode; 
        private String reasonMessage; 
        private String status; 

        private Builder() {
        } 

        private Builder(ResourceOperation model) {
            this.creatorId = model.creatorId;
            this.gmtCreatedTime = model.gmtCreatedTime;
            this.gmtEndTime = model.gmtEndTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.gmtStartTime = model.gmtStartTime;
            this.objectId = model.objectId;
            this.objectType = model.objectType;
            this.operationDescription = model.operationDescription;
            this.operationId = model.operationId;
            this.operationSpecJson = model.operationSpecJson;
            this.operationType = model.operationType;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the creator of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>1884692****</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The time when the resource change was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * <p>The time when the resource change ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:02:00Z</p>
         */
        public Builder gmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }

        /**
         * <p>The time when the resource change was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The time when the resource change started.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:01:00Z</p>
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * <p>The object ID of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaxxx</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The object type of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The description of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>A user requests to change the Desired Capacity from 4 to 5.</p>
         */
        public Builder operationDescription(String operationDescription) {
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * <p>The resource change ID.</p>
         * 
         * <strong>example:</strong>
         * <p>operation-123</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The details of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ScaleQuota&quot;:{&quot;Min&quot;:{&quot;NodeSpecs&quot;:[{&quot;Type&quot;:&quot;ecs.gn6i-c8g1.2xlarge&quot;,&quot;Count&quot;:20,&quot;IncludeNodes&quot;:[&quot;A&quot;,&quot;B&quot;,&quot;C&quot;],&quot;ExcludeNodes&quot;:[&quot;D&quot;]}]}}}</p>
         */
        public Builder operationSpecJson(String operationSpecJson) {
            this.operationSpecJson = operationSpecJson;
            return this;
        }

        /**
         * <p>The type of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>ScaleQuota</p>
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The error code.</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * <p>The status of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ResourceOperation build() {
            return new ResourceOperation(this);
        } 

    } 

}
