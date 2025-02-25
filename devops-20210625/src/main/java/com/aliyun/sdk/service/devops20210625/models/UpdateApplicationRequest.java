// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link UpdateApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationRequest</p>
 */
public class UpdateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerAccountId")
    private String ownerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private UpdateApplicationRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.ownerAccountId = builder.ownerAccountId;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return ownerAccountId
     */
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationRequest, Builder> {
        private String appName; 
        private String ownerAccountId; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationRequest request) {
            super(request);
            this.appName = request.appName;
            this.ownerAccountId = request.ownerAccountId;
            this.organizationId = request.organizationId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ownerAccountId.
         */
        public Builder ownerAccountId(String ownerAccountId) {
            this.putBodyParameter("ownerAccountId", ownerAccountId);
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpdateApplicationRequest build() {
            return new UpdateApplicationRequest(this);
        } 

    } 

}
