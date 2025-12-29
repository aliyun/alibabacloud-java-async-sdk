// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link GetSortScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetSortScriptResponseBody</p>
 */
public class GetSortScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetSortScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSortScriptResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetSortScriptResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCDEFGH</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the script.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSortScriptResponseBody build() {
            return new GetSortScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSortScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetSortScriptResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("modifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("scriptName")
        private String scriptName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.modifyTime = builder.modifyTime;
            this.scope = builder.scope;
            this.scriptName = builder.scriptName;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return scriptName
         */
        public String getScriptName() {
            return this.scriptName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String modifyTime; 
            private String scope; 
            private String scriptName; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.modifyTime = model.modifyTime;
                this.scope = model.scope;
                this.scriptName = model.scriptName;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The time when the script was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 20:21:14</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the script was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 21:21:14</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The sort phase to which the script applies.</p>
             * 
             * <strong>example:</strong>
             * <p>second_rank</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The name of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>rank_cava_20230606_v7</p>
             */
            public Builder scriptName(String scriptName) {
                this.scriptName = scriptName;
                return this;
            }

            /**
             * <p>The status of the script. For more information, see the description of the status response parameter in the ListSortScripts topic.</p>
             * 
             * <strong>example:</strong>
             * <p>released</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>cava_script</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
