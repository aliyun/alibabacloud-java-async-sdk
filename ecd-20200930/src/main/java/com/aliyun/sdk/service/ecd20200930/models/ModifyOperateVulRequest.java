// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOperateVulRequest} extends {@link RequestModel}
 *
 * <p>ModifyOperateVulRequest</p>
 */
public class ModifyOperateVulRequest extends Request {
    @Query
    @NameInMap("OperateType")
    @Validation(required = true)
    private String operateType;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("VulInfo")
    @Validation(required = true)
    private java.util.List < VulInfo> vulInfo;

    private ModifyOperateVulRequest(Builder builder) {
        super(builder);
        this.operateType = builder.operateType;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.vulInfo = builder.vulInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOperateVulRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vulInfo
     */
    public java.util.List < VulInfo> getVulInfo() {
        return this.vulInfo;
    }

    public static final class Builder extends Request.Builder<ModifyOperateVulRequest, Builder> {
        private String operateType; 
        private String reason; 
        private String regionId; 
        private String type; 
        private java.util.List < VulInfo> vulInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOperateVulRequest request) {
            super(request);
            this.operateType = request.operateType;
            this.reason = request.reason;
            this.regionId = request.regionId;
            this.type = request.type;
            this.vulInfo = request.vulInfo;
        } 

        /**
         * The action that you want to perform on the vulnerability. Valid values:
         * <p>
         * 
         * *   vul_fix: fixes the vulnerability. The system fixes the vulnerability.
         * *   vul_verify: verifies whether the vulnerability is fixed. You must perform this action after the vulnerability is fixed, and the cloud desktop is restarted.
         * *   vul_ignore: ignores the vulnerability. After the vulnerability is ignored, the system provides no more prompts about the vulnerability.
         * *   vul_undo_ignore: cancels the ignore action on the vulnerability. After you cancel the ignore action on the vulnerability, the system provides prompts about the vulnerability again.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The reason why the vulnerability is ignored.\
         * <p>
         * This parameter is required only when `OperateType` is set to `vul_ignore`.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the vulnerability. Valid values:
         * <p>
         * 
         * *   cve: the Linux software vulnerability
         * *   sys: the Windows system vulnerability
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Details of the vulnerabilities.
         */
        public Builder vulInfo(java.util.List < VulInfo> vulInfo) {
            this.putQueryParameter("VulInfo", vulInfo);
            this.vulInfo = vulInfo;
            return this;
        }

        @Override
        public ModifyOperateVulRequest build() {
            return new ModifyOperateVulRequest(this);
        } 

    } 

    public static class VulInfo extends TeaModel {
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Tag")
        private String tag;

        private VulInfo(Builder builder) {
            this.desktopId = builder.desktopId;
            this.name = builder.name;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulInfo create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String desktopId; 
            private String name; 
            private String tag; 

            /**
             * The ID of cloud desktop in which the vulnerability is detected.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag that you want to add to the vulnerability.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public VulInfo build() {
                return new VulInfo(this);
            } 

        } 

    }
}
