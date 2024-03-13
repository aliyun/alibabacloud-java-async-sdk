// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceDetailRequest</p>
 */
public class DescribeExposedInstanceDetailRequest extends Request {
    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private DescribeExposedInstanceDetailRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeExposedInstanceDetailRequest, Builder> {
        private Long resourceDirectoryAccountId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedInstanceDetailRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.uuid = request.uuid;
        } 

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to query the account ID.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The UUID of the server that is exposed on the Internet.
         * <p>
         * 
         * >  You can call the [DescribeExposedInstanceList](~~198153~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeExposedInstanceDetailRequest build() {
            return new DescribeExposedInstanceDetailRequest(this);
        } 

    } 

}
