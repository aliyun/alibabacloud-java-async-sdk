// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreatePipelineRequest} extends {@link RequestModel}
 *
 * <p>CreatePipelineRequest</p>
 */
public class CreatePipelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    @com.aliyun.core.annotation.Validation(required = true)
    private String speed;

    private CreatePipelineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.priority = builder.priority;
        this.speed = builder.speed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return speed
     */
    public String getSpeed() {
        return this.speed;
    }

    public static final class Builder extends Request.Builder<CreatePipelineRequest, Builder> {
        private String name; 
        private Integer priority; 
        private String speed; 

        private Builder() {
            super();
        } 

        private Builder(CreatePipelineRequest request) {
            super(request);
            this.name = request.name;
            this.priority = request.priority;
            this.speed = request.speed;
        } 

        /**
         * <p>The name of the MPS queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-pipeline</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The priority. Default value: 6. Valid values: 1 to 10. A greater value specifies a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The type of the MPS queue. Valid values:</p>
         * <ol>
         * <li>Standard: standard MPS queue.</li>
         * <li>Boost: MPS queue with transcoding speed boosted.</li>
         * <li>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder speed(String speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        @Override
        public CreatePipelineRequest build() {
            return new CreatePipelineRequest(this);
        } 

    } 

}
