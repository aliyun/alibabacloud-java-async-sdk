// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtendfilesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExtendfilesResponseBody</p>
 */
public class UpdateExtendfilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private UpdateExtendfilesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExtendfilesResponseBody create() {
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
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public UpdateExtendfilesResponseBody build() {
            return new UpdateExtendfilesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        private Result(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
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

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 

            /**
             * The size of the driver file. Unit: byte.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The name of the driver file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The source of the driver file. This parameter is fixed as ORIGIN, which indicates that the driver file is retained.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
