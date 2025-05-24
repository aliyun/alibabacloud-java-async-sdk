// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link OperateAppServiceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>OperateAppServiceForPartnerRequest</p>
 */
public class OperateAppServiceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateEvent")
    private String operateEvent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    private OperateAppServiceForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.extend = builder.extend;
        this.operateEvent = builder.operateEvent;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAppServiceForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return operateEvent
     */
    public String getOperateEvent() {
        return this.operateEvent;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<OperateAppServiceForPartnerRequest, Builder> {
        private String bizId; 
        private String extend; 
        private String operateEvent; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(OperateAppServiceForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.extend = request.extend;
            this.operateEvent = request.operateEvent;
            this.serviceType = request.serviceType;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * OperateEvent.
         */
        public Builder operateEvent(String operateEvent) {
            this.putQueryParameter("OperateEvent", operateEvent);
            this.operateEvent = operateEvent;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public OperateAppServiceForPartnerRequest build() {
            return new OperateAppServiceForPartnerRequest(this);
        } 

    } 

}
