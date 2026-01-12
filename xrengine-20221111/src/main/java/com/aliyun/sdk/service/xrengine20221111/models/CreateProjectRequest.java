// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoBuild")
    private Boolean autoBuild;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dependencies")
    private String dependencies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Gender")
    private String gender;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Height")
    private Double height;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Intro")
    private String intro;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MapUuid")
    private String mapUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TryOnParams")
    private TryOnParams tryOnParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Double weight;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.autoBuild = builder.autoBuild;
        this.dependencies = builder.dependencies;
        this.extInfo = builder.extInfo;
        this.gender = builder.gender;
        this.height = builder.height;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.mapUuid = builder.mapUuid;
        this.method = builder.method;
        this.mode = builder.mode;
        this.title = builder.title;
        this.tryOnParams = builder.tryOnParams;
        this.type = builder.type;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBuild
     */
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return dependencies
     */
    public String getDependencies() {
        return this.dependencies;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return height
     */
    public Double getHeight() {
        return this.height;
    }

    /**
     * @return intro
     */
    public String getIntro() {
        return this.intro;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return mapUuid
     */
    public String getMapUuid() {
        return this.mapUuid;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return tryOnParams
     */
    public TryOnParams getTryOnParams() {
        return this.tryOnParams;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return weight
     */
    public Double getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private Boolean autoBuild; 
        private String dependencies; 
        private String extInfo; 
        private String gender; 
        private Double height; 
        private String intro; 
        private String jwtToken; 
        private String mapUuid; 
        private String method; 
        private String mode; 
        private String title; 
        private TryOnParams tryOnParams; 
        private String type; 
        private Double weight; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.autoBuild = request.autoBuild;
            this.dependencies = request.dependencies;
            this.extInfo = request.extInfo;
            this.gender = request.gender;
            this.height = request.height;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.mapUuid = request.mapUuid;
            this.method = request.method;
            this.mode = request.mode;
            this.title = request.title;
            this.tryOnParams = request.tryOnParams;
            this.type = request.type;
            this.weight = request.weight;
        } 

        /**
         * AutoBuild.
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putBodyParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
        }

        /**
         * Dependencies.
         */
        public Builder dependencies(String dependencies) {
            this.putBodyParameter("Dependencies", dependencies);
            this.dependencies = dependencies;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(String gender) {
            this.putBodyParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Double height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * Intro.
         */
        public Builder intro(String intro) {
            this.putBodyParameter("Intro", intro);
            this.intro = intro;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * MapUuid.
         */
        public Builder mapUuid(String mapUuid) {
            this.putBodyParameter("MapUuid", mapUuid);
            this.mapUuid = mapUuid;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * TryOnParams.
         */
        public Builder tryOnParams(TryOnParams tryOnParams) {
            String tryOnParamsShrink = shrink(tryOnParams, "TryOnParams", "json");
            this.putBodyParameter("TryOnParams", tryOnParamsShrink);
            this.tryOnParams = tryOnParams;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Double weight) {
            this.putBodyParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class ClothInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClothInfos(Builder builder) {
            this.id = builder.id;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClothInfos create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long id; 
            private String size; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClothInfos model) {
                this.id = model.id;
                this.size = model.size;
                this.status = model.status;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClothInfos build() {
                return new ClothInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
    public static class TryOnParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClothIds")
        private java.util.List<Long> clothIds;

        @com.aliyun.core.annotation.NameInMap("ClothInfos")
        private java.util.List<ClothInfos> clothInfos;

        private TryOnParams(Builder builder) {
            this.clothIds = builder.clothIds;
            this.clothInfos = builder.clothInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TryOnParams create() {
            return builder().build();
        }

        /**
         * @return clothIds
         */
        public java.util.List<Long> getClothIds() {
            return this.clothIds;
        }

        /**
         * @return clothInfos
         */
        public java.util.List<ClothInfos> getClothInfos() {
            return this.clothInfos;
        }

        public static final class Builder {
            private java.util.List<Long> clothIds; 
            private java.util.List<ClothInfos> clothInfos; 

            private Builder() {
            } 

            private Builder(TryOnParams model) {
                this.clothIds = model.clothIds;
                this.clothInfos = model.clothInfos;
            } 

            /**
             * ClothIds.
             */
            public Builder clothIds(java.util.List<Long> clothIds) {
                this.clothIds = clothIds;
                return this;
            }

            /**
             * ClothInfos.
             */
            public Builder clothInfos(java.util.List<ClothInfos> clothInfos) {
                this.clothInfos = clothInfos;
                return this;
            }

            public TryOnParams build() {
                return new TryOnParams(this);
            } 

        } 

    }
}
