// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link EditApgroupThirdAppRequest} extends {@link RequestModel}
 *
 * <p>EditApgroupThirdAppRequest</p>
 */
public class EditApgroupThirdAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppData")
    private String appData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyToSubGroup")
    private Integer applyToSubGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InheritParentGroup")
    private Integer inheritParentGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdAppName")
    private String thirdAppName;

    private EditApgroupThirdAppRequest(Builder builder) {
        super(builder);
        this.apgroupId = builder.apgroupId;
        this.appCode = builder.appCode;
        this.appData = builder.appData;
        this.appName = builder.appName;
        this.applyToSubGroup = builder.applyToSubGroup;
        this.category = builder.category;
        this.configType = builder.configType;
        this.id = builder.id;
        this.inheritParentGroup = builder.inheritParentGroup;
        this.thirdAppName = builder.thirdAppName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditApgroupThirdAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apgroupId
     */
    public Long getApgroupId() {
        return this.apgroupId;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appData
     */
    public String getAppData() {
        return this.appData;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return applyToSubGroup
     */
    public Integer getApplyToSubGroup() {
        return this.applyToSubGroup;
    }

    /**
     * @return category
     */
    public Integer getCategory() {
        return this.category;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return inheritParentGroup
     */
    public Integer getInheritParentGroup() {
        return this.inheritParentGroup;
    }

    /**
     * @return thirdAppName
     */
    public String getThirdAppName() {
        return this.thirdAppName;
    }

    public static final class Builder extends Request.Builder<EditApgroupThirdAppRequest, Builder> {
        private Long apgroupId; 
        private String appCode; 
        private String appData; 
        private String appName; 
        private Integer applyToSubGroup; 
        private Integer category; 
        private String configType; 
        private Long id; 
        private Integer inheritParentGroup; 
        private String thirdAppName; 

        private Builder() {
            super();
        } 

        private Builder(EditApgroupThirdAppRequest request) {
            super(request);
            this.apgroupId = request.apgroupId;
            this.appCode = request.appCode;
            this.appData = request.appData;
            this.appName = request.appName;
            this.applyToSubGroup = request.applyToSubGroup;
            this.category = request.category;
            this.configType = request.configType;
            this.id = request.id;
            this.inheritParentGroup = request.inheritParentGroup;
            this.thirdAppName = request.thirdAppName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupId(Long apgroupId) {
            this.putQueryParameter("ApgroupId", apgroupId);
            this.apgroupId = apgroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppData.
         */
        public Builder appData(String appData) {
            this.putQueryParameter("AppData", appData);
            this.appData = appData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ApplyToSubGroup.
         */
        public Builder applyToSubGroup(Integer applyToSubGroup) {
            this.putQueryParameter("ApplyToSubGroup", applyToSubGroup);
            this.applyToSubGroup = applyToSubGroup;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InheritParentGroup.
         */
        public Builder inheritParentGroup(Integer inheritParentGroup) {
            this.putQueryParameter("InheritParentGroup", inheritParentGroup);
            this.inheritParentGroup = inheritParentGroup;
            return this;
        }

        /**
         * ThirdAppName.
         */
        public Builder thirdAppName(String thirdAppName) {
            this.putQueryParameter("ThirdAppName", thirdAppName);
            this.thirdAppName = thirdAppName;
            return this;
        }

        @Override
        public EditApgroupThirdAppRequest build() {
            return new EditApgroupThirdAppRequest(this);
        } 

    } 

}
