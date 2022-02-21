// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmListRequest} extends {@link RequestModel}
 *
 * <p>GetVmListRequest</p>
 */
public class GetVmListRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true, minimum = 1)
    private Long aliUid;

    @Query
    @NameInMap("GroupUuid")
    private String groupUuid;

    @Query
    @NameInMap("InstanceUuid")
    private String instanceUuid;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("WorkloadUuid")
    private String workloadUuid;

    private GetVmListRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.groupUuid = builder.groupUuid;
        this.instanceUuid = builder.instanceUuid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.workloadUuid = builder.workloadUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmListRequest create() {
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
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workloadUuid
     */
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

    public static final class Builder extends Request.Builder<GetVmListRequest, Builder> {
        private Long aliUid; 
        private String groupUuid; 
        private String instanceUuid; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String workloadUuid; 

        private Builder() {
            super();
        } 

        private Builder(GetVmListRequest response) {
            super(response);
            this.aliUid = response.aliUid;
            this.groupUuid = response.groupUuid;
            this.instanceUuid = response.instanceUuid;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
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
         * GroupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * InstanceUuid.
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public GetVmListRequest build() {
            return new GetVmListRequest(this);
        } 

    } 

}
