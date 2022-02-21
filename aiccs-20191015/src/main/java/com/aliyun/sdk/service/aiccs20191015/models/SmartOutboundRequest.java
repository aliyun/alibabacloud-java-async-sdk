// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmartOutboundRequest} extends {@link RequestModel}
 *
 * <p>SmartOutboundRequest</p>
 */
public class SmartOutboundRequest extends Request {
    @Body
    @NameInMap("AppKey")
    private String appKey;

    @Body
    @NameInMap("Called")
    private String called;

    @Body
    @NameInMap("Calling")
    private String calling;

    @Body
    @NameInMap("TemplateId")
    private Long templateId;

    @Body
    @NameInMap("TenantId")
    private Long tenantId;

    private SmartOutboundRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.called = builder.called;
        this.calling = builder.calling;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartOutboundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return called
     */
    public String getCalled() {
        return this.called;
    }

    /**
     * @return calling
     */
    public String getCalling() {
        return this.calling;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<SmartOutboundRequest, Builder> {
        private String appKey; 
        private String called; 
        private String calling; 
        private Long templateId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(SmartOutboundRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.called = response.called;
            this.calling = response.calling;
            this.templateId = response.templateId;
            this.tenantId = response.tenantId;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * Called.
         */
        public Builder called(String called) {
            this.putBodyParameter("Called", called);
            this.called = called;
            return this;
        }

        /**
         * Calling.
         */
        public Builder calling(String calling) {
            this.putBodyParameter("Calling", calling);
            this.calling = calling;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public SmartOutboundRequest build() {
            return new SmartOutboundRequest(this);
        } 

    } 

}
