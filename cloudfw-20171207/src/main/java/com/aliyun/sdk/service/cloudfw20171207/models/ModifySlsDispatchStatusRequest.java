// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifySlsDispatchStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifySlsDispatchStatusRequest</p>
 */
public class ModifySlsDispatchStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchValue")
    private String dispatchValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private Boolean enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterKeys")
    private String filterKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewRegionId")
    private String newRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    private ModifySlsDispatchStatusRequest(Builder builder) {
        super(builder);
        this.dispatchValue = builder.dispatchValue;
        this.enableStatus = builder.enableStatus;
        this.filterKeys = builder.filterKeys;
        this.newRegionId = builder.newRegionId;
        this.site = builder.site;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySlsDispatchStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchValue
     */
    public String getDispatchValue() {
        return this.dispatchValue;
    }

    /**
     * @return enableStatus
     */
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return filterKeys
     */
    public String getFilterKeys() {
        return this.filterKeys;
    }

    /**
     * @return newRegionId
     */
    public String getNewRegionId() {
        return this.newRegionId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    public static final class Builder extends Request.Builder<ModifySlsDispatchStatusRequest, Builder> {
        private String dispatchValue; 
        private Boolean enableStatus; 
        private String filterKeys; 
        private String newRegionId; 
        private String site; 

        private Builder() {
            super();
        } 

        private Builder(ModifySlsDispatchStatusRequest request) {
            super(request);
            this.dispatchValue = request.dispatchValue;
            this.enableStatus = request.enableStatus;
            this.filterKeys = request.filterKeys;
            this.newRegionId = request.newRegionId;
            this.site = request.site;
        } 

        /**
         * DispatchValue.
         */
        public Builder dispatchValue(String dispatchValue) {
            this.putQueryParameter("DispatchValue", dispatchValue);
            this.dispatchValue = dispatchValue;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(Boolean enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * FilterKeys.
         */
        public Builder filterKeys(String filterKeys) {
            this.putQueryParameter("FilterKeys", filterKeys);
            this.filterKeys = filterKeys;
            return this;
        }

        /**
         * NewRegionId.
         */
        public Builder newRegionId(String newRegionId) {
            this.putQueryParameter("NewRegionId", newRegionId);
            this.newRegionId = newRegionId;
            return this;
        }

        /**
         * Site.
         */
        public Builder site(String site) {
            this.putQueryParameter("Site", site);
            this.site = site;
            return this;
        }

        @Override
        public ModifySlsDispatchStatusRequest build() {
            return new ModifySlsDispatchStatusRequest(this);
        } 

    } 

}
