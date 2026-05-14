// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link RevokeUserDeviceSessionRequest} extends {@link RequestModel}
 *
 * <p>RevokeUserDeviceSessionRequest</p>
 */
public class RevokeUserDeviceSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DevTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String devTag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String saseUserId;

    private RevokeUserDeviceSessionRequest(Builder builder) {
        super(builder);
        this.devTag = builder.devTag;
        this.saseUserId = builder.saseUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeUserDeviceSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devTag
     */
    public String getDevTag() {
        return this.devTag;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public static final class Builder extends Request.Builder<RevokeUserDeviceSessionRequest, Builder> {
        private String devTag; 
        private String saseUserId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeUserDeviceSessionRequest request) {
            super(request);
            this.devTag = request.devTag;
            this.saseUserId = request.saseUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2987b3e0-8108-2f99-4d18-3b4f1c1c36d7</p>
         */
        public Builder devTag(String devTag) {
            this.putBodyParameter("DevTag", devTag);
            this.devTag = devTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>su_xxxxxxxx</p>
         */
        public Builder saseUserId(String saseUserId) {
            this.putBodyParameter("SaseUserId", saseUserId);
            this.saseUserId = saseUserId;
            return this;
        }

        @Override
        public RevokeUserDeviceSessionRequest build() {
            return new RevokeUserDeviceSessionRequest(this);
        } 

    } 

}
