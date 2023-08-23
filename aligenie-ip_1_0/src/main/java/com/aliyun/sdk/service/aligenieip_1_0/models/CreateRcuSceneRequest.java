// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRcuSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateRcuSceneRequest</p>
 */
public class CreateRcuSceneRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Body
    @NameInMap("SceneRelationExtDTO")
    @Validation(required = true)
    private SceneRelationExtDTO sceneRelationExtDTO;

    private CreateRcuSceneRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.sceneId = builder.sceneId;
        this.sceneRelationExtDTO = builder.sceneRelationExtDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRcuSceneRequest create() {
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
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneRelationExtDTO
     */
    public SceneRelationExtDTO getSceneRelationExtDTO() {
        return this.sceneRelationExtDTO;
    }

    public static final class Builder extends Request.Builder<CreateRcuSceneRequest, Builder> {
        private String hotelId; 
        private String sceneId; 
        private SceneRelationExtDTO sceneRelationExtDTO; 

        private Builder() {
            super();
        } 

        private Builder(CreateRcuSceneRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.sceneId = request.sceneId;
            this.sceneRelationExtDTO = request.sceneRelationExtDTO;
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
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SceneRelationExtDTO.
         */
        public Builder sceneRelationExtDTO(SceneRelationExtDTO sceneRelationExtDTO) {
            String sceneRelationExtDTOShrink = shrink(sceneRelationExtDTO, "SceneRelationExtDTO", "json");
            this.putBodyParameter("SceneRelationExtDTO", sceneRelationExtDTOShrink);
            this.sceneRelationExtDTO = sceneRelationExtDTO;
            return this;
        }

        @Override
        public CreateRcuSceneRequest build() {
            return new CreateRcuSceneRequest(this);
        } 

    } 

    public static class SceneRelationExtDTO extends TeaModel {
        @NameInMap("CorpusList")
        @Validation(required = true)
        private java.util.List < String > corpusList;

        @NameInMap("Description")
        @Validation(required = true)
        private String description;

        @NameInMap("Icon")
        @Validation(required = true)
        private String icon;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        private SceneRelationExtDTO(Builder builder) {
            this.corpusList = builder.corpusList;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneRelationExtDTO create() {
            return builder().build();
        }

        /**
         * @return corpusList
         */
        public java.util.List < String > getCorpusList() {
            return this.corpusList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < String > corpusList; 
            private String description; 
            private String icon; 
            private String name; 

            /**
             * CorpusList.
             */
            public Builder corpusList(java.util.List < String > corpusList) {
                this.corpusList = corpusList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SceneRelationExtDTO build() {
                return new SceneRelationExtDTO(this);
            } 

        } 

    }
}
