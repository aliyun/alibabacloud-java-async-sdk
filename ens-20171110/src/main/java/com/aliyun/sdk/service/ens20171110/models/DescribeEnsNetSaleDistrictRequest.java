// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetSaleDistrictRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsNetSaleDistrictRequest</p>
 */
public class DescribeEnsNetSaleDistrictRequest extends Request {
    @Query
    @NameInMap("NetDistrictCode")
    private String netDistrictCode;

    @Query
    @NameInMap("NetLevelCode")
    @Validation(required = true)
    private String netLevelCode;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeEnsNetSaleDistrictRequest(Builder builder) {
        super(builder);
        this.netDistrictCode = builder.netDistrictCode;
        this.netLevelCode = builder.netLevelCode;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsNetSaleDistrictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return netDistrictCode
     */
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    /**
     * @return netLevelCode
     */
    public String getNetLevelCode() {
        return this.netLevelCode;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeEnsNetSaleDistrictRequest, Builder> {
        private String netDistrictCode; 
        private String netLevelCode; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsNetSaleDistrictRequest request) {
            super(request);
            this.netDistrictCode = request.netDistrictCode;
            this.netLevelCode = request.netLevelCode;
            this.version = request.version;
        } 

        /**
         * NetDistrictCode.
         */
        public Builder netDistrictCode(String netDistrictCode) {
            this.putQueryParameter("NetDistrictCode", netDistrictCode);
            this.netDistrictCode = netDistrictCode;
            return this;
        }

        /**
         * NetLevelCode.
         */
        public Builder netLevelCode(String netLevelCode) {
            this.putQueryParameter("NetLevelCode", netLevelCode);
            this.netLevelCode = netLevelCode;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeEnsNetSaleDistrictRequest build() {
            return new DescribeEnsNetSaleDistrictRequest(this);
        } 

    } 

}
