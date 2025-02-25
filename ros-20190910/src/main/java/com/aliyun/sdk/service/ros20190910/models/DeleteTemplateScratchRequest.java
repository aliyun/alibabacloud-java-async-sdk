// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateScratchRequest</p>
 */
public class DeleteTemplateScratchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateScratchId;

    private DeleteTemplateScratchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateScratchRequest create() {
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
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateScratchRequest, Builder> {
        private String regionId; 
        private String templateScratchId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateScratchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateScratchId = request.templateScratchId;
        } 

        /**
         * <p>The region ID of the scenario.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ts-4f83704400994409****</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        @Override
        public DeleteTemplateScratchRequest build() {
            return new DeleteTemplateScratchRequest(this);
        } 

    } 

}
