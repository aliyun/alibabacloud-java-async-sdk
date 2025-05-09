// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link CreateRcuSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateRcuSceneRequest</p>
 */
public class CreateRcuSceneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneRelationExtDTO")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>520a0c0***5eb</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yoga</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link CreateRcuSceneRequest} extends {@link TeaModel}
     *
     * <p>CreateRcuSceneRequest</p>
     */
    public static class SceneRelationExtDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpusList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> corpusList;

        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        @com.aliyun.core.annotation.Validation(required = true)
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
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
        public java.util.List<String> getCorpusList() {
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
            private java.util.List<String> corpusList; 
            private String description; 
            private String icon; 
            private String name; 

            private Builder() {
            } 

            private Builder(SceneRelationExtDTO model) {
                this.corpusList = model.corpusList;
                this.description = model.description;
                this.icon = model.icon;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder corpusList(java.util.List<String> corpusList) {
                this.corpusList = corpusList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingmoshi/shuimian.png</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
