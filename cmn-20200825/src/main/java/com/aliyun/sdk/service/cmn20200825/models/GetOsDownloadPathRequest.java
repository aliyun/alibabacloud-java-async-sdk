// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOsDownloadPathRequest} extends {@link RequestModel}
 *
 * <p>GetOsDownloadPathRequest</p>
 */
public class GetOsDownloadPathRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OsVersionId")
    @Validation(required = true)
    private String osVersionId;

    private GetOsDownloadPathRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.osVersionId = builder.osVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOsDownloadPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return osVersionId
     */
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public static final class Builder extends Request.Builder<GetOsDownloadPathRequest, Builder> {
        private String instanceId; 
        private String osVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOsDownloadPathRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.osVersionId = request.osVersionId;
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
         * OsVersionId.
         */
        public Builder osVersionId(String osVersionId) {
            this.putQueryParameter("OsVersionId", osVersionId);
            this.osVersionId = osVersionId;
            return this;
        }

        @Override
        public GetOsDownloadPathRequest build() {
            return new GetOsDownloadPathRequest(this);
        } 

    } 

}
