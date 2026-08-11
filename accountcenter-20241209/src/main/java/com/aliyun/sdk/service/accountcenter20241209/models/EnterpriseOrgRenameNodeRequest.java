// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseOrgRenameNodeRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseOrgRenameNodeRequest</p>
 */
public class EnterpriseOrgRenameNodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ext")
    private java.util.Map<String, ?> ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsOpenApi")
    private Boolean isOpenApi;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TreeId")
    private Long treeId;

    private EnterpriseOrgRenameNodeRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.bizName = builder.bizName;
        this.ext = builder.ext;
        this.isOpenApi = builder.isOpenApi;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.nodeType = builder.nodeType;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.showCompleteInfo = builder.showCompleteInfo;
        this.treeId = builder.treeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseOrgRenameNodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return ext
     */
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    /**
     * @return isOpenApi
     */
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    /**
     * @return treeId
     */
    public Long getTreeId() {
        return this.treeId;
    }

    public static final class Builder extends Request.Builder<EnterpriseOrgRenameNodeRequest, Builder> {
        private String appName; 
        private String bizName; 
        private java.util.Map<String, ?> ext; 
        private Boolean isOpenApi; 
        private String nodeId; 
        private String nodeName; 
        private String nodeType; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Boolean showCompleteInfo; 
        private Long treeId; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseOrgRenameNodeRequest request) {
            super(request);
            this.appName = request.appName;
            this.bizName = request.bizName;
            this.ext = request.ext;
            this.isOpenApi = request.isOpenApi;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.nodeType = request.nodeType;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.showCompleteInfo = request.showCompleteInfo;
            this.treeId = request.treeId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BizName.
         */
        public Builder bizName(String bizName) {
            this.putBodyParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(java.util.Map<String, ?> ext) {
            String extShrink = shrink(ext, "Ext", "json");
            this.putBodyParameter("Ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * IsOpenApi.
         */
        public Builder isOpenApi(Boolean isOpenApi) {
            this.putBodyParameter("IsOpenApi", isOpenApi);
            this.isOpenApi = isOpenApi;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putBodyParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putBodyParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        /**
         * TreeId.
         */
        public Builder treeId(Long treeId) {
            this.putBodyParameter("TreeId", treeId);
            this.treeId = treeId;
            return this;
        }

        @Override
        public EnterpriseOrgRenameNodeRequest build() {
            return new EnterpriseOrgRenameNodeRequest(this);
        } 

    } 

}
