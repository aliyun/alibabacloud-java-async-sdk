// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetCheckSummaryRequest</p>
 */
public class GetCheckSummaryRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    private GetCheckSummaryRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<GetCheckSummaryRequest, Builder> {
        private String lang; 
        private String resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckSummaryRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceDirectoryAccountId.
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public GetCheckSummaryRequest build() {
            return new GetCheckSummaryRequest(this);
        } 

    } 

}
