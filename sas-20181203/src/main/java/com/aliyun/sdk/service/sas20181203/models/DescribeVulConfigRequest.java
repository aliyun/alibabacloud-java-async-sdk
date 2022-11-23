// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulConfigRequest</p>
 */
public class DescribeVulConfigRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeVulConfigRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVulConfigRequest, Builder> {
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulConfigRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVulConfigRequest build() {
            return new DescribeVulConfigRequest(this);
        } 

    } 

}
