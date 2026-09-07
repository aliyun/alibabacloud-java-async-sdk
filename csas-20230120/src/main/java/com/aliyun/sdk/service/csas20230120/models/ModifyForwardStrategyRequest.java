// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ModifyForwardStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardStrategyRequest</p>
 */
public class ModifyForwardStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationId")
    private String destinationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForwardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyForwardStrategyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.destinationId = builder.destinationId;
        this.destinationType = builder.destinationType;
        this.forwardId = builder.forwardId;
        this.name = builder.name;
        this.priority = builder.priority;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationId
     */
    public String getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return forwardId
     */
    public String getForwardId() {
        return this.forwardId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyForwardStrategyRequest, Builder> {
        private String description; 
        private String destinationId; 
        private String destinationType; 
        private String forwardId; 
        private String name; 
        private Integer priority; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardStrategyRequest request) {
            super(request);
            this.description = request.description;
            this.destinationId = request.destinationId;
            this.destinationType = request.destinationType;
            this.forwardId = request.forwardId;
            this.name = request.name;
            this.priority = request.priority;
            this.status = request.status;
        } 

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an internal access policy</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The target instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-e3152978fb32443b</p>
         */
        public Builder destinationId(String destinationId) {
            this.putBodyParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
            return this;
        }

        /**
         * <p>The destination type. Valid values:</p>
         * <ul>
         * <li><strong>Connector</strong>: connector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connector</p>
         */
        public Builder destinationType(String destinationType) {
            this.putBodyParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The forwarding rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-051199361a1fbefc</p>
         */
        public Builder forwardId(String forwardId) {
            this.putBodyParameter("ForwardId", forwardId);
            this.forwardId = forwardId;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>CollegeStudentsOnline</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The policy priority. A value of 1 indicates the highest priority, and a value of 100 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The policy status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyForwardStrategyRequest build() {
            return new ModifyForwardStrategyRequest(this);
        } 

    } 

}
