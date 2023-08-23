// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportHotelConfigRequest} extends {@link RequestModel}
 *
 * <p>ImportHotelConfigRequest</p>
 */
public class ImportHotelConfigRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("ImportHotelConfig")
    @Validation(required = true)
    private ImportHotelConfig importHotelConfig;

    private ImportHotelConfigRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.importHotelConfig = builder.importHotelConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportHotelConfigRequest create() {
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
     * @return importHotelConfig
     */
    public ImportHotelConfig getImportHotelConfig() {
        return this.importHotelConfig;
    }

    public static final class Builder extends Request.Builder<ImportHotelConfigRequest, Builder> {
        private String hotelId; 
        private ImportHotelConfig importHotelConfig; 

        private Builder() {
            super();
        } 

        private Builder(ImportHotelConfigRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.importHotelConfig = request.importHotelConfig;
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
         * ImportHotelConfig.
         */
        public Builder importHotelConfig(ImportHotelConfig importHotelConfig) {
            String importHotelConfigShrink = shrink(importHotelConfig, "ImportHotelConfig", "json");
            this.putBodyParameter("ImportHotelConfig", importHotelConfigShrink);
            this.importHotelConfig = importHotelConfig;
            return this;
        }

        @Override
        public ImportHotelConfigRequest build() {
            return new ImportHotelConfigRequest(this);
        } 

    } 

    public static class RcuCustomScenes extends TeaModel {
        @NameInMap("CorpusList")
        @Validation(required = true)
        private java.util.List < String > corpusList;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("SceneId")
        @Validation(required = true)
        private String sceneId;

        private RcuCustomScenes(Builder builder) {
            this.corpusList = builder.corpusList;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RcuCustomScenes create() {
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

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        public static final class Builder {
            private java.util.List < String > corpusList; 
            private String description; 
            private String icon; 
            private String name; 
            private String sceneId; 

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

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            public RcuCustomScenes build() {
                return new RcuCustomScenes(this);
            } 

        } 

    }
    public static class ImportHotelConfig extends TeaModel {
        @NameInMap("RcuCustomScenes")
        private java.util.List < RcuCustomScenes> rcuCustomScenes;

        private ImportHotelConfig(Builder builder) {
            this.rcuCustomScenes = builder.rcuCustomScenes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportHotelConfig create() {
            return builder().build();
        }

        /**
         * @return rcuCustomScenes
         */
        public java.util.List < RcuCustomScenes> getRcuCustomScenes() {
            return this.rcuCustomScenes;
        }

        public static final class Builder {
            private java.util.List < RcuCustomScenes> rcuCustomScenes; 

            /**
             * RcuCustomScenes.
             */
            public Builder rcuCustomScenes(java.util.List < RcuCustomScenes> rcuCustomScenes) {
                this.rcuCustomScenes = rcuCustomScenes;
                return this;
            }

            public ImportHotelConfig build() {
                return new ImportHotelConfig(this);
            } 

        } 

    }
}
