// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateSpaceRequest</p>
 */
public class CreateSpaceRequest extends Request {
    @Body
    @NameInMap("Desc")
    @Validation(maxLength = 128)
    private String desc;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(minimum = 1)
    private Long workspaceId;

    private CreateSpaceRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateSpaceRequest, Builder> {
        private String desc; 
        private String name; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpaceRequest request) {
            super(request);
            this.desc = request.desc;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateSpaceRequest build() {
            return new CreateSpaceRequest(this);
        } 

    } 

}
