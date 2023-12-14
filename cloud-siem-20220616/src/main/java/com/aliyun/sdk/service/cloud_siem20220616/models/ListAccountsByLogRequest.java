// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountsByLogRequest} extends {@link RequestModel}
 *
 * <p>ListAccountsByLogRequest</p>
 */
public class ListAccountsByLogRequest extends Request {
    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("LogCodes")
    @Validation(required = true)
    private java.util.List < String > logCodes;

    @Body
    @NameInMap("ProdCode")
    @Validation(required = true)
    private String prodCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListAccountsByLogRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.logCodes = builder.logCodes;
        this.prodCode = builder.prodCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsByLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return logCodes
     */
    public java.util.List < String > getLogCodes() {
        return this.logCodes;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAccountsByLogRequest, Builder> {
        private String cloudCode; 
        private java.util.List < String > logCodes; 
        private String prodCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAccountsByLogRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.logCodes = request.logCodes;
            this.prodCode = request.prodCode;
            this.regionId = request.regionId;
        } 

        /**
         * CloudCode.
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * LogCodes.
         */
        public Builder logCodes(java.util.List < String > logCodes) {
            this.putBodyParameter("LogCodes", logCodes);
            this.logCodes = logCodes;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putBodyParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAccountsByLogRequest build() {
            return new ListAccountsByLogRequest(this);
        } 

    } 

}
