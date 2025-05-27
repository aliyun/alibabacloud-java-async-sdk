// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListDataSourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceTypesRequest</p>
 */
public class ListDataSourceTypesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListDataSourceTypesRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTypesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListDataSourceTypesRequest, Builder> {
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceTypesRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The code of the third-party cloud service.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>qcloud</li>
         * <li>hcloud</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hcloud</p>
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions in China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListDataSourceTypesRequest build() {
            return new ListDataSourceTypesRequest(this);
        } 

    } 

}
