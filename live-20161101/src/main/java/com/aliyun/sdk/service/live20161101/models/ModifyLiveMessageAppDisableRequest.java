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
 * {@link ModifyLiveMessageAppDisableRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveMessageAppDisableRequest</p>
 */
public class ModifyLiveMessageAppDisableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disable")
    private Boolean disable;

    private ModifyLiveMessageAppDisableRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.disable = builder.disable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppDisableRequest create() {
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
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return disable
     */
    public Boolean getDisable() {
        return this.disable;
    }

    public static final class Builder extends Request.Builder<ModifyLiveMessageAppDisableRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private Boolean disable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveMessageAppDisableRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.disable = request.disable;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ab6b5740****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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

        /**
         * <p>Specifies whether to disable the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disable(Boolean disable) {
            this.putQueryParameter("Disable", disable);
            this.disable = disable;
            return this;
        }

        @Override
        public ModifyLiveMessageAppDisableRequest build() {
            return new ModifyLiveMessageAppDisableRequest(this);
        } 

    } 

}
