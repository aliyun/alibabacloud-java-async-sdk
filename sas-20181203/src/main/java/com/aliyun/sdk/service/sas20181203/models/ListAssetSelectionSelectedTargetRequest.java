// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetSelectionSelectedTargetRequest} extends {@link RequestModel}
 *
 * <p>ListAssetSelectionSelectedTargetRequest</p>
 */
public class ListAssetSelectionSelectedTargetRequest extends Request {
    @Query
    @NameInMap("SelectionKey")
    @Validation(required = true)
    private String selectionKey;

    @Query
    @NameInMap("TargetList")
    private java.util.List < String > targetList;

    private ListAssetSelectionSelectedTargetRequest(Builder builder) {
        super(builder);
        this.selectionKey = builder.selectionKey;
        this.targetList = builder.targetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetSelectionSelectedTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    /**
     * @return targetList
     */
    public java.util.List < String > getTargetList() {
        return this.targetList;
    }

    public static final class Builder extends Request.Builder<ListAssetSelectionSelectedTargetRequest, Builder> {
        private String selectionKey; 
        private java.util.List < String > targetList; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetSelectionSelectedTargetRequest request) {
            super(request);
            this.selectionKey = request.selectionKey;
            this.targetList = request.targetList;
        } 

        /**
         * The unique ID of the asset.
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * The details of queries.
         */
        public Builder targetList(java.util.List < String > targetList) {
            this.putQueryParameter("TargetList", targetList);
            this.targetList = targetList;
            return this;
        }

        @Override
        public ListAssetSelectionSelectedTargetRequest build() {
            return new ListAssetSelectionSelectedTargetRequest(this);
        } 

    } 

}
