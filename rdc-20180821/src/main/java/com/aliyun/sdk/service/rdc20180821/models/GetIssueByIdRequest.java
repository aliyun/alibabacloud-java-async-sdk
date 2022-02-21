// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIssueByIdRequest} extends {@link RequestModel}
 *
 * <p>GetIssueByIdRequest</p>
 */
public class GetIssueByIdRequest extends Request {
    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private Integer id;

    private GetIssueByIdRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIssueByIdRequest create() {
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

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetIssueByIdRequest, Builder> {
        private String corpIdentifier; 
        private Integer id; 

        private Builder() {
            super();
        } 

        private Builder(GetIssueByIdRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
            this.id = response.id;
        } 

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Integer id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetIssueByIdRequest build() {
            return new GetIssueByIdRequest(this);
        } 

    } 

}
