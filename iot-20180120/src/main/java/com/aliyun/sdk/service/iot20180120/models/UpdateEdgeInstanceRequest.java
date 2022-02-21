// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeInstanceRequest</p>
 */
public class UpdateEdgeInstanceRequest extends Request {
    @Query
    @NameInMap("BizEnable")
    private Boolean bizEnable;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Spec")
    private Integer spec;

    @Query
    @NameInMap("Tags")
    private String tags;

    private UpdateEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.bizEnable = builder.bizEnable;
        this.instanceId = builder.instanceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.spec = builder.spec;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizEnable
     */
    public Boolean getBizEnable() {
        return this.bizEnable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spec
     */
    public Integer getSpec() {
        return this.spec;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeInstanceRequest, Builder> {
        private Boolean bizEnable; 
        private String instanceId; 
        private String iotInstanceId; 
        private String name; 
        private Integer spec; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeInstanceRequest response) {
            super(response);
            this.bizEnable = response.bizEnable;
            this.instanceId = response.instanceId;
            this.iotInstanceId = response.iotInstanceId;
            this.name = response.name;
            this.spec = response.spec;
            this.tags = response.tags;
        } 

        /**
         * BizEnable.
         */
        public Builder bizEnable(Boolean bizEnable) {
            this.putQueryParameter("BizEnable", bizEnable);
            this.bizEnable = bizEnable;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(Integer spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateEdgeInstanceRequest build() {
            return new UpdateEdgeInstanceRequest(this);
        } 

    } 

}
