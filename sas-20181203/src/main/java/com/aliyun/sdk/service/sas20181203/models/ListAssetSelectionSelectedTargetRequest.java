// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAssetSelectionSelectedTargetRequest} extends {@link RequestModel}
 *
 * <p>ListAssetSelectionSelectedTargetRequest</p>
 */
public class ListAssetSelectionSelectedTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String selectionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetList")
    private java.util.List<String> targetList;

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
    public java.util.List<String> getTargetList() {
        return this.targetList;
    }

    public static final class Builder extends Request.Builder<ListAssetSelectionSelectedTargetRequest, Builder> {
        private String selectionKey; 
        private java.util.List<String> targetList; 

        private Builder() {
            super();
        } 

        private Builder(ListAssetSelectionSelectedTargetRequest request) {
            super(request);
            this.selectionKey = request.selectionKey;
            this.targetList = request.targetList;
        } 

        /**
         * <p>The unique ID of the asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2e6ab33d-4e00-4581-ac16-0dd1f9ad****</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * <p>The details of queries.</p>
         */
        public Builder targetList(java.util.List<String> targetList) {
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
