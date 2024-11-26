// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDiagnosisResultRequest} extends {@link RequestModel}
 *
 * <p>GetDiagnosisResultRequest</p>
 */
public class GetDiagnosisResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("diagnosisId")
    private String diagnosisId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ownerUid")
    private String ownerUid;

    private GetDiagnosisResultRequest(Builder builder) {
        super(builder);
        this.diagnosisId = builder.diagnosisId;
        this.ownerUid = builder.ownerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnosisResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnosisId
     */
    public String getDiagnosisId() {
        return this.diagnosisId;
    }

    /**
     * @return ownerUid
     */
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public static final class Builder extends Request.Builder<GetDiagnosisResultRequest, Builder> {
        private String diagnosisId; 
        private String ownerUid; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnosisResultRequest request) {
            super(request);
            this.diagnosisId = request.diagnosisId;
            this.ownerUid = request.ownerUid;
        } 

        /**
         * diagnosisId.
         */
        public Builder diagnosisId(String diagnosisId) {
            this.putQueryParameter("diagnosisId", diagnosisId);
            this.diagnosisId = diagnosisId;
            return this;
        }

        /**
         * ownerUid.
         */
        public Builder ownerUid(String ownerUid) {
            this.putQueryParameter("ownerUid", ownerUid);
            this.ownerUid = ownerUid;
            return this;
        }

        @Override
        public GetDiagnosisResultRequest build() {
            return new GetDiagnosisResultRequest(this);
        } 

    } 

}
