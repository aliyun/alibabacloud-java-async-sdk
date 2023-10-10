// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcuByRegionRequest} extends {@link RequestModel}
 *
 * <p>ListEcuByRegionRequest</p>
 */
public class ListEcuByRegionRequest extends Request {
    @Query
    @NameInMap("Act")
    @Validation(required = true)
    private String act;

    @Query
    @NameInMap("LogicalRegionId")
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
         * Set the value to `pop-query`.
         */
        public Builder act(String act) {
            this.putQueryParameter("Act", act);
            this.act = act;
            return this;
        }

        /**
         * The ID of the namespace.
         * <p>
         * 
         * *   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: cn-beijing:tdy218.
         * *   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.
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
