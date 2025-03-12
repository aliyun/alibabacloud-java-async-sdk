// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link UpdateLayoutDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateLayoutDataRequest</p>
 */
public class UpdateLayoutDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LayoutData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layoutData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subSceneId;

    private UpdateLayoutDataRequest(Builder builder) {
        super(builder);
        this.layoutData = builder.layoutData;
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLayoutDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layoutData
     */
    public String getLayoutData() {
        return this.layoutData;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<UpdateLayoutDataRequest, Builder> {
        private String layoutData; 
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLayoutDataRequest request) {
            super(request);
            this.layoutData = request.layoutData;
            this.subSceneId = request.subSceneId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder layoutData(String layoutData) {
            this.putQueryParameter("LayoutData", layoutData);
            this.layoutData = layoutData;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        @Override
        public UpdateLayoutDataRequest build() {
            return new UpdateLayoutDataRequest(this);
        } 

    } 

}
