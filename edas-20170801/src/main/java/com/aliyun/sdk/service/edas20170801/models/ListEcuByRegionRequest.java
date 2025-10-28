// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListEcuByRegionRequest} extends {@link RequestModel}
 *
 * <p>ListEcuByRegionRequest</p>
 */
public class ListEcuByRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Act")
    @com.aliyun.core.annotation.Validation(required = true)
    private String act;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    private ListEcuByRegionRequest(Builder builder) {
        super(builder);
        this.act = builder.act;
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcuByRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return act
     */
    public String getAct() {
        return this.act;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public static final class Builder extends Request.Builder<ListEcuByRegionRequest, Builder> {
        private String act; 
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEcuByRegionRequest request) {
            super(request);
            this.act = request.act;
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * <p>Set the value to <code>pop-query</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pop-query</p>
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
         * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing or cn-beijing:tdy218</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public ListEcuByRegionRequest build() {
            return new ListEcuByRegionRequest(this);
        } 

    } 

}
