// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcsScenarioFacadeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEcsScenarioFacadeResponseBody</p>
 */
public class DescribeEcsScenarioFacadeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scenarios")
    private java.util.List < Scenarios> scenarios;

    private DescribeEcsScenarioFacadeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scenarios = builder.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEcsScenarioFacadeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenarios
     */
    public java.util.List < Scenarios> getScenarios() {
        return this.scenarios;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Scenarios> scenarios; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scenarios.
         */
        public Builder scenarios(java.util.List < Scenarios> scenarios) {
            this.scenarios = scenarios;
            return this;
        }

        public DescribeEcsScenarioFacadeResponseBody build() {
            return new DescribeEcsScenarioFacadeResponseBody(this);
        } 

    } 

    public static class EcsScenarioContentData extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private java.util.List < String > values;

        private EcsScenarioContentData(Builder builder) {
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsScenarioContentData create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String type; 
            private java.util.List < String > values; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public EcsScenarioContentData build() {
                return new EcsScenarioContentData(this);
            } 

        } 

    }
    public static class Contents extends TeaModel {
        @NameInMap("Action")
        private java.util.Map < String, String > action;

        @NameInMap("Attributes")
        private java.util.Map < String, String > attributes;

        @NameInMap("ColorLevel")
        private String colorLevel;

        @NameInMap("Description")
        private String description;

        @NameInMap("EcsScenarioContentData")
        private java.util.List < EcsScenarioContentData> ecsScenarioContentData;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("SupportCancel")
        private String supportCancel;

        @NameInMap("Tips")
        private String tips;

        @NameInMap("Title")
        private String title;

        @NameInMap("Track")
        private java.util.Map < String, String > track;

        private Contents(Builder builder) {
            this.action = builder.action;
            this.attributes = builder.attributes;
            this.colorLevel = builder.colorLevel;
            this.description = builder.description;
            this.ecsScenarioContentData = builder.ecsScenarioContentData;
            this.icon = builder.icon;
            this.supportCancel = builder.supportCancel;
            this.tips = builder.tips;
            this.title = builder.title;
            this.track = builder.track;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.Map < String, String > getAction() {
            return this.action;
        }

        /**
         * @return attributes
         */
        public java.util.Map < String, String > getAttributes() {
            return this.attributes;
        }

        /**
         * @return colorLevel
         */
        public String getColorLevel() {
            return this.colorLevel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsScenarioContentData
         */
        public java.util.List < EcsScenarioContentData> getEcsScenarioContentData() {
            return this.ecsScenarioContentData;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return supportCancel
         */
        public String getSupportCancel() {
            return this.supportCancel;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return track
         */
        public java.util.Map < String, String > getTrack() {
            return this.track;
        }

        public static final class Builder {
            private java.util.Map < String, String > action; 
            private java.util.Map < String, String > attributes; 
            private String colorLevel; 
            private String description; 
            private java.util.List < EcsScenarioContentData> ecsScenarioContentData; 
            private String icon; 
            private String supportCancel; 
            private String tips; 
            private String title; 
            private java.util.Map < String, String > track; 

            /**
             * Action.
             */
            public Builder action(java.util.Map < String, String > action) {
                this.action = action;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(java.util.Map < String, String > attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * ColorLevel.
             */
            public Builder colorLevel(String colorLevel) {
                this.colorLevel = colorLevel;
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
             * EcsScenarioContentData.
             */
            public Builder ecsScenarioContentData(java.util.List < EcsScenarioContentData> ecsScenarioContentData) {
                this.ecsScenarioContentData = ecsScenarioContentData;
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
             * SupportCancel.
             */
            public Builder supportCancel(String supportCancel) {
                this.supportCancel = supportCancel;
                return this;
            }

            /**
             * Tips.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Track.
             */
            public Builder track(java.util.Map < String, String > track) {
                this.track = track;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    public static class Scenarios extends TeaModel {
        @NameInMap("Contents")
        private java.util.List < Contents> contents;

        @NameInMap("Scenario")
        private String scenario;

        private Scenarios(Builder builder) {
            this.contents = builder.contents;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenarios create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List < Contents> getContents() {
            return this.contents;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private java.util.List < Contents> contents; 
            private String scenario; 

            /**
             * Contents.
             */
            public Builder contents(java.util.List < Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            public Scenarios build() {
                return new Scenarios(this);
            } 

        } 

    }
}
