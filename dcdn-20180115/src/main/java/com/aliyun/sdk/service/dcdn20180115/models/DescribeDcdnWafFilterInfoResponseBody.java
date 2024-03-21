// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafFilterInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafFilterInfoResponseBody</p>
 */
public class DescribeDcdnWafFilterInfoResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafFilterInfoResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafFilterInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * The returned information.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafFilterInfoResponseBody build() {
            return new DescribeDcdnWafFilterInfoResponseBody(this);
        } 

    } 

    public static class Regexp extends TeaModel {
        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("Pattern")
        private String pattern;

        private Regexp(Builder builder) {
            this.errMsg = builder.errMsg;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regexp create() {
            return builder().build();
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String errMsg; 
            private String pattern; 

            /**
             * The error message returned when no items match the regular expression.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * The regular expression.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public Regexp build() {
                return new Regexp(this);
            } 

        } 

    }
    public static class LogicalSymbol extends TeaModel {
        @NameInMap("Attributes")
        private Integer attributes;

        @NameInMap("Description")
        private String description;

        @NameInMap("MaxLength")
        private Integer maxLength;

        @NameInMap("Regexp")
        private Regexp regexp;

        @NameInMap("Symbol")
        private String symbol;

        @NameInMap("Tip")
        private String tip;

        @NameInMap("Type")
        private String type;

        private LogicalSymbol(Builder builder) {
            this.attributes = builder.attributes;
            this.description = builder.description;
            this.maxLength = builder.maxLength;
            this.regexp = builder.regexp;
            this.symbol = builder.symbol;
            this.tip = builder.tip;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicalSymbol create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public Integer getAttributes() {
            return this.attributes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxLength
         */
        public Integer getMaxLength() {
            return this.maxLength;
        }

        /**
         * @return regexp
         */
        public Regexp getRegexp() {
            return this.regexp;
        }

        /**
         * @return symbol
         */
        public String getSymbol() {
            return this.symbol;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer attributes; 
            private String description; 
            private Integer maxLength; 
            private Regexp regexp; 
            private String symbol; 
            private String tip; 
            private String type; 

            /**
             * The configurable attributes, which are bit-field variables that are shown in the following list.\
             * <p>
             * For example, 1(00000001) indicates that case sensitivity can be enabled and stream match cannot be enabled, and 3(00000011) indicates that case sensitivity and stream match can be enabled.
             * 
             * *   Bit (low to high) - Description
             * *   1 - Case sensitivity
             * *   2 - Stream match
             */
            public Builder attributes(Integer attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * The logical symbol that is displayed in the Dynamic Content Delivery Network (DCDN) console.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The maximum number of match items that can be returned. The value of this parameter varies based on the value of the Type parameter. Valid values:
             * <p>
             * 
             * *   If **multi** is returned for the Type parameter, the value of this parameter indicates the maximum number of match items.
             * *   If **single** is returned for the Type parameter, the value of this parameter is 1.
             * *   If **none** is returned for the Type parameter, the value of this parameter is 0.
             */
            public Builder maxLength(Integer maxLength) {
                this.maxLength = maxLength;
                return this;
            }

            /**
             * The information about the regular expression.
             */
            public Builder regexp(Regexp regexp) {
                this.regexp = regexp;
                return this;
            }

            /**
             * The logical symbol that is passed to the backend.
             */
            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * The tips that are displayed in the match item.
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            /**
             * The number of match items. Valid values:
             * <p>
             * 
             * *   multi: You can specify multiple match items.
             * *   single: You can specify only a match item.
             * *   none: no match items.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public LogicalSymbol build() {
                return new LogicalSymbol(this);
            } 

        } 

    }
    public static class Fields extends TeaModel {
        @NameInMap("ExtendField")
        private String extendField;

        @NameInMap("LogicalSymbol")
        private java.util.List < LogicalSymbol> logicalSymbol;

        @NameInMap("MatchField")
        private String matchField;

        private Fields(Builder builder) {
            this.extendField = builder.extendField;
            this.logicalSymbol = builder.logicalSymbol;
            this.matchField = builder.matchField;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return extendField
         */
        public String getExtendField() {
            return this.extendField;
        }

        /**
         * @return logicalSymbol
         */
        public java.util.List < LogicalSymbol> getLogicalSymbol() {
            return this.logicalSymbol;
        }

        /**
         * @return matchField
         */
        public String getMatchField() {
            return this.matchField;
        }

        public static final class Builder {
            private String extendField; 
            private java.util.List < LogicalSymbol> logicalSymbol; 
            private String matchField; 

            /**
             * The description of the match field. This parameter is not returned or is empty if no match fields are found.
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
                return this;
            }

            /**
             * The information about the logical symbol.
             */
            public Builder logicalSymbol(java.util.List < LogicalSymbol> logicalSymbol) {
                this.logicalSymbol = logicalSymbol;
                return this;
            }

            /**
             * The match field.
             */
            public Builder matchField(String matchField) {
                this.matchField = matchField;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("DefenseScene")
        private String defenseScene;

        @NameInMap("Fields")
        private java.util.List < Fields> fields;

        private Content(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return fields
         */
        public java.util.List < Fields> getFields() {
            return this.fields;
        }

        public static final class Builder {
            private String defenseScene; 
            private java.util.List < Fields> fields; 

            /**
             * The type of the protection policy. The value of this parameter is the same as that of the DefenseScenes parameter in the request.
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * The information about the match condition.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
