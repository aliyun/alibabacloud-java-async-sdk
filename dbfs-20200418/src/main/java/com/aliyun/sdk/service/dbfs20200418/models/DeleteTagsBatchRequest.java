// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagsBatchRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagsBatchRequest</p>
 */
public class DeleteTagsBatchRequest extends Request {
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

    private DeleteTagsBatchRequest(Builder builder) {
        super(builder);
        this.dbfsList = builder.dbfsList;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagsBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteTagsBatchRequest, Builder> {
        private String dbfsList; 
        private String regionId; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagsBatchRequest response) {
            super(response);
            this.dbfsList = response.dbfsList;
            this.regionId = response.regionId;
            this.tags = response.tags;
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
        public DeleteTagsBatchRequest build() {
            return new DeleteTagsBatchRequest(this);
        } 

    } 

}
