// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateActionRequest} extends {@link RequestModel}
 *
 * <p>CreateActionRequest</p>
 */
public class CreateActionRequest extends Request {
    @Query
    @NameInMap("ActionName")
    @Validation(required = true)
    private String actionName;

    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private String actionType;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Popularity")
    private Integer popularity;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateActionRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.actionType = builder.actionType;
        this.content = builder.content;
        this.popularity = builder.popularity;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return popularity
     */
    public Integer getPopularity() {
        return this.popularity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateActionRequest, Builder> {
        private String actionName; 
        private String actionType; 
        private String content; 
        private Integer popularity; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateActionRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.actionType = request.actionType;
            this.content = request.content;
            this.popularity = request.popularity;
            this.regionId = request.regionId;
        } 

        /**
         * ActionName.
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Popularity.
         */
        public Builder popularity(Integer popularity) {
            this.putQueryParameter("Popularity", popularity);
            this.popularity = popularity;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateActionRequest build() {
            return new CreateActionRequest(this);
        } 

    } 

}
