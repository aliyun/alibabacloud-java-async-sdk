// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotParamItemsRequest} extends {@link RequestModel}
 *
 * <p>CreateHotParamItemsRequest</p>
 */
public class CreateHotParamItemsRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("Items")
    @Validation(required = true)
    private String items;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private CreateHotParamItemsRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.items = builder.items;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHotParamItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<CreateHotParamItemsRequest, Builder> {
        private String ahasRegionId; 
        private String items; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHotParamItemsRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.items = response.items;
            this.ruleId = response.ruleId;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(String items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public CreateHotParamItemsRequest build() {
            return new CreateHotParamItemsRequest(this);
        } 

    } 

}
