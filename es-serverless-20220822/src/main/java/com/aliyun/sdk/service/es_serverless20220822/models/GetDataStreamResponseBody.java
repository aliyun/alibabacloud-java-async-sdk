// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataStreamResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataStreamResponseBody</p>
 */
public class GetDataStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetDataStreamResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataStreamResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDataStreamResponseBody build() {
            return new GetDataStreamResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("mappings")
        private java.util.List < DataStreamMapping > mappings;

        private Template(Builder builder) {
            this.mappings = builder.mappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return mappings
         */
        public java.util.List < DataStreamMapping > getMappings() {
            return this.mappings;
        }

        public static final class Builder {
            private java.util.List < DataStreamMapping > mappings; 

            /**
             * 索引字段设置
             */
            public Builder mappings(java.util.List < DataStreamMapping > mappings) {
                this.mappings = mappings;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("appName")
        private String appName;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("dataStreamId")
        private String dataStreamId;

        @NameInMap("dataStreamName")
        private String dataStreamName;

        @NameInMap("deletePhase")
        private String deletePhase;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("template")
        private Template template;

        @NameInMap("timeStampKey")
        private String timeStampKey;

        @NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.dataStreamId = builder.dataStreamId;
            this.dataStreamName = builder.dataStreamName;
            this.deletePhase = builder.deletePhase;
            this.regionId = builder.regionId;
            this.template = builder.template;
            this.timeStampKey = builder.timeStampKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataStreamId
         */
        public String getDataStreamId() {
            return this.dataStreamId;
        }

        /**
         * @return dataStreamName
         */
        public String getDataStreamName() {
            return this.dataStreamName;
        }

        /**
         * @return deletePhase
         */
        public String getDeletePhase() {
            return this.deletePhase;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return timeStampKey
         */
        public String getTimeStampKey() {
            return this.timeStampKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appName; 
            private String createTime; 
            private String dataStreamId; 
            private String dataStreamName; 
            private String deletePhase; 
            private String regionId; 
            private Template template; 
            private String timeStampKey; 
            private String type; 

            /**
             * 关联的应用AppId
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder dataStreamId(String dataStreamId) {
                this.dataStreamId = dataStreamId;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder dataStreamName(String dataStreamName) {
                this.dataStreamName = dataStreamName;
                return this;
            }

            /**
             * 删除时间
             */
            public Builder deletePhase(String deletePhase) {
                this.deletePhase = deletePhase;
                return this;
            }

            /**
             * 代表region的资源属性字段
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 数据流模板
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * timeStampKey.
             */
            public Builder timeStampKey(String timeStampKey) {
                this.timeStampKey = timeStampKey;
                return this;
            }

            /**
             * 数据流类型
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
