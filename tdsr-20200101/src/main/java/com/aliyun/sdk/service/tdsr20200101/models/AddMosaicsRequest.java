// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMosaicsRequest} extends {@link RequestModel}
 *
 * <p>AddMosaicsRequest</p>
 */
public class AddMosaicsRequest extends Request {
    @Query
    @NameInMap("MarkPosition")
    @Validation(required = true)
    private String markPosition;

    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
    private String subSceneId;

    private AddMosaicsRequest(Builder builder) {
        super(builder);
        this.markPosition = builder.markPosition;
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMosaicsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markPosition
     */
    public String getMarkPosition() {
        return this.markPosition;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    public static final class Builder extends Request.Builder<AddMosaicsRequest, Builder> {
        private String markPosition; 
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(AddMosaicsRequest request) {
            super(request);
            this.markPosition = request.markPosition;
            this.subSceneId = request.subSceneId;
        } 

        /**
         * 马赛克位置数据
         */
        public Builder markPosition(String markPosition) {
            this.putQueryParameter("MarkPosition", markPosition);
            this.markPosition = markPosition;
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
        public AddMosaicsRequest build() {
            return new AddMosaicsRequest(this);
        } 

    } 

}
