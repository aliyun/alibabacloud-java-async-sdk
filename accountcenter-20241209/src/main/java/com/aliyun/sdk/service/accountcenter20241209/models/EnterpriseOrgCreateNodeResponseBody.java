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
 * {@link EnterpriseOrgCreateNodeResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseOrgCreateNodeResponseBody</p>
 */
public class EnterpriseOrgCreateNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseOrgCreateNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseOrgCreateNodeResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseOrgCreateNodeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public EnterpriseOrgCreateNodeResponseBody build() {
            return new EnterpriseOrgCreateNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseOrgCreateNodeResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseOrgCreateNodeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("ParentNodeId")
        private String parentNodeId;

        @com.aliyun.core.annotation.NameInMap("ParentNodeType")
        private String parentNodeType;

        @com.aliyun.core.annotation.NameInMap("TreeId")
        private Long treeId;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.parentNodeId = builder.parentNodeId;
            this.parentNodeType = builder.parentNodeType;
            this.treeId = builder.treeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return parentNodeId
         */
        public String getParentNodeId() {
            return this.parentNodeId;
        }

        /**
         * @return parentNodeType
         */
        public String getParentNodeType() {
            return this.parentNodeType;
        }

        /**
         * @return treeId
         */
        public Long getTreeId() {
            return this.treeId;
        }

        public static final class Builder {
            private String gmtCreate; 
            private Long id; 
            private String nodeId; 
            private String nodeName; 
            private String nodeType; 
            private String parentNodeId; 
            private String parentNodeType; 
            private Long treeId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.parentNodeId = model.parentNodeId;
                this.parentNodeType = model.parentNodeType;
                this.treeId = model.treeId;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * ParentNodeId.
             */
            public Builder parentNodeId(String parentNodeId) {
                this.parentNodeId = parentNodeId;
                return this;
            }

            /**
             * ParentNodeType.
             */
            public Builder parentNodeType(String parentNodeType) {
                this.parentNodeType = parentNodeType;
                return this;
            }

            /**
             * TreeId.
             */
            public Builder treeId(Long treeId) {
                this.treeId = treeId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
