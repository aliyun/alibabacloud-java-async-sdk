// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDomainRequest} extends {@link RequestModel}
 *
 * <p>GetDomainRequest</p>
 */
public class GetDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withStatistics")
    private Boolean withStatistics;

    private GetDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.withStatistics = builder.withStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainRequest create() {
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
     * @return withStatistics
     */
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

    public static final class Builder extends Request.Builder<GetDomainRequest, Builder> {
        private String domainId; 
        private Boolean withStatistics; 

        private Builder() {
            super();
        } 

        private Builder(GetDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.withStatistics = request.withStatistics;
        } 

        /**
         * <p>The ID of the domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cpqnfn5lhtgqbga95sv1</p>
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Specifies whether to return online resource information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withStatistics(Boolean withStatistics) {
            this.putQueryParameter("withStatistics", withStatistics);
            this.withStatistics = withStatistics;
            return this;
        }

        @Override
        public GetDomainRequest build() {
            return new GetDomainRequest(this);
        } 

    } 

}
