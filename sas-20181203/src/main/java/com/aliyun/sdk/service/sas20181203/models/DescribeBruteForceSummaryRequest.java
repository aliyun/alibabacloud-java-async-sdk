// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBruteForceSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeBruteForceSummaryRequest</p>
 */
public class DescribeBruteForceSummaryRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeBruteForceSummaryRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeBruteForceSummaryRequest, Builder> {
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBruteForceSummaryRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeBruteForceSummaryRequest build() {
            return new DescribeBruteForceSummaryRequest(this);
        } 

    } 

}
