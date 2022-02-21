// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteRecordTemplateRequest</p>
 */
public class DeleteRecordTemplateRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteRecordTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRecordTemplateRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteRecordTemplateRequest, Builder> {
        private String appId; 
        private Long ownerId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRecordTemplateRequest response) {
            super(response);
            this.appId = response.appId;
            this.ownerId = response.ownerId;
            this.templateId = response.templateId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteRecordTemplateRequest build() {
            return new DeleteRecordTemplateRequest(this);
        } 

    } 

}
