// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCorsDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteCorsDomainRequest</p>
 */
public class DeleteCorsDomainRequest extends Request {
    @Body
    @NameInMap("DomainId")
    @Validation(required = true)
    private String domainId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DeleteCorsDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCorsDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DeleteCorsDomainRequest, Builder> {
        private String domainId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCorsDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.spaceId = request.spaceId;
        } 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putBodyParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DeleteCorsDomainRequest build() {
            return new DeleteCorsDomainRequest(this);
        } 

    } 

}
