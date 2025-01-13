// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListNodesByBaselineRequest} extends {@link RequestModel}
 *
 * <p>ListNodesByBaselineRequest</p>
 */
public class ListNodesByBaselineRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long baselineId;

    private ListNodesByBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineId = builder.baselineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesByBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    public static final class Builder extends Request.Builder<ListNodesByBaselineRequest, Builder> {
        private String regionId; 
        private Long baselineId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesByBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineId = request.baselineId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/173964.html">ListBaselineConfigs</a> operation to query the baseline ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        @Override
        public ListNodesByBaselineRequest build() {
            return new ListNodesByBaselineRequest(this);
        } 

    } 

}
