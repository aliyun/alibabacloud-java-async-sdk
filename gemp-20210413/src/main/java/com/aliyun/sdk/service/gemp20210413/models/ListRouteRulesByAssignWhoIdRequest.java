// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesByAssignWhoIdRequest} extends {@link RequestModel}
 *
 * <p>ListRouteRulesByAssignWhoIdRequest</p>
 */
public class ListRouteRulesByAssignWhoIdRequest extends Request {
    @Body
    @NameInMap("assignWhoId")
    private Long assignWhoId;

    @Body
    @NameInMap("assignWhoType")
    private Long assignWhoType;

    private ListRouteRulesByAssignWhoIdRequest(Builder builder) {
        super(builder);
        this.assignWhoId = builder.assignWhoId;
        this.assignWhoType = builder.assignWhoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRulesByAssignWhoIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignWhoId
     */
    public Long getAssignWhoId() {
        return this.assignWhoId;
    }

    /**
     * @return assignWhoType
     */
    public Long getAssignWhoType() {
        return this.assignWhoType;
    }

    public static final class Builder extends Request.Builder<ListRouteRulesByAssignWhoIdRequest, Builder> {
        private Long assignWhoId; 
        private Long assignWhoType; 

        private Builder() {
            super();
        } 

        private Builder(ListRouteRulesByAssignWhoIdRequest request) {
            super(request);
            this.assignWhoId = request.assignWhoId;
            this.assignWhoType = request.assignWhoType;
        } 

        /**
         * assignWhoId.
         */
        public Builder assignWhoId(Long assignWhoId) {
            this.putBodyParameter("assignWhoId", assignWhoId);
            this.assignWhoId = assignWhoId;
            return this;
        }

        /**
         * assignWhoType.
         */
        public Builder assignWhoType(Long assignWhoType) {
            this.putBodyParameter("assignWhoType", assignWhoType);
            this.assignWhoType = assignWhoType;
            return this;
        }

        @Override
        public ListRouteRulesByAssignWhoIdRequest build() {
            return new ListRouteRulesByAssignWhoIdRequest(this);
        } 

    } 

}
