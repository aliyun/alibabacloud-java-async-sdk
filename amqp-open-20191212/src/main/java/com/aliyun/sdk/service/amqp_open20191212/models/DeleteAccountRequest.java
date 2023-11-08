// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccountRequest</p>
 */
public class DeleteAccountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    private Long createTimestamp;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private DeleteAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createTimestamp = builder.createTimestamp;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DeleteAccountRequest, Builder> {
        private String regionId; 
        private Long createTimestamp; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createTimestamp = request.createTimestamp;
            this.userName = request.userName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.putQueryParameter("CreateTimestamp", createTimestamp);
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DeleteAccountRequest build() {
            return new DeleteAccountRequest(this);
        } 

    } 

}
