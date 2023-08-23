// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySceneListRequest} extends {@link RequestModel}
 *
 * <p>QuerySceneListRequest</p>
 */
public class QuerySceneListRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("SceneStates")
    private java.util.List < Integer > sceneStates;

    @Body
    @NameInMap("SceneTypes")
    private java.util.List < String > sceneTypes;

    @Body
    @NameInMap("TemplateInfoIds")
    private java.util.List < String > templateInfoIds;

    private QuerySceneListRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.sceneStates = builder.sceneStates;
        this.sceneTypes = builder.sceneTypes;
        this.templateInfoIds = builder.templateInfoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySceneListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return sceneStates
     */
    public java.util.List < Integer > getSceneStates() {
        return this.sceneStates;
    }

    /**
     * @return sceneTypes
     */
    public java.util.List < String > getSceneTypes() {
        return this.sceneTypes;
    }

    /**
     * @return templateInfoIds
     */
    public java.util.List < String > getTemplateInfoIds() {
        return this.templateInfoIds;
    }

    public static final class Builder extends Request.Builder<QuerySceneListRequest, Builder> {
        private String hotelId; 
        private java.util.List < Integer > sceneStates; 
        private java.util.List < String > sceneTypes; 
        private java.util.List < String > templateInfoIds; 

        private Builder() {
            super();
        } 

        private Builder(QuerySceneListRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.sceneStates = request.sceneStates;
            this.sceneTypes = request.sceneTypes;
            this.templateInfoIds = request.templateInfoIds;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * SceneStates.
         */
        public Builder sceneStates(java.util.List < Integer > sceneStates) {
            String sceneStatesShrink = shrink(sceneStates, "SceneStates", "json");
            this.putBodyParameter("SceneStates", sceneStatesShrink);
            this.sceneStates = sceneStates;
            return this;
        }

        /**
         * SceneTypes.
         */
        public Builder sceneTypes(java.util.List < String > sceneTypes) {
            String sceneTypesShrink = shrink(sceneTypes, "SceneTypes", "json");
            this.putBodyParameter("SceneTypes", sceneTypesShrink);
            this.sceneTypes = sceneTypes;
            return this;
        }

        /**
         * TemplateInfoIds.
         */
        public Builder templateInfoIds(java.util.List < String > templateInfoIds) {
            String templateInfoIdsShrink = shrink(templateInfoIds, "TemplateInfoIds", "json");
            this.putBodyParameter("TemplateInfoIds", templateInfoIdsShrink);
            this.templateInfoIds = templateInfoIds;
            return this;
        }

        @Override
        public QuerySceneListRequest build() {
            return new QuerySceneListRequest(this);
        } 

    } 

}
