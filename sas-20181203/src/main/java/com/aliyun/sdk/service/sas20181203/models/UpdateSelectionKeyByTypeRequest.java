// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSelectionKeyByTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSelectionKeyByTypeRequest</p>
 */
public class UpdateSelectionKeyByTypeRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("SelectionKey")
    private String selectionKey;

    private UpdateSelectionKeyByTypeRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.selectionKey = builder.selectionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSelectionKeyByTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public static final class Builder extends Request.Builder<UpdateSelectionKeyByTypeRequest, Builder> {
        private String businessType; 
        private String selectionKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSelectionKeyByTypeRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.selectionKey = request.selectionKey;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * SelectionKey.
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        @Override
        public UpdateSelectionKeyByTypeRequest build() {
            return new UpdateSelectionKeyByTypeRequest(this);
        } 

    } 

}
