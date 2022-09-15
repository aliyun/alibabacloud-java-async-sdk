// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAclRequest} extends {@link RequestModel}
 *
 * <p>UpdateAclRequest</p>
 */
public class UpdateAclRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AclEntryList")
    private String aclEntryList;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    private UpdateAclRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.aclEntryList = builder.aclEntryList;
        this.instanceId = builder.instanceId;
        this.mseSessionId = builder.mseSessionId;
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

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public static final class Builder extends Request.Builder<UpdateAclRequest, Builder> {
        private String acceptLanguage; 
        private String aclEntryList; 
        private String instanceId; 
        private String mseSessionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAclRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.aclEntryList = request.aclEntryList;
            this.instanceId = request.instanceId;
            this.mseSessionId = request.mseSessionId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AclEntryList.
         */
        public Builder aclEntryList(String aclEntryList) {
            this.putQueryParameter("AclEntryList", aclEntryList);
            this.aclEntryList = aclEntryList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        @Override
        public UpdateAclRequest build() {
            return new UpdateAclRequest(this);
        } 

    } 

}
