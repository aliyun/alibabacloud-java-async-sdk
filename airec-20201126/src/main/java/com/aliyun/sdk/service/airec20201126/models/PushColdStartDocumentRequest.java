// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushColdStartDocumentRequest} extends {@link RequestModel}
 *
 * <p>PushColdStartDocumentRequest</p>
 */
public class PushColdStartDocumentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < PushColdStartDocumentRequestBody> body;

    private PushColdStartDocumentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushColdStartDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return body
     */
    public java.util.List < PushColdStartDocumentRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PushColdStartDocumentRequest, Builder> {
        private String instanceId; 
        private String tableName; 
        private java.util.List < PushColdStartDocumentRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(PushColdStartDocumentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tableName = request.tableName;
            this.body = request.body;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < PushColdStartDocumentRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PushColdStartDocumentRequest build() {
            return new PushColdStartDocumentRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushColdStartDocumentRequest} extends {@link TeaModel}
     *
     * <p>PushColdStartDocumentRequest</p>
     */
    public static class PushColdStartDocumentRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("fields")
        private Object fields;

        private PushColdStartDocumentRequestBody(Builder builder) {
            this.cmd = builder.cmd;
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushColdStartDocumentRequestBody create() {
            return builder().build();
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return fields
         */
        public Object getFields() {
            return this.fields;
        }

        public static final class Builder {
            private String cmd; 
            private Object fields; 

            /**
             * cmd.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * fields.
             */
            public Builder fields(Object fields) {
                this.fields = fields;
                return this;
            }

            public PushColdStartDocumentRequestBody build() {
                return new PushColdStartDocumentRequestBody(this);
            } 

        } 

    }
}
