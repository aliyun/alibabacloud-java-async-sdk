// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFaceVerifyResultRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceVerifyResultRequest</p>
 */
public class DeleteFaceVerifyResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyId")
    private String certifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAfterQuery")
    private String deleteAfterQuery;

    private DeleteFaceVerifyResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certifyId = builder.certifyId;
        this.deleteAfterQuery = builder.deleteAfterQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceVerifyResultRequest create() {
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
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return deleteAfterQuery
     */
    public String getDeleteAfterQuery() {
        return this.deleteAfterQuery;
    }

    public static final class Builder extends Request.Builder<DeleteFaceVerifyResultRequest, Builder> {
        private String regionId; 
        private String certifyId; 
        private String deleteAfterQuery; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceVerifyResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certifyId = request.certifyId;
            this.deleteAfterQuery = request.deleteAfterQuery;
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
         * CertifyId.
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * DeleteAfterQuery.
         */
        public Builder deleteAfterQuery(String deleteAfterQuery) {
            this.putQueryParameter("DeleteAfterQuery", deleteAfterQuery);
            this.deleteAfterQuery = deleteAfterQuery;
            return this;
        }

        @Override
        public DeleteFaceVerifyResultRequest build() {
            return new DeleteFaceVerifyResultRequest(this);
        } 

    } 

}
