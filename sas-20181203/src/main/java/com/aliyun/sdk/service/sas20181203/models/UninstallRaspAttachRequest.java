// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UninstallRaspAttachRequest} extends {@link RequestModel}
 *
 * <p>UninstallRaspAttachRequest</p>
 */
public class UninstallRaspAttachRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsUUIDList")
    private java.util.List < String > ecsUUIDList;

    private UninstallRaspAttachRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.ecsUUIDList = builder.ecsUUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallRaspAttachRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return ecsUUIDList
     */
    public java.util.List < String > getEcsUUIDList() {
        return this.ecsUUIDList;
    }

    public static final class Builder extends Request.Builder<UninstallRaspAttachRequest, Builder> {
        private String applicationId; 
        private java.util.List < String > ecsUUIDList; 

        private Builder() {
            super();
        } 

        private Builder(UninstallRaspAttachRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.ecsUUIDList = request.ecsUUIDList;
        } 

        /**
         * <p>The application group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>64b8b994563c306b4fedxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The UUIDs of ECS instances from which the RASP agent is to be uninstalled.</p>
         */
        public Builder ecsUUIDList(java.util.List < String > ecsUUIDList) {
            this.putQueryParameter("EcsUUIDList", ecsUUIDList);
            this.ecsUUIDList = ecsUUIDList;
            return this;
        }

        @Override
        public UninstallRaspAttachRequest build() {
            return new UninstallRaspAttachRequest(this);
        } 

    } 

}
