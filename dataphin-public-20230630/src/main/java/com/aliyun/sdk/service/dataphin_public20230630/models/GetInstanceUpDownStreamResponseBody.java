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
 * {@link GetInstanceUpDownStreamResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceUpDownStreamResponseBody</p>
 */
public class GetInstanceUpDownStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceDagInfo")
    private InstanceDagInfo instanceDagInfo;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceUpDownStreamResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceDagInfo = builder.instanceDagInfo;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUpDownStreamResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceDagInfo
     */
    public InstanceDagInfo getInstanceDagInfo() {
        return this.instanceDagInfo;
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
        private Integer httpStatusCode; 
        private InstanceDagInfo instanceDagInfo; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceUpDownStreamResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceDagInfo = model.instanceDagInfo;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The instance dag data, including the current instance and its upstream and downstream instances.</p>
         */
        public Builder instanceDagInfo(InstanceDagInfo instanceDagInfo) {
            this.instanceDagInfo = instanceDagInfo;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceUpDownStreamResponseBody build() {
            return new GetInstanceUpDownStreamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceUpDownStreamResponseBody</p>
     */
    public static class DownInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private DownInstanceList(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownInstanceList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
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
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 
            private String name; 
            private String nodeId; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(DownInstanceList model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>The list of field IDs.</p>
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_1234567</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1234567</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public DownInstanceList build() {
                return new DownInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceUpDownStreamResponseBody</p>
     */
    public static class StartInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private StartInstanceList(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartInstanceList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
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
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 
            private String name; 
            private String nodeId; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(StartInstanceList model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>The list of field IDs.</p>
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_1234567</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1234567</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li>DATA_PROCESS: code node.</li>
             * <li>BBOX_LOGIC_TABLE_NODE: logical table node.</li>
             * <li>PIPELINE_NODE: pipeline node.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public StartInstanceList build() {
                return new StartInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceUpDownStreamResponseBody</p>
     */
    public static class UpInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceIdList")
        private java.util.List<String> fieldInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        private UpInstanceList(Builder builder) {
            this.fieldInstanceIdList = builder.fieldInstanceIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpInstanceList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceIdList
         */
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
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
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        public static final class Builder {
            private java.util.List<String> fieldInstanceIdList; 
            private String id; 
            private String name; 
            private String nodeId; 
            private String nodeType; 

            private Builder() {
            } 

            private Builder(UpInstanceList model) {
                this.fieldInstanceIdList = model.fieldInstanceIdList;
                this.id = model.id;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
            } 

            /**
             * <p>The list of field IDs.</p>
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_1234567</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1234567</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            public UpInstanceList build() {
                return new UpInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceUpDownStreamResponseBody</p>
     */
    public static class InstanceDagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownInstanceList")
        private java.util.List<DownInstanceList> downInstanceList;

        @com.aliyun.core.annotation.NameInMap("StartInstanceList")
        private java.util.List<StartInstanceList> startInstanceList;

        @com.aliyun.core.annotation.NameInMap("UpInstanceList")
        private java.util.List<UpInstanceList> upInstanceList;

        private InstanceDagInfo(Builder builder) {
            this.downInstanceList = builder.downInstanceList;
            this.startInstanceList = builder.startInstanceList;
            this.upInstanceList = builder.upInstanceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDagInfo create() {
            return builder().build();
        }

        /**
         * @return downInstanceList
         */
        public java.util.List<DownInstanceList> getDownInstanceList() {
            return this.downInstanceList;
        }

        /**
         * @return startInstanceList
         */
        public java.util.List<StartInstanceList> getStartInstanceList() {
            return this.startInstanceList;
        }

        /**
         * @return upInstanceList
         */
        public java.util.List<UpInstanceList> getUpInstanceList() {
            return this.upInstanceList;
        }

        public static final class Builder {
            private java.util.List<DownInstanceList> downInstanceList; 
            private java.util.List<StartInstanceList> startInstanceList; 
            private java.util.List<UpInstanceList> upInstanceList; 

            private Builder() {
            } 

            private Builder(InstanceDagInfo model) {
                this.downInstanceList = model.downInstanceList;
                this.startInstanceList = model.startInstanceList;
                this.upInstanceList = model.upInstanceList;
            } 

            /**
             * <p>The downstream instances.</p>
             */
            public Builder downInstanceList(java.util.List<DownInstanceList> downInstanceList) {
                this.downInstanceList = downInstanceList;
                return this;
            }

            /**
             * <p>The center instances.</p>
             */
            public Builder startInstanceList(java.util.List<StartInstanceList> startInstanceList) {
                this.startInstanceList = startInstanceList;
                return this;
            }

            /**
             * <p>The upstream instances.</p>
             */
            public Builder upInstanceList(java.util.List<UpInstanceList> upInstanceList) {
                this.upInstanceList = upInstanceList;
                return this;
            }

            public InstanceDagInfo build() {
                return new InstanceDagInfo(this);
            } 

        } 

    }
}
