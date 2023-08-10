// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScriptFileNamesResponseBody} extends {@link TeaModel}
 *
 * <p>GetScriptFileNamesResponseBody</p>
 */
public class GetScriptFileNamesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The files of the script.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public GetScriptFileNamesResponseBody build() {
            return new GetScriptFileNamesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("createTime")
        private String createTime;

        @NameInMap("fileName")
        private String fileName;

        @NameInMap("modifyTime")
        private String modifyTime;

        @NameInMap("pathName")
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

            /**
             * The time when the script file was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the script file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The time when the script file was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * pathName.
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
