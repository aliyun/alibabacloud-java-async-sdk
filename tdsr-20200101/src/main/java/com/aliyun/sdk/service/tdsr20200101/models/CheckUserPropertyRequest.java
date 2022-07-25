// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserPropertyRequest} extends {@link RequestModel}
 *
 * <p>CheckUserPropertyRequest</p>
 */
public class CheckUserPropertyRequest extends Request {
    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    private CheckUserPropertyRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<CheckUserPropertyRequest, Builder> {
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserPropertyRequest request) {
            super(request);
            this.uid = request.uid;
        } 

        /**
         * 用户uid
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CheckUserPropertyRequest build() {
            return new CheckUserPropertyRequest(this);
        } 

    } 

}
