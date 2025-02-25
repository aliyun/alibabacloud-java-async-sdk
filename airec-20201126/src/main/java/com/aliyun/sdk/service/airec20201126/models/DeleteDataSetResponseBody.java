// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDataSetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDataSetResponseBody</p>
 */
public class DeleteDataSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DeleteDataSetResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details about the dataset.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DeleteDataSetResponseBody build() {
            return new DeleteDataSetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteDataSetResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteDataSetResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private String versionId;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.state = builder.state;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private String instanceId; 
            private String state; 
            private String versionId; 

            /**
             * <p>The time when the data source was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1544112000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the data source was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1544112000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>airec-cn-o400whm78004</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The state for the dataset of the current version. Example: Importing. The value indicates that the dataset of the current version is being imported.</p>
             * 
             * <strong>example:</strong>
             * <p>Importing</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The version number of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>20181023214546</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
