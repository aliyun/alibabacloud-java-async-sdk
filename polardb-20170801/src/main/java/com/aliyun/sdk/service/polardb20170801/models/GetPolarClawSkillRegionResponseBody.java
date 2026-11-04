// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link GetPolarClawSkillRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolarClawSkillRegionResponseBody</p>
 */
public class GetPolarClawSkillRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    private String OSSBucket;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolarClawSkillRegionResponseBody(Builder builder) {
        this.OSSBucket = builder.OSSBucket;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolarClawSkillRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String OSSBucket; 
        private String regionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPolarClawSkillRegionResponseBody model) {
            this.OSSBucket = model.OSSBucket;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The OSS bucket that stores images.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket-test</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolarClawSkillRegionResponseBody build() {
            return new GetPolarClawSkillRegionResponseBody(this);
        } 

    } 

}
