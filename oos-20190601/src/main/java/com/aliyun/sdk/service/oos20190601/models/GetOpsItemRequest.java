// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOpsItemRequest} extends {@link RequestModel}
 *
 * <p>GetOpsItemRequest</p>
 */
public class GetOpsItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String opsItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetOpsItemRequest(Builder builder) {
        super(builder);
        this.opsItemId = builder.opsItemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpsItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return opsItemId
     */
    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetOpsItemRequest, Builder> {
        private String opsItemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetOpsItemRequest request) {
            super(request);
            this.opsItemId = request.opsItemId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The O&amp;M item ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oi-d52b08695e2b46ae8413</p>
         */
        public Builder opsItemId(String opsItemId) {
            this.putQueryParameter("OpsItemId", opsItemId);
            this.opsItemId = opsItemId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetOpsItemRequest build() {
            return new GetOpsItemRequest(this);
        } 

    } 

}
