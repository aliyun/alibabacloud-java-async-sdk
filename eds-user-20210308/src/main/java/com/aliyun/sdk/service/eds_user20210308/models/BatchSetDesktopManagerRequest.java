// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link BatchSetDesktopManagerRequest} extends {@link RequestModel}
 *
 * <p>BatchSetDesktopManagerRequest</p>
 */
public class BatchSetDesktopManagerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDesktopManager")
    private String isDesktopManager;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> users;

    private BatchSetDesktopManagerRequest(Builder builder) {
        super(builder);
        this.isDesktopManager = builder.isDesktopManager;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetDesktopManagerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDesktopManager
     */
    public String getIsDesktopManager() {
        return this.isDesktopManager;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<BatchSetDesktopManagerRequest, Builder> {
        private String isDesktopManager; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetDesktopManagerRequest request) {
            super(request);
            this.isDesktopManager = request.isDesktopManager;
            this.users = request.users;
        } 

        /**
         * IsDesktopManager.
         */
        public Builder isDesktopManager(String isDesktopManager) {
            this.putBodyParameter("IsDesktopManager", isDesktopManager);
            this.isDesktopManager = isDesktopManager;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder users(java.util.List<String> users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public BatchSetDesktopManagerRequest build() {
            return new BatchSetDesktopManagerRequest(this);
        } 

    } 

}
