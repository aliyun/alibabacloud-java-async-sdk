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
 * {@link OperateAppInstanceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>OperateAppInstanceForPartnerRequest</p>
 */
public class OperateAppInstanceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateEvent")
    private String operateEvent;

    private OperateAppInstanceForPartnerRequest(Builder builder) {
        super(builder);
        this.extend = builder.extend;
        this.operateEvent = builder.operateEvent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAppInstanceForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<OperateAppInstanceForPartnerRequest, Builder> {
        private String extend; 
        private String operateEvent; 

        private Builder() {
            super();
        } 

        private Builder(OperateAppInstanceForPartnerRequest request) {
            super(request);
            this.extend = request.extend;
            this.operateEvent = request.operateEvent;
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

        @Override
        public OperateAppInstanceForPartnerRequest build() {
            return new OperateAppInstanceForPartnerRequest(this);
        } 

    } 

}
