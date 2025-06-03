// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListSurveyResourceConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyResourceConnectionsRequest</p>
 */
public class ListSurveyResourceConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ids")
    private java.util.List<Integer> ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListSurveyResourceConnectionsRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyResourceConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSurveyResourceConnectionsRequest, Builder> {
        private java.util.List<Integer> ids; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyResourceConnectionsRequest request) {
            super(request);
            this.ids = request.ids;
            this.regionId = request.regionId;
        } 

        /**
         * ids.
         */
        public Builder ids(java.util.List<Integer> ids) {
            this.putBodyParameter("ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSurveyResourceConnectionsRequest build() {
            return new ListSurveyResourceConnectionsRequest(this);
        } 

    } 

}
