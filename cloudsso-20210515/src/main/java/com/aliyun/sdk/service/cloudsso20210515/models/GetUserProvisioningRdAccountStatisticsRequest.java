// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserProvisioningRdAccountStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetUserProvisioningRdAccountStatisticsRequest</p>
 */
public class GetUserProvisioningRdAccountStatisticsRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("RdMemberId")
    private String rdMemberId;

    private GetUserProvisioningRdAccountStatisticsRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.rdMemberId = builder.rdMemberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserProvisioningRdAccountStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return rdMemberId
     */
    public String getRdMemberId() {
        return this.rdMemberId;
    }

    public static final class Builder extends Request.Builder<GetUserProvisioningRdAccountStatisticsRequest, Builder> {
        private String directoryId; 
        private String rdMemberId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserProvisioningRdAccountStatisticsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.rdMemberId = request.rdMemberId;
        } 

        /**
         * The ID of the resource directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the member in the resource directory.
         */
        public Builder rdMemberId(String rdMemberId) {
            this.putQueryParameter("RdMemberId", rdMemberId);
            this.rdMemberId = rdMemberId;
            return this;
        }

        @Override
        public GetUserProvisioningRdAccountStatisticsRequest build() {
            return new GetUserProvisioningRdAccountStatisticsRequest(this);
        } 

    } 

}
