// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ResetAndroidInstancesInGroupRequest} extends {@link RequestModel}
 *
 * <p>ResetAndroidInstancesInGroupRequest</p>
 */
public class ResetAndroidInstancesInGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AndroidInstanceIds")
    private java.util.List<String> androidInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreParamValidation")
    private Boolean ignoreParamValidation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleMode")
    private String saleMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingResetType")
    private Integer settingResetType;

    private ResetAndroidInstancesInGroupRequest(Builder builder) {
        super(builder);
        this.androidInstanceIds = builder.androidInstanceIds;
        this.ignoreParamValidation = builder.ignoreParamValidation;
        this.saleMode = builder.saleMode;
        this.settingResetType = builder.settingResetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAndroidInstancesInGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return androidInstanceIds
     */
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    /**
     * @return ignoreParamValidation
     */
    public Boolean getIgnoreParamValidation() {
        return this.ignoreParamValidation;
    }

    /**
     * @return saleMode
     */
    public String getSaleMode() {
        return this.saleMode;
    }

    /**
     * @return settingResetType
     */
    public Integer getSettingResetType() {
        return this.settingResetType;
    }

    public static final class Builder extends Request.Builder<ResetAndroidInstancesInGroupRequest, Builder> {
        private java.util.List<String> androidInstanceIds; 
        private Boolean ignoreParamValidation; 
        private String saleMode; 
        private Integer settingResetType; 

        private Builder() {
            super();
        } 

        private Builder(ResetAndroidInstancesInGroupRequest request) {
            super(request);
            this.androidInstanceIds = request.androidInstanceIds;
            this.ignoreParamValidation = request.ignoreParamValidation;
            this.saleMode = request.saleMode;
            this.settingResetType = request.settingResetType;
        } 

        /**
         * <p>The IDs of the cloud phone instances.</p>
         */
        public Builder androidInstanceIds(java.util.List<String> androidInstanceIds) {
            this.putQueryParameter("AndroidInstanceIds", androidInstanceIds);
            this.androidInstanceIds = androidInstanceIds;
            return this;
        }

        /**
         * IgnoreParamValidation.
         */
        public Builder ignoreParamValidation(Boolean ignoreParamValidation) {
            this.putQueryParameter("IgnoreParamValidation", ignoreParamValidation);
            this.ignoreParamValidation = ignoreParamValidation;
            return this;
        }

        /**
         * SaleMode.
         */
        public Builder saleMode(String saleMode) {
            this.putQueryParameter("SaleMode", saleMode);
            this.saleMode = saleMode;
            return this;
        }

        /**
         * SettingResetType.
         */
        public Builder settingResetType(Integer settingResetType) {
            this.putQueryParameter("SettingResetType", settingResetType);
            this.settingResetType = settingResetType;
            return this;
        }

        @Override
        public ResetAndroidInstancesInGroupRequest build() {
            return new ResetAndroidInstancesInGroupRequest(this);
        } 

    } 

}
