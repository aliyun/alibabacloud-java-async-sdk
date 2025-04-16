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
         * InstanceDagInfo.
         */
        public Builder instanceDagInfo(InstanceDagInfo instanceDagInfo) {
            this.instanceDagInfo = instanceDagInfo;
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
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeType.
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
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeType.
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
             * FieldInstanceIdList.
             */
            public Builder fieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
                this.fieldInstanceIdList = fieldInstanceIdList;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeType.
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
             * DownInstanceList.
             */
            public Builder downInstanceList(java.util.List<DownInstanceList> downInstanceList) {
                this.downInstanceList = downInstanceList;
                return this;
            }

            /**
             * StartInstanceList.
             */
            public Builder startInstanceList(java.util.List<StartInstanceList> startInstanceList) {
                this.startInstanceList = startInstanceList;
                return this;
            }

            /**
             * UpInstanceList.
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
