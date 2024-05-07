// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneGroupRequest</p>
 */
public class CreateOrUpdateSwimmingLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CanaryModel")
    private Integer canaryModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbGrayEnable")
    private Boolean dbGrayEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryApp")
    private String entryApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageQueueFilterSide")
    private String messageQueueFilterSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageQueueGrayEnable")
    private Boolean messageQueueGrayEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paths")
    private java.util.List < String > paths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordCanaryDetail")
    private Boolean recordCanaryDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteIds")
    private java.util.List < Long > routeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private CreateOrUpdateSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appIds = builder.appIds;
        this.canaryModel = builder.canaryModel;
        this.dbGrayEnable = builder.dbGrayEnable;
        this.entryApp = builder.entryApp;
        this.id = builder.id;
        this.messageQueueFilterSide = builder.messageQueueFilterSide;
        this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.paths = builder.paths;
        this.recordCanaryDetail = builder.recordCanaryDetail;
        this.region = builder.region;
        this.routeIds = builder.routeIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return canaryModel
     */
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    /**
     * @return dbGrayEnable
     */
    public Boolean getDbGrayEnable() {
        return this.dbGrayEnable;
    }

    /**
     * @return entryApp
     */
    public String getEntryApp() {
        return this.entryApp;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return messageQueueFilterSide
     */
    public String getMessageQueueFilterSide() {
        return this.messageQueueFilterSide;
    }

    /**
     * @return messageQueueGrayEnable
     */
    public Boolean getMessageQueueGrayEnable() {
        return this.messageQueueGrayEnable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return paths
     */
    public java.util.List < String > getPaths() {
        return this.paths;
    }

    /**
     * @return recordCanaryDetail
     */
    public Boolean getRecordCanaryDetail() {
        return this.recordCanaryDetail;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return routeIds
     */
    public java.util.List < Long > getRouteIds() {
        return this.routeIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneGroupRequest, Builder> {
        private String acceptLanguage; 
        private String appIds; 
        private Integer canaryModel; 
        private Boolean dbGrayEnable; 
        private String entryApp; 
        private Long id; 
        private String messageQueueFilterSide; 
        private Boolean messageQueueGrayEnable; 
        private String name; 
        private String namespace; 
        private java.util.List < String > paths; 
        private Boolean recordCanaryDetail; 
        private String region; 
        private java.util.List < Long > routeIds; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSwimmingLaneGroupRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appIds = request.appIds;
            this.canaryModel = request.canaryModel;
            this.dbGrayEnable = request.dbGrayEnable;
            this.entryApp = request.entryApp;
            this.id = request.id;
            this.messageQueueFilterSide = request.messageQueueFilterSide;
            this.messageQueueGrayEnable = request.messageQueueGrayEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.paths = request.paths;
            this.recordCanaryDetail = request.recordCanaryDetail;
            this.region = request.region;
            this.routeIds = request.routeIds;
            this.status = request.status;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The IDs of applications. Separate application IDs with commas (,).
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * CanaryModel.
         */
        public Builder canaryModel(Integer canaryModel) {
            this.putQueryParameter("CanaryModel", canaryModel);
            this.canaryModel = canaryModel;
            return this;
        }

        /**
         * Specifies whether to enable database canary release.
         */
        public Builder dbGrayEnable(Boolean dbGrayEnable) {
            this.putQueryParameter("DbGrayEnable", dbGrayEnable);
            this.dbGrayEnable = dbGrayEnable;
            return this;
        }

        /**
         * The ingress application.
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * The ID of the lane group. A value of -1 is used to create a lane group. A value greater than 0 is used to modify the specified lane group.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The side for message filtering when the canary release for messaging feature is enabled.
         */
        public Builder messageQueueFilterSide(String messageQueueFilterSide) {
            this.putQueryParameter("MessageQueueFilterSide", messageQueueFilterSide);
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }

        /**
         * Specifies whether to enable canary release for messaging.
         */
        public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.putQueryParameter("MessageQueueGrayEnable", messageQueueGrayEnable);
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }

        /**
         * The name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The name of the Microservices Engine (MSE) namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Paths.
         */
        public Builder paths(java.util.List < String > paths) {
            String pathsShrink = shrink(paths, "Paths", "json");
            this.putQueryParameter("Paths", pathsShrink);
            this.paths = paths;
            return this;
        }

        /**
         * Specifies whether to record request details.
         */
        public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
            this.putQueryParameter("RecordCanaryDetail", recordCanaryDetail);
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * RouteIds.
         */
        public Builder routeIds(java.util.List < Long > routeIds) {
            String routeIdsShrink = shrink(routeIds, "RouteIds", "json");
            this.putQueryParameter("RouteIds", routeIdsShrink);
            this.routeIds = routeIds;
            return this;
        }

        /**
         * The status of the lane group. The value 0 specifies that the lane group is disabled. The value 1 specifies that the lane group is enabled.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneGroupRequest build() {
            return new CreateOrUpdateSwimmingLaneGroupRequest(this);
        } 

    } 

}
