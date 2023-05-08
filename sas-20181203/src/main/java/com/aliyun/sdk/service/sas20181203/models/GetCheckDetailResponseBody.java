// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckDetailResponseBody</p>
 */
public class GetCheckDetailResponseBody extends TeaModel {
    @NameInMap("AssistInfo")
    private AssistInfo assistInfo;

    @NameInMap("CustomConfigs")
    private java.util.List < CustomConfigs> customConfigs;

    @NameInMap("Description")
    private Description description;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Solution")
    private Solution solution;

    private GetCheckDetailResponseBody(Builder builder) {
        this.assistInfo = builder.assistInfo;
        this.customConfigs = builder.customConfigs;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return assistInfo
     */
    public AssistInfo getAssistInfo() {
        return this.assistInfo;
    }

    /**
     * @return customConfigs
     */
    public java.util.List < CustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    /**
     * @return description
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solution
     */
    public Solution getSolution() {
        return this.solution;
    }

    public static final class Builder {
        private AssistInfo assistInfo; 
        private java.util.List < CustomConfigs> customConfigs; 
        private Description description; 
        private String requestId; 
        private Solution solution; 

        /**
         * AssistInfo.
         */
        public Builder assistInfo(AssistInfo assistInfo) {
            this.assistInfo = assistInfo;
            return this;
        }

        /**
         * CustomConfigs.
         */
        public Builder customConfigs(java.util.List < CustomConfigs> customConfigs) {
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(Description description) {
            this.description = description;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Solution.
         */
        public Builder solution(Solution solution) {
            this.solution = solution;
            return this;
        }

        public GetCheckDetailResponseBody build() {
            return new GetCheckDetailResponseBody(this);
        } 

    } 

    public static class AssistInfo extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private AssistInfo(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssistInfo create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AssistInfo build() {
                return new AssistInfo(this);
            } 

        } 

    }
    public static class CustomConfigs extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("TypeDefine")
        private String typeDefine;

        @NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return typeDefine
         */
        public String getTypeDefine() {
            return this.typeDefine;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String defaultValue; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String value; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * TypeDefine.
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
    public static class Description extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Description(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    public static class Solution extends TeaModel {
        @NameInMap("Link")
        private String link;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Solution(Builder builder) {
            this.link = builder.link;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solution create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String link; 
            private String type; 
            private String value; 

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Solution build() {
                return new Solution(this);
            } 

        } 

    }
}
