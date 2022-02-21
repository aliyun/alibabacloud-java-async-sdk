// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageRequest} extends {@link RequestModel}
 *
 * <p>PushMessageRequest</p>
 */
public class PushMessageRequest extends Request {
    @Query
    @NameInMap("Act")
    @Validation(required = true)
    private String act;

    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("AppPackage")
    @Validation(required = true)
    private String appPackage;

    @Query
    @NameInMap("CustomContent")
    private String customContent;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("ExpiredTime")
    private Long expiredTime;

    @Query
    @NameInMap("PkgContent")
    @Validation(required = true)
    private String pkgContent;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("ReceiverType")
    @Validation(required = true)
    private String receiverType;

    @Query
    @NameInMap("ReceiverValues")
    @Validation(required = true)
    private String receiverValues;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    @Query
    @NameInMap("Uri")
    private String uri;

    private PushMessageRequest(Builder builder) {
        super(builder);
        this.act = builder.act;
        this.appKey = builder.appKey;
        this.appPackage = builder.appPackage;
        this.customContent = builder.customContent;
        this.desc = builder.desc;
        this.expiredTime = builder.expiredTime;
        this.pkgContent = builder.pkgContent;
        this.projectId = builder.projectId;
        this.receiverType = builder.receiverType;
        this.receiverValues = builder.receiverValues;
        this.regionId = builder.regionId;
        this.title = builder.title;
        this.type = builder.type;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return act
     */
    public String getAct() {
        return this.act;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appPackage
     */
    public String getAppPackage() {
        return this.appPackage;
    }

    /**
     * @return customContent
     */
    public String getCustomContent() {
        return this.customContent;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return pkgContent
     */
    public String getPkgContent() {
        return this.pkgContent;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return receiverType
     */
    public String getReceiverType() {
        return this.receiverType;
    }

    /**
     * @return receiverValues
     */
    public String getReceiverValues() {
        return this.receiverValues;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<PushMessageRequest, Builder> {
        private String act; 
        private String appKey; 
        private String appPackage; 
        private String customContent; 
        private String desc; 
        private Long expiredTime; 
        private String pkgContent; 
        private String projectId; 
        private String receiverType; 
        private String receiverValues; 
        private String regionId; 
        private String title; 
        private Integer type; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(PushMessageRequest response) {
            super(response);
            this.act = response.act;
            this.appKey = response.appKey;
            this.appPackage = response.appPackage;
            this.customContent = response.customContent;
            this.desc = response.desc;
            this.expiredTime = response.expiredTime;
            this.pkgContent = response.pkgContent;
            this.projectId = response.projectId;
            this.receiverType = response.receiverType;
            this.receiverValues = response.receiverValues;
            this.regionId = response.regionId;
            this.title = response.title;
            this.type = response.type;
            this.uri = response.uri;
        } 

        /**
         * Act.
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AppPackage.
         */
        public Builder appPackage(String appPackage) {
            this.putQueryParameter("AppPackage", appPackage);
            this.appPackage = appPackage;
            return this;
        }

        /**
         * CustomContent.
         */
        public Builder customContent(String customContent) {
            this.putQueryParameter("CustomContent", customContent);
            this.customContent = customContent;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(Long expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * PkgContent.
         */
        public Builder pkgContent(String pkgContent) {
            this.putQueryParameter("PkgContent", pkgContent);
            this.pkgContent = pkgContent;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ReceiverType.
         */
        public Builder receiverType(String receiverType) {
            this.putQueryParameter("ReceiverType", receiverType);
            this.receiverType = receiverType;
            return this;
        }

        /**
         * ReceiverValues.
         */
        public Builder receiverValues(String receiverValues) {
            this.putQueryParameter("ReceiverValues", receiverValues);
            this.receiverValues = receiverValues;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public PushMessageRequest build() {
            return new PushMessageRequest(this);
        } 

    } 

}
