// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateIspFlushCacheInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateIspFlushCacheInstanceConfigRequest</p>
 */
public class UpdateIspFlushCacheInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private UpdateIspFlushCacheInstanceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIspFlushCacheInstanceConfigRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<UpdateIspFlushCacheInstanceConfigRequest, Builder> {
        private String instanceId; 
        private String instanceName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIspFlushCacheInstanceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public UpdateIspFlushCacheInstanceConfigRequest build() {
            return new UpdateIspFlushCacheInstanceConfigRequest(this);
        } 

    } 

}
