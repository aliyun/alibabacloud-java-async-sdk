// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveJoinCompanyRequest} extends {@link RequestModel}
 *
 * <p>ApproveJoinCompanyRequest</p>
 */
public class ApproveJoinCompanyRequest extends Request {
    @Body
    @NameInMap("ApplicationIds")
    @Validation(required = true)
    private String applicationIds;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    private ApproveJoinCompanyRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.corpIdentifier = builder.corpIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveJoinCompanyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public String getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public static final class Builder extends Request.Builder<ApproveJoinCompanyRequest, Builder> {
        private String applicationIds; 
        private String corpIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ApproveJoinCompanyRequest response) {
            super(response);
            this.applicationIds = response.applicationIds;
            this.corpIdentifier = response.corpIdentifier;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(String applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        @Override
        public ApproveJoinCompanyRequest build() {
            return new ApproveJoinCompanyRequest(this);
        } 

    } 

}
