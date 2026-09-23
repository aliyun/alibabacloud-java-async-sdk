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
 * {@link GetInstanceDownStreamResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceDownStreamResponseBody</p>
 */
public class GetInstanceDownStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceRelationList")
    private java.util.List<InstanceRelationList> instanceRelationList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceDownStreamResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceRelationList = builder.instanceRelationList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceDownStreamResponseBody create() {
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
     * @return instanceRelationList
     */
    public java.util.List<InstanceRelationList> getInstanceRelationList() {
        return this.instanceRelationList;
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
        private java.util.List<InstanceRelationList> instanceRelationList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceDownStreamResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.instanceRelationList = model.instanceRelationList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code. OK indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Downstream instances and dependency relationships.</p>
         */
        public Builder instanceRelationList(java.util.List<InstanceRelationList> instanceRelationList) {
            this.instanceRelationList = instanceRelationList;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
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

        public GetInstanceDownStreamResponseBody build() {
            return new GetInstanceDownStreamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDownStreamResponseBody</p>
     */
    public static class FieldInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldInstanceId")
        private String fieldInstanceId;

        @com.aliyun.core.annotation.NameInMap("RunStatus")
        private String runStatus;

        @com.aliyun.core.annotation.NameInMap("SelectStatus")
        private String selectStatus;

        private FieldInstanceList(Builder builder) {
            this.fieldInstanceId = builder.fieldInstanceId;
            this.runStatus = builder.runStatus;
            this.selectStatus = builder.selectStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldInstanceList create() {
            return builder().build();
        }

        /**
         * @return fieldInstanceId
         */
        public String getFieldInstanceId() {
            return this.fieldInstanceId;
        }

        /**
         * @return runStatus
         */
        public String getRunStatus() {
            return this.runStatus;
        }

        /**
         * @return selectStatus
         */
        public String getSelectStatus() {
            return this.selectStatus;
        }

        public static final class Builder {
            private String fieldInstanceId; 
            private String runStatus; 
            private String selectStatus; 

            private Builder() {
            } 

            private Builder(FieldInstanceList model) {
                this.fieldInstanceId = model.fieldInstanceId;
                this.runStatus = model.runStatus;
                this.selectStatus = model.selectStatus;
            } 

            /**
             * <p>Field instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_23211</p>
             */
            public Builder fieldInstanceId(String fieldInstanceId) {
                this.fieldInstanceId = fieldInstanceId;
                return this;
            }

            /**
             * <p>Run status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder runStatus(String runStatus) {
                this.runStatus = runStatus;
                return this;
            }

            /**
             * <p>Selection status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>OPTIONAL</p>
             */
            public Builder selectStatus(String selectStatus) {
                this.selectStatus = selectStatus;
                return this;
            }

            public FieldInstanceList build() {
                return new FieldInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDownStreamResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private InstanceInfo(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
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
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_232411</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>xx测试</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Node type.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_PROCESS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceDownStreamResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDownStreamResponseBody</p>
     */
    public static class InstanceRelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownStreamDepth")
        private Integer downStreamDepth;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("FieldInstanceList")
        private java.util.List<FieldInstanceList> fieldInstanceList;

        @com.aliyun.core.annotation.NameInMap("InstanceInfo")
        private InstanceInfo instanceInfo;

        @com.aliyun.core.annotation.NameInMap("RunStatus")
        private String runStatus;

        @com.aliyun.core.annotation.NameInMap("SelectStatus")
        private String selectStatus;

        @com.aliyun.core.annotation.NameInMap("SelectStatusCause")
        private String selectStatusCause;

        private InstanceRelationList(Builder builder) {
            this.downStreamDepth = builder.downStreamDepth;
            this.extendInfo = builder.extendInfo;
            this.fieldInstanceList = builder.fieldInstanceList;
            this.instanceInfo = builder.instanceInfo;
            this.runStatus = builder.runStatus;
            this.selectStatus = builder.selectStatus;
            this.selectStatusCause = builder.selectStatusCause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRelationList create() {
            return builder().build();
        }

        /**
         * @return downStreamDepth
         */
        public Integer getDownStreamDepth() {
            return this.downStreamDepth;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return fieldInstanceList
         */
        public java.util.List<FieldInstanceList> getFieldInstanceList() {
            return this.fieldInstanceList;
        }

        /**
         * @return instanceInfo
         */
        public InstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        /**
         * @return runStatus
         */
        public String getRunStatus() {
            return this.runStatus;
        }

        /**
         * @return selectStatus
         */
        public String getSelectStatus() {
            return this.selectStatus;
        }

        /**
         * @return selectStatusCause
         */
        public String getSelectStatusCause() {
            return this.selectStatusCause;
        }

        public static final class Builder {
            private Integer downStreamDepth; 
            private String extendInfo; 
            private java.util.List<FieldInstanceList> fieldInstanceList; 
            private InstanceInfo instanceInfo; 
            private String runStatus; 
            private String selectStatus; 
            private String selectStatusCause; 

            private Builder() {
            } 

            private Builder(InstanceRelationList model) {
                this.downStreamDepth = model.downStreamDepth;
                this.extendInfo = model.extendInfo;
                this.fieldInstanceList = model.fieldInstanceList;
                this.instanceInfo = model.instanceInfo;
                this.runStatus = model.runStatus;
                this.selectStatus = model.selectStatus;
                this.selectStatusCause = model.selectStatusCause;
            } 

            /**
             * <p>Depth level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downStreamDepth(Integer downStreamDepth) {
                this.downStreamDepth = downStreamDepth;
                return this;
            }

            /**
             * <p>Extended information of the node instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;a&quot;:&quot;x&quot;}</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>Field instance list.</p>
             */
            public Builder fieldInstanceList(java.util.List<FieldInstanceList> fieldInstanceList) {
                this.fieldInstanceList = fieldInstanceList;
                return this;
            }

            /**
             * <p>Instance information.</p>
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * <p>Run status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder runStatus(String runStatus) {
                this.runStatus = runStatus;
                return this;
            }

            /**
             * <p>Selection status of the instance, primarily used for logical fields.</p>
             * <ul>
             * <li>OPTIONAL: Optional.</li>
             * <li>SELECTED: Required.</li>
             * <li>DISABLE: Not selectable.</li>
             * <li>GROUP_SELECTED: Select all or deselect all.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPTIONAL</p>
             */
            public Builder selectStatus(String selectStatus) {
                this.selectStatus = selectStatus;
                return this;
            }

            /**
             * <p>Reason why the instance is selected.</p>
             * <ul>
             * <li>PK_CHANGE</li>
             * <li>LOGIC_CHANGE</li>
             * <li>RELATION</li>
             * <li>BIZ_RELATIO</li>
             * <li>MV_RELATION</li>
             * <li>MODEL_REFRESH</li>
             * <li>FIELD_DELETED</li>
             * <li>FIELD_ADDED_NO_INSTANCE</li>
             * <li>PERMISSION_DENY</li>
             * <li>OUTSIDE_INCOMING</li>
             * <li>INSTANCE_STATUS</li>
             * <li>AFFECT_BY_UPSTREAM</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIELD_DELETED</p>
             */
            public Builder selectStatusCause(String selectStatusCause) {
                this.selectStatusCause = selectStatusCause;
                return this;
            }

            public InstanceRelationList build() {
                return new InstanceRelationList(this);
            } 

        } 

    }
}
