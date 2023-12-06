// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoundationComponentReferenceRequest} extends {@link RequestModel}
 *
 * <p>GetFoundationComponentReferenceRequest</p>
 */
public class GetFoundationComponentReferenceRequest extends Request {
    @Path
    @NameInMap("componentReferenceUID")
    @Validation(required = true)
    private String componentReferenceUID;

    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    private GetFoundationComponentReferenceRequest(Builder builder) {
        super(builder);
        this.componentReferenceUID = builder.componentReferenceUID;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoundationComponentReferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentReferenceUID
     */
    public String getComponentReferenceUID() {
        return this.componentReferenceUID;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetFoundationComponentReferenceRequest, Builder> {
        private String componentReferenceUID; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetFoundationComponentReferenceRequest request) {
            super(request);
            this.componentReferenceUID = request.componentReferenceUID;
            this.uid = request.uid;
        } 

        /**
         * componentReferenceUID.
         */
        public Builder componentReferenceUID(String componentReferenceUID) {
            this.putPathParameter("componentReferenceUID", componentReferenceUID);
            this.componentReferenceUID = componentReferenceUID;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetFoundationComponentReferenceRequest build() {
            return new GetFoundationComponentReferenceRequest(this);
        } 

    } 

}
