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
 * {@link GetAlertRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRequest</p>
 */
public class GetAlertRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertUuid")
    private String alertUuid;

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
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Long roleType;

    private GetAlertRequest(Builder builder) {
        super(builder);
        this.alertUuid = builder.alertUuid;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertUuid
     */
    public String getAlertUuid() {
        return this.alertUuid;
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
     * @return roleType
     */
    public Long getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<GetAlertRequest, Builder> {
        private String alertUuid; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 
        private Long roleType; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertRequest request) {
            super(request);
            this.alertUuid = request.alertUuid;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * <p>The ID of the alert associated with the event.</p>
         * <blockquote>
         * <p>This parameter is required. If this parameter is not specified, the service returns a 400 error.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        public Builder alertUuid(String alertUuid) {
            this.putBodyParameter("AlertUuid", alertUuid);
            this.alertUuid = alertUuid;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required. If this parameter is not specified, the service returns a 400 error.</p>
         * </blockquote>
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
         * <p>The region where the data management center of threat detection and response is located. Specify the management center region based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets belong to the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
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
         * <p>The ID of the member to which the administrator switches the view.</p>
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
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>0: the view of the current Alibaba Cloud account.</li>
         * <li>1: the view of all accounts in the enterprise.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Long roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public GetAlertRequest build() {
            return new GetAlertRequest(this);
        } 

    } 

}
