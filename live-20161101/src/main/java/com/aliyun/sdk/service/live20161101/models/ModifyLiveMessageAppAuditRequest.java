// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageAppAuditRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageAppAuditRequest</p>
 */
public class ModifyLiveMessageAppAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditUrl")
    private String auditUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    private ModifyLiveMessageAppAuditRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.auditType = builder.auditType;
        this.auditUrl = builder.auditUrl;
        this.dataCenter = builder.dataCenter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppAuditRequest create() {
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
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return auditUrl
     */
    public String getAuditUrl() {
        return this.auditUrl;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageAppAuditRequest, Builder> {
        private String appId; 
        private Integer auditType; 
        private String auditUrl; 
        private String dataCenter; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageAppAuditRequest request) {
            super(request);
            this.appId = request.appId;
            this.auditType = request.auditType;
            this.auditUrl = request.auditUrl;
            this.dataCenter = request.dataCenter;
        } 

        /**
         * <p>The ID of the interactive messaging application whose content moderation settings you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The content moderation method. Valid values:</p>
         * <ul>
         * <li>0: disables content moderation.</li>
         * <li>1: uses built-in content moderation.</li>
         * <li>2: uses custom content moderation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder auditType(Integer auditType) {
            this.putQueryParameter("AuditType", auditType);
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>The URL for content moderation. This parameter is required if you set AuditType to 2. The URL must start with http:// or https:// and cannot contain a private IP address or a port number.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/exampleaudit">http://example.aliyundoc.com/exampleaudit</a></p>
         */
        public Builder auditUrl(String auditUrl) {
            this.putQueryParameter("AuditUrl", auditUrl);
            this.auditUrl = auditUrl;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        @Override
        public ModifyLiveMessageAppAuditRequest build() {
            return new ModifyLiveMessageAppAuditRequest(this);
        } 

    } 

}
