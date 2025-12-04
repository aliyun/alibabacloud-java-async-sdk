// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetDataEventSelectorRequest} extends {@link RequestModel}
 *
 * <p>GetDataEventSelectorRequest</p>
 */
public class GetDataEventSelectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trailName;

    private GetDataEventSelectorRequest(Builder builder) {
        super(builder);
        this.trailName = builder.trailName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataEventSelectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trailName
     */
    public String getTrailName() {
        return this.trailName;
    }

    public static final class Builder extends Request.Builder<GetDataEventSelectorRequest, Builder> {
        private String trailName; 

        private Builder() {
            super();
        } 

        private Builder(GetDataEventSelectorRequest request) {
            super(request);
            this.trailName = request.trailName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        public Builder trailName(String trailName) {
            this.putQueryParameter("TrailName", trailName);
            this.trailName = trailName;
            return this;
        }

        @Override
        public GetDataEventSelectorRequest build() {
            return new GetDataEventSelectorRequest(this);
        } 

    } 

}
