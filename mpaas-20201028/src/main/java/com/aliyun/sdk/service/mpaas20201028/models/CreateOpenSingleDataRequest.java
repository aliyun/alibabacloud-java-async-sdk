// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpenSingleDataRequest} extends {@link RequestModel}
 *
 * <p>CreateOpenSingleDataRequest</p>
 */
public class CreateOpenSingleDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppMaxVersion")
    private String appMaxVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppMinVersion")
    private String appMinVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckOnline")
    private Boolean checkOnline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtAttrStr")
    private String extAttrStr;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LinkToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linkToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Payload")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdMsgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdMsgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidTimeEnd")
    @com.aliyun.core.annotation.Validation(maximum = 99999999999999D)
    private Long validTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidTimeStart")
    @com.aliyun.core.annotation.Validation(maximum = 99999999999999D)
    private Long validTimeStart;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateOpenSingleDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appMaxVersion = builder.appMaxVersion;
        this.appMinVersion = builder.appMinVersion;
        this.bizType = builder.bizType;
        this.checkOnline = builder.checkOnline;
        this.extAttrStr = builder.extAttrStr;
        this.linkToken = builder.linkToken;
        this.osType = builder.osType;
        this.payload = builder.payload;
        this.thirdMsgId = builder.thirdMsgId;
        this.validTimeEnd = builder.validTimeEnd;
        this.validTimeStart = builder.validTimeStart;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpenSingleDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appMaxVersion
     */
    public String getAppMaxVersion() {
        return this.appMaxVersion;
    }

    /**
     * @return appMinVersion
     */
    public String getAppMinVersion() {
        return this.appMinVersion;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return checkOnline
     */
    public Boolean getCheckOnline() {
        return this.checkOnline;
    }

    /**
     * @return extAttrStr
     */
    public String getExtAttrStr() {
        return this.extAttrStr;
    }

    /**
     * @return linkToken
     */
    public String getLinkToken() {
        return this.linkToken;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return thirdMsgId
     */
    public String getThirdMsgId() {
        return this.thirdMsgId;
    }

    /**
     * @return validTimeEnd
     */
    public Long getValidTimeEnd() {
        return this.validTimeEnd;
    }

    /**
     * @return validTimeStart
     */
    public Long getValidTimeStart() {
        return this.validTimeStart;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateOpenSingleDataRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appMaxVersion; 
        private String appMinVersion; 
        private String bizType; 
        private Boolean checkOnline; 
        private String extAttrStr; 
        private String linkToken; 
        private String osType; 
        private String payload; 
        private String thirdMsgId; 
        private Long validTimeEnd; 
        private Long validTimeStart; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOpenSingleDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appMaxVersion = request.appMaxVersion;
            this.appMinVersion = request.appMinVersion;
            this.bizType = request.bizType;
            this.checkOnline = request.checkOnline;
            this.extAttrStr = request.extAttrStr;
            this.linkToken = request.linkToken;
            this.osType = request.osType;
            this.payload = request.payload;
            this.thirdMsgId = request.thirdMsgId;
            this.validTimeEnd = request.validTimeEnd;
            this.validTimeStart = request.validTimeStart;
            this.workspaceId = request.workspaceId;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppMaxVersion.
         */
        public Builder appMaxVersion(String appMaxVersion) {
            this.putBodyParameter("AppMaxVersion", appMaxVersion);
            this.appMaxVersion = appMaxVersion;
            return this;
        }

        /**
         * AppMinVersion.
         */
        public Builder appMinVersion(String appMinVersion) {
            this.putBodyParameter("AppMinVersion", appMinVersion);
            this.appMinVersion = appMinVersion;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CheckOnline.
         */
        public Builder checkOnline(Boolean checkOnline) {
            this.putBodyParameter("CheckOnline", checkOnline);
            this.checkOnline = checkOnline;
            return this;
        }

        /**
         * ExtAttrStr.
         */
        public Builder extAttrStr(String extAttrStr) {
            this.putBodyParameter("ExtAttrStr", extAttrStr);
            this.extAttrStr = extAttrStr;
            return this;
        }

        /**
         * LinkToken.
         */
        public Builder linkToken(String linkToken) {
            this.putBodyParameter("LinkToken", linkToken);
            this.linkToken = linkToken;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * ThirdMsgId.
         */
        public Builder thirdMsgId(String thirdMsgId) {
            this.putBodyParameter("ThirdMsgId", thirdMsgId);
            this.thirdMsgId = thirdMsgId;
            return this;
        }

        /**
         * ValidTimeEnd.
         */
        public Builder validTimeEnd(Long validTimeEnd) {
            this.putBodyParameter("ValidTimeEnd", validTimeEnd);
            this.validTimeEnd = validTimeEnd;
            return this;
        }

        /**
         * ValidTimeStart.
         */
        public Builder validTimeStart(Long validTimeStart) {
            this.putBodyParameter("ValidTimeStart", validTimeStart);
            this.validTimeStart = validTimeStart;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateOpenSingleDataRequest build() {
            return new CreateOpenSingleDataRequest(this);
        } 

    } 

}
