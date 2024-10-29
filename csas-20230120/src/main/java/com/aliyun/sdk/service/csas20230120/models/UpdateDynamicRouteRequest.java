// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateDynamicRouteRequest</p>
 */
public class UpdateDynamicRouteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicRouteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicRouteType")
    private String dynamicRouteType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextHop")
    private String nextHop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List < String > tagIds;

    private UpdateDynamicRouteRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.applicationType = builder.applicationType;
        this.description = builder.description;
        this.dynamicRouteId = builder.dynamicRouteId;
        this.dynamicRouteType = builder.dynamicRouteType;
        this.modifyType = builder.modifyType;
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

    public static UpdateDynamicRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List < String > getApplicationIds() {
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
     * @return dynamicRouteId
     */
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    /**
     * @return dynamicRouteType
     */
    public String getDynamicRouteType() {
        return this.dynamicRouteType;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
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
    public java.util.List < String > getRegionIds() {
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
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    public static final class Builder extends Request.Builder<UpdateDynamicRouteRequest, Builder> {
        private java.util.List < String > applicationIds; 
        private String applicationType; 
        private String description; 
        private String dynamicRouteId; 
        private String dynamicRouteType; 
        private String modifyType; 
        private String name; 
        private String nextHop; 
        private Integer priority; 
        private java.util.List < String > regionIds; 
        private String status; 
        private java.util.List < String > tagIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDynamicRouteRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.applicationType = request.applicationType;
            this.description = request.description;
            this.dynamicRouteId = request.dynamicRouteId;
            this.dynamicRouteType = request.dynamicRouteType;
            this.modifyType = request.modifyType;
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
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * ApplicationType.
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
         * <p>dr-ca9fddfac7c6****</p>
         */
        public Builder dynamicRouteId(String dynamicRouteId) {
            this.putBodyParameter("DynamicRouteId", dynamicRouteId);
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }

        /**
         * DynamicRouteType.
         */
        public Builder dynamicRouteType(String dynamicRouteType) {
            this.putBodyParameter("DynamicRouteType", dynamicRouteType);
            this.dynamicRouteType = dynamicRouteType;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
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
         * NextHop.
         */
        public Builder nextHop(String nextHop) {
            this.putBodyParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            this.putBodyParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        @Override
        public UpdateDynamicRouteRequest build() {
            return new UpdateDynamicRouteRequest(this);
        } 

    } 

}
