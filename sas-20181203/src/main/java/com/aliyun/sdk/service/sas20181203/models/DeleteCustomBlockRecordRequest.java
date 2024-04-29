// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomBlockRecordRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomBlockRecordRequest</p>
 */
public class DeleteCustomBlockRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteCustomBlockRecordRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomBlockRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomBlockRecordRequest, Builder> {
        private Long id; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomBlockRecordRequest request) {
            super(request);
            this.id = request.id;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the IP address blocking policy.
         * <p>
         * 
         * > You can call the [DescribeCustomBlockRecords](~~DescribeCustomBlockRecords~~) operation to query the ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DeleteCustomBlockRecordRequest build() {
            return new DeleteCustomBlockRecordRequest(this);
        } 

    } 

}
