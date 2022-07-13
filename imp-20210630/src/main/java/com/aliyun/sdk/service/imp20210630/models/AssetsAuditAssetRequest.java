// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsAuditAssetRequest} extends {@link RequestModel}
 *
 * <p>AssetsAuditAssetRequest</p>
 */
public class AssetsAuditAssetRequest extends Request {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("AuditStatus")
    private String auditStatus;

    @NameInMap("Id")
    private String id;

    private AssetsAuditAssetRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.auditStatus = builder.auditStatus;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetsAuditAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<AssetsAuditAssetRequest, Builder> {
        private String appId; 
        private String auditStatus; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(AssetsAuditAssetRequest request) {
            super(request);
            this.appId = request.appId;
            this.auditStatus = request.auditStatus;
            this.id = request.id;
        } 

        /**
         * AppId
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * 审核状态
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * 审核状态
         */
        public Builder auditStatus(CommonAuditStatus auditStatus) {
            this.auditStatus = auditStatus.getValue();
            return this;
        }

        /**
         * AssetId
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        @Override
        public AssetsAuditAssetRequest build() {
            return new AssetsAuditAssetRequest(this);
        } 

    } 

}
