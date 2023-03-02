// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInsRequest} extends {@link RequestModel}
 *
 * <p>UpdateInsRequest</p>
 */
public class UpdateInsRequest extends Request {
    @Query
    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @Query
    @NameInMap("Succeed")
    private String succeed;

    private UpdateInsRequest(Builder builder) {
        super(builder);
        this.httpStatusCode = builder.httpStatusCode;
        this.succeed = builder.succeed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return succeed
     */
    public String getSucceed() {
        return this.succeed;
    }

    public static final class Builder extends Request.Builder<UpdateInsRequest, Builder> {
        private String httpStatusCode; 
        private String succeed; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInsRequest request) {
            super(request);
            this.httpStatusCode = request.httpStatusCode;
            this.succeed = request.succeed;
        } 

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.putQueryParameter("HttpStatusCode", httpStatusCode);
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Succeed.
         */
        public Builder succeed(String succeed) {
            this.putQueryParameter("Succeed", succeed);
            this.succeed = succeed;
            return this;
        }

        @Override
        public UpdateInsRequest build() {
            return new UpdateInsRequest(this);
        } 

    } 

}
