// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppEnvDeployBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppEnvDeployBaselineResponseBody</p>
 */
public class DescribeAppEnvDeployBaselineResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAppEnvDeployBaselineResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppEnvDeployBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAppEnvDeployBaselineResponseBody build() {
            return new DescribeAppEnvDeployBaselineResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EnvId")
        private Long envId;

        @NameInMap("PacketComment")
        private String packetComment;

        @NameInMap("PacketId")
        private Long packetId;

        @NameInMap("PacketUrl")
        private String packetUrl;

        @NameInMap("SchemaId")
        private Long schemaId;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.envId = builder.envId;
            this.packetComment = builder.packetComment;
            this.packetId = builder.packetId;
            this.packetUrl = builder.packetUrl;
            this.schemaId = builder.schemaId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return packetComment
         */
        public String getPacketComment() {
            return this.packetComment;
        }

        /**
         * @return packetId
         */
        public Long getPacketId() {
            return this.packetId;
        }

        /**
         * @return packetUrl
         */
        public String getPacketUrl() {
            return this.packetUrl;
        }

        /**
         * @return schemaId
         */
        public Long getSchemaId() {
            return this.schemaId;
        }

        public static final class Builder {
            private Long appId; 
            private String createTime; 
            private Long envId; 
            private String packetComment; 
            private Long packetId; 
            private String packetUrl; 
            private Long schemaId; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * PacketComment.
             */
            public Builder packetComment(String packetComment) {
                this.packetComment = packetComment;
                return this;
            }

            /**
             * PacketId.
             */
            public Builder packetId(Long packetId) {
                this.packetId = packetId;
                return this;
            }

            /**
             * PacketUrl.
             */
            public Builder packetUrl(String packetUrl) {
                this.packetUrl = packetUrl;
                return this;
            }

            /**
             * SchemaId.
             */
            public Builder schemaId(Long schemaId) {
                this.schemaId = schemaId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
