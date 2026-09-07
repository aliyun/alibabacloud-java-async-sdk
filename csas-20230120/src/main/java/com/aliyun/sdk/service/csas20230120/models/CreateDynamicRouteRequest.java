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
         * <p>A collection of internal network access application IDs for the dynamic route. You can enter a maximum of 200 internal network access application IDs. Required when ApplicationType is <strong>Application</strong>. Choose one of <strong>ApplicationIds</strong> or <strong>TagIds</strong>. Do not enter when <strong>ApplicationType</strong> is <strong>All</strong>.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The application type of the dynamic route. Valid values:</p>
         * <ul>
         * <li><p><strong>All</strong>: All applications.</p>
         * </li>
         * <li><p><strong>Application</strong>: Application.</p>
         * </li>
         * <li><p><strong>Tag</strong>: Tag.</p>
         * </li>
         * </ul>
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
         * <p>The dynamic route description. It is 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase letters, numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条动态路由</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dynamic route type. Valid values: <strong>connector</strong>: Leased line.</p>
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
         * <p>The dynamic route name. It is 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
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
         * <p>The next hop instance ID of the dynamic route. Source:</p>
         * <ul>
         * <li>For more information, see <a href="">ListConnectors</a>: Query Connectors in batches.</li>
         * </ul>
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
         * <p>The dynamic route priority. 1 indicates the highest priority. Valid values: 1-99.</p>
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
         * <p>A list of regions supported by SASE POP cluster access points.</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.putBodyParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The dynamic route status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
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
         * <p>A collection of internal network access tag IDs for the dynamic route. You can enter a maximum of 40 internal network access tag IDs. Required when ApplicationType is <strong>Tag</strong>. Choose one of <strong>ApplicationIds</strong> or <strong>TagIds</strong>. Do not enter when <strong>ApplicationType</strong> is <strong>All</strong>.</p>
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
