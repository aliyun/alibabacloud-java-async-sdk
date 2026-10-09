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
         * <p>The key for the log category. Valid values:</p>
         * <p><strong>internet_log</strong></p>
         * <p><strong>vpc_firewall_log</strong></p>
         * <p><strong>nat_firewall_log</strong></p>
         * <p><strong>ipv6_firewall_log</strong></p>
         * <p><strong>dns_firewall_log</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>internet_log</p>
         */
        public Builder dispatchValue(String dispatchValue) {
            this.putQueryParameter("DispatchValue", dispatchValue);
            this.dispatchValue = dispatchValue;
            return this;
        }

        /**
         * <p>Specifies whether to deliver logs. A value of \<code>true\\</code> enables delivery, and \<code>false\\</code> disables it.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableStatus(Boolean enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The supported filter conditions. Valid values:</p>
         * <p><strong>attack</strong></p>
         * <p><strong>acl</strong></p>
         * <p><strong>other</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>attack,acl</p>
         */
        public Builder filterKeys(String filterKeys) {
            this.putQueryParameter("FilterKeys", filterKeys);
            this.filterKeys = filterKeys;
            return this;
        }

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder newRegionId(String newRegionId) {
            this.putQueryParameter("NewRegionId", newRegionId);
            this.newRegionId = newRegionId;
            return this;
        }

        /**
         * <p>The site to modify. If the log version is 1, leave this parameter empty or set it to \<code>global\\</code>. If the log version is 2, set this parameter to \<code>cn\\</code> or \<code>intl\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
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
