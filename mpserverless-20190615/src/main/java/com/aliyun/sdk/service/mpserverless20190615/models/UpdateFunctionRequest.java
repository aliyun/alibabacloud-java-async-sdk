// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionRequest</p>
 */
public class UpdateFunctionRequest extends Request {
    @Body
    @NameInMap("Desc")
    @Validation(maxLength = 128)
    private String desc;

    @Body
    @NameInMap("HttpTriggerPath")
    @Validation(maxLength = 128)
    private String httpTriggerPath;

    @Body
    @NameInMap("InstanceConcurrency")
    @Validation(maximum = 20, minimum = 1)
    private Integer instanceConcurrency;

    @Body
    @NameInMap("Memory")
    @Validation(maximum = 2048, minimum = 128)
    private Integer memory;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Runtime")
    private String runtime;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("Timeout")
    @Validation(maximum = 7200, minimum = 1)
    private Integer timeout;

    @Body
    @NameInMap("TimingTriggerConfig")
    private String timingTriggerConfig;

    @Body
    @NameInMap("TimingTriggerUserPayload")
    private String timingTriggerUserPayload;

    private UpdateFunctionRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.httpTriggerPath = builder.httpTriggerPath;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.memory = builder.memory;
        this.name = builder.name;
        this.runtime = builder.runtime;
        this.spaceId = builder.spaceId;
        this.timeout = builder.timeout;
        this.timingTriggerConfig = builder.timingTriggerConfig;
        this.timingTriggerUserPayload = builder.timingTriggerUserPayload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return httpTriggerPath
     */
    public String getHttpTriggerPath() {
        return this.httpTriggerPath;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return timingTriggerConfig
     */
    public String getTimingTriggerConfig() {
        return this.timingTriggerConfig;
    }

    /**
     * @return timingTriggerUserPayload
     */
    public String getTimingTriggerUserPayload() {
        return this.timingTriggerUserPayload;
    }

    public static final class Builder extends Request.Builder<UpdateFunctionRequest, Builder> {
        private String desc; 
        private String httpTriggerPath; 
        private Integer instanceConcurrency; 
        private Integer memory; 
        private String name; 
        private String runtime; 
        private String spaceId; 
        private Integer timeout; 
        private String timingTriggerConfig; 
        private String timingTriggerUserPayload; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionRequest request) {
            super(request);
            this.desc = request.desc;
            this.httpTriggerPath = request.httpTriggerPath;
            this.instanceConcurrency = request.instanceConcurrency;
            this.memory = request.memory;
            this.name = request.name;
            this.runtime = request.runtime;
            this.spaceId = request.spaceId;
            this.timeout = request.timeout;
            this.timingTriggerConfig = request.timingTriggerConfig;
            this.timingTriggerUserPayload = request.timingTriggerUserPayload;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * HttpTriggerPath.
         */
        public Builder httpTriggerPath(String httpTriggerPath) {
            this.putBodyParameter("HttpTriggerPath", httpTriggerPath);
            this.httpTriggerPath = httpTriggerPath;
            return this;
        }

        /**
         * InstanceConcurrency.
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.putBodyParameter("InstanceConcurrency", instanceConcurrency);
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.putBodyParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Runtime.
         */
        public Builder runtime(String runtime) {
            this.putBodyParameter("Runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * TimingTriggerConfig.
         */
        public Builder timingTriggerConfig(String timingTriggerConfig) {
            this.putBodyParameter("TimingTriggerConfig", timingTriggerConfig);
            this.timingTriggerConfig = timingTriggerConfig;
            return this;
        }

        /**
         * TimingTriggerUserPayload.
         */
        public Builder timingTriggerUserPayload(String timingTriggerUserPayload) {
            this.putBodyParameter("TimingTriggerUserPayload", timingTriggerUserPayload);
            this.timingTriggerUserPayload = timingTriggerUserPayload;
            return this;
        }

        @Override
        public UpdateFunctionRequest build() {
            return new UpdateFunctionRequest(this);
        } 

    } 

}
