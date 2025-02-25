// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.group = builder.group;
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String clusterId; 
        private String group; 
        private String password; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.group = request.group;
            this.password = request.password;
            this.userName = request.userName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The user group attribute of the user that you want to update. Valid values:</p>
         * <ul>
         * <li>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs.</li>
         * <li>wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>users</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The password attribute of the user that you want to update. The password must be 6 to 30 characters in length and must contain three of the following four character types:</p>
         * <ul>
         * <li>Uppercase letters</li>
         * <li>Lowercase letters</li>
         * <li>Digits</li>
         * <li>Special characters ()~!@#$%^&amp;*-_+=|{}[]:;&quot;/&lt;&gt;,.?/</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
