// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAnswerSampleRequest} extends {@link RequestModel}
 *
 * <p>DeleteAnswerSampleRequest</p>
 */
public class DeleteAnswerSampleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private String ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteAnswerSampleRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAnswerSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAnswerSampleRequest, Builder> {
        private String ids; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAnswerSampleRequest request) {
            super(request);
            this.ids = request.ids;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putBodyParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
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
        public DeleteAnswerSampleRequest build() {
            return new DeleteAnswerSampleRequest(this);
        } 

    } 

}
