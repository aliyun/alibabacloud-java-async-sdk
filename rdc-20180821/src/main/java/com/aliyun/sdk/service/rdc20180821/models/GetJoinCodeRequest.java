// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJoinCodeRequest} extends {@link RequestModel}
 *
 * <p>GetJoinCodeRequest</p>
 */
public class GetJoinCodeRequest extends Request {
    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    private GetJoinCodeRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJoinCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public static final class Builder extends Request.Builder<GetJoinCodeRequest, Builder> {
        private String corpIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(GetJoinCodeRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
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
        public GetJoinCodeRequest build() {
            return new GetJoinCodeRequest(this);
        } 

    } 

}
