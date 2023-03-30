// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneGroupRequest</p>
 */
public class CreateOrUpdateSwimmingLaneGroupRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppIds")
    private String appIds;

    @Query
    @NameInMap("DbGrayEnable")
    private Boolean dbGrayEnable;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("EntryApp")
    private String entryApp;

    @Query
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @Query
    @NameInMap("GmtModified")
    private String gmtModified;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("LicenseKey")
    private String licenseKey;

    @Query
    @NameInMap("MessageQueueFilterSide")
    private String messageQueueFilterSide;

    @Query
    @NameInMap("MessageQueueGrayEnable")
    private Boolean messageQueueGrayEnable;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(maxLength = 64)
    private String namespace;

    @Query
    @NameInMap("RecordCanaryDetail")
    private Boolean recordCanaryDetail;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("UserId")
    private String userId;

    private CreateOrUpdateSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appIds = builder.appIds;
        this.dbGrayEnable = builder.dbGrayEnable;
        this.enable = builder.enable;
        this.entryApp = builder.entryApp;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.licenseKey = builder.licenseKey;
        this.messageQueueFilterSide = builder.messageQueueFilterSide;
        this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.recordCanaryDetail = builder.recordCanaryDetail;
        this.region = builder.region;
        this.source = builder.source;
        this.status = builder.status;
        this.userId = builder.userId;
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
     * @return dbGrayEnable
     */
    public Boolean getDbGrayEnable() {
        return this.dbGrayEnable;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return entryApp
     */
    public String getEntryApp() {
        return this.entryApp;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneGroupRequest, Builder> {
        private String acceptLanguage; 
        private String appIds; 
        private Boolean dbGrayEnable; 
        private Boolean enable; 
        private String entryApp; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String licenseKey; 
        private String messageQueueFilterSide; 
        private Boolean messageQueueGrayEnable; 
        private String name; 
        private String namespace; 
        private Boolean recordCanaryDetail; 
        private String region; 
        private String source; 
        private Integer status; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSwimmingLaneGroupRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appIds = request.appIds;
            this.dbGrayEnable = request.dbGrayEnable;
            this.enable = request.enable;
            this.entryApp = request.entryApp;
            this.gmtCreate = request.gmtCreate;
            this.gmtModified = request.gmtModified;
            this.id = request.id;
            this.licenseKey = request.licenseKey;
            this.messageQueueFilterSide = request.messageQueueFilterSide;
            this.messageQueueGrayEnable = request.messageQueueGrayEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.recordCanaryDetail = request.recordCanaryDetail;
            this.region = request.region;
            this.source = request.source;
            this.status = request.status;
            this.userId = request.userId;
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
         * Specifies whether to enable database canary release.
         */
        public Builder dbGrayEnable(Boolean dbGrayEnable) {
            this.putQueryParameter("DbGrayEnable", dbGrayEnable);
            this.dbGrayEnable = dbGrayEnable;
            return this;
        }

        /**
         * Specifies whether to enable a lane group.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * The creation time.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * The update time.
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * The ID of the primary key. The primary key is auto-increment.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The license key in use.
         */
        public Builder licenseKey(String licenseKey) {
            this.putQueryParameter("LicenseKey", licenseKey);
            this.licenseKey = licenseKey;
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
         * MSE命名空间名字
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RecordCanaryDetail.
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
         * The service source. Valid value: edasmsc.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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

        /**
         * The Alibaba Cloud account. The value is a number, such as 136246\*\*\*\*\*\*809. You can leave this parameter empty.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneGroupRequest build() {
            return new CreateOrUpdateSwimmingLaneGroupRequest(this);
        } 

    } 

}
