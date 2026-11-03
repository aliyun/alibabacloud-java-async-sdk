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
         * <p>The unique identifier for ID Verification.</p>
         * 
         * <strong>example:</strong>
         * <p>shae18209d29ce4e8ba252caae98ab15</p>
         */
        public Builder certifyId(String certifyId) {
            this.putQueryParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * <p>Specifies whether the deletion relies on the data retrieved from the corresponding verification process. Valid values:</p>
         * <ul>
         * <li>Y: Yes. To successfully delete the related data, you must have obtained the processing result by calling the DescribeFaceVerify operation.</li>
         * <li>N: No. This is the default value. You can directly set this parameter to N when you use the server-only API integration mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
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
