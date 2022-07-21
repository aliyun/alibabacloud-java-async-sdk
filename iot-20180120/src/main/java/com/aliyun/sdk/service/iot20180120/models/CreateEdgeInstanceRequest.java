// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeInstanceRequest</p>
 */
public class CreateEdgeInstanceRequest extends Request {
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

    private CreateEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.spec = builder.spec;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateEdgeInstanceRequest, Builder> {
        private String iotInstanceId; 
        private String name; 
        private Integer spec; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeInstanceRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.spec = request.spec;
            this.tags = request.tags;
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
        public CreateEdgeInstanceRequest build() {
            return new CreateEdgeInstanceRequest(this);
        } 

    } 

}
