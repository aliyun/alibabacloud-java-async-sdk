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
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsDesktopManager")
    private String isDesktopManager;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> users;

    private BatchSetDesktopManagerRequest(Builder builder) {
        super(builder);
        this.businessChannel = builder.businessChannel;
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
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
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
        private String businessChannel; 
        private String isDesktopManager; 
        private java.util.List<String> users; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetDesktopManagerRequest request) {
            super(request);
            this.businessChannel = request.businessChannel;
            this.isDesktopManager = request.isDesktopManager;
            this.users = request.users;
        } 

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putBodyParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>Whether the convenience account has the local administrator permissions on cloud computers.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: no</li>
         * <li>1 (default): yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDesktopManager(String isDesktopManager) {
            this.putBodyParameter("IsDesktopManager", isDesktopManager);
            this.isDesktopManager = isDesktopManager;
            return this;
        }

        /**
         * <p>The convenience accounts.</p>
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
