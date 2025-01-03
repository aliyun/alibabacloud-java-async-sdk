// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link UpdateSqlInstanceParamsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSqlInstanceParamsResponseBody</p>
 */
public class UpdateSqlInstanceParamsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private UpdateSqlInstanceParamsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSqlInstanceParamsResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>InstanceVersionVO</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateSqlInstanceParamsResponseBody build() {
            return new UpdateSqlInstanceParamsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSqlInstanceParamsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateSqlInstanceParamsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("combineParams")
        private String combineParams;

        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("dynamicParams")
        private String dynamicParams;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("kvpairs")
        private String kvpairs;

        @com.aliyun.core.annotation.NameInMap("relatedTemplateId")
        private Long relatedTemplateId;

        @com.aliyun.core.annotation.NameInMap("staticParams")
        private String staticParams;

        @com.aliyun.core.annotation.NameInMap("templateParams")
        private String templateParams;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private Result(Builder builder) {
            this.combineParams = builder.combineParams;
            this.comment = builder.comment;
            this.content = builder.content;
            this.dynamicParams = builder.dynamicParams;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceId = builder.instanceId;
            this.kvpairs = builder.kvpairs;
            this.relatedTemplateId = builder.relatedTemplateId;
            this.staticParams = builder.staticParams;
            this.templateParams = builder.templateParams;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return combineParams
         */
        public String getCombineParams() {
            return this.combineParams;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dynamicParams
         */
        public String getDynamicParams() {
            return this.dynamicParams;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return kvpairs
         */
        public String getKvpairs() {
            return this.kvpairs;
        }

        /**
         * @return relatedTemplateId
         */
        public Long getRelatedTemplateId() {
            return this.relatedTemplateId;
        }

        /**
         * @return staticParams
         */
        public String getStaticParams() {
            return this.staticParams;
        }

        /**
         * @return templateParams
         */
        public String getTemplateParams() {
            return this.templateParams;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String combineParams; 
            private String comment; 
            private String content; 
            private String dynamicParams; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long instanceId; 
            private String kvpairs; 
            private Long relatedTemplateId; 
            private String staticParams; 
            private String templateParams; 
            private Long version; 

            /**
             * combineParams.
             */
            public Builder combineParams(String combineParams) {
                this.combineParams = combineParams;
                return this;
            }

            /**
             * comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * dynamicParams.
             */
            public Builder dynamicParams(String dynamicParams) {
                this.dynamicParams = dynamicParams;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * kvpairs.
             */
            public Builder kvpairs(String kvpairs) {
                this.kvpairs = kvpairs;
                return this;
            }

            /**
             * relatedTemplateId.
             */
            public Builder relatedTemplateId(Long relatedTemplateId) {
                this.relatedTemplateId = relatedTemplateId;
                return this;
            }

            /**
             * staticParams.
             */
            public Builder staticParams(String staticParams) {
                this.staticParams = staticParams;
                return this;
            }

            /**
             * templateParams.
             */
            public Builder templateParams(String templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
