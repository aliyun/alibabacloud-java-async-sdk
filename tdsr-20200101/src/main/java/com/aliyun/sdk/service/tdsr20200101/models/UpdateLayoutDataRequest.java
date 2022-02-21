// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLayoutDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateLayoutDataRequest</p>
 */
public class UpdateLayoutDataRequest extends Request {
    @Query
    @NameInMap("LayoutData")
    @Validation(required = true)
    private String layoutData;

    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
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

        private Builder(UpdateLayoutDataRequest response) {
            super(response);
            this.layoutData = response.layoutData;
            this.subSceneId = response.subSceneId;
        } 

        /**
         * 标注数据
         */
        public Builder layoutData(String layoutData) {
            this.putQueryParameter("LayoutData", layoutData);
            this.layoutData = layoutData;
            return this;
        }

        /**
         * 子场景ID
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
