// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCheckDetailRequest</p>
 */
public class GetCheckDetailRequest extends Request {
    @Query
    @NameInMap("CheckId")
    @Validation(required = true)
    private Long checkId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private GetCheckDetailRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetCheckDetailRequest, Builder> {
        private Long checkId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckDetailRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.lang = request.lang;
        } 

        /**
         * CheckId.
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetCheckDetailRequest build() {
            return new GetCheckDetailRequest(this);
        } 

    } 

}
