// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ModifyVisualServicePasswdRequest} extends {@link RequestModel}
 *
 * <p>ModifyVisualServicePasswdRequest</p>
 */
public class ModifyVisualServicePasswdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Passwd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passwd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runasUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunasUserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runasUserPassword;

    private ModifyVisualServicePasswdRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.passwd = builder.passwd;
        this.runasUser = builder.runasUser;
        this.runasUserPassword = builder.runasUserPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVisualServicePasswdRequest create() {
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
     * @return passwd
     */
    public String getPasswd() {
        return this.passwd;
    }

    /**
     * @return runasUser
     */
    public String getRunasUser() {
        return this.runasUser;
    }

    /**
     * @return runasUserPassword
     */
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    public static final class Builder extends Request.Builder<ModifyVisualServicePasswdRequest, Builder> {
        private String clusterId; 
        private String passwd; 
        private String runasUser; 
        private String runasUserPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVisualServicePasswdRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.passwd = request.passwd;
            this.runasUser = request.runasUser;
            this.runasUserPassword = request.runasUserPassword;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The password that you can use to remotely connect to the visualization service over the VNC. The password must be 6 characters in length and must contain letters and digits.</p>
         * <blockquote>
         * <p> You must call the API operation over HTTPS to ensure that the password remains confidential.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1254****</p>
         */
        public Builder passwd(String passwd) {
            this.putQueryParameter("Passwd", passwd);
            this.passwd = passwd;
            return this;
        }

        /**
         * <p>The username of the cluster. Set the value to root.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder runasUser(String runasUser) {
            this.putQueryParameter("RunasUser", runasUser);
            this.runasUser = runasUser;
            return this;
        }

        /**
         * <p>The password that corresponds to the username specified by RunasUser.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2145****</p>
         */
        public Builder runasUserPassword(String runasUserPassword) {
            this.putQueryParameter("RunasUserPassword", runasUserPassword);
            this.runasUserPassword = runasUserPassword;
            return this;
        }

        @Override
        public ModifyVisualServicePasswdRequest build() {
            return new ModifyVisualServicePasswdRequest(this);
        } 

    } 

}
