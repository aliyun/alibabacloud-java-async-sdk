// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link RtcSipMuteRequest} extends {@link RequestModel}
 *
 * <p>RtcSipMuteRequest</p>
 */
public class RtcSipMuteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Operations> operations;

    private RtcSipMuteRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.operations = builder.operations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RtcSipMuteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return operations
     */
    public java.util.List<Operations> getOperations() {
        return this.operations;
    }

    public static final class Builder extends Request.Builder<RtcSipMuteRequest, Builder> {
        private String appId; 
        private String channelId; 
        private java.util.List<Operations> operations; 

        private Builder() {
            super();
        } 

        private Builder(RtcSipMuteRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.operations = request.operations;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eo85****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operations(java.util.List<Operations> operations) {
            this.putQueryParameter("Operations", operations);
            this.operations = operations;
            return this;
        }

        @Override
        public RtcSipMuteRequest build() {
            return new RtcSipMuteRequest(this);
        } 

    } 

    /**
     * 
     * {@link RtcSipMuteRequest} extends {@link TeaModel}
     *
     * <p>RtcSipMuteRequest</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        private Value(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String status; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.status = model.status;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>inactive</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    /**
     * 
     * {@link RtcSipMuteRequest} extends {@link TeaModel}
     *
     * <p>RtcSipMuteRequest</p>
     */
    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ids")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> ids;

        @com.aliyun.core.annotation.NameInMap("Op")
        @com.aliyun.core.annotation.Validation(required = true)
        private String op;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("Path")
        @com.aliyun.core.annotation.Validation(required = true)
        private String path;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private Value value;

        private Operations(Builder builder) {
            this.ids = builder.ids;
            this.op = builder.op;
            this.operationId = builder.operationId;
            this.path = builder.path;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<String> getIds() {
            return this.ids;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return value
         */
        public Value getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<String> ids; 
            private String op; 
            private String operationId; 
            private String path; 
            private Value value; 

            private Builder() {
            } 

            private Builder(Operations model) {
                this.ids = model.ids;
                this.op = model.op;
                this.operationId = model.operationId;
                this.path = model.path;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ids(java.util.List<String> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>replace</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12122121</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/media/audio/status</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder value(Value value) {
                this.value = value;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
}
