// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListNodeDownStreamResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeDownStreamResponseBody</p>
 */
public class ListNodeDownStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeInfoList")
    private java.util.List<NodeInfoList> nodeInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListNodeDownStreamResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nodeInfoList = builder.nodeInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeDownStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeInfoList
     */
    public java.util.List<NodeInfoList> getNodeInfoList() {
        return this.nodeInfoList;
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
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<NodeInfoList> nodeInfoList; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * NodeInfoList.
         */
        public Builder nodeInfoList(java.util.List<NodeInfoList> nodeInfoList) {
            this.nodeInfoList = nodeInfoList;
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

        public ListNodeDownStreamResponseBody build() {
            return new ListNodeDownStreamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDownStreamResponseBody</p>
     */
    public static class NodeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Depth")
        private Integer depth;

        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NodeInfoList(Builder builder) {
            this.depth = builder.depth;
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfoList create() {
            return builder().build();
        }

        /**
         * @return depth
         */
        public Integer getDepth() {
            return this.depth;
        }

        /**
         * @return fieldIdList
         */
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer depth; 
            private java.util.List<String> fieldIdList; 
            private String id; 
            private String name; 
            private String type; 

            /**
             * Depth.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * FieldIdList.
             */
            public Builder fieldIdList(java.util.List<String> fieldIdList) {
                this.fieldIdList = fieldIdList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NodeInfoList build() {
                return new NodeInfoList(this);
            } 

        } 

    }
}
