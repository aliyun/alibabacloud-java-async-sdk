// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEnvironmentFoundationReferenceRequest} extends {@link RequestModel}
 *
 * <p>SetEnvironmentFoundationReferenceRequest</p>
 */
public class SetEnvironmentFoundationReferenceRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("foundationReferenceUID")
    @Validation(required = true)
    private String foundationReferenceUID;

    private SetEnvironmentFoundationReferenceRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.foundationReferenceUID = builder.foundationReferenceUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEnvironmentFoundationReferenceRequest create() {
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

    /**
     * @return foundationReferenceUID
     */
    public String getFoundationReferenceUID() {
        return this.foundationReferenceUID;
    }

    public static final class Builder extends Request.Builder<SetEnvironmentFoundationReferenceRequest, Builder> {
        private String uid; 
        private String foundationReferenceUID; 

        private Builder() {
            super();
        } 

        private Builder(SetEnvironmentFoundationReferenceRequest request) {
            super(request);
            this.uid = request.uid;
            this.foundationReferenceUID = request.foundationReferenceUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * foundationReferenceUID.
         */
        public Builder foundationReferenceUID(String foundationReferenceUID) {
            this.putPathParameter("foundationReferenceUID", foundationReferenceUID);
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }

        @Override
        public SetEnvironmentFoundationReferenceRequest build() {
            return new SetEnvironmentFoundationReferenceRequest(this);
        } 

    } 

}
