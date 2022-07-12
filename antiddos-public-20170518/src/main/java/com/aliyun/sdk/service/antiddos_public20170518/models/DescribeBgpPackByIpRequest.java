// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpPackByIpRequest} extends {@link RequestModel}
 *
 * <p>DescribeBgpPackByIpRequest</p>
 */
public class DescribeBgpPackByIpRequest extends Request {
    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    @Query
    @NameInMap("Ip")
    @Validation(required = true)
    private String ip;

    private DescribeBgpPackByIpRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBgpPackByIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<DescribeBgpPackByIpRequest, Builder> {
        private String ddosRegionId; 
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBgpPackByIpRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.ip = request.ip;
        } 

        /**
         * DdosRegionId.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public DescribeBgpPackByIpRequest build() {
            return new DescribeBgpPackByIpRequest(this);
        } 

    } 

}
