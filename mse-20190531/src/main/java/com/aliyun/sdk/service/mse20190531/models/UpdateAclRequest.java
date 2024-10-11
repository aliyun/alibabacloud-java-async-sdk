// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAclRequest} extends {@link RequestModel}
 *
 * <p>UpdateAclRequest</p>
 */
public class UpdateAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntryList")
    private String aclEntryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private UpdateAclRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aclEntryList = builder.aclEntryList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return aclEntryList
     */
    public String getAclEntryList() {
        return this.aclEntryList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateAclRequest, Builder> {
        private String acceptLanguage; 
        private String aclEntryList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAclRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aclEntryList = request.aclEntryList;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The IP addresses or CIDR blocks in the IP address whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/XX,192.168.0.0/XX</p>
         */
        public Builder aclEntryList(String aclEntryList) {
            this.putQueryParameter("AclEntryList", aclEntryList);
            this.aclEntryList = aclEntryList;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-78v1l83****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateAclRequest build() {
            return new UpdateAclRequest(this);
        } 

    } 

}
