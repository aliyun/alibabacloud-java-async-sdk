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
 * {@link ListGraphSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListGraphSchemasResponseBody</p>
 */
public class ListGraphSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGraphSchemasResponseBody(Builder builder) {
        this.code = builder.code;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGraphSchemasResponseBody create() {
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
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGraphSchemasResponseBody model) {
            this.code = model.code;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
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
         * <p>租户下 active 图谱摘要列表</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
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

        public ListGraphSchemasResponseBody build() {
            return new ListGraphSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGraphSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListGraphSchemasResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeVersion")
        private String activeVersion;

        @com.aliyun.core.annotation.NameInMap("businessProfile")
        private String businessProfile;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("graphName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("graphStatus")
        @com.aliyun.core.annotation.Validation(required = true)
        private String graphStatus;

        @com.aliyun.core.annotation.NameInMap("hasDraft")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean hasDraft;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("objectTypeCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long objectTypeCount;

        @com.aliyun.core.annotation.NameInMap("relationCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long relationCount;

        @com.aliyun.core.annotation.NameInMap("semanticTags")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> semanticTags;

        private Items(Builder builder) {
            this.activeVersion = builder.activeVersion;
            this.businessProfile = builder.businessProfile;
            this.displayName = builder.displayName;
            this.graphName = builder.graphName;
            this.graphStatus = builder.graphStatus;
            this.hasDraft = builder.hasDraft;
            this.isDefault = builder.isDefault;
            this.objectTypeCount = builder.objectTypeCount;
            this.relationCount = builder.relationCount;
            this.semanticTags = builder.semanticTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return activeVersion
         */
        public String getActiveVersion() {
            return this.activeVersion;
        }

        /**
         * @return businessProfile
         */
        public String getBusinessProfile() {
            return this.businessProfile;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
        }

        /**
         * @return graphStatus
         */
        public String getGraphStatus() {
            return this.graphStatus;
        }

        /**
         * @return hasDraft
         */
        public Boolean getHasDraft() {
            return this.hasDraft;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return objectTypeCount
         */
        public Long getObjectTypeCount() {
            return this.objectTypeCount;
        }

        /**
         * @return relationCount
         */
        public Long getRelationCount() {
            return this.relationCount;
        }

        /**
         * @return semanticTags
         */
        public java.util.List<String> getSemanticTags() {
            return this.semanticTags;
        }

        public static final class Builder {
            private String activeVersion; 
            private String businessProfile; 
            private String displayName; 
            private String graphName; 
            private String graphStatus; 
            private Boolean hasDraft; 
            private Boolean isDefault; 
            private Long objectTypeCount; 
            private Long relationCount; 
            private java.util.List<String> semanticTags; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.activeVersion = model.activeVersion;
                this.businessProfile = model.businessProfile;
                this.displayName = model.displayName;
                this.graphName = model.graphName;
                this.graphStatus = model.graphStatus;
                this.hasDraft = model.hasDraft;
                this.isDefault = model.isDefault;
                this.objectTypeCount = model.objectTypeCount;
                this.relationCount = model.relationCount;
                this.semanticTags = model.semanticTags;
            } 

            /**
             * <p>active Schema 版本</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0</p>
             */
            public Builder activeVersion(String activeVersion) {
                this.activeVersion = activeVersion;
                return this;
            }

            /**
             * <p>业务说明，未设置时为空字符串</p>
             * 
             * <strong>example:</strong>
             * <p>客户域语义图谱</p>
             */
            public Builder businessProfile(String businessProfile) {
                this.businessProfile = businessProfile;
                return this;
            }

            /**
             * <p>图谱展示名，空值时兜底 graphName</p>
             * 
             * <strong>example:</strong>
             * <p>CRM 图谱</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>图谱名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>crm_graph</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>图谱状态：PUBLISHED / DEVELOPING（当前用户有活动草稿）/ PUBLISHING（当前用户发布中）</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder graphStatus(String graphStatus) {
                this.graphStatus = graphStatus;
                return this;
            }

            /**
             * <p>当前调用者视角是否存在个人活动草稿；部署/系统级 Token 恒 false</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasDraft(Boolean hasDraft) {
                this.hasDraft = hasDraft;
                return this;
            }

            /**
             * <p>是否为租户默认图谱</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>object_type 数量，解析失败兜底 0</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder objectTypeCount(Long objectTypeCount) {
                this.objectTypeCount = objectTypeCount;
                return this;
            }

            /**
             * <p>relation 数量，解析失败兜底 0</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder relationCount(Long relationCount) {
                this.relationCount = relationCount;
                return this;
            }

            /**
             * <p>语义标签列表，未配置时为空数组</p>
             * <p>This parameter is required.</p>
             */
            public Builder semanticTags(java.util.List<String> semanticTags) {
                this.semanticTags = semanticTags;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
