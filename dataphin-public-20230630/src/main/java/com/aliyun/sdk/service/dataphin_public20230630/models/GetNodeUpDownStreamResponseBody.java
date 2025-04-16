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
 * {@link GetNodeUpDownStreamResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeUpDownStreamResponseBody</p>
 */
public class GetNodeUpDownStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NodeDagInfo")
    private NodeDagInfo nodeDagInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNodeUpDownStreamResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.nodeDagInfo = builder.nodeDagInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeUpDownStreamResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeDagInfo
     */
    public NodeDagInfo getNodeDagInfo() {
        return this.nodeDagInfo;
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
        private NodeDagInfo nodeDagInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNodeUpDownStreamResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.nodeDagInfo = model.nodeDagInfo;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NodeDagInfo.
         */
        public Builder nodeDagInfo(NodeDagInfo nodeDagInfo) {
            this.nodeDagInfo = nodeDagInfo;
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

        public GetNodeUpDownStreamResponseBody build() {
            return new GetNodeUpDownStreamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeUpDownStreamResponseBody</p>
     */
    public static class DownStreamNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DownStreamNodeList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownStreamNodeList create() {
            return builder().build();
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
            private java.util.List<String> fieldIdList; 
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(DownStreamNodeList model) {
                this.fieldIdList = model.fieldIdList;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
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

            public DownStreamNodeList build() {
                return new DownStreamNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeUpDownStreamResponseBody</p>
     */
    public static class StartNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private StartNodeList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartNodeList create() {
            return builder().build();
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
            private java.util.List<String> fieldIdList; 
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(StartNodeList model) {
                this.fieldIdList = model.fieldIdList;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
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

            public StartNodeList build() {
                return new StartNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeUpDownStreamResponseBody</p>
     */
    public static class UpStreamNodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UpStreamNodeList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpStreamNodeList create() {
            return builder().build();
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
            private java.util.List<String> fieldIdList; 
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpStreamNodeList model) {
                this.fieldIdList = model.fieldIdList;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
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

            public UpStreamNodeList build() {
                return new UpStreamNodeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeUpDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeUpDownStreamResponseBody</p>
     */
    public static class NodeDagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownStreamNodeList")
        private java.util.List<DownStreamNodeList> downStreamNodeList;

        @com.aliyun.core.annotation.NameInMap("StartNodeList")
        private java.util.List<StartNodeList> startNodeList;

        @com.aliyun.core.annotation.NameInMap("UpStreamNodeList")
        private java.util.List<UpStreamNodeList> upStreamNodeList;

        private NodeDagInfo(Builder builder) {
            this.downStreamNodeList = builder.downStreamNodeList;
            this.startNodeList = builder.startNodeList;
            this.upStreamNodeList = builder.upStreamNodeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeDagInfo create() {
            return builder().build();
        }

        /**
         * @return downStreamNodeList
         */
        public java.util.List<DownStreamNodeList> getDownStreamNodeList() {
            return this.downStreamNodeList;
        }

        /**
         * @return startNodeList
         */
        public java.util.List<StartNodeList> getStartNodeList() {
            return this.startNodeList;
        }

        /**
         * @return upStreamNodeList
         */
        public java.util.List<UpStreamNodeList> getUpStreamNodeList() {
            return this.upStreamNodeList;
        }

        public static final class Builder {
            private java.util.List<DownStreamNodeList> downStreamNodeList; 
            private java.util.List<StartNodeList> startNodeList; 
            private java.util.List<UpStreamNodeList> upStreamNodeList; 

            private Builder() {
            } 

            private Builder(NodeDagInfo model) {
                this.downStreamNodeList = model.downStreamNodeList;
                this.startNodeList = model.startNodeList;
                this.upStreamNodeList = model.upStreamNodeList;
            } 

            /**
             * DownStreamNodeList.
             */
            public Builder downStreamNodeList(java.util.List<DownStreamNodeList> downStreamNodeList) {
                this.downStreamNodeList = downStreamNodeList;
                return this;
            }

            /**
             * StartNodeList.
             */
            public Builder startNodeList(java.util.List<StartNodeList> startNodeList) {
                this.startNodeList = startNodeList;
                return this;
            }

            /**
             * UpStreamNodeList.
             */
            public Builder upStreamNodeList(java.util.List<UpStreamNodeList> upStreamNodeList) {
                this.upStreamNodeList = upStreamNodeList;
                return this;
            }

            public NodeDagInfo build() {
                return new NodeDagInfo(this);
            } 

        } 

    }
}
