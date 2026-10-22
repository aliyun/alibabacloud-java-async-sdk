// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ModifyProjectNotifyReceiverRequest} extends {@link RequestModel}
 *
 * <p>ModifyProjectNotifyReceiverRequest</p>
 */
public class ModifyProjectNotifyReceiverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long receiverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyProjectNotifyReceiverRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.phone = builder.phone;
        this.receiverId = builder.receiverId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProjectNotifyReceiverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return receiverId
     */
    public Long getReceiverId() {
        return this.receiverId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyProjectNotifyReceiverRequest, Builder> {
        private String email; 
        private String instanceId; 
        private String name; 
        private String phone; 
        private Long receiverId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProjectNotifyReceiverRequest request) {
            super(request);
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.phone = request.phone;
            this.receiverId = request.receiverId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The new email address of the notification recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>1824***@qq.com</p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The ID of the bastion host instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host instance ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new name of the notification recipient. The name must be 1 to 128 characters in length, cannot start with a special character, and can contain only the following special characters: periods (.), underscores (_), hyphens (-), backslashes (\), and spaces.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the name remains unchanged.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The new phone number of the notification recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>171****5421</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>The ID of the notification recipient.</p>
         * <blockquote>
         * <p>You can call the ListProjectNotifyReceivers operation to query this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder receiverId(Long receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyProjectNotifyReceiverRequest build() {
            return new ModifyProjectNotifyReceiverRequest(this);
        } 

    } 

}
