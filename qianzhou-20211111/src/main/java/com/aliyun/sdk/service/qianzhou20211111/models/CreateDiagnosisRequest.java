// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnosisRequest</p>
 */
public class CreateDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterID")
    private String clusterID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("diagnosisType")
    private String diagnosisType;

    private CreateDiagnosisRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clusterID = builder.clusterID;
        this.diagnosisType = builder.diagnosisType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return clusterID
     */
    public String getClusterID() {
        return this.clusterID;
    }

    /**
     * @return diagnosisType
     */
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public static final class Builder extends Request.Builder<CreateDiagnosisRequest, Builder> {
        private String body; 
        private String clusterID; 
        private String diagnosisType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnosisRequest request) {
            super(request);
            this.body = request.body;
            this.clusterID = request.clusterID;
            this.diagnosisType = request.diagnosisType;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * clusterID.
         */
        public Builder clusterID(String clusterID) {
            this.putQueryParameter("clusterID", clusterID);
            this.clusterID = clusterID;
            return this;
        }

        /**
         * diagnosisType.
         */
        public Builder diagnosisType(String diagnosisType) {
            this.putQueryParameter("diagnosisType", diagnosisType);
            this.diagnosisType = diagnosisType;
            return this;
        }

        @Override
        public CreateDiagnosisRequest build() {
            return new CreateDiagnosisRequest(this);
        } 

    } 

}
