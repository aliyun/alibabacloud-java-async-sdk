// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataStorageTtlRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageTtlRequest</p>
 */
public class UpdateDataStorageTtlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreColdTtl")
    private String logStoreColdTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreHotTtl")
    private String logStoreHotTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
    private String logStoreTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataStorageTtlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.logStoreColdTtl = builder.logStoreColdTtl;
        this.logStoreHotTtl = builder.logStoreHotTtl;
        this.logStoreName = builder.logStoreName;
        this.logStoreTtl = builder.logStoreTtl;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageTtlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logStoreColdTtl
     */
    public String getLogStoreColdTtl() {
        return this.logStoreColdTtl;
    }

    /**
     * @return logStoreHotTtl
     */
    public String getLogStoreHotTtl() {
        return this.logStoreHotTtl;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logStoreTtl
     */
    public String getLogStoreTtl() {
        return this.logStoreTtl;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageTtlRequest, Builder> {
        private String lang; 
        private String logStoreColdTtl; 
        private String logStoreHotTtl; 
        private String logStoreName; 
        private String logStoreTtl; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageTtlRequest request) {
            super(request);
            this.lang = request.lang;
            this.logStoreColdTtl = request.logStoreColdTtl;
            this.logStoreHotTtl = request.logStoreHotTtl;
            this.logStoreName = request.logStoreName;
            this.logStoreTtl = request.logStoreTtl;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The cold storage duration in Simple Log Service. This parameter is not available for configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder logStoreColdTtl(String logStoreColdTtl) {
            this.putBodyParameter("LogStoreColdTtl", logStoreColdTtl);
            this.logStoreColdTtl = logStoreColdTtl;
            return this;
        }

        /**
         * <p>The hot storage duration in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder logStoreHotTtl(String logStoreHotTtl) {
            this.putBodyParameter("LogStoreHotTtl", logStoreHotTtl);
            this.logStoreHotTtl = logStoreHotTtl;
            return this;
        }

        /**
         * <p>The name of the Logstore for Threat Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The storage duration of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder logStoreTtl(String logStoreTtl) {
            this.putBodyParameter("LogStoreTtl", logStoreTtl);
            this.logStoreTtl = logStoreTtl;
            return this;
        }

        /**
         * <p>The region of the data management center for Threat Analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user whose perspective the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateDataStorageTtlRequest build() {
            return new UpdateDataStorageTtlRequest(this);
        } 

    } 

}
