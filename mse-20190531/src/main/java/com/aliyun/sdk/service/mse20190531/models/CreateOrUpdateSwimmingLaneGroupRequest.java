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
    @NameInMap("Id")
    private Long id;

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
    @NameInMap("Status")
    private Integer status;

    private CreateOrUpdateSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appIds = builder.appIds;
        this.dbGrayEnable = builder.dbGrayEnable;
        this.enable = builder.enable;
        this.entryApp = builder.entryApp;
        this.id = builder.id;
        this.messageQueueFilterSide = builder.messageQueueFilterSide;
        this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.recordCanaryDetail = builder.recordCanaryDetail;
        this.region = builder.region;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneGroupRequest, Builder> {
        private String acceptLanguage; 
        private String appIds; 
        private Boolean dbGrayEnable; 
        private Boolean enable; 
        private String entryApp; 
        private Long id; 
        private String messageQueueFilterSide; 
        private Boolean messageQueueGrayEnable; 
        private String name; 
        private String namespace; 
        private Boolean recordCanaryDetail; 
        private String region; 
        private Integer status; 

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
            this.id = request.id;
            this.messageQueueFilterSide = request.messageQueueFilterSide;
            this.messageQueueGrayEnable = request.messageQueueGrayEnable;
            this.name = request.name;
            this.namespace = request.namespace;
            this.recordCanaryDetail = request.recordCanaryDetail;
            this.region = request.region;
            this.status = request.status;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * 应用集合。以 "," 分割应用 id
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * 是否开启数据库灰度
         */
        public Builder dbGrayEnable(Boolean dbGrayEnable) {
            this.putQueryParameter("DbGrayEnable", dbGrayEnable);
            this.dbGrayEnable = dbGrayEnable;
            return this;
        }

        /**
         * 是否开启。
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * 入口应用。格式 "来源系统:id"，比如 EDAS:UUID 或者 CSB:UUID
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * 主键ID。由SP生成(数据库自增主键)。
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 消息灰度过滤侧
         */
        public Builder messageQueueFilterSide(String messageQueueFilterSide) {
            this.putQueryParameter("MessageQueueFilterSide", messageQueueFilterSide);
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }

        /**
         * 是否开启消息灰度
         */
        public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.putQueryParameter("MessageQueueGrayEnable", messageQueueGrayEnable);
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }

        /**
         * 名称
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
         * 是否开启记录请求详情。
         */
        public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
            this.putQueryParameter("RecordCanaryDetail", recordCanaryDetail);
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }

        /**
         * region
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * 0 未生效
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
