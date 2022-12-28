// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataStreamRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStreamRequest</p>
 */
public class UpdateDataStreamRequest extends Request {
    @Path
    @NameInMap("dataStreamName")
    @Validation(required = true)
    private String dataStreamName;

    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("deletePhase")
    private String deletePhase;

    @Body
    @NameInMap("dynamic")
    private String dynamic;

    @Body
    @NameInMap("template")
    private Template template;

    @Body
    @NameInMap("timeStampKey")
    private String timeStampKey;

    private UpdateDataStreamRequest(Builder builder) {
        super(builder);
        this.dataStreamName = builder.dataStreamName;
        this.appName = builder.appName;
        this.deletePhase = builder.deletePhase;
        this.dynamic = builder.dynamic;
        this.template = builder.template;
        this.timeStampKey = builder.timeStampKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataStreamName
     */
    public String getDataStreamName() {
        return this.dataStreamName;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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

    public static final class Builder extends Request.Builder<UpdateDataStreamRequest, Builder> {
        private String dataStreamName; 
        private String appName; 
        private String deletePhase; 
        private String dynamic; 
        private Template template; 
        private String timeStampKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStreamRequest request) {
            super(request);
            this.dataStreamName = request.dataStreamName;
            this.appName = request.appName;
            this.deletePhase = request.deletePhase;
            this.dynamic = request.dynamic;
            this.template = request.template;
            this.timeStampKey = request.timeStampKey;
        } 

        /**
         * 实例 ID。
         */
        public Builder dataStreamName(String dataStreamName) {
            this.putPathParameter("dataStreamName", dataStreamName);
            this.dataStreamName = dataStreamName;
            return this;
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
         * template.
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

        @Override
        public UpdateDataStreamRequest build() {
            return new UpdateDataStreamRequest(this);
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
             * mappings.
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
