// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateApplicationVswitchesRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationVswitchesRequest</p>
 */
public class UpdateApplicationVswitchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private UpdateApplicationVswitchesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationVswitchesRequest create() {
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
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationVswitchesRequest, Builder> {
        private String appId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationVswitchesRequest request) {
            super(request);
            this.appId = request.appId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public UpdateApplicationVswitchesRequest build() {
            return new UpdateApplicationVswitchesRequest(this);
        } 

    } 

}
