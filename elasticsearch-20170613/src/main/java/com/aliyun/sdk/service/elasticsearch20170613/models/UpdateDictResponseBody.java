// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDictResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDictResponseBody</p>
 */
public class UpdateDictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private UpdateDictResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDictResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public UpdateDictResponseBody build() {
            return new UpdateDictResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * The size of the dictionary file. Unit: bytes.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The name of the dictionary file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The source type of the dictionary file. Valid values:
             * <p>
             * 
             * *   OSS
             * *   ORIGIN
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The dictionary type. Valid values:
             * <p>
             * 
             * *   MAIN: IK main dicrionary
             * *   STOP: IK stopword list
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
