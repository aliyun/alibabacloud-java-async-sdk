// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link SaveGraphDraftResourceResponseBody} extends {@link TeaModel}
 *
 * <p>SaveGraphDraftResourceResponseBody</p>
 */
public class SaveGraphDraftResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("draftChangeId")
    private Long draftChangeId;

    @com.aliyun.core.annotation.NameInMap("draftContentHash")
    private String draftContentHash;

    @com.aliyun.core.annotation.NameInMap("elementType")
    private String elementType;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("operationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private SaveGraphDraftResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.draftChangeId = builder.draftChangeId;
        this.draftContentHash = builder.draftContentHash;
        this.elementType = builder.elementType;
        this.gmtModified = builder.gmtModified;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.operationType = builder.operationType;
        this.requestId = builder.requestId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveGraphDraftResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return draftChangeId
     */
    public Long getDraftChangeId() {
        return this.draftChangeId;
    }

    /**
     * @return draftContentHash
     */
    public String getDraftContentHash() {
        return this.draftContentHash;
    }

    /**
     * @return elementType
     */
    public String getElementType() {
        return this.elementType;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String code; 
        private Long draftChangeId; 
        private String draftContentHash; 
        private String elementType; 
        private String gmtModified; 
        private String graphName; 
        private String message; 
        private String operationType; 
        private String requestId; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(SaveGraphDraftResourceResponseBody model) {
            this.code = model.code;
            this.draftChangeId = model.draftChangeId;
            this.draftContentHash = model.draftContentHash;
            this.elementType = model.elementType;
            this.gmtModified = model.gmtModified;
            this.graphName = model.graphName;
            this.message = model.message;
            this.operationType = model.operationType;
            this.requestId = model.requestId;
            this.resourceName = model.resourceName;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>草稿变更 ID；内容与在线完全一致被跳过时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>401001</p>
         */
        public Builder draftChangeId(Long draftChangeId) {
            this.draftChangeId = draftChangeId;
            return this;
        }

        /**
         * <p>草稿内容哈希；被跳过时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:abc123</p>
         */
        public Builder draftContentHash(String draftContentHash) {
            this.draftContentHash = draftContentHash;
            return this;
        }

        /**
         * <p>资源小类：resourceType=object 时固定 object_type；resourceType=element 时为 indicator / logic / process / rule / analysis 之一</p>
         * 
         * <strong>example:</strong>
         * <p>object_type</p>
         */
        public Builder elementType(String elementType) {
            this.elementType = elementType;
            return this;
        }

        /**
         * <p>最后修改时间（ISO8601）；被跳过时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T10:30:00+00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>图谱名称</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>操作类型：CREATE / UPDATE（由底层判定）；被跳过时为 null</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>资源名</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>资源大类：object（对象）/ element（业务元素）</p>
         * 
         * <strong>example:</strong>
         * <p>object</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public SaveGraphDraftResourceResponseBody build() {
            return new SaveGraphDraftResourceResponseBody(this);
        } 

    } 

}
