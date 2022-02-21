// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPersonDetailRequest} extends {@link RequestModel}
 *
 * <p>GetPersonDetailRequest</p>
 */
public class GetPersonDetailRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    private String algorithmType;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("PersonID")
    private String personID;

    private GetPersonDetailRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.corpId = builder.corpId;
        this.personID = builder.personID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return personID
     */
    public String getPersonID() {
        return this.personID;
    }

    public static final class Builder extends Request.Builder<GetPersonDetailRequest, Builder> {
        private String algorithmType; 
        private String corpId; 
        private String personID; 

        private Builder() {
            super();
        } 

        private Builder(GetPersonDetailRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.corpId = response.corpId;
            this.personID = response.personID;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * PersonID.
         */
        public Builder personID(String personID) {
            this.putBodyParameter("PersonID", personID);
            this.personID = personID;
            return this;
        }

        @Override
        public GetPersonDetailRequest build() {
            return new GetPersonDetailRequest(this);
        } 

    } 

}
