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
 * {@link ImportHotelConfigRequest} extends {@link RequestModel}
 *
 * <p>ImportHotelConfigRequest</p>
 */
public class ImportHotelConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportHotelConfig")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link ImportHotelConfigRequest} extends {@link TeaModel}
     *
     * <p>ImportHotelConfigRequest</p>
     */
    public static class RcuCustomScenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpusList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> corpusList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        @com.aliyun.core.annotation.Validation(required = true)
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

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        public static final class Builder {
            private java.util.List<String> corpusList; 
            private String description; 
            private String icon; 
            private String name; 
            private String sceneId; 

            private Builder() {
            } 

            private Builder(RcuCustomScenes model) {
                this.corpusList = model.corpusList;
                this.description = model.description;
                this.icon = model.icon;
                this.name = model.name;
                this.sceneId = model.sceneId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder corpusList(java.util.List<String> corpusList) {
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
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
    /**
     * 
     * {@link ImportHotelConfigRequest} extends {@link TeaModel}
     *
     * <p>ImportHotelConfigRequest</p>
     */
    public static class ImportHotelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RcuCustomScenes")
        private java.util.List<RcuCustomScenes> rcuCustomScenes;

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
        public java.util.List<RcuCustomScenes> getRcuCustomScenes() {
            return this.rcuCustomScenes;
        }

        public static final class Builder {
            private java.util.List<RcuCustomScenes> rcuCustomScenes; 

            private Builder() {
            } 

            private Builder(ImportHotelConfig model) {
                this.rcuCustomScenes = model.rcuCustomScenes;
            } 

            /**
             * RcuCustomScenes.
             */
            public Builder rcuCustomScenes(java.util.List<RcuCustomScenes> rcuCustomScenes) {
                this.rcuCustomScenes = rcuCustomScenes;
                return this;
            }

            public ImportHotelConfig build() {
                return new ImportHotelConfig(this);
            } 

        } 

    }
}
