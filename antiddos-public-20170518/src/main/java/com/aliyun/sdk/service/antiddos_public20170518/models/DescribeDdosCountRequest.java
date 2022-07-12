// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeDdosCountRequest</p>
 */
public class DescribeDdosCountRequest extends Request {
    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    private DescribeDdosCountRequest(Builder builder) {
        super(builder);
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosCountRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeDdosCountRequest, Builder> {
        private String ddosRegionId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDdosCountRequest request) {
            super(request);
            this.ddosRegionId = request.ddosRegionId;
            this.instanceType = request.instanceType;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public DescribeDdosCountRequest build() {
            return new DescribeDdosCountRequest(this);
        } 

    } 

}
