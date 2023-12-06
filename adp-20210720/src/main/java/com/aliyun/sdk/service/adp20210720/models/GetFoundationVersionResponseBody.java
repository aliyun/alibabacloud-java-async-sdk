// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoundationVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFoundationVersionResponseBody</p>
 */
public class GetFoundationVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetFoundationVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoundationVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetFoundationVersionResponseBody build() {
            return new GetFoundationVersionResponseBody(this);
        } 

    } 

    public static class SiteSurveyTool extends TeaModel {
        @NameInMap("clusterCheckerURL")
        private String clusterCheckerURL;

        @NameInMap("clusterInfoBrief")
        private String clusterInfoBrief;

        private SiteSurveyTool(Builder builder) {
            this.clusterCheckerURL = builder.clusterCheckerURL;
            this.clusterInfoBrief = builder.clusterInfoBrief;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteSurveyTool create() {
            return builder().build();
        }

        /**
         * @return clusterCheckerURL
         */
        public String getClusterCheckerURL() {
            return this.clusterCheckerURL;
        }

        /**
         * @return clusterInfoBrief
         */
        public String getClusterInfoBrief() {
            return this.clusterInfoBrief;
        }

        public static final class Builder {
            private String clusterCheckerURL; 
            private String clusterInfoBrief; 

            /**
             * clusterCheckerURL.
             */
            public Builder clusterCheckerURL(String clusterCheckerURL) {
                this.clusterCheckerURL = clusterCheckerURL;
                return this;
            }

            /**
             * clusterInfoBrief.
             */
            public Builder clusterInfoBrief(String clusterInfoBrief) {
                this.clusterInfoBrief = clusterInfoBrief;
                return this;
            }

            public SiteSurveyTool build() {
                return new SiteSurveyTool(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("features")
        private java.util.List < String > features;

        @NameInMap("isDefault")
        private Boolean isDefault;

        @NameInMap("labels")
        private String labels;

        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("platforms")
        private java.util.List < Platform > platforms;

        @NameInMap("siteSurveyTool")
        private SiteSurveyTool siteSurveyTool;

        @NameInMap("specName")
        private String specName;

        @NameInMap("status")
        @Validation(required = true)
        private String status;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        @NameInMap("uid")
        private String uid;

        @NameInMap("version")
        @Validation(required = true)
        private String version;

        private Data(Builder builder) {
            this.description = builder.description;
            this.features = builder.features;
            this.isDefault = builder.isDefault;
            this.labels = builder.labels;
            this.name = builder.name;
            this.platforms = builder.platforms;
            this.siteSurveyTool = builder.siteSurveyTool;
            this.specName = builder.specName;
            this.status = builder.status;
            this.type = builder.type;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return features
         */
        public java.util.List < String > getFeatures() {
            return this.features;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platforms
         */
        public java.util.List < Platform > getPlatforms() {
            return this.platforms;
        }

        /**
         * @return siteSurveyTool
         */
        public SiteSurveyTool getSiteSurveyTool() {
            return this.siteSurveyTool;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private java.util.List < String > features; 
            private Boolean isDefault; 
            private String labels; 
            private String name; 
            private java.util.List < Platform > platforms; 
            private SiteSurveyTool siteSurveyTool; 
            private String specName; 
            private String status; 
            private String type; 
            private String uid; 
            private String version; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * features.
             */
            public Builder features(java.util.List < String > features) {
                this.features = features;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * platforms.
             */
            public Builder platforms(java.util.List < Platform > platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * siteSurveyTool.
             */
            public Builder siteSurveyTool(SiteSurveyTool siteSurveyTool) {
                this.siteSurveyTool = siteSurveyTool;
                return this;
            }

            /**
             * specName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * version
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
