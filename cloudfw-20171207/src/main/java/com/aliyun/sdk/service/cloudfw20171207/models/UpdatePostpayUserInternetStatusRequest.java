// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link UpdatePostpayUserInternetStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdatePostpayUserInternetStatusRequest</p>
 */
public class UpdatePostpayUserInternetStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operate")
    private String operate;

    private UpdatePostpayUserInternetStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.operate = builder.operate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostpayUserInternetStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operate
     */
    public String getOperate() {
        return this.operate;
    }

    public static final class Builder extends Request.Builder<UpdatePostpayUserInternetStatusRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String operate; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePostpayUserInternetStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.operate = request.operate;
        } 

        /**
         * <p>The instance ID of Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_elasticity_public_cn-zsk39m******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default)</li>
         * <li><strong>en</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The operation type.</p>
         * <ul>
         * <li>Set the value to open.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
            return this;
        }

        @Override
        public UpdatePostpayUserInternetStatusRequest build() {
            return new UpdatePostpayUserInternetStatusRequest(this);
        } 

    } 

}
