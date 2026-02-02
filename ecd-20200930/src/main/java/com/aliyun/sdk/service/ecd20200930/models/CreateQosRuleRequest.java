// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateQosRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateQosRuleRequest</p>
 */
public class CreateQosRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAndroidId")
    private java.util.List<String> authAndroidId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthDesktopId")
    private java.util.List<String> authDesktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Download")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer download;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Upload")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer upload;

    private CreateQosRuleRequest(Builder builder) {
        super(builder);
        this.authAndroidId = builder.authAndroidId;
        this.authDesktopId = builder.authDesktopId;
        this.download = builder.download;
        this.networkPackageId = builder.networkPackageId;
        this.qosRuleName = builder.qosRuleName;
        this.upload = builder.upload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authAndroidId
     */
    public java.util.List<String> getAuthAndroidId() {
        return this.authAndroidId;
    }

    /**
     * @return authDesktopId
     */
    public java.util.List<String> getAuthDesktopId() {
        return this.authDesktopId;
    }

    /**
     * @return download
     */
    public Integer getDownload() {
        return this.download;
    }

    /**
     * @return networkPackageId
     */
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    /**
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return this.qosRuleName;
    }

    /**
     * @return upload
     */
    public Integer getUpload() {
        return this.upload;
    }

    public static final class Builder extends Request.Builder<CreateQosRuleRequest, Builder> {
        private java.util.List<String> authAndroidId; 
        private java.util.List<String> authDesktopId; 
        private Integer download; 
        private String networkPackageId; 
        private String qosRuleName; 
        private Integer upload; 

        private Builder() {
            super();
        } 

        private Builder(CreateQosRuleRequest request) {
            super(request);
            this.authAndroidId = request.authAndroidId;
            this.authDesktopId = request.authDesktopId;
            this.download = request.download;
            this.networkPackageId = request.networkPackageId;
            this.qosRuleName = request.qosRuleName;
            this.upload = request.upload;
        } 

        /**
         * AuthAndroidId.
         */
        public Builder authAndroidId(java.util.List<String> authAndroidId) {
            this.putQueryParameter("AuthAndroidId", authAndroidId);
            this.authAndroidId = authAndroidId;
            return this;
        }

        /**
         * AuthDesktopId.
         */
        public Builder authDesktopId(java.util.List<String> authDesktopId) {
            this.putQueryParameter("AuthDesktopId", authDesktopId);
            this.authDesktopId = authDesktopId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder download(Integer download) {
            this.putQueryParameter("Download", download);
            this.download = download;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-cfedn7r2pe48g****</p>
         */
        public Builder networkPackageId(String networkPackageId) {
            this.putQueryParameter("NetworkPackageId", networkPackageId);
            this.networkPackageId = networkPackageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder qosRuleName(String qosRuleName) {
            this.putQueryParameter("QosRuleName", qosRuleName);
            this.qosRuleName = qosRuleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder upload(Integer upload) {
            this.putQueryParameter("Upload", upload);
            this.upload = upload;
            return this;
        }

        @Override
        public CreateQosRuleRequest build() {
            return new CreateQosRuleRequest(this);
        } 

    } 

}
