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
 * {@link GetDataStorageRequest} extends {@link RequestModel}
 *
 * <p>GetDataStorageRequest</p>
 */
public class GetDataStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithAutoKeyDetect")
    private Boolean withAutoKeyDetect;

    private GetDataStorageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.withAutoKeyDetect = builder.withAutoKeyDetect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataStorageRequest create() {
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

    /**
     * @return withAutoKeyDetect
     */
    public Boolean getWithAutoKeyDetect() {
        return this.withAutoKeyDetect;
    }

    public static final class Builder extends Request.Builder<GetDataStorageRequest, Builder> {
        private String lang; 
        private String regionId; 
        private Long roleFor; 
        private Boolean withAutoKeyDetect; 

        private Builder() {
            super();
        } 

        private Builder(GetDataStorageRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.withAutoKeyDetect = request.withAutoKeyDetect;
        } 

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error with the message &quot;The specified Lang can not be empty.&quot; Explicitly pass the language code.</p>
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
         * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
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

        /**
         * <p>Specifies whether to read the auto-discovered index configuration of each Logstore. This operation requires accessing Simple Log Service (SLS) for each Logstore. Default value: false. Set this parameter to true only on the storage management page.</p>
         */
        public Builder withAutoKeyDetect(Boolean withAutoKeyDetect) {
            this.putBodyParameter("WithAutoKeyDetect", withAutoKeyDetect);
            this.withAutoKeyDetect = withAutoKeyDetect;
            return this;
        }

        @Override
        public GetDataStorageRequest build() {
            return new GetDataStorageRequest(this);
        } 

    } 

}
