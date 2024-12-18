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
 * {@link CreateDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateDynamicRouteRequest</p>
 */
public class CreateDynamicRouteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicRouteType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicRouteType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextHop")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextHop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    private CreateDynamicRouteRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.applicationType = builder.applicationType;
        this.description = builder.description;
        this.dynamicRouteType = builder.dynamicRouteType;
        this.name = builder.name;
        this.nextHop = builder.nextHop;
        this.priority = builder.priority;
        this.regionIds = builder.regionIds;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDynamicRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dynamicRouteType
     */
    public String getDynamicRouteType() {
        return this.dynamicRouteType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return regionIds
     */
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<CreateDynamicRouteRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private String applicationType; 
        private String description; 
        private String dynamicRouteType; 
        private String name; 
        private String nextHop; 
        private Integer priority; 
        private java.util.List<String> regionIds; 
        private String status; 
        private java.util.List<String> tagIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateDynamicRouteRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.applicationType = request.applicationType;
            this.description = request.description;
            this.dynamicRouteType = request.dynamicRouteType;
            this.name = request.name;
            this.nextHop = request.nextHop;
            this.priority = request.priority;
            this.regionIds = request.regionIds;
            this.status = request.status;
            this.tagIds = request.tagIds;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        public Builder applicationType(String applicationType) {
            this.putBodyParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector</p>
         */
        public Builder dynamicRouteType(String dynamicRouteType) {
            this.putBodyParameter("DynamicRouteType", dynamicRouteType);
            this.dynamicRouteType = dynamicRouteType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic_route_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-8ccb13b6f52c****</p>
         */
        public Builder nextHop(String nextHop) {
            this.putBodyParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.putBodyParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public CreateDynamicRouteRequest build() {
            return new CreateDynamicRouteRequest(this);
        } 

    } 

}
