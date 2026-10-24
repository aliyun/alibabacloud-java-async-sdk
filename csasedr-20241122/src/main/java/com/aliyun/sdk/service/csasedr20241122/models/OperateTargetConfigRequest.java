// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link OperateTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateTargetConfigRequest</p>
 */
public class OperateTargetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String selectionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchIdList")
    private java.util.List<String> switchIdList;

    private OperateTargetConfigRequest(Builder builder) {
        super(builder);
        this.selectionKey = builder.selectionKey;
        this.status = builder.status;
        this.switchIdList = builder.switchIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateTargetConfigRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return switchIdList
     */
    public java.util.List<String> getSwitchIdList() {
        return this.switchIdList;
    }

    public static final class Builder extends Request.Builder<OperateTargetConfigRequest, Builder> {
        private String selectionKey; 
        private String status; 
        private java.util.List<String> switchIdList; 

        private Builder() {
            super();
        } 

        private Builder(OperateTargetConfigRequest request) {
            super(request);
            this.selectionKey = request.selectionKey;
            this.status = request.status;
            this.switchIdList = request.switchIdList;
        } 

        /**
         * <p>The key of the rule switch configuration associated with the policy. It must be the same as the key used in the ListSystemConfigRules query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8b37f46a-72d9-4c8c-bada-2f374a9c3410</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        /**
         * <p>The status of the rule switch. Valid values:</p>
         * <ul>
         * <li><strong>add</strong>: Enabled.</li>
         * <li><strong>del</strong>: Disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of system rule switch identifiers whose status is to be updated. The elements are obtained from the SwitchId returned by ListSystemConfigRules. A maximum of 100 items are supported. The backend updates the items one by one based on the list. The request is rejected if the list is not provided.</p>
         */
        public Builder switchIdList(java.util.List<String> switchIdList) {
            String switchIdListShrink = shrink(switchIdList, "SwitchIdList", "json");
            this.putQueryParameter("SwitchIdList", switchIdListShrink);
            this.switchIdList = switchIdList;
            return this;
        }

        @Override
        public OperateTargetConfigRequest build() {
            return new OperateTargetConfigRequest(this);
        } 

    } 

}
