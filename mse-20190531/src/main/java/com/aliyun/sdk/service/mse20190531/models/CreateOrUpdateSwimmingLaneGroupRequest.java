// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
    private java.util.List<String> paths;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordCanaryDetail")
    private Boolean recordCanaryDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteIds")
    private java.util.List<Long> routeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwimVersion")
    private Integer swimVersion;

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
        this.swimVersion = builder.swimVersion;
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
    public java.util.List<String> getPaths() {
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
    public java.util.List<Long> getRouteIds() {
        return this.routeIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return swimVersion
     */
    public Integer getSwimVersion() {
        return this.swimVersion;
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
        private java.util.List<String> paths; 
        private Boolean recordCanaryDetail; 
        private String region; 
        private java.util.List<Long> routeIds; 
        private Integer status; 
        private Integer swimVersion; 

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
            this.swimVersion = request.swimVersion;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The IDs of the applications. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxn1po62@492b8f98d4bxxxx,xxxxn1po62@2d8f5d1b7f2xxxx</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The end-to-end canary release mode. Valid values:</p>
         * <ul>
         * <li>0: Route by request content.</li>
         * <li>1: Route by proportion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder canaryModel(Integer canaryModel) {
            this.putQueryParameter("CanaryModel", canaryModel);
            this.canaryModel = canaryModel;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Specifies whether to enable canary release for databases.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dbGrayEnable(Boolean dbGrayEnable) {
            this.putQueryParameter("DbGrayEnable", dbGrayEnable);
            this.dbGrayEnable = dbGrayEnable;
            return this;
        }

        /**
         * <p>The entry application. Format: Source system:ID. Examples:</p>
         * <ul>
         * <li>mse:${MSE application ID}</li>
         * <li>mse-gw:${MSE cloud-native gateway ID}</li>
         * <li>apig:${cloud-native API gateway ID}</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse-gw:gw-2b1407e050f1446xxxcd2a65fd9xxxx</p>
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * <p>The ID of the swimlane group. A value of -1 indicates that a swimlane group is created. A value greater than 0 indicates that a specified swimlane group is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The side where message queue canary release filtering is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        public Builder messageQueueFilterSide(String messageQueueFilterSide) {
            this.putQueryParameter("MessageQueueFilterSide", messageQueueFilterSide);
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }

        /**
         * <p>Specifies whether to enable canary release for message queues.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.putQueryParameter("MessageQueueGrayEnable", messageQueueGrayEnable);
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }

        /**
         * <p>The name of the swimlane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the MSE namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The paths. This parameter is required when a Java gateway is used as the entry point.</p>
         */
        public Builder paths(java.util.List<String> paths) {
            String pathsShrink = shrink(paths, "Paths", "json");
            this.putQueryParameter("Paths", pathsShrink);
            this.paths = paths;
            return this;
        }

        /**
         * <p>Specifies whether to record request details.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
            this.putQueryParameter("RecordCanaryDetail", recordCanaryDetail);
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The IDs of the routes. If a cloud-native gateway is used as the entry point, you must call this operation to pass the IDs of the selected cloud-native gateway routes before creating a swimlane for the swimlane group.</p>
         */
        public Builder routeIds(java.util.List<Long> routeIds) {
            String routeIdsShrink = shrink(routeIds, "RouteIds", "json");
            this.putQueryParameter("RouteIds", routeIdsShrink);
            this.routeIds = routeIds;
            return this;
        }

        /**
         * <p>The status of the swimlane group. Valid values:</p>
         * <ul>
         * <li>0: Inactive.</li>
         * <li>1: Active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The version of the end-to-end canary release. Valid values:</p>
         * <ul>
         * <li>0: Not recommended. Routes must be specified.</li>
         * <li>2: Recommended. Routes do not need to be specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder swimVersion(Integer swimVersion) {
            this.putQueryParameter("SwimVersion", swimVersion);
            this.swimVersion = swimVersion;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneGroupRequest build() {
            return new CreateOrUpdateSwimmingLaneGroupRequest(this);
        } 

    } 

}
