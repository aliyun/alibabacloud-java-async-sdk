// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductEnvironmentsRequest} extends {@link RequestModel}
 *
 * <p>ListProductEnvironmentsRequest</p>
 */
public class ListProductEnvironmentsRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("compatibleProductVersionUID")
    private String compatibleProductVersionUID;

    @Query
    @NameInMap("envType")
    private String envType;

    @Query
    @NameInMap("options")
    private Options options;

    @Query
    @NameInMap("platforms")
    private java.util.List < Platforms> platforms;

    @Query
    @NameInMap("productVersionSpecUID")
    private String productVersionSpecUID;

    @Query
    @NameInMap("productVersionUID")
    private String productVersionUID;

    private ListProductEnvironmentsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.compatibleProductVersionUID = builder.compatibleProductVersionUID;
        this.envType = builder.envType;
        this.options = builder.options;
        this.platforms = builder.platforms;
        this.productVersionSpecUID = builder.productVersionSpecUID;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductEnvironmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return compatibleProductVersionUID
     */
    public String getCompatibleProductVersionUID() {
        return this.compatibleProductVersionUID;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    /**
     * @return platforms
     */
    public java.util.List < Platforms> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return productVersionSpecUID
     */
    public String getProductVersionSpecUID() {
        return this.productVersionSpecUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<ListProductEnvironmentsRequest, Builder> {
        private String uid; 
        private String compatibleProductVersionUID; 
        private String envType; 
        private Options options; 
        private java.util.List < Platforms> platforms; 
        private String productVersionSpecUID; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(ListProductEnvironmentsRequest request) {
            super(request);
            this.uid = request.uid;
            this.compatibleProductVersionUID = request.compatibleProductVersionUID;
            this.envType = request.envType;
            this.options = request.options;
            this.platforms = request.platforms;
            this.productVersionSpecUID = request.productVersionSpecUID;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * compatibleProductVersionUID.
         */
        public Builder compatibleProductVersionUID(String compatibleProductVersionUID) {
            this.putQueryParameter("compatibleProductVersionUID", compatibleProductVersionUID);
            this.compatibleProductVersionUID = compatibleProductVersionUID;
            return this;
        }

        /**
         * envType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("envType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * options.
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "options", "json");
            this.putQueryParameter("options", optionsShrink);
            this.options = options;
            return this;
        }

        /**
         * platforms.
         */
        public Builder platforms(java.util.List < Platforms> platforms) {
            String platformsShrink = shrink(platforms, "platforms", "json");
            this.putQueryParameter("platforms", platformsShrink);
            this.platforms = platforms;
            return this;
        }

        /**
         * productVersionSpecUID.
         */
        public Builder productVersionSpecUID(String productVersionSpecUID) {
            this.putQueryParameter("productVersionSpecUID", productVersionSpecUID);
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public ListProductEnvironmentsRequest build() {
            return new ListProductEnvironmentsRequest(this);
        } 

    } 

    public static class Options extends TeaModel {
        @NameInMap("filterWithSpecUID")
        private Boolean filterWithSpecUID;

        @NameInMap("specUID")
        private String specUID;

        private Options(Builder builder) {
            this.filterWithSpecUID = builder.filterWithSpecUID;
            this.specUID = builder.specUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return filterWithSpecUID
         */
        public Boolean getFilterWithSpecUID() {
            return this.filterWithSpecUID;
        }

        /**
         * @return specUID
         */
        public String getSpecUID() {
            return this.specUID;
        }

        public static final class Builder {
            private Boolean filterWithSpecUID; 
            private String specUID; 

            /**
             * filterWithSpecUID.
             */
            public Builder filterWithSpecUID(Boolean filterWithSpecUID) {
                this.filterWithSpecUID = filterWithSpecUID;
                return this;
            }

            /**
             * specUID.
             */
            public Builder specUID(String specUID) {
                this.specUID = specUID;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    public static class Platforms extends TeaModel {
        @NameInMap("architecture")
        private String architecture;

        @NameInMap("os")
        private String os;

        private Platforms(Builder builder) {
            this.architecture = builder.architecture;
            this.os = builder.os;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        public static final class Builder {
            private String architecture; 
            private String os; 

            /**
             * architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
