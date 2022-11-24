// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeLogstoreRequest} extends {@link RequestModel}
 *
 * <p>GetRetcodeLogstoreRequest</p>
 */
public class GetRetcodeLogstoreRequest extends Request {
    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetRetcodeLogstoreRequest(Builder builder) {
        super(builder);
        this.pid = builder.pid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeLogstoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetRetcodeLogstoreRequest, Builder> {
        private String pid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRetcodeLogstoreRequest request) {
            super(request);
            this.pid = request.pid;
            this.regionId = request.regionId;
        } 

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRetcodeLogstoreRequest build() {
            return new GetRetcodeLogstoreRequest(this);
        } 

    } 

}
