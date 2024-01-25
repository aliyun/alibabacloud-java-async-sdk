// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiStoreUserTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiStoreUserTaskRequest</p>
 */
public class DeleteAiStoreUserTaskRequest extends Request {
    @Body
    @NameInMap("AistoreVersion")
    private String aistoreVersion;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DeleteAiStoreUserTaskRequest(Builder builder) {
        super(builder);
        this.aistoreVersion = builder.aistoreVersion;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiStoreUserTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAiStoreUserTaskRequest, Builder> {
        private String aistoreVersion; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiStoreUserTaskRequest request) {
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
        public DeleteAiStoreUserTaskRequest build() {
            return new DeleteAiStoreUserTaskRequest(this);
        } 

    } 

}
