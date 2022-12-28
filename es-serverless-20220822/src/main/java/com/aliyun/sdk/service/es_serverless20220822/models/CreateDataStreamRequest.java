// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataStreamRequest} extends {@link RequestModel}
 *
 * <p>CreateDataStreamRequest</p>
 */
public class CreateDataStreamRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("dataStreamName")
    @Validation(required = true)
    private String dataStreamName;

    @Body
    @NameInMap("deletePhase")
    @Validation(required = true)
    private String deletePhase;

    @Body
    @NameInMap("dynamic")
    private String dynamic;

    @Body
    @NameInMap("regionId")
    private String regionId;

    @Body
    @NameInMap("template")
    private Template template;

    @Body
    @NameInMap("timeStampKey")
    private String timeStampKey;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private CreateDataStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.dataStreamName = builder.dataStreamName;
        this.deletePhase = builder.deletePhase;
        this.dynamic = builder.dynamic;
        this.regionId = builder.regionId;
        this.template = builder.template;
        this.timeStampKey = builder.timeStampKey;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return dynamic
     */
    public String getDynamic() {
        return this.dynamic;
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

    public static final class Builder extends Request.Builder<CreateDataStreamRequest, Builder> {
        private String appName; 
        private String dataStreamName; 
        private String deletePhase; 
        private String dynamic; 
        private String regionId; 
        private Template template; 
        private String timeStampKey; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.dataStreamName = request.dataStreamName;
            this.deletePhase = request.deletePhase;
            this.dynamic = request.dynamic;
            this.regionId = request.regionId;
            this.template = request.template;
            this.timeStampKey = request.timeStampKey;
            this.type = request.type;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 代表资源名称的资源属性字段
         */
        public Builder dataStreamName(String dataStreamName) {
            this.putBodyParameter("dataStreamName", dataStreamName);
            this.dataStreamName = dataStreamName;
            return this;
        }

        /**
         * 删除时间
         */
        public Builder deletePhase(String deletePhase) {
            this.putBodyParameter("deletePhase", deletePhase);
            this.deletePhase = deletePhase;
            return this;
        }

        /**
         * dynamic.
         */
        public Builder dynamic(String dynamic) {
            this.putBodyParameter("dynamic", dynamic);
            this.dynamic = dynamic;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 数据流模板
         */
        public Builder template(Template template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * timeStampKey.
         */
        public Builder timeStampKey(String timeStampKey) {
            this.putBodyParameter("timeStampKey", timeStampKey);
            this.timeStampKey = timeStampKey;
            return this;
        }

        /**
         * 数据流类型
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDataStreamRequest build() {
            return new CreateDataStreamRequest(this);
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
}
