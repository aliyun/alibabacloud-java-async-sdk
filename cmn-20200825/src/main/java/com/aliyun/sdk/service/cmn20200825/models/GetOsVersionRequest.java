// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOsVersionRequest} extends {@link RequestModel}
 *
 * <p>GetOsVersionRequest</p>
 */
public class GetOsVersionRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OsVersionId")
    @Validation(required = true)
    private String osVersionId;

    private GetOsVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.osVersionId = builder.osVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOsVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetOsVersionRequest, Builder> {
        private String instanceId; 
        private String osVersionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOsVersionRequest request) {
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
        public GetOsVersionRequest build() {
            return new GetOsVersionRequest(this);
        } 

    } 

}
