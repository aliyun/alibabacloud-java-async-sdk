// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link GetErrorRequest} extends {@link RequestModel}
 *
 * <p>GetErrorRequest</p>
 */
public class GetErrorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizModule")
    private String bizModule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long clientTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Did")
    private String did;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetErrorRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.bizModule = builder.bizModule;
        this.clientTime = builder.clientTime;
        this.did = builder.did;
        this.force = builder.force;
        this.os = builder.os;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return bizModule
     */
    public String getBizModule() {
        return this.bizModule;
    }

    /**
     * @return clientTime
     */
    public Long getClientTime() {
        return this.clientTime;
    }

    /**
     * @return did
     */
    public String getDid() {
        return this.did;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetErrorRequest, Builder> {
        private Long appKey; 
        private String bizModule; 
        private Long clientTime; 
        private String did; 
        private Boolean force; 
        private String os; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetErrorRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.bizModule = request.bizModule;
            this.clientTime = request.clientTime;
            this.did = request.did;
            this.force = request.force;
            this.os = request.os;
            this.uuid = request.uuid;
        } 

        /**
         * <p>appKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>233588686</p>
         */
        public Builder appKey(Long appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * BizModule.
         */
        public Builder bizModule(String bizModule) {
            this.putBodyParameter("BizModule", bizModule);
            this.bizModule = bizModule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        public Builder clientTime(Long clientTime) {
            this.putBodyParameter("ClientTime", clientTime);
            this.clientTime = clientTime;
            return this;
        }

        /**
         * Did.
         */
        public Builder did(String did) {
            this.putBodyParameter("Did", did);
            this.did = did;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putBodyParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetErrorRequest build() {
            return new GetErrorRequest(this);
        } 

    } 

}
