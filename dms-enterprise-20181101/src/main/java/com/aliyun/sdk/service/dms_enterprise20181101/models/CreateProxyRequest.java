// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateProxyRequest} extends {@link RequestModel}
 *
 * <p>CreateProxyRequest</p>
 */
public class CreateProxyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateProxyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.tid = builder.tid;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateProxyRequest, Builder> {
        private String regionId; 
        private Long instanceId; 
        private String password; 
        private Long tid; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateProxyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.tid = request.tid;
            this.username = request.username;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the database instance. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listinstances">ListInstances</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getinstance">GetInstance</a> operation to query the database instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>183****</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The username of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateProxyRequest build() {
            return new CreateProxyRequest(this);
        } 

    } 

}
