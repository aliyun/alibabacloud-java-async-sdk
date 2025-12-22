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
 * {@link GetScriptFileNamesResponseBody} extends {@link TeaModel}
 *
 * <p>GetScriptFileNamesResponseBody</p>
 */
public class GetScriptFileNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private GetScriptFileNamesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptFileNamesResponseBody create() {
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(GetScriptFileNamesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCDEFGH</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The files of the script.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public GetScriptFileNamesResponseBody build() {
            return new GetScriptFileNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScriptFileNamesResponseBody} extends {@link TeaModel}
     *
     * <p>GetScriptFileNamesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("modifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("pathName")
        private String pathName;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.fileName = builder.fileName;
            this.modifyTime = builder.modifyTime;
            this.pathName = builder.pathName;
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        public static final class Builder {
            private String createTime; 
            private String fileName; 
            private String modifyTime; 
            private String pathName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.fileName = model.fileName;
                this.modifyTime = model.modifyTime;
                this.pathName = model.pathName;
            } 

            /**
             * <p>The time when the script file was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 20:21:14</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the script file.</p>
             * 
             * <strong>example:</strong>
             * <p>my_cava_script.cava</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The time when the script file was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 21:21:14</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The path name of the script file.</p>
             * 
             * <strong>example:</strong>
             * <p>src</p>
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
