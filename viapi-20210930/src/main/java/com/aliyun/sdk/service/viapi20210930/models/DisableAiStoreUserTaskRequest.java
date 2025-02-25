// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAiStoreUserTaskRequest} extends {@link RequestModel}
 *
 * <p>DisableAiStoreUserTaskRequest</p>
 */
public class DisableAiStoreUserTaskRequest extends Request {
    @Body
    @NameInMap("AistoreVersion")
    private String aistoreVersion;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DisableAiStoreUserTaskRequest(Builder builder) {
        super(builder);
        this.aistoreVersion = builder.aistoreVersion;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAiStoreUserTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aistoreVersion
     */
    public String getAistoreVersion() {
        return this.aistoreVersion;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DisableAiStoreUserTaskRequest, Builder> {
        private String aistoreVersion; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DisableAiStoreUserTaskRequest request) {
            super(request);
            this.aistoreVersion = request.aistoreVersion;
            this.id = request.id;
        } 

        /**
         * AistoreVersion.
         */
        public Builder aistoreVersion(String aistoreVersion) {
            this.putBodyParameter("AistoreVersion", aistoreVersion);
            this.aistoreVersion = aistoreVersion;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DisableAiStoreUserTaskRequest build() {
            return new DisableAiStoreUserTaskRequest(this);
        } 

    } 

}
