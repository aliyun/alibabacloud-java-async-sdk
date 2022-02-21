// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsBatchRequest} extends {@link RequestModel}
 *
 * <p>AddTagsBatchRequest</p>
 */
public class AddTagsBatchRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DbfsList")
    @Validation(required = true)
    private String dbfsList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private String tags;

    private AddTagsBatchRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbfsList = builder.dbfsList;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsBatchRequest create() {
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
     * @return dbfsList
     */
    public String getDbfsList() {
        return this.dbfsList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<AddTagsBatchRequest, Builder> {
        private String clientToken; 
        private String dbfsList; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsBatchRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dbfsList = response.dbfsList;
            this.regionId = response.regionId;
            this.tags = response.tags;
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
         * DbfsList.
         */
        public Builder dbfsList(String dbfsList) {
            this.putQueryParameter("DbfsList", dbfsList);
            this.dbfsList = dbfsList;
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

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public AddTagsBatchRequest build() {
            return new AddTagsBatchRequest(this);
        } 

    } 

}
