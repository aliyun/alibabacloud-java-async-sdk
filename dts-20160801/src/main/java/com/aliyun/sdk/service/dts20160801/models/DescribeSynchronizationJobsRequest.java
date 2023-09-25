// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSynchronizationJobsRequest</p>
 */
public class DescribeSynchronizationJobsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    private DescribeSynchronizationJobsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.synchronizationJobName = builder.synchronizationJobName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public static final class Builder extends Request.Builder<DescribeSynchronizationJobsRequest, Builder> {
        private String clientToken; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String synchronizationJobName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSynchronizationJobsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.synchronizationJobName = request.synchronizationJobName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * SynchronizationJobName.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.putQueryParameter("SynchronizationJobName", synchronizationJobName);
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        @Override
        public DescribeSynchronizationJobsRequest build() {
            return new DescribeSynchronizationJobsRequest(this);
        } 

    } 

}
