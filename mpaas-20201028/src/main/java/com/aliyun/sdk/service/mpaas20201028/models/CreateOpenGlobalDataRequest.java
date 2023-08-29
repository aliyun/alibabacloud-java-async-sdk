// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpenGlobalDataRequest} extends {@link RequestModel}
 *
 * <p>CreateOpenGlobalDataRequest</p>
 */
public class CreateOpenGlobalDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppMaxVersion")
    private String appMaxVersion;

    @Body
    @NameInMap("AppMinVersion")
    private String appMinVersion;

    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Body
    @NameInMap("ExtAttrStr")
    private String extAttrStr;

    @Body
    @NameInMap("MaxUid")
    @Validation(maximum = 99)
    private Long maxUid;

    @Body
    @NameInMap("MinUid")
    @Validation(maximum = 99)
    private Long minUid;

    @Body
    @NameInMap("OsType")
    private String osType;

    @Body
    @NameInMap("Payload")
    @Validation(required = true)
    private String payload;

    @Body
    @NameInMap("ThirdMsgId")
    @Validation(required = true)
    private String thirdMsgId;

    @Body
    @NameInMap("Uids")
    private String uids;

    @Body
    @NameInMap("ValidTimeEnd")
    @Validation(maximum = 99999999999999D)
    private Long validTimeEnd;

    @Body
    @NameInMap("ValidTimeStart")
    @Validation(maximum = 99999999999999D)
    private Long validTimeStart;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateOpenGlobalDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appMaxVersion = builder.appMaxVersion;
        this.appMinVersion = builder.appMinVersion;
        this.bizType = builder.bizType;
        this.extAttrStr = builder.extAttrStr;
        this.maxUid = builder.maxUid;
        this.minUid = builder.minUid;
        this.osType = builder.osType;
        this.payload = builder.payload;
        this.thirdMsgId = builder.thirdMsgId;
        this.uids = builder.uids;
        this.validTimeEnd = builder.validTimeEnd;
        this.validTimeStart = builder.validTimeStart;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpenGlobalDataRequest create() {
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
     * @return extAttrStr
     */
    public String getExtAttrStr() {
        return this.extAttrStr;
    }

    /**
     * @return maxUid
     */
    public Long getMaxUid() {
        return this.maxUid;
    }

    /**
     * @return minUid
     */
    public Long getMinUid() {
        return this.minUid;
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
     * @return uids
     */
    public String getUids() {
        return this.uids;
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

    public static final class Builder extends Request.Builder<CreateOpenGlobalDataRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appMaxVersion; 
        private String appMinVersion; 
        private String bizType; 
        private String extAttrStr; 
        private Long maxUid; 
        private Long minUid; 
        private String osType; 
        private String payload; 
        private String thirdMsgId; 
        private String uids; 
        private Long validTimeEnd; 
        private Long validTimeStart; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOpenGlobalDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appMaxVersion = request.appMaxVersion;
            this.appMinVersion = request.appMinVersion;
            this.bizType = request.bizType;
            this.extAttrStr = request.extAttrStr;
            this.maxUid = request.maxUid;
            this.minUid = request.minUid;
            this.osType = request.osType;
            this.payload = request.payload;
            this.thirdMsgId = request.thirdMsgId;
            this.uids = request.uids;
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
         * ExtAttrStr.
         */
        public Builder extAttrStr(String extAttrStr) {
            this.putBodyParameter("ExtAttrStr", extAttrStr);
            this.extAttrStr = extAttrStr;
            return this;
        }

        /**
         * MaxUid.
         */
        public Builder maxUid(Long maxUid) {
            this.putBodyParameter("MaxUid", maxUid);
            this.maxUid = maxUid;
            return this;
        }

        /**
         * MinUid.
         */
        public Builder minUid(Long minUid) {
            this.putBodyParameter("MinUid", minUid);
            this.minUid = minUid;
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
         * Uids.
         */
        public Builder uids(String uids) {
            this.putBodyParameter("Uids", uids);
            this.uids = uids;
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
        public CreateOpenGlobalDataRequest build() {
            return new CreateOpenGlobalDataRequest(this);
        } 

    } 

}
