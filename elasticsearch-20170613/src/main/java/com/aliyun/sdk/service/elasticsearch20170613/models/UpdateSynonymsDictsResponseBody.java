// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSynonymsDictsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSynonymsDictsResponseBody</p>
 */
public class UpdateSynonymsDictsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private UpdateSynonymsDictsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSynonymsDictsResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7C5622CC-B312-426F-85AA-B0271*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public UpdateSynonymsDictsResponseBody build() {
            return new UpdateSynonymsDictsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSynonymsDictsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSynonymsDictsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>The size of the dictionary file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>220</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The name of the dictionary file.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy_0.txt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source type of the dictionary file. Valid values:</p>
             * <ul>
             * <li>OSS</li>
             * <li>ORIGIN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The dictionary type. The value is fixed as SYNONYMS.</p>
             * 
             * <strong>example:</strong>
             * <p>SYNONYMS</p>
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
