// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFcServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeFcServiceRequest</p>
 */
public class DescribeFcServiceRequest extends Request {
    @Body
    @NameInMap("Limit")
    private Integer limit;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("Prefix")
    private String prefix;

    @Body
    @NameInMap("RegionCode")
    private String regionCode;

    private DescribeFcServiceRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.operaUid = builder.operaUid;
        this.prefix = builder.prefix;
        this.regionCode = builder.regionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFcServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    public static final class Builder extends Request.Builder<DescribeFcServiceRequest, Builder> {
        private Integer limit; 
        private String nextToken; 
        private String operaUid; 
        private String prefix; 
        private String regionCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFcServiceRequest request) {
            super(request);
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.operaUid = request.operaUid;
            this.prefix = request.prefix;
            this.regionCode = request.regionCode;
        } 

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putBodyParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putBodyParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        @Override
        public DescribeFcServiceRequest build() {
            return new DescribeFcServiceRequest(this);
        } 

    } 

}
