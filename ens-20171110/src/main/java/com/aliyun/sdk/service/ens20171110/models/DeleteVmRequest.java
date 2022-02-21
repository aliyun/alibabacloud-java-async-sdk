// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVmRequest} extends {@link RequestModel}
 *
 * <p>DeleteVmRequest</p>
 */
public class DeleteVmRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(minimum = 1)
    private Long aliUid;

    @Query
    @NameInMap("WorkloadUuid")
    private String workloadUuid;

    private DeleteVmRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.workloadUuid = builder.workloadUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return workloadUuid
     */
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

    public static final class Builder extends Request.Builder<DeleteVmRequest, Builder> {
        private Long aliUid; 
        private String workloadUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVmRequest response) {
            super(response);
            this.aliUid = response.aliUid;
            this.workloadUuid = response.workloadUuid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * WorkloadUuid.
         */
        public Builder workloadUuid(String workloadUuid) {
            this.putQueryParameter("WorkloadUuid", workloadUuid);
            this.workloadUuid = workloadUuid;
            return this;
        }

        @Override
        public DeleteVmRequest build() {
            return new DeleteVmRequest(this);
        } 

    } 

}
