// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackRequest} extends {@link RequestModel}
 *
 * <p>DescribePackRequest</p>
 */
public class DescribePackRequest extends Request {
    @Query
    @NameInMap("PackId")
    @Validation(required = true)
    private String packId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribePackRequest(Builder builder) {
        super(builder);
        this.packId = builder.packId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packId
     */
    public String getPackId() {
        return this.packId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribePackRequest, Builder> {
        private String packId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackRequest request) {
            super(request);
            this.packId = request.packId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * PackId.
         */
        public Builder packId(String packId) {
            this.putQueryParameter("PackId", packId);
            this.packId = packId;
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
        public DescribePackRequest build() {
            return new DescribePackRequest(this);
        } 

    } 

}
