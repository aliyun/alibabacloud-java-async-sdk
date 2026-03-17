// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppTokenServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateAppTokenServiceRequest</p>
 */
public class CreateAppTokenServiceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateAction")
    private String createAction;

    private CreateAppTokenServiceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createAction = builder.createAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppTokenServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createAction
     */
    public String getCreateAction() {
        return this.createAction;
    }

    public static final class Builder extends Request.Builder<CreateAppTokenServiceRequest, Builder> {
        private String regionId; 
        private String createAction; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppTokenServiceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createAction = request.createAction;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CreateAction.
         */
        public Builder createAction(String createAction) {
            this.putQueryParameter("CreateAction", createAction);
            this.createAction = createAction;
            return this;
        }

        @Override
        public CreateAppTokenServiceRequest build() {
            return new CreateAppTokenServiceRequest(this);
        } 

    } 

}
